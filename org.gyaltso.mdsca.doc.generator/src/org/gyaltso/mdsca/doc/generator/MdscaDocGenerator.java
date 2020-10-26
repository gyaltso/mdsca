package org.gyaltso.mdsca.doc.generator;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.acceleo.query.runtime.IQueryEnvironment;
import org.eclipse.acceleo.query.runtime.Query;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.obeonetwork.m2doc.ide.M2DocPlugin;
import org.obeonetwork.m2doc.parser.DocumentParserException;
import org.obeonetwork.m2doc.template.DocumentTemplate;
import org.obeonetwork.m2doc.util.IClassProvider;
import org.obeonetwork.m2doc.util.M2DocUtils;

public class MdscaDocGenerator extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		URI templateUri = null;
		try {
			templateUri = getTemplateURI();
		} catch (IOException e) {
			throw new RuntimeException("Error creating template Uri...xxx");
		}

		Map<String, String> options = new HashMap<>();
		List<Exception> exceptions = new ArrayList<>();
		ResourceSet rs = new ResourceSetImpl();
		IQueryEnvironment queryEnvironment = Query.newEnvironment();
		M2DocUtils.prepareEnvironmentServices(queryEnvironment, rs, templateUri, options);

		IClassProvider classProvider = M2DocPlugin.getClassProvider();
		try {
			DocumentTemplate template = M2DocUtils.parse(rs.getURIConverter(), templateUri,
					queryEnvironment, classProvider, null);
			System.out.println(template);
		} catch (DocumentParserException e) {
			e.printStackTrace();
		} finally {
			M2DocUtils.cleanResourceSetForModels(null, rs);
		}

		return null;
	}

	private URI getTemplateURI() throws IOException {
		URL url = Platform.getBundle("org.gyaltso.mdsca.doc.generator").getResource("/resources/mdsca.docx");
		File file = new File(FileLocator.toFileURL(url).getFile());
		return URI.createFileURI(file.getAbsolutePath());
	}

}
