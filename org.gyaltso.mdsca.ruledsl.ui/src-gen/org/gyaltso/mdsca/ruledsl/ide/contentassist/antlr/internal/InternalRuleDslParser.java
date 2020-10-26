package org.gyaltso.mdsca.ruledsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.gyaltso.mdsca.ruledsl.services.RuleDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRuleDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'format'", "'applyToPublic'", "'applyToProtected'", "'applyToPackage'", "'applyToPrivate'", "'}'", "'allowClassName'", "'max'", "'countEmpty'", "'ignoreOverriddenMethods'", "'TypeName'", "'MethodNameRule'", "'MethodLengthRule'", "'MethodParamLengthRule'"
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

    	public void setGrammarAccess(RuleDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRulesFile"
    // InternalRuleDsl.g:53:1: entryRuleRulesFile : ruleRulesFile EOF ;
    public final void entryRuleRulesFile() throws RecognitionException {
        try {
            // InternalRuleDsl.g:54:1: ( ruleRulesFile EOF )
            // InternalRuleDsl.g:55:1: ruleRulesFile EOF
            {
             before(grammarAccess.getRulesFileRule()); 
            pushFollow(FOLLOW_1);
            ruleRulesFile();

            state._fsp--;

             after(grammarAccess.getRulesFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRulesFile"


    // $ANTLR start "ruleRulesFile"
    // InternalRuleDsl.g:62:1: ruleRulesFile : ( ( rule__RulesFile__Group__0 ) ) ;
    public final void ruleRulesFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:66:2: ( ( ( rule__RulesFile__Group__0 ) ) )
            // InternalRuleDsl.g:67:2: ( ( rule__RulesFile__Group__0 ) )
            {
            // InternalRuleDsl.g:67:2: ( ( rule__RulesFile__Group__0 ) )
            // InternalRuleDsl.g:68:3: ( rule__RulesFile__Group__0 )
            {
             before(grammarAccess.getRulesFileAccess().getGroup()); 
            // InternalRuleDsl.g:69:3: ( rule__RulesFile__Group__0 )
            // InternalRuleDsl.g:69:4: rule__RulesFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RulesFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRulesFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRulesFile"


    // $ANTLR start "entryRuleTypeNameRule"
    // InternalRuleDsl.g:78:1: entryRuleTypeNameRule : ruleTypeNameRule EOF ;
    public final void entryRuleTypeNameRule() throws RecognitionException {
        try {
            // InternalRuleDsl.g:79:1: ( ruleTypeNameRule EOF )
            // InternalRuleDsl.g:80:1: ruleTypeNameRule EOF
            {
             before(grammarAccess.getTypeNameRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeNameRule();

            state._fsp--;

             after(grammarAccess.getTypeNameRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeNameRule"


    // $ANTLR start "ruleTypeNameRule"
    // InternalRuleDsl.g:87:1: ruleTypeNameRule : ( ( rule__TypeNameRule__Group__0 ) ) ;
    public final void ruleTypeNameRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:91:2: ( ( ( rule__TypeNameRule__Group__0 ) ) )
            // InternalRuleDsl.g:92:2: ( ( rule__TypeNameRule__Group__0 ) )
            {
            // InternalRuleDsl.g:92:2: ( ( rule__TypeNameRule__Group__0 ) )
            // InternalRuleDsl.g:93:3: ( rule__TypeNameRule__Group__0 )
            {
             before(grammarAccess.getTypeNameRuleAccess().getGroup()); 
            // InternalRuleDsl.g:94:3: ( rule__TypeNameRule__Group__0 )
            // InternalRuleDsl.g:94:4: rule__TypeNameRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeNameRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeNameRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeNameRule"


    // $ANTLR start "entryRuleMethodNameRule"
    // InternalRuleDsl.g:103:1: entryRuleMethodNameRule : ruleMethodNameRule EOF ;
    public final void entryRuleMethodNameRule() throws RecognitionException {
        try {
            // InternalRuleDsl.g:104:1: ( ruleMethodNameRule EOF )
            // InternalRuleDsl.g:105:1: ruleMethodNameRule EOF
            {
             before(grammarAccess.getMethodNameRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodNameRule();

            state._fsp--;

             after(grammarAccess.getMethodNameRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodNameRule"


    // $ANTLR start "ruleMethodNameRule"
    // InternalRuleDsl.g:112:1: ruleMethodNameRule : ( ( rule__MethodNameRule__Group__0 ) ) ;
    public final void ruleMethodNameRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:116:2: ( ( ( rule__MethodNameRule__Group__0 ) ) )
            // InternalRuleDsl.g:117:2: ( ( rule__MethodNameRule__Group__0 ) )
            {
            // InternalRuleDsl.g:117:2: ( ( rule__MethodNameRule__Group__0 ) )
            // InternalRuleDsl.g:118:3: ( rule__MethodNameRule__Group__0 )
            {
             before(grammarAccess.getMethodNameRuleAccess().getGroup()); 
            // InternalRuleDsl.g:119:3: ( rule__MethodNameRule__Group__0 )
            // InternalRuleDsl.g:119:4: rule__MethodNameRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodNameRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodNameRule"


    // $ANTLR start "entryRuleMethodLengthRule"
    // InternalRuleDsl.g:128:1: entryRuleMethodLengthRule : ruleMethodLengthRule EOF ;
    public final void entryRuleMethodLengthRule() throws RecognitionException {
        try {
            // InternalRuleDsl.g:129:1: ( ruleMethodLengthRule EOF )
            // InternalRuleDsl.g:130:1: ruleMethodLengthRule EOF
            {
             before(grammarAccess.getMethodLengthRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodLengthRule();

            state._fsp--;

             after(grammarAccess.getMethodLengthRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodLengthRule"


    // $ANTLR start "ruleMethodLengthRule"
    // InternalRuleDsl.g:137:1: ruleMethodLengthRule : ( ( rule__MethodLengthRule__Group__0 ) ) ;
    public final void ruleMethodLengthRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:141:2: ( ( ( rule__MethodLengthRule__Group__0 ) ) )
            // InternalRuleDsl.g:142:2: ( ( rule__MethodLengthRule__Group__0 ) )
            {
            // InternalRuleDsl.g:142:2: ( ( rule__MethodLengthRule__Group__0 ) )
            // InternalRuleDsl.g:143:3: ( rule__MethodLengthRule__Group__0 )
            {
             before(grammarAccess.getMethodLengthRuleAccess().getGroup()); 
            // InternalRuleDsl.g:144:3: ( rule__MethodLengthRule__Group__0 )
            // InternalRuleDsl.g:144:4: rule__MethodLengthRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodLengthRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodLengthRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodLengthRule"


    // $ANTLR start "entryRuleMethodParamCountRule"
    // InternalRuleDsl.g:153:1: entryRuleMethodParamCountRule : ruleMethodParamCountRule EOF ;
    public final void entryRuleMethodParamCountRule() throws RecognitionException {
        try {
            // InternalRuleDsl.g:154:1: ( ruleMethodParamCountRule EOF )
            // InternalRuleDsl.g:155:1: ruleMethodParamCountRule EOF
            {
             before(grammarAccess.getMethodParamCountRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodParamCountRule();

            state._fsp--;

             after(grammarAccess.getMethodParamCountRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodParamCountRule"


    // $ANTLR start "ruleMethodParamCountRule"
    // InternalRuleDsl.g:162:1: ruleMethodParamCountRule : ( ( rule__MethodParamCountRule__Group__0 ) ) ;
    public final void ruleMethodParamCountRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:166:2: ( ( ( rule__MethodParamCountRule__Group__0 ) ) )
            // InternalRuleDsl.g:167:2: ( ( rule__MethodParamCountRule__Group__0 ) )
            {
            // InternalRuleDsl.g:167:2: ( ( rule__MethodParamCountRule__Group__0 ) )
            // InternalRuleDsl.g:168:3: ( rule__MethodParamCountRule__Group__0 )
            {
             before(grammarAccess.getMethodParamCountRuleAccess().getGroup()); 
            // InternalRuleDsl.g:169:3: ( rule__MethodParamCountRule__Group__0 )
            // InternalRuleDsl.g:169:4: rule__MethodParamCountRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodParamCountRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodParamCountRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodParamCountRule"


    // $ANTLR start "rule__RulesFile__Group__0"
    // InternalRuleDsl.g:177:1: rule__RulesFile__Group__0 : rule__RulesFile__Group__0__Impl rule__RulesFile__Group__1 ;
    public final void rule__RulesFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:181:1: ( rule__RulesFile__Group__0__Impl rule__RulesFile__Group__1 )
            // InternalRuleDsl.g:182:2: rule__RulesFile__Group__0__Impl rule__RulesFile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RulesFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RulesFile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulesFile__Group__0"


    // $ANTLR start "rule__RulesFile__Group__0__Impl"
    // InternalRuleDsl.g:189:1: rule__RulesFile__Group__0__Impl : ( ( rule__RulesFile__MethodNameRuleAssignment_0 )? ) ;
    public final void rule__RulesFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:193:1: ( ( ( rule__RulesFile__MethodNameRuleAssignment_0 )? ) )
            // InternalRuleDsl.g:194:1: ( ( rule__RulesFile__MethodNameRuleAssignment_0 )? )
            {
            // InternalRuleDsl.g:194:1: ( ( rule__RulesFile__MethodNameRuleAssignment_0 )? )
            // InternalRuleDsl.g:195:2: ( rule__RulesFile__MethodNameRuleAssignment_0 )?
            {
             before(grammarAccess.getRulesFileAccess().getMethodNameRuleAssignment_0()); 
            // InternalRuleDsl.g:196:2: ( rule__RulesFile__MethodNameRuleAssignment_0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRuleDsl.g:196:3: rule__RulesFile__MethodNameRuleAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RulesFile__MethodNameRuleAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRulesFileAccess().getMethodNameRuleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulesFile__Group__0__Impl"


    // $ANTLR start "rule__RulesFile__Group__1"
    // InternalRuleDsl.g:204:1: rule__RulesFile__Group__1 : rule__RulesFile__Group__1__Impl rule__RulesFile__Group__2 ;
    public final void rule__RulesFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:208:1: ( rule__RulesFile__Group__1__Impl rule__RulesFile__Group__2 )
            // InternalRuleDsl.g:209:2: rule__RulesFile__Group__1__Impl rule__RulesFile__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RulesFile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RulesFile__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulesFile__Group__1"


    // $ANTLR start "rule__RulesFile__Group__1__Impl"
    // InternalRuleDsl.g:216:1: rule__RulesFile__Group__1__Impl : ( ( rule__RulesFile__MethdLengthRuleAssignment_1 )? ) ;
    public final void rule__RulesFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:220:1: ( ( ( rule__RulesFile__MethdLengthRuleAssignment_1 )? ) )
            // InternalRuleDsl.g:221:1: ( ( rule__RulesFile__MethdLengthRuleAssignment_1 )? )
            {
            // InternalRuleDsl.g:221:1: ( ( rule__RulesFile__MethdLengthRuleAssignment_1 )? )
            // InternalRuleDsl.g:222:2: ( rule__RulesFile__MethdLengthRuleAssignment_1 )?
            {
             before(grammarAccess.getRulesFileAccess().getMethdLengthRuleAssignment_1()); 
            // InternalRuleDsl.g:223:2: ( rule__RulesFile__MethdLengthRuleAssignment_1 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==25) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRuleDsl.g:223:3: rule__RulesFile__MethdLengthRuleAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RulesFile__MethdLengthRuleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRulesFileAccess().getMethdLengthRuleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulesFile__Group__1__Impl"


    // $ANTLR start "rule__RulesFile__Group__2"
    // InternalRuleDsl.g:231:1: rule__RulesFile__Group__2 : rule__RulesFile__Group__2__Impl rule__RulesFile__Group__3 ;
    public final void rule__RulesFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:235:1: ( rule__RulesFile__Group__2__Impl rule__RulesFile__Group__3 )
            // InternalRuleDsl.g:236:2: rule__RulesFile__Group__2__Impl rule__RulesFile__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__RulesFile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RulesFile__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulesFile__Group__2"


    // $ANTLR start "rule__RulesFile__Group__2__Impl"
    // InternalRuleDsl.g:243:1: rule__RulesFile__Group__2__Impl : ( ( rule__RulesFile__MethodNoOfParamsRuleAssignment_2 )? ) ;
    public final void rule__RulesFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:247:1: ( ( ( rule__RulesFile__MethodNoOfParamsRuleAssignment_2 )? ) )
            // InternalRuleDsl.g:248:1: ( ( rule__RulesFile__MethodNoOfParamsRuleAssignment_2 )? )
            {
            // InternalRuleDsl.g:248:1: ( ( rule__RulesFile__MethodNoOfParamsRuleAssignment_2 )? )
            // InternalRuleDsl.g:249:2: ( rule__RulesFile__MethodNoOfParamsRuleAssignment_2 )?
            {
             before(grammarAccess.getRulesFileAccess().getMethodNoOfParamsRuleAssignment_2()); 
            // InternalRuleDsl.g:250:2: ( rule__RulesFile__MethodNoOfParamsRuleAssignment_2 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRuleDsl.g:250:3: rule__RulesFile__MethodNoOfParamsRuleAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RulesFile__MethodNoOfParamsRuleAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRulesFileAccess().getMethodNoOfParamsRuleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulesFile__Group__2__Impl"


    // $ANTLR start "rule__RulesFile__Group__3"
    // InternalRuleDsl.g:258:1: rule__RulesFile__Group__3 : rule__RulesFile__Group__3__Impl ;
    public final void rule__RulesFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:262:1: ( rule__RulesFile__Group__3__Impl )
            // InternalRuleDsl.g:263:2: rule__RulesFile__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RulesFile__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulesFile__Group__3"


    // $ANTLR start "rule__RulesFile__Group__3__Impl"
    // InternalRuleDsl.g:269:1: rule__RulesFile__Group__3__Impl : ( ( rule__RulesFile__TypeNameAssignment_3 )? ) ;
    public final void rule__RulesFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:273:1: ( ( ( rule__RulesFile__TypeNameAssignment_3 )? ) )
            // InternalRuleDsl.g:274:1: ( ( rule__RulesFile__TypeNameAssignment_3 )? )
            {
            // InternalRuleDsl.g:274:1: ( ( rule__RulesFile__TypeNameAssignment_3 )? )
            // InternalRuleDsl.g:275:2: ( rule__RulesFile__TypeNameAssignment_3 )?
            {
             before(grammarAccess.getRulesFileAccess().getTypeNameAssignment_3()); 
            // InternalRuleDsl.g:276:2: ( rule__RulesFile__TypeNameAssignment_3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRuleDsl.g:276:3: rule__RulesFile__TypeNameAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RulesFile__TypeNameAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRulesFileAccess().getTypeNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulesFile__Group__3__Impl"


    // $ANTLR start "rule__TypeNameRule__Group__0"
    // InternalRuleDsl.g:285:1: rule__TypeNameRule__Group__0 : rule__TypeNameRule__Group__0__Impl rule__TypeNameRule__Group__1 ;
    public final void rule__TypeNameRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:289:1: ( rule__TypeNameRule__Group__0__Impl rule__TypeNameRule__Group__1 )
            // InternalRuleDsl.g:290:2: rule__TypeNameRule__Group__0__Impl rule__TypeNameRule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TypeNameRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeNameRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__0"


    // $ANTLR start "rule__TypeNameRule__Group__0__Impl"
    // InternalRuleDsl.g:297:1: rule__TypeNameRule__Group__0__Impl : ( () ) ;
    public final void rule__TypeNameRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:301:1: ( ( () ) )
            // InternalRuleDsl.g:302:1: ( () )
            {
            // InternalRuleDsl.g:302:1: ( () )
            // InternalRuleDsl.g:303:2: ()
            {
             before(grammarAccess.getTypeNameRuleAccess().getTypeNameRuleAction_0()); 
            // InternalRuleDsl.g:304:2: ()
            // InternalRuleDsl.g:304:3: 
            {
            }

             after(grammarAccess.getTypeNameRuleAccess().getTypeNameRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__0__Impl"


    // $ANTLR start "rule__TypeNameRule__Group__1"
    // InternalRuleDsl.g:312:1: rule__TypeNameRule__Group__1 : rule__TypeNameRule__Group__1__Impl rule__TypeNameRule__Group__2 ;
    public final void rule__TypeNameRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:316:1: ( rule__TypeNameRule__Group__1__Impl rule__TypeNameRule__Group__2 )
            // InternalRuleDsl.g:317:2: rule__TypeNameRule__Group__1__Impl rule__TypeNameRule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TypeNameRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeNameRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__1"


    // $ANTLR start "rule__TypeNameRule__Group__1__Impl"
    // InternalRuleDsl.g:324:1: rule__TypeNameRule__Group__1__Impl : ( ( rule__TypeNameRule__NameAssignment_1 ) ) ;
    public final void rule__TypeNameRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:328:1: ( ( ( rule__TypeNameRule__NameAssignment_1 ) ) )
            // InternalRuleDsl.g:329:1: ( ( rule__TypeNameRule__NameAssignment_1 ) )
            {
            // InternalRuleDsl.g:329:1: ( ( rule__TypeNameRule__NameAssignment_1 ) )
            // InternalRuleDsl.g:330:2: ( rule__TypeNameRule__NameAssignment_1 )
            {
             before(grammarAccess.getTypeNameRuleAccess().getNameAssignment_1()); 
            // InternalRuleDsl.g:331:2: ( rule__TypeNameRule__NameAssignment_1 )
            // InternalRuleDsl.g:331:3: rule__TypeNameRule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeNameRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeNameRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__1__Impl"


    // $ANTLR start "rule__TypeNameRule__Group__2"
    // InternalRuleDsl.g:339:1: rule__TypeNameRule__Group__2 : rule__TypeNameRule__Group__2__Impl rule__TypeNameRule__Group__3 ;
    public final void rule__TypeNameRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:343:1: ( rule__TypeNameRule__Group__2__Impl rule__TypeNameRule__Group__3 )
            // InternalRuleDsl.g:344:2: rule__TypeNameRule__Group__2__Impl rule__TypeNameRule__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__TypeNameRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeNameRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__2"


    // $ANTLR start "rule__TypeNameRule__Group__2__Impl"
    // InternalRuleDsl.g:351:1: rule__TypeNameRule__Group__2__Impl : ( '{' ) ;
    public final void rule__TypeNameRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:355:1: ( ( '{' ) )
            // InternalRuleDsl.g:356:1: ( '{' )
            {
            // InternalRuleDsl.g:356:1: ( '{' )
            // InternalRuleDsl.g:357:2: '{'
            {
             before(grammarAccess.getTypeNameRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTypeNameRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__2__Impl"


    // $ANTLR start "rule__TypeNameRule__Group__3"
    // InternalRuleDsl.g:366:1: rule__TypeNameRule__Group__3 : rule__TypeNameRule__Group__3__Impl rule__TypeNameRule__Group__4 ;
    public final void rule__TypeNameRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:370:1: ( rule__TypeNameRule__Group__3__Impl rule__TypeNameRule__Group__4 )
            // InternalRuleDsl.g:371:2: rule__TypeNameRule__Group__3__Impl rule__TypeNameRule__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__TypeNameRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeNameRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__3"


    // $ANTLR start "rule__TypeNameRule__Group__3__Impl"
    // InternalRuleDsl.g:378:1: rule__TypeNameRule__Group__3__Impl : ( 'format' ) ;
    public final void rule__TypeNameRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:382:1: ( ( 'format' ) )
            // InternalRuleDsl.g:383:1: ( 'format' )
            {
            // InternalRuleDsl.g:383:1: ( 'format' )
            // InternalRuleDsl.g:384:2: 'format'
            {
             before(grammarAccess.getTypeNameRuleAccess().getFormatKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTypeNameRuleAccess().getFormatKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__3__Impl"


    // $ANTLR start "rule__TypeNameRule__Group__4"
    // InternalRuleDsl.g:393:1: rule__TypeNameRule__Group__4 : rule__TypeNameRule__Group__4__Impl rule__TypeNameRule__Group__5 ;
    public final void rule__TypeNameRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:397:1: ( rule__TypeNameRule__Group__4__Impl rule__TypeNameRule__Group__5 )
            // InternalRuleDsl.g:398:2: rule__TypeNameRule__Group__4__Impl rule__TypeNameRule__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__TypeNameRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeNameRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__4"


    // $ANTLR start "rule__TypeNameRule__Group__4__Impl"
    // InternalRuleDsl.g:405:1: rule__TypeNameRule__Group__4__Impl : ( ( rule__TypeNameRule__FormatAssignment_4 ) ) ;
    public final void rule__TypeNameRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:409:1: ( ( ( rule__TypeNameRule__FormatAssignment_4 ) ) )
            // InternalRuleDsl.g:410:1: ( ( rule__TypeNameRule__FormatAssignment_4 ) )
            {
            // InternalRuleDsl.g:410:1: ( ( rule__TypeNameRule__FormatAssignment_4 ) )
            // InternalRuleDsl.g:411:2: ( rule__TypeNameRule__FormatAssignment_4 )
            {
             before(grammarAccess.getTypeNameRuleAccess().getFormatAssignment_4()); 
            // InternalRuleDsl.g:412:2: ( rule__TypeNameRule__FormatAssignment_4 )
            // InternalRuleDsl.g:412:3: rule__TypeNameRule__FormatAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TypeNameRule__FormatAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTypeNameRuleAccess().getFormatAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__4__Impl"


    // $ANTLR start "rule__TypeNameRule__Group__5"
    // InternalRuleDsl.g:420:1: rule__TypeNameRule__Group__5 : rule__TypeNameRule__Group__5__Impl rule__TypeNameRule__Group__6 ;
    public final void rule__TypeNameRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:424:1: ( rule__TypeNameRule__Group__5__Impl rule__TypeNameRule__Group__6 )
            // InternalRuleDsl.g:425:2: rule__TypeNameRule__Group__5__Impl rule__TypeNameRule__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__TypeNameRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeNameRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__5"


    // $ANTLR start "rule__TypeNameRule__Group__5__Impl"
    // InternalRuleDsl.g:432:1: rule__TypeNameRule__Group__5__Impl : ( 'applyToPublic' ) ;
    public final void rule__TypeNameRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:436:1: ( ( 'applyToPublic' ) )
            // InternalRuleDsl.g:437:1: ( 'applyToPublic' )
            {
            // InternalRuleDsl.g:437:1: ( 'applyToPublic' )
            // InternalRuleDsl.g:438:2: 'applyToPublic'
            {
             before(grammarAccess.getTypeNameRuleAccess().getApplyToPublicKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTypeNameRuleAccess().getApplyToPublicKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__5__Impl"


    // $ANTLR start "rule__TypeNameRule__Group__6"
    // InternalRuleDsl.g:447:1: rule__TypeNameRule__Group__6 : rule__TypeNameRule__Group__6__Impl rule__TypeNameRule__Group__7 ;
    public final void rule__TypeNameRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:451:1: ( rule__TypeNameRule__Group__6__Impl rule__TypeNameRule__Group__7 )
            // InternalRuleDsl.g:452:2: rule__TypeNameRule__Group__6__Impl rule__TypeNameRule__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__TypeNameRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeNameRule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__6"


    // $ANTLR start "rule__TypeNameRule__Group__6__Impl"
    // InternalRuleDsl.g:459:1: rule__TypeNameRule__Group__6__Impl : ( ( rule__TypeNameRule__ApplyToPublicAssignment_6 ) ) ;
    public final void rule__TypeNameRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:463:1: ( ( ( rule__TypeNameRule__ApplyToPublicAssignment_6 ) ) )
            // InternalRuleDsl.g:464:1: ( ( rule__TypeNameRule__ApplyToPublicAssignment_6 ) )
            {
            // InternalRuleDsl.g:464:1: ( ( rule__TypeNameRule__ApplyToPublicAssignment_6 ) )
            // InternalRuleDsl.g:465:2: ( rule__TypeNameRule__ApplyToPublicAssignment_6 )
            {
             before(grammarAccess.getTypeNameRuleAccess().getApplyToPublicAssignment_6()); 
            // InternalRuleDsl.g:466:2: ( rule__TypeNameRule__ApplyToPublicAssignment_6 )
            // InternalRuleDsl.g:466:3: rule__TypeNameRule__ApplyToPublicAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TypeNameRule__ApplyToPublicAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTypeNameRuleAccess().getApplyToPublicAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__6__Impl"


    // $ANTLR start "rule__TypeNameRule__Group__7"
    // InternalRuleDsl.g:474:1: rule__TypeNameRule__Group__7 : rule__TypeNameRule__Group__7__Impl rule__TypeNameRule__Group__8 ;
    public final void rule__TypeNameRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:478:1: ( rule__TypeNameRule__Group__7__Impl rule__TypeNameRule__Group__8 )
            // InternalRuleDsl.g:479:2: rule__TypeNameRule__Group__7__Impl rule__TypeNameRule__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__TypeNameRule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeNameRule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__7"


    // $ANTLR start "rule__TypeNameRule__Group__7__Impl"
    // InternalRuleDsl.g:486:1: rule__TypeNameRule__Group__7__Impl : ( 'applyToProtected' ) ;
    public final void rule__TypeNameRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:490:1: ( ( 'applyToProtected' ) )
            // InternalRuleDsl.g:491:1: ( 'applyToProtected' )
            {
            // InternalRuleDsl.g:491:1: ( 'applyToProtected' )
            // InternalRuleDsl.g:492:2: 'applyToProtected'
            {
             before(grammarAccess.getTypeNameRuleAccess().getApplyToProtectedKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTypeNameRuleAccess().getApplyToProtectedKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__7__Impl"


    // $ANTLR start "rule__TypeNameRule__Group__8"
    // InternalRuleDsl.g:501:1: rule__TypeNameRule__Group__8 : rule__TypeNameRule__Group__8__Impl rule__TypeNameRule__Group__9 ;
    public final void rule__TypeNameRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:505:1: ( rule__TypeNameRule__Group__8__Impl rule__TypeNameRule__Group__9 )
            // InternalRuleDsl.g:506:2: rule__TypeNameRule__Group__8__Impl rule__TypeNameRule__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__TypeNameRule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeNameRule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__8"


    // $ANTLR start "rule__TypeNameRule__Group__8__Impl"
    // InternalRuleDsl.g:513:1: rule__TypeNameRule__Group__8__Impl : ( ( rule__TypeNameRule__ApplyToProtectedAssignment_8 ) ) ;
    public final void rule__TypeNameRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:517:1: ( ( ( rule__TypeNameRule__ApplyToProtectedAssignment_8 ) ) )
            // InternalRuleDsl.g:518:1: ( ( rule__TypeNameRule__ApplyToProtectedAssignment_8 ) )
            {
            // InternalRuleDsl.g:518:1: ( ( rule__TypeNameRule__ApplyToProtectedAssignment_8 ) )
            // InternalRuleDsl.g:519:2: ( rule__TypeNameRule__ApplyToProtectedAssignment_8 )
            {
             before(grammarAccess.getTypeNameRuleAccess().getApplyToProtectedAssignment_8()); 
            // InternalRuleDsl.g:520:2: ( rule__TypeNameRule__ApplyToProtectedAssignment_8 )
            // InternalRuleDsl.g:520:3: rule__TypeNameRule__ApplyToProtectedAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__TypeNameRule__ApplyToProtectedAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTypeNameRuleAccess().getApplyToProtectedAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__8__Impl"


    // $ANTLR start "rule__TypeNameRule__Group__9"
    // InternalRuleDsl.g:528:1: rule__TypeNameRule__Group__9 : rule__TypeNameRule__Group__9__Impl rule__TypeNameRule__Group__10 ;
    public final void rule__TypeNameRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:532:1: ( rule__TypeNameRule__Group__9__Impl rule__TypeNameRule__Group__10 )
            // InternalRuleDsl.g:533:2: rule__TypeNameRule__Group__9__Impl rule__TypeNameRule__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__TypeNameRule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeNameRule__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__9"


    // $ANTLR start "rule__TypeNameRule__Group__9__Impl"
    // InternalRuleDsl.g:540:1: rule__TypeNameRule__Group__9__Impl : ( 'applyToPackage' ) ;
    public final void rule__TypeNameRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:544:1: ( ( 'applyToPackage' ) )
            // InternalRuleDsl.g:545:1: ( 'applyToPackage' )
            {
            // InternalRuleDsl.g:545:1: ( 'applyToPackage' )
            // InternalRuleDsl.g:546:2: 'applyToPackage'
            {
             before(grammarAccess.getTypeNameRuleAccess().getApplyToPackageKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTypeNameRuleAccess().getApplyToPackageKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__9__Impl"


    // $ANTLR start "rule__TypeNameRule__Group__10"
    // InternalRuleDsl.g:555:1: rule__TypeNameRule__Group__10 : rule__TypeNameRule__Group__10__Impl rule__TypeNameRule__Group__11 ;
    public final void rule__TypeNameRule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:559:1: ( rule__TypeNameRule__Group__10__Impl rule__TypeNameRule__Group__11 )
            // InternalRuleDsl.g:560:2: rule__TypeNameRule__Group__10__Impl rule__TypeNameRule__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__TypeNameRule__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeNameRule__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__10"


    // $ANTLR start "rule__TypeNameRule__Group__10__Impl"
    // InternalRuleDsl.g:567:1: rule__TypeNameRule__Group__10__Impl : ( ( rule__TypeNameRule__ApplyToPackageAssignment_10 ) ) ;
    public final void rule__TypeNameRule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:571:1: ( ( ( rule__TypeNameRule__ApplyToPackageAssignment_10 ) ) )
            // InternalRuleDsl.g:572:1: ( ( rule__TypeNameRule__ApplyToPackageAssignment_10 ) )
            {
            // InternalRuleDsl.g:572:1: ( ( rule__TypeNameRule__ApplyToPackageAssignment_10 ) )
            // InternalRuleDsl.g:573:2: ( rule__TypeNameRule__ApplyToPackageAssignment_10 )
            {
             before(grammarAccess.getTypeNameRuleAccess().getApplyToPackageAssignment_10()); 
            // InternalRuleDsl.g:574:2: ( rule__TypeNameRule__ApplyToPackageAssignment_10 )
            // InternalRuleDsl.g:574:3: rule__TypeNameRule__ApplyToPackageAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__TypeNameRule__ApplyToPackageAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTypeNameRuleAccess().getApplyToPackageAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__10__Impl"


    // $ANTLR start "rule__TypeNameRule__Group__11"
    // InternalRuleDsl.g:582:1: rule__TypeNameRule__Group__11 : rule__TypeNameRule__Group__11__Impl rule__TypeNameRule__Group__12 ;
    public final void rule__TypeNameRule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:586:1: ( rule__TypeNameRule__Group__11__Impl rule__TypeNameRule__Group__12 )
            // InternalRuleDsl.g:587:2: rule__TypeNameRule__Group__11__Impl rule__TypeNameRule__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__TypeNameRule__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeNameRule__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__11"


    // $ANTLR start "rule__TypeNameRule__Group__11__Impl"
    // InternalRuleDsl.g:594:1: rule__TypeNameRule__Group__11__Impl : ( 'applyToPrivate' ) ;
    public final void rule__TypeNameRule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:598:1: ( ( 'applyToPrivate' ) )
            // InternalRuleDsl.g:599:1: ( 'applyToPrivate' )
            {
            // InternalRuleDsl.g:599:1: ( 'applyToPrivate' )
            // InternalRuleDsl.g:600:2: 'applyToPrivate'
            {
             before(grammarAccess.getTypeNameRuleAccess().getApplyToPrivateKeyword_11()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTypeNameRuleAccess().getApplyToPrivateKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__11__Impl"


    // $ANTLR start "rule__TypeNameRule__Group__12"
    // InternalRuleDsl.g:609:1: rule__TypeNameRule__Group__12 : rule__TypeNameRule__Group__12__Impl rule__TypeNameRule__Group__13 ;
    public final void rule__TypeNameRule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:613:1: ( rule__TypeNameRule__Group__12__Impl rule__TypeNameRule__Group__13 )
            // InternalRuleDsl.g:614:2: rule__TypeNameRule__Group__12__Impl rule__TypeNameRule__Group__13
            {
            pushFollow(FOLLOW_13);
            rule__TypeNameRule__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeNameRule__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__12"


    // $ANTLR start "rule__TypeNameRule__Group__12__Impl"
    // InternalRuleDsl.g:621:1: rule__TypeNameRule__Group__12__Impl : ( ( rule__TypeNameRule__ApplyToPrivateAssignment_12 ) ) ;
    public final void rule__TypeNameRule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:625:1: ( ( ( rule__TypeNameRule__ApplyToPrivateAssignment_12 ) ) )
            // InternalRuleDsl.g:626:1: ( ( rule__TypeNameRule__ApplyToPrivateAssignment_12 ) )
            {
            // InternalRuleDsl.g:626:1: ( ( rule__TypeNameRule__ApplyToPrivateAssignment_12 ) )
            // InternalRuleDsl.g:627:2: ( rule__TypeNameRule__ApplyToPrivateAssignment_12 )
            {
             before(grammarAccess.getTypeNameRuleAccess().getApplyToPrivateAssignment_12()); 
            // InternalRuleDsl.g:628:2: ( rule__TypeNameRule__ApplyToPrivateAssignment_12 )
            // InternalRuleDsl.g:628:3: rule__TypeNameRule__ApplyToPrivateAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__TypeNameRule__ApplyToPrivateAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getTypeNameRuleAccess().getApplyToPrivateAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__12__Impl"


    // $ANTLR start "rule__TypeNameRule__Group__13"
    // InternalRuleDsl.g:636:1: rule__TypeNameRule__Group__13 : rule__TypeNameRule__Group__13__Impl ;
    public final void rule__TypeNameRule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:640:1: ( rule__TypeNameRule__Group__13__Impl )
            // InternalRuleDsl.g:641:2: rule__TypeNameRule__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeNameRule__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__13"


    // $ANTLR start "rule__TypeNameRule__Group__13__Impl"
    // InternalRuleDsl.g:647:1: rule__TypeNameRule__Group__13__Impl : ( '}' ) ;
    public final void rule__TypeNameRule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:651:1: ( ( '}' ) )
            // InternalRuleDsl.g:652:1: ( '}' )
            {
            // InternalRuleDsl.g:652:1: ( '}' )
            // InternalRuleDsl.g:653:2: '}'
            {
             before(grammarAccess.getTypeNameRuleAccess().getRightCurlyBracketKeyword_13()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTypeNameRuleAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__Group__13__Impl"


    // $ANTLR start "rule__MethodNameRule__Group__0"
    // InternalRuleDsl.g:663:1: rule__MethodNameRule__Group__0 : rule__MethodNameRule__Group__0__Impl rule__MethodNameRule__Group__1 ;
    public final void rule__MethodNameRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:667:1: ( rule__MethodNameRule__Group__0__Impl rule__MethodNameRule__Group__1 )
            // InternalRuleDsl.g:668:2: rule__MethodNameRule__Group__0__Impl rule__MethodNameRule__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__MethodNameRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__0"


    // $ANTLR start "rule__MethodNameRule__Group__0__Impl"
    // InternalRuleDsl.g:675:1: rule__MethodNameRule__Group__0__Impl : ( () ) ;
    public final void rule__MethodNameRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:679:1: ( ( () ) )
            // InternalRuleDsl.g:680:1: ( () )
            {
            // InternalRuleDsl.g:680:1: ( () )
            // InternalRuleDsl.g:681:2: ()
            {
             before(grammarAccess.getMethodNameRuleAccess().getMethodNameRuleAction_0()); 
            // InternalRuleDsl.g:682:2: ()
            // InternalRuleDsl.g:682:3: 
            {
            }

             after(grammarAccess.getMethodNameRuleAccess().getMethodNameRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__0__Impl"


    // $ANTLR start "rule__MethodNameRule__Group__1"
    // InternalRuleDsl.g:690:1: rule__MethodNameRule__Group__1 : rule__MethodNameRule__Group__1__Impl rule__MethodNameRule__Group__2 ;
    public final void rule__MethodNameRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:694:1: ( rule__MethodNameRule__Group__1__Impl rule__MethodNameRule__Group__2 )
            // InternalRuleDsl.g:695:2: rule__MethodNameRule__Group__1__Impl rule__MethodNameRule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MethodNameRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__1"


    // $ANTLR start "rule__MethodNameRule__Group__1__Impl"
    // InternalRuleDsl.g:702:1: rule__MethodNameRule__Group__1__Impl : ( ( rule__MethodNameRule__NameAssignment_1 ) ) ;
    public final void rule__MethodNameRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:706:1: ( ( ( rule__MethodNameRule__NameAssignment_1 ) ) )
            // InternalRuleDsl.g:707:1: ( ( rule__MethodNameRule__NameAssignment_1 ) )
            {
            // InternalRuleDsl.g:707:1: ( ( rule__MethodNameRule__NameAssignment_1 ) )
            // InternalRuleDsl.g:708:2: ( rule__MethodNameRule__NameAssignment_1 )
            {
             before(grammarAccess.getMethodNameRuleAccess().getNameAssignment_1()); 
            // InternalRuleDsl.g:709:2: ( rule__MethodNameRule__NameAssignment_1 )
            // InternalRuleDsl.g:709:3: rule__MethodNameRule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodNameRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodNameRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__1__Impl"


    // $ANTLR start "rule__MethodNameRule__Group__2"
    // InternalRuleDsl.g:717:1: rule__MethodNameRule__Group__2 : rule__MethodNameRule__Group__2__Impl rule__MethodNameRule__Group__3 ;
    public final void rule__MethodNameRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:721:1: ( rule__MethodNameRule__Group__2__Impl rule__MethodNameRule__Group__3 )
            // InternalRuleDsl.g:722:2: rule__MethodNameRule__Group__2__Impl rule__MethodNameRule__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MethodNameRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__2"


    // $ANTLR start "rule__MethodNameRule__Group__2__Impl"
    // InternalRuleDsl.g:729:1: rule__MethodNameRule__Group__2__Impl : ( '{' ) ;
    public final void rule__MethodNameRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:733:1: ( ( '{' ) )
            // InternalRuleDsl.g:734:1: ( '{' )
            {
            // InternalRuleDsl.g:734:1: ( '{' )
            // InternalRuleDsl.g:735:2: '{'
            {
             before(grammarAccess.getMethodNameRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMethodNameRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__2__Impl"


    // $ANTLR start "rule__MethodNameRule__Group__3"
    // InternalRuleDsl.g:744:1: rule__MethodNameRule__Group__3 : rule__MethodNameRule__Group__3__Impl rule__MethodNameRule__Group__4 ;
    public final void rule__MethodNameRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:748:1: ( rule__MethodNameRule__Group__3__Impl rule__MethodNameRule__Group__4 )
            // InternalRuleDsl.g:749:2: rule__MethodNameRule__Group__3__Impl rule__MethodNameRule__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__MethodNameRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__3"


    // $ANTLR start "rule__MethodNameRule__Group__3__Impl"
    // InternalRuleDsl.g:756:1: rule__MethodNameRule__Group__3__Impl : ( 'format' ) ;
    public final void rule__MethodNameRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:760:1: ( ( 'format' ) )
            // InternalRuleDsl.g:761:1: ( 'format' )
            {
            // InternalRuleDsl.g:761:1: ( 'format' )
            // InternalRuleDsl.g:762:2: 'format'
            {
             before(grammarAccess.getMethodNameRuleAccess().getFormatKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMethodNameRuleAccess().getFormatKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__3__Impl"


    // $ANTLR start "rule__MethodNameRule__Group__4"
    // InternalRuleDsl.g:771:1: rule__MethodNameRule__Group__4 : rule__MethodNameRule__Group__4__Impl rule__MethodNameRule__Group__5 ;
    public final void rule__MethodNameRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:775:1: ( rule__MethodNameRule__Group__4__Impl rule__MethodNameRule__Group__5 )
            // InternalRuleDsl.g:776:2: rule__MethodNameRule__Group__4__Impl rule__MethodNameRule__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__MethodNameRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__4"


    // $ANTLR start "rule__MethodNameRule__Group__4__Impl"
    // InternalRuleDsl.g:783:1: rule__MethodNameRule__Group__4__Impl : ( ( rule__MethodNameRule__FormatAssignment_4 ) ) ;
    public final void rule__MethodNameRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:787:1: ( ( ( rule__MethodNameRule__FormatAssignment_4 ) ) )
            // InternalRuleDsl.g:788:1: ( ( rule__MethodNameRule__FormatAssignment_4 ) )
            {
            // InternalRuleDsl.g:788:1: ( ( rule__MethodNameRule__FormatAssignment_4 ) )
            // InternalRuleDsl.g:789:2: ( rule__MethodNameRule__FormatAssignment_4 )
            {
             before(grammarAccess.getMethodNameRuleAccess().getFormatAssignment_4()); 
            // InternalRuleDsl.g:790:2: ( rule__MethodNameRule__FormatAssignment_4 )
            // InternalRuleDsl.g:790:3: rule__MethodNameRule__FormatAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MethodNameRule__FormatAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMethodNameRuleAccess().getFormatAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__4__Impl"


    // $ANTLR start "rule__MethodNameRule__Group__5"
    // InternalRuleDsl.g:798:1: rule__MethodNameRule__Group__5 : rule__MethodNameRule__Group__5__Impl rule__MethodNameRule__Group__6 ;
    public final void rule__MethodNameRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:802:1: ( rule__MethodNameRule__Group__5__Impl rule__MethodNameRule__Group__6 )
            // InternalRuleDsl.g:803:2: rule__MethodNameRule__Group__5__Impl rule__MethodNameRule__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__MethodNameRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__5"


    // $ANTLR start "rule__MethodNameRule__Group__5__Impl"
    // InternalRuleDsl.g:810:1: rule__MethodNameRule__Group__5__Impl : ( 'allowClassName' ) ;
    public final void rule__MethodNameRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:814:1: ( ( 'allowClassName' ) )
            // InternalRuleDsl.g:815:1: ( 'allowClassName' )
            {
            // InternalRuleDsl.g:815:1: ( 'allowClassName' )
            // InternalRuleDsl.g:816:2: 'allowClassName'
            {
             before(grammarAccess.getMethodNameRuleAccess().getAllowClassNameKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMethodNameRuleAccess().getAllowClassNameKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__5__Impl"


    // $ANTLR start "rule__MethodNameRule__Group__6"
    // InternalRuleDsl.g:825:1: rule__MethodNameRule__Group__6 : rule__MethodNameRule__Group__6__Impl rule__MethodNameRule__Group__7 ;
    public final void rule__MethodNameRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:829:1: ( rule__MethodNameRule__Group__6__Impl rule__MethodNameRule__Group__7 )
            // InternalRuleDsl.g:830:2: rule__MethodNameRule__Group__6__Impl rule__MethodNameRule__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__MethodNameRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__6"


    // $ANTLR start "rule__MethodNameRule__Group__6__Impl"
    // InternalRuleDsl.g:837:1: rule__MethodNameRule__Group__6__Impl : ( ( rule__MethodNameRule__AllowClassNameAssignment_6 ) ) ;
    public final void rule__MethodNameRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:841:1: ( ( ( rule__MethodNameRule__AllowClassNameAssignment_6 ) ) )
            // InternalRuleDsl.g:842:1: ( ( rule__MethodNameRule__AllowClassNameAssignment_6 ) )
            {
            // InternalRuleDsl.g:842:1: ( ( rule__MethodNameRule__AllowClassNameAssignment_6 ) )
            // InternalRuleDsl.g:843:2: ( rule__MethodNameRule__AllowClassNameAssignment_6 )
            {
             before(grammarAccess.getMethodNameRuleAccess().getAllowClassNameAssignment_6()); 
            // InternalRuleDsl.g:844:2: ( rule__MethodNameRule__AllowClassNameAssignment_6 )
            // InternalRuleDsl.g:844:3: rule__MethodNameRule__AllowClassNameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__MethodNameRule__AllowClassNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMethodNameRuleAccess().getAllowClassNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__6__Impl"


    // $ANTLR start "rule__MethodNameRule__Group__7"
    // InternalRuleDsl.g:852:1: rule__MethodNameRule__Group__7 : rule__MethodNameRule__Group__7__Impl rule__MethodNameRule__Group__8 ;
    public final void rule__MethodNameRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:856:1: ( rule__MethodNameRule__Group__7__Impl rule__MethodNameRule__Group__8 )
            // InternalRuleDsl.g:857:2: rule__MethodNameRule__Group__7__Impl rule__MethodNameRule__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__MethodNameRule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__7"


    // $ANTLR start "rule__MethodNameRule__Group__7__Impl"
    // InternalRuleDsl.g:864:1: rule__MethodNameRule__Group__7__Impl : ( 'applyToPublic' ) ;
    public final void rule__MethodNameRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:868:1: ( ( 'applyToPublic' ) )
            // InternalRuleDsl.g:869:1: ( 'applyToPublic' )
            {
            // InternalRuleDsl.g:869:1: ( 'applyToPublic' )
            // InternalRuleDsl.g:870:2: 'applyToPublic'
            {
             before(grammarAccess.getMethodNameRuleAccess().getApplyToPublicKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMethodNameRuleAccess().getApplyToPublicKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__7__Impl"


    // $ANTLR start "rule__MethodNameRule__Group__8"
    // InternalRuleDsl.g:879:1: rule__MethodNameRule__Group__8 : rule__MethodNameRule__Group__8__Impl rule__MethodNameRule__Group__9 ;
    public final void rule__MethodNameRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:883:1: ( rule__MethodNameRule__Group__8__Impl rule__MethodNameRule__Group__9 )
            // InternalRuleDsl.g:884:2: rule__MethodNameRule__Group__8__Impl rule__MethodNameRule__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__MethodNameRule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__8"


    // $ANTLR start "rule__MethodNameRule__Group__8__Impl"
    // InternalRuleDsl.g:891:1: rule__MethodNameRule__Group__8__Impl : ( ( rule__MethodNameRule__ApplyToPublicAssignment_8 ) ) ;
    public final void rule__MethodNameRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:895:1: ( ( ( rule__MethodNameRule__ApplyToPublicAssignment_8 ) ) )
            // InternalRuleDsl.g:896:1: ( ( rule__MethodNameRule__ApplyToPublicAssignment_8 ) )
            {
            // InternalRuleDsl.g:896:1: ( ( rule__MethodNameRule__ApplyToPublicAssignment_8 ) )
            // InternalRuleDsl.g:897:2: ( rule__MethodNameRule__ApplyToPublicAssignment_8 )
            {
             before(grammarAccess.getMethodNameRuleAccess().getApplyToPublicAssignment_8()); 
            // InternalRuleDsl.g:898:2: ( rule__MethodNameRule__ApplyToPublicAssignment_8 )
            // InternalRuleDsl.g:898:3: rule__MethodNameRule__ApplyToPublicAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__MethodNameRule__ApplyToPublicAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMethodNameRuleAccess().getApplyToPublicAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__8__Impl"


    // $ANTLR start "rule__MethodNameRule__Group__9"
    // InternalRuleDsl.g:906:1: rule__MethodNameRule__Group__9 : rule__MethodNameRule__Group__9__Impl rule__MethodNameRule__Group__10 ;
    public final void rule__MethodNameRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:910:1: ( rule__MethodNameRule__Group__9__Impl rule__MethodNameRule__Group__10 )
            // InternalRuleDsl.g:911:2: rule__MethodNameRule__Group__9__Impl rule__MethodNameRule__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__MethodNameRule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__9"


    // $ANTLR start "rule__MethodNameRule__Group__9__Impl"
    // InternalRuleDsl.g:918:1: rule__MethodNameRule__Group__9__Impl : ( 'applyToProtected' ) ;
    public final void rule__MethodNameRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:922:1: ( ( 'applyToProtected' ) )
            // InternalRuleDsl.g:923:1: ( 'applyToProtected' )
            {
            // InternalRuleDsl.g:923:1: ( 'applyToProtected' )
            // InternalRuleDsl.g:924:2: 'applyToProtected'
            {
             before(grammarAccess.getMethodNameRuleAccess().getApplyToProtectedKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMethodNameRuleAccess().getApplyToProtectedKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__9__Impl"


    // $ANTLR start "rule__MethodNameRule__Group__10"
    // InternalRuleDsl.g:933:1: rule__MethodNameRule__Group__10 : rule__MethodNameRule__Group__10__Impl rule__MethodNameRule__Group__11 ;
    public final void rule__MethodNameRule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:937:1: ( rule__MethodNameRule__Group__10__Impl rule__MethodNameRule__Group__11 )
            // InternalRuleDsl.g:938:2: rule__MethodNameRule__Group__10__Impl rule__MethodNameRule__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__MethodNameRule__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__10"


    // $ANTLR start "rule__MethodNameRule__Group__10__Impl"
    // InternalRuleDsl.g:945:1: rule__MethodNameRule__Group__10__Impl : ( ( rule__MethodNameRule__ApplyToProtectedAssignment_10 ) ) ;
    public final void rule__MethodNameRule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:949:1: ( ( ( rule__MethodNameRule__ApplyToProtectedAssignment_10 ) ) )
            // InternalRuleDsl.g:950:1: ( ( rule__MethodNameRule__ApplyToProtectedAssignment_10 ) )
            {
            // InternalRuleDsl.g:950:1: ( ( rule__MethodNameRule__ApplyToProtectedAssignment_10 ) )
            // InternalRuleDsl.g:951:2: ( rule__MethodNameRule__ApplyToProtectedAssignment_10 )
            {
             before(grammarAccess.getMethodNameRuleAccess().getApplyToProtectedAssignment_10()); 
            // InternalRuleDsl.g:952:2: ( rule__MethodNameRule__ApplyToProtectedAssignment_10 )
            // InternalRuleDsl.g:952:3: rule__MethodNameRule__ApplyToProtectedAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__MethodNameRule__ApplyToProtectedAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getMethodNameRuleAccess().getApplyToProtectedAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__10__Impl"


    // $ANTLR start "rule__MethodNameRule__Group__11"
    // InternalRuleDsl.g:960:1: rule__MethodNameRule__Group__11 : rule__MethodNameRule__Group__11__Impl rule__MethodNameRule__Group__12 ;
    public final void rule__MethodNameRule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:964:1: ( rule__MethodNameRule__Group__11__Impl rule__MethodNameRule__Group__12 )
            // InternalRuleDsl.g:965:2: rule__MethodNameRule__Group__11__Impl rule__MethodNameRule__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__MethodNameRule__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__11"


    // $ANTLR start "rule__MethodNameRule__Group__11__Impl"
    // InternalRuleDsl.g:972:1: rule__MethodNameRule__Group__11__Impl : ( 'applyToPackage' ) ;
    public final void rule__MethodNameRule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:976:1: ( ( 'applyToPackage' ) )
            // InternalRuleDsl.g:977:1: ( 'applyToPackage' )
            {
            // InternalRuleDsl.g:977:1: ( 'applyToPackage' )
            // InternalRuleDsl.g:978:2: 'applyToPackage'
            {
             before(grammarAccess.getMethodNameRuleAccess().getApplyToPackageKeyword_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMethodNameRuleAccess().getApplyToPackageKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__11__Impl"


    // $ANTLR start "rule__MethodNameRule__Group__12"
    // InternalRuleDsl.g:987:1: rule__MethodNameRule__Group__12 : rule__MethodNameRule__Group__12__Impl rule__MethodNameRule__Group__13 ;
    public final void rule__MethodNameRule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:991:1: ( rule__MethodNameRule__Group__12__Impl rule__MethodNameRule__Group__13 )
            // InternalRuleDsl.g:992:2: rule__MethodNameRule__Group__12__Impl rule__MethodNameRule__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__MethodNameRule__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__12"


    // $ANTLR start "rule__MethodNameRule__Group__12__Impl"
    // InternalRuleDsl.g:999:1: rule__MethodNameRule__Group__12__Impl : ( ( rule__MethodNameRule__ApplyToPackageAssignment_12 ) ) ;
    public final void rule__MethodNameRule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1003:1: ( ( ( rule__MethodNameRule__ApplyToPackageAssignment_12 ) ) )
            // InternalRuleDsl.g:1004:1: ( ( rule__MethodNameRule__ApplyToPackageAssignment_12 ) )
            {
            // InternalRuleDsl.g:1004:1: ( ( rule__MethodNameRule__ApplyToPackageAssignment_12 ) )
            // InternalRuleDsl.g:1005:2: ( rule__MethodNameRule__ApplyToPackageAssignment_12 )
            {
             before(grammarAccess.getMethodNameRuleAccess().getApplyToPackageAssignment_12()); 
            // InternalRuleDsl.g:1006:2: ( rule__MethodNameRule__ApplyToPackageAssignment_12 )
            // InternalRuleDsl.g:1006:3: rule__MethodNameRule__ApplyToPackageAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__MethodNameRule__ApplyToPackageAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getMethodNameRuleAccess().getApplyToPackageAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__12__Impl"


    // $ANTLR start "rule__MethodNameRule__Group__13"
    // InternalRuleDsl.g:1014:1: rule__MethodNameRule__Group__13 : rule__MethodNameRule__Group__13__Impl rule__MethodNameRule__Group__14 ;
    public final void rule__MethodNameRule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1018:1: ( rule__MethodNameRule__Group__13__Impl rule__MethodNameRule__Group__14 )
            // InternalRuleDsl.g:1019:2: rule__MethodNameRule__Group__13__Impl rule__MethodNameRule__Group__14
            {
            pushFollow(FOLLOW_9);
            rule__MethodNameRule__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__13"


    // $ANTLR start "rule__MethodNameRule__Group__13__Impl"
    // InternalRuleDsl.g:1026:1: rule__MethodNameRule__Group__13__Impl : ( 'applyToPrivate' ) ;
    public final void rule__MethodNameRule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1030:1: ( ( 'applyToPrivate' ) )
            // InternalRuleDsl.g:1031:1: ( 'applyToPrivate' )
            {
            // InternalRuleDsl.g:1031:1: ( 'applyToPrivate' )
            // InternalRuleDsl.g:1032:2: 'applyToPrivate'
            {
             before(grammarAccess.getMethodNameRuleAccess().getApplyToPrivateKeyword_13()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMethodNameRuleAccess().getApplyToPrivateKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__13__Impl"


    // $ANTLR start "rule__MethodNameRule__Group__14"
    // InternalRuleDsl.g:1041:1: rule__MethodNameRule__Group__14 : rule__MethodNameRule__Group__14__Impl rule__MethodNameRule__Group__15 ;
    public final void rule__MethodNameRule__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1045:1: ( rule__MethodNameRule__Group__14__Impl rule__MethodNameRule__Group__15 )
            // InternalRuleDsl.g:1046:2: rule__MethodNameRule__Group__14__Impl rule__MethodNameRule__Group__15
            {
            pushFollow(FOLLOW_13);
            rule__MethodNameRule__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__14"


    // $ANTLR start "rule__MethodNameRule__Group__14__Impl"
    // InternalRuleDsl.g:1053:1: rule__MethodNameRule__Group__14__Impl : ( ( rule__MethodNameRule__ApplyToPrivateAssignment_14 ) ) ;
    public final void rule__MethodNameRule__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1057:1: ( ( ( rule__MethodNameRule__ApplyToPrivateAssignment_14 ) ) )
            // InternalRuleDsl.g:1058:1: ( ( rule__MethodNameRule__ApplyToPrivateAssignment_14 ) )
            {
            // InternalRuleDsl.g:1058:1: ( ( rule__MethodNameRule__ApplyToPrivateAssignment_14 ) )
            // InternalRuleDsl.g:1059:2: ( rule__MethodNameRule__ApplyToPrivateAssignment_14 )
            {
             before(grammarAccess.getMethodNameRuleAccess().getApplyToPrivateAssignment_14()); 
            // InternalRuleDsl.g:1060:2: ( rule__MethodNameRule__ApplyToPrivateAssignment_14 )
            // InternalRuleDsl.g:1060:3: rule__MethodNameRule__ApplyToPrivateAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__MethodNameRule__ApplyToPrivateAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getMethodNameRuleAccess().getApplyToPrivateAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__14__Impl"


    // $ANTLR start "rule__MethodNameRule__Group__15"
    // InternalRuleDsl.g:1068:1: rule__MethodNameRule__Group__15 : rule__MethodNameRule__Group__15__Impl ;
    public final void rule__MethodNameRule__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1072:1: ( rule__MethodNameRule__Group__15__Impl )
            // InternalRuleDsl.g:1073:2: rule__MethodNameRule__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodNameRule__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__15"


    // $ANTLR start "rule__MethodNameRule__Group__15__Impl"
    // InternalRuleDsl.g:1079:1: rule__MethodNameRule__Group__15__Impl : ( '}' ) ;
    public final void rule__MethodNameRule__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1083:1: ( ( '}' ) )
            // InternalRuleDsl.g:1084:1: ( '}' )
            {
            // InternalRuleDsl.g:1084:1: ( '}' )
            // InternalRuleDsl.g:1085:2: '}'
            {
             before(grammarAccess.getMethodNameRuleAccess().getRightCurlyBracketKeyword_15()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMethodNameRuleAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__Group__15__Impl"


    // $ANTLR start "rule__MethodLengthRule__Group__0"
    // InternalRuleDsl.g:1095:1: rule__MethodLengthRule__Group__0 : rule__MethodLengthRule__Group__0__Impl rule__MethodLengthRule__Group__1 ;
    public final void rule__MethodLengthRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1099:1: ( rule__MethodLengthRule__Group__0__Impl rule__MethodLengthRule__Group__1 )
            // InternalRuleDsl.g:1100:2: rule__MethodLengthRule__Group__0__Impl rule__MethodLengthRule__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__MethodLengthRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodLengthRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__Group__0"


    // $ANTLR start "rule__MethodLengthRule__Group__0__Impl"
    // InternalRuleDsl.g:1107:1: rule__MethodLengthRule__Group__0__Impl : ( () ) ;
    public final void rule__MethodLengthRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1111:1: ( ( () ) )
            // InternalRuleDsl.g:1112:1: ( () )
            {
            // InternalRuleDsl.g:1112:1: ( () )
            // InternalRuleDsl.g:1113:2: ()
            {
             before(grammarAccess.getMethodLengthRuleAccess().getMethodLengthRuleAction_0()); 
            // InternalRuleDsl.g:1114:2: ()
            // InternalRuleDsl.g:1114:3: 
            {
            }

             after(grammarAccess.getMethodLengthRuleAccess().getMethodLengthRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__Group__0__Impl"


    // $ANTLR start "rule__MethodLengthRule__Group__1"
    // InternalRuleDsl.g:1122:1: rule__MethodLengthRule__Group__1 : rule__MethodLengthRule__Group__1__Impl rule__MethodLengthRule__Group__2 ;
    public final void rule__MethodLengthRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1126:1: ( rule__MethodLengthRule__Group__1__Impl rule__MethodLengthRule__Group__2 )
            // InternalRuleDsl.g:1127:2: rule__MethodLengthRule__Group__1__Impl rule__MethodLengthRule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MethodLengthRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodLengthRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__Group__1"


    // $ANTLR start "rule__MethodLengthRule__Group__1__Impl"
    // InternalRuleDsl.g:1134:1: rule__MethodLengthRule__Group__1__Impl : ( ( rule__MethodLengthRule__NameAssignment_1 ) ) ;
    public final void rule__MethodLengthRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1138:1: ( ( ( rule__MethodLengthRule__NameAssignment_1 ) ) )
            // InternalRuleDsl.g:1139:1: ( ( rule__MethodLengthRule__NameAssignment_1 ) )
            {
            // InternalRuleDsl.g:1139:1: ( ( rule__MethodLengthRule__NameAssignment_1 ) )
            // InternalRuleDsl.g:1140:2: ( rule__MethodLengthRule__NameAssignment_1 )
            {
             before(grammarAccess.getMethodLengthRuleAccess().getNameAssignment_1()); 
            // InternalRuleDsl.g:1141:2: ( rule__MethodLengthRule__NameAssignment_1 )
            // InternalRuleDsl.g:1141:3: rule__MethodLengthRule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodLengthRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodLengthRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__Group__1__Impl"


    // $ANTLR start "rule__MethodLengthRule__Group__2"
    // InternalRuleDsl.g:1149:1: rule__MethodLengthRule__Group__2 : rule__MethodLengthRule__Group__2__Impl rule__MethodLengthRule__Group__3 ;
    public final void rule__MethodLengthRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1153:1: ( rule__MethodLengthRule__Group__2__Impl rule__MethodLengthRule__Group__3 )
            // InternalRuleDsl.g:1154:2: rule__MethodLengthRule__Group__2__Impl rule__MethodLengthRule__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__MethodLengthRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodLengthRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__Group__2"


    // $ANTLR start "rule__MethodLengthRule__Group__2__Impl"
    // InternalRuleDsl.g:1161:1: rule__MethodLengthRule__Group__2__Impl : ( '{' ) ;
    public final void rule__MethodLengthRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1165:1: ( ( '{' ) )
            // InternalRuleDsl.g:1166:1: ( '{' )
            {
            // InternalRuleDsl.g:1166:1: ( '{' )
            // InternalRuleDsl.g:1167:2: '{'
            {
             before(grammarAccess.getMethodLengthRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMethodLengthRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__Group__2__Impl"


    // $ANTLR start "rule__MethodLengthRule__Group__3"
    // InternalRuleDsl.g:1176:1: rule__MethodLengthRule__Group__3 : rule__MethodLengthRule__Group__3__Impl rule__MethodLengthRule__Group__4 ;
    public final void rule__MethodLengthRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1180:1: ( rule__MethodLengthRule__Group__3__Impl rule__MethodLengthRule__Group__4 )
            // InternalRuleDsl.g:1181:2: rule__MethodLengthRule__Group__3__Impl rule__MethodLengthRule__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__MethodLengthRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodLengthRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__Group__3"


    // $ANTLR start "rule__MethodLengthRule__Group__3__Impl"
    // InternalRuleDsl.g:1188:1: rule__MethodLengthRule__Group__3__Impl : ( 'max' ) ;
    public final void rule__MethodLengthRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1192:1: ( ( 'max' ) )
            // InternalRuleDsl.g:1193:1: ( 'max' )
            {
            // InternalRuleDsl.g:1193:1: ( 'max' )
            // InternalRuleDsl.g:1194:2: 'max'
            {
             before(grammarAccess.getMethodLengthRuleAccess().getMaxKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMethodLengthRuleAccess().getMaxKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__Group__3__Impl"


    // $ANTLR start "rule__MethodLengthRule__Group__4"
    // InternalRuleDsl.g:1203:1: rule__MethodLengthRule__Group__4 : rule__MethodLengthRule__Group__4__Impl rule__MethodLengthRule__Group__5 ;
    public final void rule__MethodLengthRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1207:1: ( rule__MethodLengthRule__Group__4__Impl rule__MethodLengthRule__Group__5 )
            // InternalRuleDsl.g:1208:2: rule__MethodLengthRule__Group__4__Impl rule__MethodLengthRule__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__MethodLengthRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodLengthRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__Group__4"


    // $ANTLR start "rule__MethodLengthRule__Group__4__Impl"
    // InternalRuleDsl.g:1215:1: rule__MethodLengthRule__Group__4__Impl : ( ( rule__MethodLengthRule__MaxAssignment_4 ) ) ;
    public final void rule__MethodLengthRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1219:1: ( ( ( rule__MethodLengthRule__MaxAssignment_4 ) ) )
            // InternalRuleDsl.g:1220:1: ( ( rule__MethodLengthRule__MaxAssignment_4 ) )
            {
            // InternalRuleDsl.g:1220:1: ( ( rule__MethodLengthRule__MaxAssignment_4 ) )
            // InternalRuleDsl.g:1221:2: ( rule__MethodLengthRule__MaxAssignment_4 )
            {
             before(grammarAccess.getMethodLengthRuleAccess().getMaxAssignment_4()); 
            // InternalRuleDsl.g:1222:2: ( rule__MethodLengthRule__MaxAssignment_4 )
            // InternalRuleDsl.g:1222:3: rule__MethodLengthRule__MaxAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MethodLengthRule__MaxAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMethodLengthRuleAccess().getMaxAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__Group__4__Impl"


    // $ANTLR start "rule__MethodLengthRule__Group__5"
    // InternalRuleDsl.g:1230:1: rule__MethodLengthRule__Group__5 : rule__MethodLengthRule__Group__5__Impl rule__MethodLengthRule__Group__6 ;
    public final void rule__MethodLengthRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1234:1: ( rule__MethodLengthRule__Group__5__Impl rule__MethodLengthRule__Group__6 )
            // InternalRuleDsl.g:1235:2: rule__MethodLengthRule__Group__5__Impl rule__MethodLengthRule__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__MethodLengthRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodLengthRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__Group__5"


    // $ANTLR start "rule__MethodLengthRule__Group__5__Impl"
    // InternalRuleDsl.g:1242:1: rule__MethodLengthRule__Group__5__Impl : ( 'countEmpty' ) ;
    public final void rule__MethodLengthRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1246:1: ( ( 'countEmpty' ) )
            // InternalRuleDsl.g:1247:1: ( 'countEmpty' )
            {
            // InternalRuleDsl.g:1247:1: ( 'countEmpty' )
            // InternalRuleDsl.g:1248:2: 'countEmpty'
            {
             before(grammarAccess.getMethodLengthRuleAccess().getCountEmptyKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMethodLengthRuleAccess().getCountEmptyKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__Group__5__Impl"


    // $ANTLR start "rule__MethodLengthRule__Group__6"
    // InternalRuleDsl.g:1257:1: rule__MethodLengthRule__Group__6 : rule__MethodLengthRule__Group__6__Impl rule__MethodLengthRule__Group__7 ;
    public final void rule__MethodLengthRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1261:1: ( rule__MethodLengthRule__Group__6__Impl rule__MethodLengthRule__Group__7 )
            // InternalRuleDsl.g:1262:2: rule__MethodLengthRule__Group__6__Impl rule__MethodLengthRule__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__MethodLengthRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodLengthRule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__Group__6"


    // $ANTLR start "rule__MethodLengthRule__Group__6__Impl"
    // InternalRuleDsl.g:1269:1: rule__MethodLengthRule__Group__6__Impl : ( ( rule__MethodLengthRule__CountEmptyAssignment_6 ) ) ;
    public final void rule__MethodLengthRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1273:1: ( ( ( rule__MethodLengthRule__CountEmptyAssignment_6 ) ) )
            // InternalRuleDsl.g:1274:1: ( ( rule__MethodLengthRule__CountEmptyAssignment_6 ) )
            {
            // InternalRuleDsl.g:1274:1: ( ( rule__MethodLengthRule__CountEmptyAssignment_6 ) )
            // InternalRuleDsl.g:1275:2: ( rule__MethodLengthRule__CountEmptyAssignment_6 )
            {
             before(grammarAccess.getMethodLengthRuleAccess().getCountEmptyAssignment_6()); 
            // InternalRuleDsl.g:1276:2: ( rule__MethodLengthRule__CountEmptyAssignment_6 )
            // InternalRuleDsl.g:1276:3: rule__MethodLengthRule__CountEmptyAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__MethodLengthRule__CountEmptyAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMethodLengthRuleAccess().getCountEmptyAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__Group__6__Impl"


    // $ANTLR start "rule__MethodLengthRule__Group__7"
    // InternalRuleDsl.g:1284:1: rule__MethodLengthRule__Group__7 : rule__MethodLengthRule__Group__7__Impl ;
    public final void rule__MethodLengthRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1288:1: ( rule__MethodLengthRule__Group__7__Impl )
            // InternalRuleDsl.g:1289:2: rule__MethodLengthRule__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodLengthRule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__Group__7"


    // $ANTLR start "rule__MethodLengthRule__Group__7__Impl"
    // InternalRuleDsl.g:1295:1: rule__MethodLengthRule__Group__7__Impl : ( '}' ) ;
    public final void rule__MethodLengthRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1299:1: ( ( '}' ) )
            // InternalRuleDsl.g:1300:1: ( '}' )
            {
            // InternalRuleDsl.g:1300:1: ( '}' )
            // InternalRuleDsl.g:1301:2: '}'
            {
             before(grammarAccess.getMethodLengthRuleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMethodLengthRuleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__Group__7__Impl"


    // $ANTLR start "rule__MethodParamCountRule__Group__0"
    // InternalRuleDsl.g:1311:1: rule__MethodParamCountRule__Group__0 : rule__MethodParamCountRule__Group__0__Impl rule__MethodParamCountRule__Group__1 ;
    public final void rule__MethodParamCountRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1315:1: ( rule__MethodParamCountRule__Group__0__Impl rule__MethodParamCountRule__Group__1 )
            // InternalRuleDsl.g:1316:2: rule__MethodParamCountRule__Group__0__Impl rule__MethodParamCountRule__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MethodParamCountRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodParamCountRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__Group__0"


    // $ANTLR start "rule__MethodParamCountRule__Group__0__Impl"
    // InternalRuleDsl.g:1323:1: rule__MethodParamCountRule__Group__0__Impl : ( () ) ;
    public final void rule__MethodParamCountRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1327:1: ( ( () ) )
            // InternalRuleDsl.g:1328:1: ( () )
            {
            // InternalRuleDsl.g:1328:1: ( () )
            // InternalRuleDsl.g:1329:2: ()
            {
             before(grammarAccess.getMethodParamCountRuleAccess().getMethodParamCountRuleAction_0()); 
            // InternalRuleDsl.g:1330:2: ()
            // InternalRuleDsl.g:1330:3: 
            {
            }

             after(grammarAccess.getMethodParamCountRuleAccess().getMethodParamCountRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__Group__0__Impl"


    // $ANTLR start "rule__MethodParamCountRule__Group__1"
    // InternalRuleDsl.g:1338:1: rule__MethodParamCountRule__Group__1 : rule__MethodParamCountRule__Group__1__Impl rule__MethodParamCountRule__Group__2 ;
    public final void rule__MethodParamCountRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1342:1: ( rule__MethodParamCountRule__Group__1__Impl rule__MethodParamCountRule__Group__2 )
            // InternalRuleDsl.g:1343:2: rule__MethodParamCountRule__Group__1__Impl rule__MethodParamCountRule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MethodParamCountRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodParamCountRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__Group__1"


    // $ANTLR start "rule__MethodParamCountRule__Group__1__Impl"
    // InternalRuleDsl.g:1350:1: rule__MethodParamCountRule__Group__1__Impl : ( ( rule__MethodParamCountRule__NameAssignment_1 ) ) ;
    public final void rule__MethodParamCountRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1354:1: ( ( ( rule__MethodParamCountRule__NameAssignment_1 ) ) )
            // InternalRuleDsl.g:1355:1: ( ( rule__MethodParamCountRule__NameAssignment_1 ) )
            {
            // InternalRuleDsl.g:1355:1: ( ( rule__MethodParamCountRule__NameAssignment_1 ) )
            // InternalRuleDsl.g:1356:2: ( rule__MethodParamCountRule__NameAssignment_1 )
            {
             before(grammarAccess.getMethodParamCountRuleAccess().getNameAssignment_1()); 
            // InternalRuleDsl.g:1357:2: ( rule__MethodParamCountRule__NameAssignment_1 )
            // InternalRuleDsl.g:1357:3: rule__MethodParamCountRule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodParamCountRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodParamCountRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__Group__1__Impl"


    // $ANTLR start "rule__MethodParamCountRule__Group__2"
    // InternalRuleDsl.g:1365:1: rule__MethodParamCountRule__Group__2 : rule__MethodParamCountRule__Group__2__Impl rule__MethodParamCountRule__Group__3 ;
    public final void rule__MethodParamCountRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1369:1: ( rule__MethodParamCountRule__Group__2__Impl rule__MethodParamCountRule__Group__3 )
            // InternalRuleDsl.g:1370:2: rule__MethodParamCountRule__Group__2__Impl rule__MethodParamCountRule__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__MethodParamCountRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodParamCountRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__Group__2"


    // $ANTLR start "rule__MethodParamCountRule__Group__2__Impl"
    // InternalRuleDsl.g:1377:1: rule__MethodParamCountRule__Group__2__Impl : ( '{' ) ;
    public final void rule__MethodParamCountRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1381:1: ( ( '{' ) )
            // InternalRuleDsl.g:1382:1: ( '{' )
            {
            // InternalRuleDsl.g:1382:1: ( '{' )
            // InternalRuleDsl.g:1383:2: '{'
            {
             before(grammarAccess.getMethodParamCountRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMethodParamCountRuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__Group__2__Impl"


    // $ANTLR start "rule__MethodParamCountRule__Group__3"
    // InternalRuleDsl.g:1392:1: rule__MethodParamCountRule__Group__3 : rule__MethodParamCountRule__Group__3__Impl rule__MethodParamCountRule__Group__4 ;
    public final void rule__MethodParamCountRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1396:1: ( rule__MethodParamCountRule__Group__3__Impl rule__MethodParamCountRule__Group__4 )
            // InternalRuleDsl.g:1397:2: rule__MethodParamCountRule__Group__3__Impl rule__MethodParamCountRule__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__MethodParamCountRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodParamCountRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__Group__3"


    // $ANTLR start "rule__MethodParamCountRule__Group__3__Impl"
    // InternalRuleDsl.g:1404:1: rule__MethodParamCountRule__Group__3__Impl : ( 'max' ) ;
    public final void rule__MethodParamCountRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1408:1: ( ( 'max' ) )
            // InternalRuleDsl.g:1409:1: ( 'max' )
            {
            // InternalRuleDsl.g:1409:1: ( 'max' )
            // InternalRuleDsl.g:1410:2: 'max'
            {
             before(grammarAccess.getMethodParamCountRuleAccess().getMaxKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMethodParamCountRuleAccess().getMaxKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__Group__3__Impl"


    // $ANTLR start "rule__MethodParamCountRule__Group__4"
    // InternalRuleDsl.g:1419:1: rule__MethodParamCountRule__Group__4 : rule__MethodParamCountRule__Group__4__Impl rule__MethodParamCountRule__Group__5 ;
    public final void rule__MethodParamCountRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1423:1: ( rule__MethodParamCountRule__Group__4__Impl rule__MethodParamCountRule__Group__5 )
            // InternalRuleDsl.g:1424:2: rule__MethodParamCountRule__Group__4__Impl rule__MethodParamCountRule__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__MethodParamCountRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodParamCountRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__Group__4"


    // $ANTLR start "rule__MethodParamCountRule__Group__4__Impl"
    // InternalRuleDsl.g:1431:1: rule__MethodParamCountRule__Group__4__Impl : ( ( rule__MethodParamCountRule__MaxAssignment_4 ) ) ;
    public final void rule__MethodParamCountRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1435:1: ( ( ( rule__MethodParamCountRule__MaxAssignment_4 ) ) )
            // InternalRuleDsl.g:1436:1: ( ( rule__MethodParamCountRule__MaxAssignment_4 ) )
            {
            // InternalRuleDsl.g:1436:1: ( ( rule__MethodParamCountRule__MaxAssignment_4 ) )
            // InternalRuleDsl.g:1437:2: ( rule__MethodParamCountRule__MaxAssignment_4 )
            {
             before(grammarAccess.getMethodParamCountRuleAccess().getMaxAssignment_4()); 
            // InternalRuleDsl.g:1438:2: ( rule__MethodParamCountRule__MaxAssignment_4 )
            // InternalRuleDsl.g:1438:3: rule__MethodParamCountRule__MaxAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MethodParamCountRule__MaxAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMethodParamCountRuleAccess().getMaxAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__Group__4__Impl"


    // $ANTLR start "rule__MethodParamCountRule__Group__5"
    // InternalRuleDsl.g:1446:1: rule__MethodParamCountRule__Group__5 : rule__MethodParamCountRule__Group__5__Impl rule__MethodParamCountRule__Group__6 ;
    public final void rule__MethodParamCountRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1450:1: ( rule__MethodParamCountRule__Group__5__Impl rule__MethodParamCountRule__Group__6 )
            // InternalRuleDsl.g:1451:2: rule__MethodParamCountRule__Group__5__Impl rule__MethodParamCountRule__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__MethodParamCountRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodParamCountRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__Group__5"


    // $ANTLR start "rule__MethodParamCountRule__Group__5__Impl"
    // InternalRuleDsl.g:1458:1: rule__MethodParamCountRule__Group__5__Impl : ( 'ignoreOverriddenMethods' ) ;
    public final void rule__MethodParamCountRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1462:1: ( ( 'ignoreOverriddenMethods' ) )
            // InternalRuleDsl.g:1463:1: ( 'ignoreOverriddenMethods' )
            {
            // InternalRuleDsl.g:1463:1: ( 'ignoreOverriddenMethods' )
            // InternalRuleDsl.g:1464:2: 'ignoreOverriddenMethods'
            {
             before(grammarAccess.getMethodParamCountRuleAccess().getIgnoreOverriddenMethodsKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMethodParamCountRuleAccess().getIgnoreOverriddenMethodsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__Group__5__Impl"


    // $ANTLR start "rule__MethodParamCountRule__Group__6"
    // InternalRuleDsl.g:1473:1: rule__MethodParamCountRule__Group__6 : rule__MethodParamCountRule__Group__6__Impl rule__MethodParamCountRule__Group__7 ;
    public final void rule__MethodParamCountRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1477:1: ( rule__MethodParamCountRule__Group__6__Impl rule__MethodParamCountRule__Group__7 )
            // InternalRuleDsl.g:1478:2: rule__MethodParamCountRule__Group__6__Impl rule__MethodParamCountRule__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__MethodParamCountRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodParamCountRule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__Group__6"


    // $ANTLR start "rule__MethodParamCountRule__Group__6__Impl"
    // InternalRuleDsl.g:1485:1: rule__MethodParamCountRule__Group__6__Impl : ( ( rule__MethodParamCountRule__IgnoreOverriddenMethodsAssignment_6 ) ) ;
    public final void rule__MethodParamCountRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1489:1: ( ( ( rule__MethodParamCountRule__IgnoreOverriddenMethodsAssignment_6 ) ) )
            // InternalRuleDsl.g:1490:1: ( ( rule__MethodParamCountRule__IgnoreOverriddenMethodsAssignment_6 ) )
            {
            // InternalRuleDsl.g:1490:1: ( ( rule__MethodParamCountRule__IgnoreOverriddenMethodsAssignment_6 ) )
            // InternalRuleDsl.g:1491:2: ( rule__MethodParamCountRule__IgnoreOverriddenMethodsAssignment_6 )
            {
             before(grammarAccess.getMethodParamCountRuleAccess().getIgnoreOverriddenMethodsAssignment_6()); 
            // InternalRuleDsl.g:1492:2: ( rule__MethodParamCountRule__IgnoreOverriddenMethodsAssignment_6 )
            // InternalRuleDsl.g:1492:3: rule__MethodParamCountRule__IgnoreOverriddenMethodsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__MethodParamCountRule__IgnoreOverriddenMethodsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMethodParamCountRuleAccess().getIgnoreOverriddenMethodsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__Group__6__Impl"


    // $ANTLR start "rule__MethodParamCountRule__Group__7"
    // InternalRuleDsl.g:1500:1: rule__MethodParamCountRule__Group__7 : rule__MethodParamCountRule__Group__7__Impl ;
    public final void rule__MethodParamCountRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1504:1: ( rule__MethodParamCountRule__Group__7__Impl )
            // InternalRuleDsl.g:1505:2: rule__MethodParamCountRule__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodParamCountRule__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__Group__7"


    // $ANTLR start "rule__MethodParamCountRule__Group__7__Impl"
    // InternalRuleDsl.g:1511:1: rule__MethodParamCountRule__Group__7__Impl : ( '}' ) ;
    public final void rule__MethodParamCountRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1515:1: ( ( '}' ) )
            // InternalRuleDsl.g:1516:1: ( '}' )
            {
            // InternalRuleDsl.g:1516:1: ( '}' )
            // InternalRuleDsl.g:1517:2: '}'
            {
             before(grammarAccess.getMethodParamCountRuleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMethodParamCountRuleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__Group__7__Impl"


    // $ANTLR start "rule__RulesFile__MethodNameRuleAssignment_0"
    // InternalRuleDsl.g:1527:1: rule__RulesFile__MethodNameRuleAssignment_0 : ( ruleMethodNameRule ) ;
    public final void rule__RulesFile__MethodNameRuleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1531:1: ( ( ruleMethodNameRule ) )
            // InternalRuleDsl.g:1532:2: ( ruleMethodNameRule )
            {
            // InternalRuleDsl.g:1532:2: ( ruleMethodNameRule )
            // InternalRuleDsl.g:1533:3: ruleMethodNameRule
            {
             before(grammarAccess.getRulesFileAccess().getMethodNameRuleMethodNameRuleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodNameRule();

            state._fsp--;

             after(grammarAccess.getRulesFileAccess().getMethodNameRuleMethodNameRuleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulesFile__MethodNameRuleAssignment_0"


    // $ANTLR start "rule__RulesFile__MethdLengthRuleAssignment_1"
    // InternalRuleDsl.g:1542:1: rule__RulesFile__MethdLengthRuleAssignment_1 : ( ruleMethodLengthRule ) ;
    public final void rule__RulesFile__MethdLengthRuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1546:1: ( ( ruleMethodLengthRule ) )
            // InternalRuleDsl.g:1547:2: ( ruleMethodLengthRule )
            {
            // InternalRuleDsl.g:1547:2: ( ruleMethodLengthRule )
            // InternalRuleDsl.g:1548:3: ruleMethodLengthRule
            {
             before(grammarAccess.getRulesFileAccess().getMethdLengthRuleMethodLengthRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodLengthRule();

            state._fsp--;

             after(grammarAccess.getRulesFileAccess().getMethdLengthRuleMethodLengthRuleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulesFile__MethdLengthRuleAssignment_1"


    // $ANTLR start "rule__RulesFile__MethodNoOfParamsRuleAssignment_2"
    // InternalRuleDsl.g:1557:1: rule__RulesFile__MethodNoOfParamsRuleAssignment_2 : ( ruleMethodParamCountRule ) ;
    public final void rule__RulesFile__MethodNoOfParamsRuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1561:1: ( ( ruleMethodParamCountRule ) )
            // InternalRuleDsl.g:1562:2: ( ruleMethodParamCountRule )
            {
            // InternalRuleDsl.g:1562:2: ( ruleMethodParamCountRule )
            // InternalRuleDsl.g:1563:3: ruleMethodParamCountRule
            {
             before(grammarAccess.getRulesFileAccess().getMethodNoOfParamsRuleMethodParamCountRuleParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodParamCountRule();

            state._fsp--;

             after(grammarAccess.getRulesFileAccess().getMethodNoOfParamsRuleMethodParamCountRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulesFile__MethodNoOfParamsRuleAssignment_2"


    // $ANTLR start "rule__RulesFile__TypeNameAssignment_3"
    // InternalRuleDsl.g:1572:1: rule__RulesFile__TypeNameAssignment_3 : ( ruleTypeNameRule ) ;
    public final void rule__RulesFile__TypeNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1576:1: ( ( ruleTypeNameRule ) )
            // InternalRuleDsl.g:1577:2: ( ruleTypeNameRule )
            {
            // InternalRuleDsl.g:1577:2: ( ruleTypeNameRule )
            // InternalRuleDsl.g:1578:3: ruleTypeNameRule
            {
             before(grammarAccess.getRulesFileAccess().getTypeNameTypeNameRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeNameRule();

            state._fsp--;

             after(grammarAccess.getRulesFileAccess().getTypeNameTypeNameRuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RulesFile__TypeNameAssignment_3"


    // $ANTLR start "rule__TypeNameRule__NameAssignment_1"
    // InternalRuleDsl.g:1587:1: rule__TypeNameRule__NameAssignment_1 : ( ( 'TypeName' ) ) ;
    public final void rule__TypeNameRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1591:1: ( ( ( 'TypeName' ) ) )
            // InternalRuleDsl.g:1592:2: ( ( 'TypeName' ) )
            {
            // InternalRuleDsl.g:1592:2: ( ( 'TypeName' ) )
            // InternalRuleDsl.g:1593:3: ( 'TypeName' )
            {
             before(grammarAccess.getTypeNameRuleAccess().getNameTypeNameKeyword_1_0()); 
            // InternalRuleDsl.g:1594:3: ( 'TypeName' )
            // InternalRuleDsl.g:1595:4: 'TypeName'
            {
             before(grammarAccess.getTypeNameRuleAccess().getNameTypeNameKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTypeNameRuleAccess().getNameTypeNameKeyword_1_0()); 

            }

             after(grammarAccess.getTypeNameRuleAccess().getNameTypeNameKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__NameAssignment_1"


    // $ANTLR start "rule__TypeNameRule__FormatAssignment_4"
    // InternalRuleDsl.g:1606:1: rule__TypeNameRule__FormatAssignment_4 : ( RULE_STRING ) ;
    public final void rule__TypeNameRule__FormatAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1610:1: ( ( RULE_STRING ) )
            // InternalRuleDsl.g:1611:2: ( RULE_STRING )
            {
            // InternalRuleDsl.g:1611:2: ( RULE_STRING )
            // InternalRuleDsl.g:1612:3: RULE_STRING
            {
             before(grammarAccess.getTypeNameRuleAccess().getFormatSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTypeNameRuleAccess().getFormatSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__FormatAssignment_4"


    // $ANTLR start "rule__TypeNameRule__ApplyToPublicAssignment_6"
    // InternalRuleDsl.g:1621:1: rule__TypeNameRule__ApplyToPublicAssignment_6 : ( RULE_BOOLEAN ) ;
    public final void rule__TypeNameRule__ApplyToPublicAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1625:1: ( ( RULE_BOOLEAN ) )
            // InternalRuleDsl.g:1626:2: ( RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:1626:2: ( RULE_BOOLEAN )
            // InternalRuleDsl.g:1627:3: RULE_BOOLEAN
            {
             before(grammarAccess.getTypeNameRuleAccess().getApplyToPublicBOOLEANTerminalRuleCall_6_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getTypeNameRuleAccess().getApplyToPublicBOOLEANTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__ApplyToPublicAssignment_6"


    // $ANTLR start "rule__TypeNameRule__ApplyToProtectedAssignment_8"
    // InternalRuleDsl.g:1636:1: rule__TypeNameRule__ApplyToProtectedAssignment_8 : ( RULE_BOOLEAN ) ;
    public final void rule__TypeNameRule__ApplyToProtectedAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1640:1: ( ( RULE_BOOLEAN ) )
            // InternalRuleDsl.g:1641:2: ( RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:1641:2: ( RULE_BOOLEAN )
            // InternalRuleDsl.g:1642:3: RULE_BOOLEAN
            {
             before(grammarAccess.getTypeNameRuleAccess().getApplyToProtectedBOOLEANTerminalRuleCall_8_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getTypeNameRuleAccess().getApplyToProtectedBOOLEANTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__ApplyToProtectedAssignment_8"


    // $ANTLR start "rule__TypeNameRule__ApplyToPackageAssignment_10"
    // InternalRuleDsl.g:1651:1: rule__TypeNameRule__ApplyToPackageAssignment_10 : ( RULE_BOOLEAN ) ;
    public final void rule__TypeNameRule__ApplyToPackageAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1655:1: ( ( RULE_BOOLEAN ) )
            // InternalRuleDsl.g:1656:2: ( RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:1656:2: ( RULE_BOOLEAN )
            // InternalRuleDsl.g:1657:3: RULE_BOOLEAN
            {
             before(grammarAccess.getTypeNameRuleAccess().getApplyToPackageBOOLEANTerminalRuleCall_10_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getTypeNameRuleAccess().getApplyToPackageBOOLEANTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__ApplyToPackageAssignment_10"


    // $ANTLR start "rule__TypeNameRule__ApplyToPrivateAssignment_12"
    // InternalRuleDsl.g:1666:1: rule__TypeNameRule__ApplyToPrivateAssignment_12 : ( RULE_BOOLEAN ) ;
    public final void rule__TypeNameRule__ApplyToPrivateAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1670:1: ( ( RULE_BOOLEAN ) )
            // InternalRuleDsl.g:1671:2: ( RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:1671:2: ( RULE_BOOLEAN )
            // InternalRuleDsl.g:1672:3: RULE_BOOLEAN
            {
             before(grammarAccess.getTypeNameRuleAccess().getApplyToPrivateBOOLEANTerminalRuleCall_12_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getTypeNameRuleAccess().getApplyToPrivateBOOLEANTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeNameRule__ApplyToPrivateAssignment_12"


    // $ANTLR start "rule__MethodNameRule__NameAssignment_1"
    // InternalRuleDsl.g:1681:1: rule__MethodNameRule__NameAssignment_1 : ( ( 'MethodNameRule' ) ) ;
    public final void rule__MethodNameRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1685:1: ( ( ( 'MethodNameRule' ) ) )
            // InternalRuleDsl.g:1686:2: ( ( 'MethodNameRule' ) )
            {
            // InternalRuleDsl.g:1686:2: ( ( 'MethodNameRule' ) )
            // InternalRuleDsl.g:1687:3: ( 'MethodNameRule' )
            {
             before(grammarAccess.getMethodNameRuleAccess().getNameMethodNameRuleKeyword_1_0()); 
            // InternalRuleDsl.g:1688:3: ( 'MethodNameRule' )
            // InternalRuleDsl.g:1689:4: 'MethodNameRule'
            {
             before(grammarAccess.getMethodNameRuleAccess().getNameMethodNameRuleKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMethodNameRuleAccess().getNameMethodNameRuleKeyword_1_0()); 

            }

             after(grammarAccess.getMethodNameRuleAccess().getNameMethodNameRuleKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__NameAssignment_1"


    // $ANTLR start "rule__MethodNameRule__FormatAssignment_4"
    // InternalRuleDsl.g:1700:1: rule__MethodNameRule__FormatAssignment_4 : ( RULE_STRING ) ;
    public final void rule__MethodNameRule__FormatAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1704:1: ( ( RULE_STRING ) )
            // InternalRuleDsl.g:1705:2: ( RULE_STRING )
            {
            // InternalRuleDsl.g:1705:2: ( RULE_STRING )
            // InternalRuleDsl.g:1706:3: RULE_STRING
            {
             before(grammarAccess.getMethodNameRuleAccess().getFormatSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMethodNameRuleAccess().getFormatSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__FormatAssignment_4"


    // $ANTLR start "rule__MethodNameRule__AllowClassNameAssignment_6"
    // InternalRuleDsl.g:1715:1: rule__MethodNameRule__AllowClassNameAssignment_6 : ( RULE_BOOLEAN ) ;
    public final void rule__MethodNameRule__AllowClassNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1719:1: ( ( RULE_BOOLEAN ) )
            // InternalRuleDsl.g:1720:2: ( RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:1720:2: ( RULE_BOOLEAN )
            // InternalRuleDsl.g:1721:3: RULE_BOOLEAN
            {
             before(grammarAccess.getMethodNameRuleAccess().getAllowClassNameBOOLEANTerminalRuleCall_6_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getMethodNameRuleAccess().getAllowClassNameBOOLEANTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__AllowClassNameAssignment_6"


    // $ANTLR start "rule__MethodNameRule__ApplyToPublicAssignment_8"
    // InternalRuleDsl.g:1730:1: rule__MethodNameRule__ApplyToPublicAssignment_8 : ( RULE_BOOLEAN ) ;
    public final void rule__MethodNameRule__ApplyToPublicAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1734:1: ( ( RULE_BOOLEAN ) )
            // InternalRuleDsl.g:1735:2: ( RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:1735:2: ( RULE_BOOLEAN )
            // InternalRuleDsl.g:1736:3: RULE_BOOLEAN
            {
             before(grammarAccess.getMethodNameRuleAccess().getApplyToPublicBOOLEANTerminalRuleCall_8_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getMethodNameRuleAccess().getApplyToPublicBOOLEANTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__ApplyToPublicAssignment_8"


    // $ANTLR start "rule__MethodNameRule__ApplyToProtectedAssignment_10"
    // InternalRuleDsl.g:1745:1: rule__MethodNameRule__ApplyToProtectedAssignment_10 : ( RULE_BOOLEAN ) ;
    public final void rule__MethodNameRule__ApplyToProtectedAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1749:1: ( ( RULE_BOOLEAN ) )
            // InternalRuleDsl.g:1750:2: ( RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:1750:2: ( RULE_BOOLEAN )
            // InternalRuleDsl.g:1751:3: RULE_BOOLEAN
            {
             before(grammarAccess.getMethodNameRuleAccess().getApplyToProtectedBOOLEANTerminalRuleCall_10_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getMethodNameRuleAccess().getApplyToProtectedBOOLEANTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__ApplyToProtectedAssignment_10"


    // $ANTLR start "rule__MethodNameRule__ApplyToPackageAssignment_12"
    // InternalRuleDsl.g:1760:1: rule__MethodNameRule__ApplyToPackageAssignment_12 : ( RULE_BOOLEAN ) ;
    public final void rule__MethodNameRule__ApplyToPackageAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1764:1: ( ( RULE_BOOLEAN ) )
            // InternalRuleDsl.g:1765:2: ( RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:1765:2: ( RULE_BOOLEAN )
            // InternalRuleDsl.g:1766:3: RULE_BOOLEAN
            {
             before(grammarAccess.getMethodNameRuleAccess().getApplyToPackageBOOLEANTerminalRuleCall_12_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getMethodNameRuleAccess().getApplyToPackageBOOLEANTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__ApplyToPackageAssignment_12"


    // $ANTLR start "rule__MethodNameRule__ApplyToPrivateAssignment_14"
    // InternalRuleDsl.g:1775:1: rule__MethodNameRule__ApplyToPrivateAssignment_14 : ( RULE_BOOLEAN ) ;
    public final void rule__MethodNameRule__ApplyToPrivateAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1779:1: ( ( RULE_BOOLEAN ) )
            // InternalRuleDsl.g:1780:2: ( RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:1780:2: ( RULE_BOOLEAN )
            // InternalRuleDsl.g:1781:3: RULE_BOOLEAN
            {
             before(grammarAccess.getMethodNameRuleAccess().getApplyToPrivateBOOLEANTerminalRuleCall_14_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getMethodNameRuleAccess().getApplyToPrivateBOOLEANTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodNameRule__ApplyToPrivateAssignment_14"


    // $ANTLR start "rule__MethodLengthRule__NameAssignment_1"
    // InternalRuleDsl.g:1790:1: rule__MethodLengthRule__NameAssignment_1 : ( ( 'MethodLengthRule' ) ) ;
    public final void rule__MethodLengthRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1794:1: ( ( ( 'MethodLengthRule' ) ) )
            // InternalRuleDsl.g:1795:2: ( ( 'MethodLengthRule' ) )
            {
            // InternalRuleDsl.g:1795:2: ( ( 'MethodLengthRule' ) )
            // InternalRuleDsl.g:1796:3: ( 'MethodLengthRule' )
            {
             before(grammarAccess.getMethodLengthRuleAccess().getNameMethodLengthRuleKeyword_1_0()); 
            // InternalRuleDsl.g:1797:3: ( 'MethodLengthRule' )
            // InternalRuleDsl.g:1798:4: 'MethodLengthRule'
            {
             before(grammarAccess.getMethodLengthRuleAccess().getNameMethodLengthRuleKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMethodLengthRuleAccess().getNameMethodLengthRuleKeyword_1_0()); 

            }

             after(grammarAccess.getMethodLengthRuleAccess().getNameMethodLengthRuleKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__NameAssignment_1"


    // $ANTLR start "rule__MethodLengthRule__MaxAssignment_4"
    // InternalRuleDsl.g:1809:1: rule__MethodLengthRule__MaxAssignment_4 : ( RULE_INT ) ;
    public final void rule__MethodLengthRule__MaxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1813:1: ( ( RULE_INT ) )
            // InternalRuleDsl.g:1814:2: ( RULE_INT )
            {
            // InternalRuleDsl.g:1814:2: ( RULE_INT )
            // InternalRuleDsl.g:1815:3: RULE_INT
            {
             before(grammarAccess.getMethodLengthRuleAccess().getMaxINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMethodLengthRuleAccess().getMaxINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__MaxAssignment_4"


    // $ANTLR start "rule__MethodLengthRule__CountEmptyAssignment_6"
    // InternalRuleDsl.g:1824:1: rule__MethodLengthRule__CountEmptyAssignment_6 : ( RULE_BOOLEAN ) ;
    public final void rule__MethodLengthRule__CountEmptyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1828:1: ( ( RULE_BOOLEAN ) )
            // InternalRuleDsl.g:1829:2: ( RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:1829:2: ( RULE_BOOLEAN )
            // InternalRuleDsl.g:1830:3: RULE_BOOLEAN
            {
             before(grammarAccess.getMethodLengthRuleAccess().getCountEmptyBOOLEANTerminalRuleCall_6_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getMethodLengthRuleAccess().getCountEmptyBOOLEANTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodLengthRule__CountEmptyAssignment_6"


    // $ANTLR start "rule__MethodParamCountRule__NameAssignment_1"
    // InternalRuleDsl.g:1839:1: rule__MethodParamCountRule__NameAssignment_1 : ( ( 'MethodParamLengthRule' ) ) ;
    public final void rule__MethodParamCountRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1843:1: ( ( ( 'MethodParamLengthRule' ) ) )
            // InternalRuleDsl.g:1844:2: ( ( 'MethodParamLengthRule' ) )
            {
            // InternalRuleDsl.g:1844:2: ( ( 'MethodParamLengthRule' ) )
            // InternalRuleDsl.g:1845:3: ( 'MethodParamLengthRule' )
            {
             before(grammarAccess.getMethodParamCountRuleAccess().getNameMethodParamLengthRuleKeyword_1_0()); 
            // InternalRuleDsl.g:1846:3: ( 'MethodParamLengthRule' )
            // InternalRuleDsl.g:1847:4: 'MethodParamLengthRule'
            {
             before(grammarAccess.getMethodParamCountRuleAccess().getNameMethodParamLengthRuleKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMethodParamCountRuleAccess().getNameMethodParamLengthRuleKeyword_1_0()); 

            }

             after(grammarAccess.getMethodParamCountRuleAccess().getNameMethodParamLengthRuleKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__NameAssignment_1"


    // $ANTLR start "rule__MethodParamCountRule__MaxAssignment_4"
    // InternalRuleDsl.g:1858:1: rule__MethodParamCountRule__MaxAssignment_4 : ( RULE_INT ) ;
    public final void rule__MethodParamCountRule__MaxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1862:1: ( ( RULE_INT ) )
            // InternalRuleDsl.g:1863:2: ( RULE_INT )
            {
            // InternalRuleDsl.g:1863:2: ( RULE_INT )
            // InternalRuleDsl.g:1864:3: RULE_INT
            {
             before(grammarAccess.getMethodParamCountRuleAccess().getMaxINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMethodParamCountRuleAccess().getMaxINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__MaxAssignment_4"


    // $ANTLR start "rule__MethodParamCountRule__IgnoreOverriddenMethodsAssignment_6"
    // InternalRuleDsl.g:1873:1: rule__MethodParamCountRule__IgnoreOverriddenMethodsAssignment_6 : ( RULE_BOOLEAN ) ;
    public final void rule__MethodParamCountRule__IgnoreOverriddenMethodsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1877:1: ( ( RULE_BOOLEAN ) )
            // InternalRuleDsl.g:1878:2: ( RULE_BOOLEAN )
            {
            // InternalRuleDsl.g:1878:2: ( RULE_BOOLEAN )
            // InternalRuleDsl.g:1879:3: RULE_BOOLEAN
            {
             before(grammarAccess.getMethodParamCountRuleAccess().getIgnoreOverriddenMethodsBOOLEANTerminalRuleCall_6_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getMethodParamCountRuleAccess().getIgnoreOverriddenMethodsBOOLEANTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodParamCountRule__IgnoreOverriddenMethodsAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000006800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});

}