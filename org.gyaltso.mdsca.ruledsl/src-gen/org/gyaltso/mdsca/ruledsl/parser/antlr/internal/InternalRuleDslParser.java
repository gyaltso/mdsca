package org.gyaltso.mdsca.ruledsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.gyaltso.mdsca.ruledsl.services.RuleDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRuleDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TypeName'", "'{'", "'format'", "'applyToPublic'", "'applyToProtected'", "'applyToPackage'", "'applyToPrivate'", "'}'", "'MethodNameRule'", "'allowClassName'", "'MethodLengthRule'", "'max'", "'countEmpty'", "'MethodParamLengthRule'", "'ignoreOverriddenMethods'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRuleDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRuleDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRuleDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRuleDsl.g"; }



     	private RuleDslGrammarAccess grammarAccess;

        public InternalRuleDslParser(TokenStream input, RuleDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RulesFile";
       	}

       	@Override
       	protected RuleDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRulesFile"
    // InternalRuleDsl.g:64:1: entryRuleRulesFile returns [EObject current=null] : iv_ruleRulesFile= ruleRulesFile EOF ;
    public final EObject entryRuleRulesFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRulesFile = null;


        try {
            // InternalRuleDsl.g:64:50: (iv_ruleRulesFile= ruleRulesFile EOF )
            // InternalRuleDsl.g:65:2: iv_ruleRulesFile= ruleRulesFile EOF
            {
             newCompositeNode(grammarAccess.getRulesFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRulesFile=ruleRulesFile();

            state._fsp--;

             current =iv_ruleRulesFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRulesFile"


    // $ANTLR start "ruleRulesFile"
    // InternalRuleDsl.g:71:1: ruleRulesFile returns [EObject current=null] : ( ( (lv_methodNameRule_0_0= ruleMethodNameRule ) )? ( (lv_methdLengthRule_1_0= ruleMethodLengthRule ) )? ( (lv_methodNoOfParamsRule_2_0= ruleMethodParamCountRule ) )? ( (lv_typeName_3_0= ruleTypeNameRule ) )? ) ;
    public final EObject ruleRulesFile() throws RecognitionException {
        EObject current = null;

        EObject lv_methodNameRule_0_0 = null;

        EObject lv_methdLengthRule_1_0 = null;

        EObject lv_methodNoOfParamsRule_2_0 = null;

        EObject lv_typeName_3_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:77:2: ( ( ( (lv_methodNameRule_0_0= ruleMethodNameRule ) )? ( (lv_methdLengthRule_1_0= ruleMethodLengthRule ) )? ( (lv_methodNoOfParamsRule_2_0= ruleMethodParamCountRule ) )? ( (lv_typeName_3_0= ruleTypeNameRule ) )? ) )
            // InternalRuleDsl.g:78:2: ( ( (lv_methodNameRule_0_0= ruleMethodNameRule ) )? ( (lv_methdLengthRule_1_0= ruleMethodLengthRule ) )? ( (lv_methodNoOfParamsRule_2_0= ruleMethodParamCountRule ) )? ( (lv_typeName_3_0= ruleTypeNameRule ) )? )
            {
            // InternalRuleDsl.g:78:2: ( ( (lv_methodNameRule_0_0= ruleMethodNameRule ) )? ( (lv_methdLengthRule_1_0= ruleMethodLengthRule ) )? ( (lv_methodNoOfParamsRule_2_0= ruleMethodParamCountRule ) )? ( (lv_typeName_3_0= ruleTypeNameRule ) )? )
            // InternalRuleDsl.g:79:3: ( (lv_methodNameRule_0_0= ruleMethodNameRule ) )? ( (lv_methdLengthRule_1_0= ruleMethodLengthRule ) )? ( (lv_methodNoOfParamsRule_2_0= ruleMethodParamCountRule ) )? ( (lv_typeName_3_0= ruleTypeNameRule ) )?
            {
            // InternalRuleDsl.g:79:3: ( (lv_methodNameRule_0_0= ruleMethodNameRule ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRuleDsl.g:80:4: (lv_methodNameRule_0_0= ruleMethodNameRule )
                    {
                    // InternalRuleDsl.g:80:4: (lv_methodNameRule_0_0= ruleMethodNameRule )
                    // InternalRuleDsl.g:81:5: lv_methodNameRule_0_0= ruleMethodNameRule
                    {

                    					newCompositeNode(grammarAccess.getRulesFileAccess().getMethodNameRuleMethodNameRuleParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_methodNameRule_0_0=ruleMethodNameRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRulesFileRule());
                    					}
                    					set(
                    						current,
                    						"methodNameRule",
                    						lv_methodNameRule_0_0,
                    						"org.gyaltso.mdsca.ruledsl.RuleDsl.MethodNameRule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRuleDsl.g:98:3: ( (lv_methdLengthRule_1_0= ruleMethodLengthRule ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRuleDsl.g:99:4: (lv_methdLengthRule_1_0= ruleMethodLengthRule )
                    {
                    // InternalRuleDsl.g:99:4: (lv_methdLengthRule_1_0= ruleMethodLengthRule )
                    // InternalRuleDsl.g:100:5: lv_methdLengthRule_1_0= ruleMethodLengthRule
                    {

                    					newCompositeNode(grammarAccess.getRulesFileAccess().getMethdLengthRuleMethodLengthRuleParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_methdLengthRule_1_0=ruleMethodLengthRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRulesFileRule());
                    					}
                    					set(
                    						current,
                    						"methdLengthRule",
                    						lv_methdLengthRule_1_0,
                    						"org.gyaltso.mdsca.ruledsl.RuleDsl.MethodLengthRule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRuleDsl.g:117:3: ( (lv_methodNoOfParamsRule_2_0= ruleMethodParamCountRule ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRuleDsl.g:118:4: (lv_methodNoOfParamsRule_2_0= ruleMethodParamCountRule )
                    {
                    // InternalRuleDsl.g:118:4: (lv_methodNoOfParamsRule_2_0= ruleMethodParamCountRule )
                    // InternalRuleDsl.g:119:5: lv_methodNoOfParamsRule_2_0= ruleMethodParamCountRule
                    {

                    					newCompositeNode(grammarAccess.getRulesFileAccess().getMethodNoOfParamsRuleMethodParamCountRuleParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_methodNoOfParamsRule_2_0=ruleMethodParamCountRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRulesFileRule());
                    					}
                    					set(
                    						current,
                    						"methodNoOfParamsRule",
                    						lv_methodNoOfParamsRule_2_0,
                    						"org.gyaltso.mdsca.ruledsl.RuleDsl.MethodParamCountRule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalRuleDsl.g:136:3: ( (lv_typeName_3_0= ruleTypeNameRule ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRuleDsl.g:137:4: (lv_typeName_3_0= ruleTypeNameRule )
                    {
                    // InternalRuleDsl.g:137:4: (lv_typeName_3_0= ruleTypeNameRule )
                    // InternalRuleDsl.g:138:5: lv_typeName_3_0= ruleTypeNameRule
                    {

                    					newCompositeNode(grammarAccess.getRulesFileAccess().getTypeNameTypeNameRuleParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_typeName_3_0=ruleTypeNameRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRulesFileRule());
                    					}
                    					set(
                    						current,
                    						"typeName",
                    						lv_typeName_3_0,
                    						"org.gyaltso.mdsca.ruledsl.RuleDsl.TypeNameRule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRulesFile"


    // $ANTLR start "entryRuleTypeNameRule"
    // InternalRuleDsl.g:159:1: entryRuleTypeNameRule returns [EObject current=null] : iv_ruleTypeNameRule= ruleTypeNameRule EOF ;
    public final EObject entryRuleTypeNameRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameRule = null;


        try {
            // InternalRuleDsl.g:159:53: (iv_ruleTypeNameRule= ruleTypeNameRule EOF )
            // InternalRuleDsl.g:160:2: iv_ruleTypeNameRule= ruleTypeNameRule EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeNameRule=ruleTypeNameRule();

            state._fsp--;

             current =iv_ruleTypeNameRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeNameRule"


    // $ANTLR start "ruleTypeNameRule"
    // InternalRuleDsl.g:166:1: ruleTypeNameRule returns [EObject current=null] : ( () ( (lv_name_1_0= 'TypeName' ) ) otherlv_2= '{' otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) otherlv_5= 'applyToPublic' ( (lv_applyToPublic_6_0= RULE_BOOLEAN ) ) otherlv_7= 'applyToProtected' ( (lv_applyToProtected_8_0= RULE_BOOLEAN ) ) otherlv_9= 'applyToPackage' ( (lv_applyToPackage_10_0= RULE_BOOLEAN ) ) otherlv_11= 'applyToPrivate' ( (lv_applyToPrivate_12_0= RULE_BOOLEAN ) ) otherlv_13= '}' ) ;
    public final EObject ruleTypeNameRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_format_4_0=null;
        Token otherlv_5=null;
        Token lv_applyToPublic_6_0=null;
        Token otherlv_7=null;
        Token lv_applyToProtected_8_0=null;
        Token otherlv_9=null;
        Token lv_applyToPackage_10_0=null;
        Token otherlv_11=null;
        Token lv_applyToPrivate_12_0=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:172:2: ( ( () ( (lv_name_1_0= 'TypeName' ) ) otherlv_2= '{' otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) otherlv_5= 'applyToPublic' ( (lv_applyToPublic_6_0= RULE_BOOLEAN ) ) otherlv_7= 'applyToProtected' ( (lv_applyToProtected_8_0= RULE_BOOLEAN ) ) otherlv_9= 'applyToPackage' ( (lv_applyToPackage_10_0= RULE_BOOLEAN ) ) otherlv_11= 'applyToPrivate' ( (lv_applyToPrivate_12_0= RULE_BOOLEAN ) ) otherlv_13= '}' ) )
            // InternalRuleDsl.g:173:2: ( () ( (lv_name_1_0= 'TypeName' ) ) otherlv_2= '{' otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) otherlv_5= 'applyToPublic' ( (lv_applyToPublic_6_0= RULE_BOOLEAN ) ) otherlv_7= 'applyToProtected' ( (lv_applyToProtected_8_0= RULE_BOOLEAN ) ) otherlv_9= 'applyToPackage' ( (lv_applyToPackage_10_0= RULE_BOOLEAN ) ) otherlv_11= 'applyToPrivate' ( (lv_applyToPrivate_12_0= RULE_BOOLEAN ) ) otherlv_13= '}' )
            {
            // InternalRuleDsl.g:173:2: ( () ( (lv_name_1_0= 'TypeName' ) ) otherlv_2= '{' otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) otherlv_5= 'applyToPublic' ( (lv_applyToPublic_6_0= RULE_BOOLEAN ) ) otherlv_7= 'applyToProtected' ( (lv_applyToProtected_8_0= RULE_BOOLEAN ) ) otherlv_9= 'applyToPackage' ( (lv_applyToPackage_10_0= RULE_BOOLEAN ) ) otherlv_11= 'applyToPrivate' ( (lv_applyToPrivate_12_0= RULE_BOOLEAN ) ) otherlv_13= '}' )
            // InternalRuleDsl.g:174:3: () ( (lv_name_1_0= 'TypeName' ) ) otherlv_2= '{' otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) otherlv_5= 'applyToPublic' ( (lv_applyToPublic_6_0= RULE_BOOLEAN ) ) otherlv_7= 'applyToProtected' ( (lv_applyToProtected_8_0= RULE_BOOLEAN ) ) otherlv_9= 'applyToPackage' ( (lv_applyToPackage_10_0= RULE_BOOLEAN ) ) otherlv_11= 'applyToPrivate' ( (lv_applyToPrivate_12_0= RULE_BOOLEAN ) ) otherlv_13= '}'
            {
            // InternalRuleDsl.g:174:3: ()
            // InternalRuleDsl.g:175:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeNameRuleAccess().getTypeNameRuleAction_0(),
            					current);
            			

            }

            // InternalRuleDsl.g:181:3: ( (lv_name_1_0= 'TypeName' ) )
            // InternalRuleDsl.g:182:4: (lv_name_1_0= 'TypeName' )
            {
            // InternalRuleDsl.g:182:4: (lv_name_1_0= 'TypeName' )
            // InternalRuleDsl.g:183:5: lv_name_1_0= 'TypeName'
            {
            lv_name_1_0=(Token)match(input,12,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeNameRuleAccess().getNameTypeNameKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeNameRuleRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "TypeName");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeNameRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeNameRuleAccess().getFormatKeyword_3());
            		
            // InternalRuleDsl.g:203:3: ( (lv_format_4_0= RULE_STRING ) )
            // InternalRuleDsl.g:204:4: (lv_format_4_0= RULE_STRING )
            {
            // InternalRuleDsl.g:204:4: (lv_format_4_0= RULE_STRING )
            // InternalRuleDsl.g:205:5: lv_format_4_0= RULE_STRING
            {
            lv_format_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_format_4_0, grammarAccess.getTypeNameRuleAccess().getFormatSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeNameRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"format",
            						lv_format_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getTypeNameRuleAccess().getApplyToPublicKeyword_5());
            		
            // InternalRuleDsl.g:225:3: ( (lv_applyToPublic_6_0= RULE_BOOLEAN ) )
            // InternalRuleDsl.g:226:4: (lv_applyToPublic_6_0= RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:226:4: (lv_applyToPublic_6_0= RULE_BOOLEAN )
            // InternalRuleDsl.g:227:5: lv_applyToPublic_6_0= RULE_BOOLEAN
            {
            lv_applyToPublic_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_11); 

            					newLeafNode(lv_applyToPublic_6_0, grammarAccess.getTypeNameRuleAccess().getApplyToPublicBOOLEANTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeNameRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"applyToPublic",
            						lv_applyToPublic_6_0,
            						"org.gyaltso.mdsca.ruledsl.RuleDsl.BOOLEAN");
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getTypeNameRuleAccess().getApplyToProtectedKeyword_7());
            		
            // InternalRuleDsl.g:247:3: ( (lv_applyToProtected_8_0= RULE_BOOLEAN ) )
            // InternalRuleDsl.g:248:4: (lv_applyToProtected_8_0= RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:248:4: (lv_applyToProtected_8_0= RULE_BOOLEAN )
            // InternalRuleDsl.g:249:5: lv_applyToProtected_8_0= RULE_BOOLEAN
            {
            lv_applyToProtected_8_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_12); 

            					newLeafNode(lv_applyToProtected_8_0, grammarAccess.getTypeNameRuleAccess().getApplyToProtectedBOOLEANTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeNameRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"applyToProtected",
            						lv_applyToProtected_8_0,
            						"org.gyaltso.mdsca.ruledsl.RuleDsl.BOOLEAN");
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getTypeNameRuleAccess().getApplyToPackageKeyword_9());
            		
            // InternalRuleDsl.g:269:3: ( (lv_applyToPackage_10_0= RULE_BOOLEAN ) )
            // InternalRuleDsl.g:270:4: (lv_applyToPackage_10_0= RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:270:4: (lv_applyToPackage_10_0= RULE_BOOLEAN )
            // InternalRuleDsl.g:271:5: lv_applyToPackage_10_0= RULE_BOOLEAN
            {
            lv_applyToPackage_10_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_13); 

            					newLeafNode(lv_applyToPackage_10_0, grammarAccess.getTypeNameRuleAccess().getApplyToPackageBOOLEANTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeNameRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"applyToPackage",
            						lv_applyToPackage_10_0,
            						"org.gyaltso.mdsca.ruledsl.RuleDsl.BOOLEAN");
            				

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getTypeNameRuleAccess().getApplyToPrivateKeyword_11());
            		
            // InternalRuleDsl.g:291:3: ( (lv_applyToPrivate_12_0= RULE_BOOLEAN ) )
            // InternalRuleDsl.g:292:4: (lv_applyToPrivate_12_0= RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:292:4: (lv_applyToPrivate_12_0= RULE_BOOLEAN )
            // InternalRuleDsl.g:293:5: lv_applyToPrivate_12_0= RULE_BOOLEAN
            {
            lv_applyToPrivate_12_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_14); 

            					newLeafNode(lv_applyToPrivate_12_0, grammarAccess.getTypeNameRuleAccess().getApplyToPrivateBOOLEANTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeNameRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"applyToPrivate",
            						lv_applyToPrivate_12_0,
            						"org.gyaltso.mdsca.ruledsl.RuleDsl.BOOLEAN");
            				

            }


            }

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getTypeNameRuleAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeNameRule"


    // $ANTLR start "entryRuleMethodNameRule"
    // InternalRuleDsl.g:317:1: entryRuleMethodNameRule returns [EObject current=null] : iv_ruleMethodNameRule= ruleMethodNameRule EOF ;
    public final EObject entryRuleMethodNameRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodNameRule = null;


        try {
            // InternalRuleDsl.g:317:55: (iv_ruleMethodNameRule= ruleMethodNameRule EOF )
            // InternalRuleDsl.g:318:2: iv_ruleMethodNameRule= ruleMethodNameRule EOF
            {
             newCompositeNode(grammarAccess.getMethodNameRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodNameRule=ruleMethodNameRule();

            state._fsp--;

             current =iv_ruleMethodNameRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodNameRule"


    // $ANTLR start "ruleMethodNameRule"
    // InternalRuleDsl.g:324:1: ruleMethodNameRule returns [EObject current=null] : ( () ( (lv_name_1_0= 'MethodNameRule' ) ) otherlv_2= '{' otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) otherlv_5= 'allowClassName' ( (lv_allowClassName_6_0= RULE_BOOLEAN ) ) otherlv_7= 'applyToPublic' ( (lv_applyToPublic_8_0= RULE_BOOLEAN ) ) otherlv_9= 'applyToProtected' ( (lv_applyToProtected_10_0= RULE_BOOLEAN ) ) otherlv_11= 'applyToPackage' ( (lv_applyToPackage_12_0= RULE_BOOLEAN ) ) otherlv_13= 'applyToPrivate' ( (lv_applyToPrivate_14_0= RULE_BOOLEAN ) ) otherlv_15= '}' ) ;
    public final EObject ruleMethodNameRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_format_4_0=null;
        Token otherlv_5=null;
        Token lv_allowClassName_6_0=null;
        Token otherlv_7=null;
        Token lv_applyToPublic_8_0=null;
        Token otherlv_9=null;
        Token lv_applyToProtected_10_0=null;
        Token otherlv_11=null;
        Token lv_applyToPackage_12_0=null;
        Token otherlv_13=null;
        Token lv_applyToPrivate_14_0=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:330:2: ( ( () ( (lv_name_1_0= 'MethodNameRule' ) ) otherlv_2= '{' otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) otherlv_5= 'allowClassName' ( (lv_allowClassName_6_0= RULE_BOOLEAN ) ) otherlv_7= 'applyToPublic' ( (lv_applyToPublic_8_0= RULE_BOOLEAN ) ) otherlv_9= 'applyToProtected' ( (lv_applyToProtected_10_0= RULE_BOOLEAN ) ) otherlv_11= 'applyToPackage' ( (lv_applyToPackage_12_0= RULE_BOOLEAN ) ) otherlv_13= 'applyToPrivate' ( (lv_applyToPrivate_14_0= RULE_BOOLEAN ) ) otherlv_15= '}' ) )
            // InternalRuleDsl.g:331:2: ( () ( (lv_name_1_0= 'MethodNameRule' ) ) otherlv_2= '{' otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) otherlv_5= 'allowClassName' ( (lv_allowClassName_6_0= RULE_BOOLEAN ) ) otherlv_7= 'applyToPublic' ( (lv_applyToPublic_8_0= RULE_BOOLEAN ) ) otherlv_9= 'applyToProtected' ( (lv_applyToProtected_10_0= RULE_BOOLEAN ) ) otherlv_11= 'applyToPackage' ( (lv_applyToPackage_12_0= RULE_BOOLEAN ) ) otherlv_13= 'applyToPrivate' ( (lv_applyToPrivate_14_0= RULE_BOOLEAN ) ) otherlv_15= '}' )
            {
            // InternalRuleDsl.g:331:2: ( () ( (lv_name_1_0= 'MethodNameRule' ) ) otherlv_2= '{' otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) otherlv_5= 'allowClassName' ( (lv_allowClassName_6_0= RULE_BOOLEAN ) ) otherlv_7= 'applyToPublic' ( (lv_applyToPublic_8_0= RULE_BOOLEAN ) ) otherlv_9= 'applyToProtected' ( (lv_applyToProtected_10_0= RULE_BOOLEAN ) ) otherlv_11= 'applyToPackage' ( (lv_applyToPackage_12_0= RULE_BOOLEAN ) ) otherlv_13= 'applyToPrivate' ( (lv_applyToPrivate_14_0= RULE_BOOLEAN ) ) otherlv_15= '}' )
            // InternalRuleDsl.g:332:3: () ( (lv_name_1_0= 'MethodNameRule' ) ) otherlv_2= '{' otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) otherlv_5= 'allowClassName' ( (lv_allowClassName_6_0= RULE_BOOLEAN ) ) otherlv_7= 'applyToPublic' ( (lv_applyToPublic_8_0= RULE_BOOLEAN ) ) otherlv_9= 'applyToProtected' ( (lv_applyToProtected_10_0= RULE_BOOLEAN ) ) otherlv_11= 'applyToPackage' ( (lv_applyToPackage_12_0= RULE_BOOLEAN ) ) otherlv_13= 'applyToPrivate' ( (lv_applyToPrivate_14_0= RULE_BOOLEAN ) ) otherlv_15= '}'
            {
            // InternalRuleDsl.g:332:3: ()
            // InternalRuleDsl.g:333:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodNameRuleAccess().getMethodNameRuleAction_0(),
            					current);
            			

            }

            // InternalRuleDsl.g:339:3: ( (lv_name_1_0= 'MethodNameRule' ) )
            // InternalRuleDsl.g:340:4: (lv_name_1_0= 'MethodNameRule' )
            {
            // InternalRuleDsl.g:340:4: (lv_name_1_0= 'MethodNameRule' )
            // InternalRuleDsl.g:341:5: lv_name_1_0= 'MethodNameRule'
            {
            lv_name_1_0=(Token)match(input,20,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodNameRuleAccess().getNameMethodNameRuleKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodNameRuleRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "MethodNameRule");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodNameRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodNameRuleAccess().getFormatKeyword_3());
            		
            // InternalRuleDsl.g:361:3: ( (lv_format_4_0= RULE_STRING ) )
            // InternalRuleDsl.g:362:4: (lv_format_4_0= RULE_STRING )
            {
            // InternalRuleDsl.g:362:4: (lv_format_4_0= RULE_STRING )
            // InternalRuleDsl.g:363:5: lv_format_4_0= RULE_STRING
            {
            lv_format_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_format_4_0, grammarAccess.getMethodNameRuleAccess().getFormatSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodNameRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"format",
            						lv_format_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodNameRuleAccess().getAllowClassNameKeyword_5());
            		
            // InternalRuleDsl.g:383:3: ( (lv_allowClassName_6_0= RULE_BOOLEAN ) )
            // InternalRuleDsl.g:384:4: (lv_allowClassName_6_0= RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:384:4: (lv_allowClassName_6_0= RULE_BOOLEAN )
            // InternalRuleDsl.g:385:5: lv_allowClassName_6_0= RULE_BOOLEAN
            {
            lv_allowClassName_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_9); 

            					newLeafNode(lv_allowClassName_6_0, grammarAccess.getMethodNameRuleAccess().getAllowClassNameBOOLEANTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodNameRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"allowClassName",
            						lv_allowClassName_6_0,
            						"org.gyaltso.mdsca.ruledsl.RuleDsl.BOOLEAN");
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodNameRuleAccess().getApplyToPublicKeyword_7());
            		
            // InternalRuleDsl.g:405:3: ( (lv_applyToPublic_8_0= RULE_BOOLEAN ) )
            // InternalRuleDsl.g:406:4: (lv_applyToPublic_8_0= RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:406:4: (lv_applyToPublic_8_0= RULE_BOOLEAN )
            // InternalRuleDsl.g:407:5: lv_applyToPublic_8_0= RULE_BOOLEAN
            {
            lv_applyToPublic_8_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_11); 

            					newLeafNode(lv_applyToPublic_8_0, grammarAccess.getMethodNameRuleAccess().getApplyToPublicBOOLEANTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodNameRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"applyToPublic",
            						lv_applyToPublic_8_0,
            						"org.gyaltso.mdsca.ruledsl.RuleDsl.BOOLEAN");
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getMethodNameRuleAccess().getApplyToProtectedKeyword_9());
            		
            // InternalRuleDsl.g:427:3: ( (lv_applyToProtected_10_0= RULE_BOOLEAN ) )
            // InternalRuleDsl.g:428:4: (lv_applyToProtected_10_0= RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:428:4: (lv_applyToProtected_10_0= RULE_BOOLEAN )
            // InternalRuleDsl.g:429:5: lv_applyToProtected_10_0= RULE_BOOLEAN
            {
            lv_applyToProtected_10_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_12); 

            					newLeafNode(lv_applyToProtected_10_0, grammarAccess.getMethodNameRuleAccess().getApplyToProtectedBOOLEANTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodNameRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"applyToProtected",
            						lv_applyToProtected_10_0,
            						"org.gyaltso.mdsca.ruledsl.RuleDsl.BOOLEAN");
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getMethodNameRuleAccess().getApplyToPackageKeyword_11());
            		
            // InternalRuleDsl.g:449:3: ( (lv_applyToPackage_12_0= RULE_BOOLEAN ) )
            // InternalRuleDsl.g:450:4: (lv_applyToPackage_12_0= RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:450:4: (lv_applyToPackage_12_0= RULE_BOOLEAN )
            // InternalRuleDsl.g:451:5: lv_applyToPackage_12_0= RULE_BOOLEAN
            {
            lv_applyToPackage_12_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_13); 

            					newLeafNode(lv_applyToPackage_12_0, grammarAccess.getMethodNameRuleAccess().getApplyToPackageBOOLEANTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodNameRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"applyToPackage",
            						lv_applyToPackage_12_0,
            						"org.gyaltso.mdsca.ruledsl.RuleDsl.BOOLEAN");
            				

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_13, grammarAccess.getMethodNameRuleAccess().getApplyToPrivateKeyword_13());
            		
            // InternalRuleDsl.g:471:3: ( (lv_applyToPrivate_14_0= RULE_BOOLEAN ) )
            // InternalRuleDsl.g:472:4: (lv_applyToPrivate_14_0= RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:472:4: (lv_applyToPrivate_14_0= RULE_BOOLEAN )
            // InternalRuleDsl.g:473:5: lv_applyToPrivate_14_0= RULE_BOOLEAN
            {
            lv_applyToPrivate_14_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_14); 

            					newLeafNode(lv_applyToPrivate_14_0, grammarAccess.getMethodNameRuleAccess().getApplyToPrivateBOOLEANTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodNameRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"applyToPrivate",
            						lv_applyToPrivate_14_0,
            						"org.gyaltso.mdsca.ruledsl.RuleDsl.BOOLEAN");
            				

            }


            }

            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getMethodNameRuleAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodNameRule"


    // $ANTLR start "entryRuleMethodLengthRule"
    // InternalRuleDsl.g:497:1: entryRuleMethodLengthRule returns [EObject current=null] : iv_ruleMethodLengthRule= ruleMethodLengthRule EOF ;
    public final EObject entryRuleMethodLengthRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodLengthRule = null;


        try {
            // InternalRuleDsl.g:497:57: (iv_ruleMethodLengthRule= ruleMethodLengthRule EOF )
            // InternalRuleDsl.g:498:2: iv_ruleMethodLengthRule= ruleMethodLengthRule EOF
            {
             newCompositeNode(grammarAccess.getMethodLengthRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodLengthRule=ruleMethodLengthRule();

            state._fsp--;

             current =iv_ruleMethodLengthRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodLengthRule"


    // $ANTLR start "ruleMethodLengthRule"
    // InternalRuleDsl.g:504:1: ruleMethodLengthRule returns [EObject current=null] : ( () ( (lv_name_1_0= 'MethodLengthRule' ) ) otherlv_2= '{' otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) otherlv_5= 'countEmpty' ( (lv_countEmpty_6_0= RULE_BOOLEAN ) ) otherlv_7= '}' ) ;
    public final EObject ruleMethodLengthRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_max_4_0=null;
        Token otherlv_5=null;
        Token lv_countEmpty_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:510:2: ( ( () ( (lv_name_1_0= 'MethodLengthRule' ) ) otherlv_2= '{' otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) otherlv_5= 'countEmpty' ( (lv_countEmpty_6_0= RULE_BOOLEAN ) ) otherlv_7= '}' ) )
            // InternalRuleDsl.g:511:2: ( () ( (lv_name_1_0= 'MethodLengthRule' ) ) otherlv_2= '{' otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) otherlv_5= 'countEmpty' ( (lv_countEmpty_6_0= RULE_BOOLEAN ) ) otherlv_7= '}' )
            {
            // InternalRuleDsl.g:511:2: ( () ( (lv_name_1_0= 'MethodLengthRule' ) ) otherlv_2= '{' otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) otherlv_5= 'countEmpty' ( (lv_countEmpty_6_0= RULE_BOOLEAN ) ) otherlv_7= '}' )
            // InternalRuleDsl.g:512:3: () ( (lv_name_1_0= 'MethodLengthRule' ) ) otherlv_2= '{' otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) otherlv_5= 'countEmpty' ( (lv_countEmpty_6_0= RULE_BOOLEAN ) ) otherlv_7= '}'
            {
            // InternalRuleDsl.g:512:3: ()
            // InternalRuleDsl.g:513:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodLengthRuleAccess().getMethodLengthRuleAction_0(),
            					current);
            			

            }

            // InternalRuleDsl.g:519:3: ( (lv_name_1_0= 'MethodLengthRule' ) )
            // InternalRuleDsl.g:520:4: (lv_name_1_0= 'MethodLengthRule' )
            {
            // InternalRuleDsl.g:520:4: (lv_name_1_0= 'MethodLengthRule' )
            // InternalRuleDsl.g:521:5: lv_name_1_0= 'MethodLengthRule'
            {
            lv_name_1_0=(Token)match(input,22,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodLengthRuleAccess().getNameMethodLengthRuleKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodLengthRuleRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "MethodLengthRule");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodLengthRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodLengthRuleAccess().getMaxKeyword_3());
            		
            // InternalRuleDsl.g:541:3: ( (lv_max_4_0= RULE_INT ) )
            // InternalRuleDsl.g:542:4: (lv_max_4_0= RULE_INT )
            {
            // InternalRuleDsl.g:542:4: (lv_max_4_0= RULE_INT )
            // InternalRuleDsl.g:543:5: lv_max_4_0= RULE_INT
            {
            lv_max_4_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_max_4_0, grammarAccess.getMethodLengthRuleAccess().getMaxINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodLengthRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodLengthRuleAccess().getCountEmptyKeyword_5());
            		
            // InternalRuleDsl.g:563:3: ( (lv_countEmpty_6_0= RULE_BOOLEAN ) )
            // InternalRuleDsl.g:564:4: (lv_countEmpty_6_0= RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:564:4: (lv_countEmpty_6_0= RULE_BOOLEAN )
            // InternalRuleDsl.g:565:5: lv_countEmpty_6_0= RULE_BOOLEAN
            {
            lv_countEmpty_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_14); 

            					newLeafNode(lv_countEmpty_6_0, grammarAccess.getMethodLengthRuleAccess().getCountEmptyBOOLEANTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodLengthRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"countEmpty",
            						lv_countEmpty_6_0,
            						"org.gyaltso.mdsca.ruledsl.RuleDsl.BOOLEAN");
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodLengthRuleAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodLengthRule"


    // $ANTLR start "entryRuleMethodParamCountRule"
    // InternalRuleDsl.g:589:1: entryRuleMethodParamCountRule returns [EObject current=null] : iv_ruleMethodParamCountRule= ruleMethodParamCountRule EOF ;
    public final EObject entryRuleMethodParamCountRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodParamCountRule = null;


        try {
            // InternalRuleDsl.g:589:61: (iv_ruleMethodParamCountRule= ruleMethodParamCountRule EOF )
            // InternalRuleDsl.g:590:2: iv_ruleMethodParamCountRule= ruleMethodParamCountRule EOF
            {
             newCompositeNode(grammarAccess.getMethodParamCountRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodParamCountRule=ruleMethodParamCountRule();

            state._fsp--;

             current =iv_ruleMethodParamCountRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodParamCountRule"


    // $ANTLR start "ruleMethodParamCountRule"
    // InternalRuleDsl.g:596:1: ruleMethodParamCountRule returns [EObject current=null] : ( () ( (lv_name_1_0= 'MethodParamLengthRule' ) ) otherlv_2= '{' otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) otherlv_5= 'ignoreOverriddenMethods' ( (lv_ignoreOverriddenMethods_6_0= RULE_BOOLEAN ) ) otherlv_7= '}' ) ;
    public final EObject ruleMethodParamCountRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_max_4_0=null;
        Token otherlv_5=null;
        Token lv_ignoreOverriddenMethods_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:602:2: ( ( () ( (lv_name_1_0= 'MethodParamLengthRule' ) ) otherlv_2= '{' otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) otherlv_5= 'ignoreOverriddenMethods' ( (lv_ignoreOverriddenMethods_6_0= RULE_BOOLEAN ) ) otherlv_7= '}' ) )
            // InternalRuleDsl.g:603:2: ( () ( (lv_name_1_0= 'MethodParamLengthRule' ) ) otherlv_2= '{' otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) otherlv_5= 'ignoreOverriddenMethods' ( (lv_ignoreOverriddenMethods_6_0= RULE_BOOLEAN ) ) otherlv_7= '}' )
            {
            // InternalRuleDsl.g:603:2: ( () ( (lv_name_1_0= 'MethodParamLengthRule' ) ) otherlv_2= '{' otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) otherlv_5= 'ignoreOverriddenMethods' ( (lv_ignoreOverriddenMethods_6_0= RULE_BOOLEAN ) ) otherlv_7= '}' )
            // InternalRuleDsl.g:604:3: () ( (lv_name_1_0= 'MethodParamLengthRule' ) ) otherlv_2= '{' otherlv_3= 'max' ( (lv_max_4_0= RULE_INT ) ) otherlv_5= 'ignoreOverriddenMethods' ( (lv_ignoreOverriddenMethods_6_0= RULE_BOOLEAN ) ) otherlv_7= '}'
            {
            // InternalRuleDsl.g:604:3: ()
            // InternalRuleDsl.g:605:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMethodParamCountRuleAccess().getMethodParamCountRuleAction_0(),
            					current);
            			

            }

            // InternalRuleDsl.g:611:3: ( (lv_name_1_0= 'MethodParamLengthRule' ) )
            // InternalRuleDsl.g:612:4: (lv_name_1_0= 'MethodParamLengthRule' )
            {
            // InternalRuleDsl.g:612:4: (lv_name_1_0= 'MethodParamLengthRule' )
            // InternalRuleDsl.g:613:5: lv_name_1_0= 'MethodParamLengthRule'
            {
            lv_name_1_0=(Token)match(input,25,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodParamCountRuleAccess().getNameMethodParamLengthRuleKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodParamCountRuleRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "MethodParamLengthRule");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodParamCountRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodParamCountRuleAccess().getMaxKeyword_3());
            		
            // InternalRuleDsl.g:633:3: ( (lv_max_4_0= RULE_INT ) )
            // InternalRuleDsl.g:634:4: (lv_max_4_0= RULE_INT )
            {
            // InternalRuleDsl.g:634:4: (lv_max_4_0= RULE_INT )
            // InternalRuleDsl.g:635:5: lv_max_4_0= RULE_INT
            {
            lv_max_4_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_max_4_0, grammarAccess.getMethodParamCountRuleAccess().getMaxINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodParamCountRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodParamCountRuleAccess().getIgnoreOverriddenMethodsKeyword_5());
            		
            // InternalRuleDsl.g:655:3: ( (lv_ignoreOverriddenMethods_6_0= RULE_BOOLEAN ) )
            // InternalRuleDsl.g:656:4: (lv_ignoreOverriddenMethods_6_0= RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:656:4: (lv_ignoreOverriddenMethods_6_0= RULE_BOOLEAN )
            // InternalRuleDsl.g:657:5: lv_ignoreOverriddenMethods_6_0= RULE_BOOLEAN
            {
            lv_ignoreOverriddenMethods_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_14); 

            					newLeafNode(lv_ignoreOverriddenMethods_6_0, grammarAccess.getMethodParamCountRuleAccess().getIgnoreOverriddenMethodsBOOLEANTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodParamCountRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ignoreOverriddenMethods",
            						lv_ignoreOverriddenMethods_6_0,
            						"org.gyaltso.mdsca.ruledsl.RuleDsl.BOOLEAN");
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodParamCountRuleAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodParamCountRule"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002401002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});

}