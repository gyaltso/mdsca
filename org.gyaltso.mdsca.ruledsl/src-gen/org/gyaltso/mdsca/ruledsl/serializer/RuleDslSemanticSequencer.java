/*
 * generated by Xtext 2.23.0
 */
package org.gyaltso.mdsca.ruledsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.gyaltso.mdsca.ruledsl.ruleDsl.MethodLengthRule;
import org.gyaltso.mdsca.ruledsl.ruleDsl.MethodNameRule;
import org.gyaltso.mdsca.ruledsl.ruleDsl.MethodParamCountRule;
import org.gyaltso.mdsca.ruledsl.ruleDsl.RuleDslPackage;
import org.gyaltso.mdsca.ruledsl.ruleDsl.RulesFile;
import org.gyaltso.mdsca.ruledsl.ruleDsl.TypeNameRule;
import org.gyaltso.mdsca.ruledsl.services.RuleDslGrammarAccess;

@SuppressWarnings("all")
public class RuleDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RuleDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RuleDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RuleDslPackage.METHOD_LENGTH_RULE:
				sequence_MethodLengthRule(context, (MethodLengthRule) semanticObject); 
				return; 
			case RuleDslPackage.METHOD_NAME_RULE:
				sequence_MethodNameRule(context, (MethodNameRule) semanticObject); 
				return; 
			case RuleDslPackage.METHOD_PARAM_COUNT_RULE:
				sequence_MethodParamCountRule(context, (MethodParamCountRule) semanticObject); 
				return; 
			case RuleDslPackage.RULES_FILE:
				sequence_RulesFile(context, (RulesFile) semanticObject); 
				return; 
			case RuleDslPackage.TYPE_NAME_RULE:
				sequence_TypeNameRule(context, (TypeNameRule) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     MethodLengthRule returns MethodLengthRule
	 *
	 * Constraint:
	 *     (name='MethodLengthRule' max=INT countEmpty=BOOLEAN)
	 */
	protected void sequence_MethodLengthRule(ISerializationContext context, MethodLengthRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.RULE__NAME));
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.METHOD_LENGTH_RULE__MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.METHOD_LENGTH_RULE__MAX));
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.METHOD_LENGTH_RULE__COUNT_EMPTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.METHOD_LENGTH_RULE__COUNT_EMPTY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMethodLengthRuleAccess().getNameMethodLengthRuleKeyword_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMethodLengthRuleAccess().getMaxINTTerminalRuleCall_4_0(), semanticObject.getMax());
		feeder.accept(grammarAccess.getMethodLengthRuleAccess().getCountEmptyBOOLEANTerminalRuleCall_6_0(), semanticObject.isCountEmpty());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MethodNameRule returns MethodNameRule
	 *
	 * Constraint:
	 *     (
	 *         name='MethodNameRule' 
	 *         format=STRING 
	 *         allowClassName=BOOLEAN 
	 *         applyToPublic=BOOLEAN 
	 *         applyToProtected=BOOLEAN 
	 *         applyToPackage=BOOLEAN 
	 *         applyToPrivate=BOOLEAN
	 *     )
	 */
	protected void sequence_MethodNameRule(ISerializationContext context, MethodNameRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.RULE__NAME));
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.METHOD_NAME_RULE__FORMAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.METHOD_NAME_RULE__FORMAT));
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.METHOD_NAME_RULE__ALLOW_CLASS_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.METHOD_NAME_RULE__ALLOW_CLASS_NAME));
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.METHOD_NAME_RULE__APPLY_TO_PUBLIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.METHOD_NAME_RULE__APPLY_TO_PUBLIC));
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.METHOD_NAME_RULE__APPLY_TO_PROTECTED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.METHOD_NAME_RULE__APPLY_TO_PROTECTED));
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.METHOD_NAME_RULE__APPLY_TO_PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.METHOD_NAME_RULE__APPLY_TO_PACKAGE));
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.METHOD_NAME_RULE__APPLY_TO_PRIVATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.METHOD_NAME_RULE__APPLY_TO_PRIVATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMethodNameRuleAccess().getNameMethodNameRuleKeyword_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMethodNameRuleAccess().getFormatSTRINGTerminalRuleCall_4_0(), semanticObject.getFormat());
		feeder.accept(grammarAccess.getMethodNameRuleAccess().getAllowClassNameBOOLEANTerminalRuleCall_6_0(), semanticObject.isAllowClassName());
		feeder.accept(grammarAccess.getMethodNameRuleAccess().getApplyToPublicBOOLEANTerminalRuleCall_8_0(), semanticObject.isApplyToPublic());
		feeder.accept(grammarAccess.getMethodNameRuleAccess().getApplyToProtectedBOOLEANTerminalRuleCall_10_0(), semanticObject.isApplyToProtected());
		feeder.accept(grammarAccess.getMethodNameRuleAccess().getApplyToPackageBOOLEANTerminalRuleCall_12_0(), semanticObject.isApplyToPackage());
		feeder.accept(grammarAccess.getMethodNameRuleAccess().getApplyToPrivateBOOLEANTerminalRuleCall_14_0(), semanticObject.isApplyToPrivate());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MethodParamCountRule returns MethodParamCountRule
	 *
	 * Constraint:
	 *     (name='MethodParamLengthRule' max=INT ignoreOverriddenMethods=BOOLEAN)
	 */
	protected void sequence_MethodParamCountRule(ISerializationContext context, MethodParamCountRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.RULE__NAME));
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.METHOD_PARAM_COUNT_RULE__MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.METHOD_PARAM_COUNT_RULE__MAX));
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.METHOD_PARAM_COUNT_RULE__IGNORE_OVERRIDDEN_METHODS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.METHOD_PARAM_COUNT_RULE__IGNORE_OVERRIDDEN_METHODS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMethodParamCountRuleAccess().getNameMethodParamLengthRuleKeyword_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMethodParamCountRuleAccess().getMaxINTTerminalRuleCall_4_0(), semanticObject.getMax());
		feeder.accept(grammarAccess.getMethodParamCountRuleAccess().getIgnoreOverriddenMethodsBOOLEANTerminalRuleCall_6_0(), semanticObject.isIgnoreOverriddenMethods());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RulesFile returns RulesFile
	 *
	 * Constraint:
	 *     (
	 *         (methodNameRule=MethodNameRule ((methdLengthRule=MethodLengthRule typeName=TypeNameRule) | typeName=TypeNameRule)) | 
	 *         (
	 *             ((methodNameRule=MethodNameRule methdLengthRule=MethodLengthRule) | methdLengthRule=MethodLengthRule)? 
	 *             methodNoOfParamsRule=MethodParamCountRule 
	 *             typeName=TypeNameRule
	 *         ) | 
	 *         (methdLengthRule=MethodLengthRule typeName=TypeNameRule) | 
	 *         typeName=TypeNameRule
	 *     )?
	 */
	protected void sequence_RulesFile(ISerializationContext context, RulesFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeNameRule returns TypeNameRule
	 *
	 * Constraint:
	 *     (
	 *         name='TypeName' 
	 *         format=STRING 
	 *         applyToPublic=BOOLEAN 
	 *         applyToProtected=BOOLEAN 
	 *         applyToPackage=BOOLEAN 
	 *         applyToPrivate=BOOLEAN
	 *     )
	 */
	protected void sequence_TypeNameRule(ISerializationContext context, TypeNameRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.RULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.RULE__NAME));
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.TYPE_NAME_RULE__FORMAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.TYPE_NAME_RULE__FORMAT));
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.TYPE_NAME_RULE__APPLY_TO_PUBLIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.TYPE_NAME_RULE__APPLY_TO_PUBLIC));
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.TYPE_NAME_RULE__APPLY_TO_PROTECTED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.TYPE_NAME_RULE__APPLY_TO_PROTECTED));
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.TYPE_NAME_RULE__APPLY_TO_PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.TYPE_NAME_RULE__APPLY_TO_PACKAGE));
			if (transientValues.isValueTransient(semanticObject, RuleDslPackage.Literals.TYPE_NAME_RULE__APPLY_TO_PRIVATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RuleDslPackage.Literals.TYPE_NAME_RULE__APPLY_TO_PRIVATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeNameRuleAccess().getNameTypeNameKeyword_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTypeNameRuleAccess().getFormatSTRINGTerminalRuleCall_4_0(), semanticObject.getFormat());
		feeder.accept(grammarAccess.getTypeNameRuleAccess().getApplyToPublicBOOLEANTerminalRuleCall_6_0(), semanticObject.isApplyToPublic());
		feeder.accept(grammarAccess.getTypeNameRuleAccess().getApplyToProtectedBOOLEANTerminalRuleCall_8_0(), semanticObject.isApplyToProtected());
		feeder.accept(grammarAccess.getTypeNameRuleAccess().getApplyToPackageBOOLEANTerminalRuleCall_10_0(), semanticObject.isApplyToPackage());
		feeder.accept(grammarAccess.getTypeNameRuleAccess().getApplyToPrivateBOOLEANTerminalRuleCall_12_0(), semanticObject.isApplyToPrivate());
		feeder.finish();
	}
	
	
}