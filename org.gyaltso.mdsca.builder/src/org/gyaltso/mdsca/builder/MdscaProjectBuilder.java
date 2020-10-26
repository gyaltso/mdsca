package org.gyaltso.mdsca.builder;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.gyaltso.mdsca.checks.Check;
import org.gyaltso.mdsca.checks.Result;
import org.gyaltso.mdsca.checks.method.MethodLengthCheck;
import org.gyaltso.mdsca.checks.method.MethodNameCheck;
import org.gyaltso.mdsca.checks.method.MethodParamCountCheck;
import org.gyaltso.mdsca.model.Clazz;
import org.gyaltso.mdsca.ruledsl.resource.RulesResource;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

public class MdscaProjectBuilder extends IncrementalProjectBuilder {

	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;

	private RulesResource ruleResource;

	public MdscaProjectBuilder() {
		IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createURI("dummy.rule"));
		resourceServiceProvider.get(Injector.class).injectMembers(this);
		initRulesResource();
	}

	private RulesResource initRulesResource() {
		try {
			URL url = Platform.getBundle("org.gyaltso.mdsca.ruledsl").getResource("/resources/default.rule");
			File file = new File(FileLocator.toFileURL(url).getFile());
			ruleResource = (RulesResource) resourceSetProvider.get()
					.getResource(URI.createFileURI(file.getAbsolutePath()), true);
			return ruleResource;
		} catch (IOException e) {
			throw new RuntimeException("Unable to read the Rule resource...xxx");
		}
	}

	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {
		IJavaProject javaProject = JavaCore.create(getProject());

		switch (kind) {
		case INCREMENTAL_BUILD:
			runChecks(javaProject);
			break;
		case AUTO_BUILD:
			runChecks(javaProject);
			break;
		}
		return null;
	}

	private void clearMarker(ICompilationUnit compUnit) {
		try {
			IMarker[] markers = compUnit.getResource().findMarkers("org.gyaltso.mdsca.problem_marker", false,
					IProject.DEPTH_ONE);
			for (IMarker marker : markers) {
				marker.delete();
			}
		} catch (CoreException e) {
			throw new RuntimeException("Todo...", e);
		}
	}

	private void runChecks(IJavaProject javaProject) {
		try {
			for (IPackageFragment pkgFragment : Arrays.asList(javaProject.getPackageFragments())) {
				for (ICompilationUnit compUnit : Arrays.asList(pkgFragment.getCompilationUnits())) {
					clearMarker(compUnit);

					Clazz clazz = new Clazz(compUnit);
					clazz.getMethods().forEach(method -> {
						getMethodChecks(ruleResource).forEach(check -> {
							Result result = check.check(method);
							try {
								if (result != null) {
									IMarker marker = compUnit.getResource()
											.createMarker("org.gyaltso.mdsca.problem_marker");
									marker.setAttribute(IMarker.LINE_NUMBER, result.getLineNo());
									marker.setAttribute(IMarker.MESSAGE, result.getMessage());
									marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_NORMAL);
									marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
								}
							} catch (CoreException e) {
								throw new RuntimeException("Todo...", e);
							}
						});
					});
				}
			}
		} catch (JavaModelException e) {
			throw new RuntimeException("Todo...", e);
		}
	}

	private List<Check> getMethodChecks(RulesResource resource) {
		List<Check> checks = new ArrayList<>();
		checks.add(new MethodNameCheck(resource.getMethodNameRule()));
		checks.add(new MethodLengthCheck(resource.getMethodLengthRule()));
		checks.add(new MethodParamCountCheck(resource.getParameterCountRule()));
		return checks;
	}

}
