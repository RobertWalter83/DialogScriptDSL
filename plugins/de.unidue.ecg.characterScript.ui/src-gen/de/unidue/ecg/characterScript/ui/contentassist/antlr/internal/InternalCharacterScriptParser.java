package de.unidue.ecg.characterScript.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.unidue.ecg.characterScript.services.CharacterScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCharacterScriptParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'full name'", "'age'", "'description'", "'sex'", "'type'", "'NUMBER'", "'TEXT'", "'PC'", "'NPC'", "'male'", "'female'", "'import'", "'template'", "'end'", "'as'", "'('", "')'", "','", "'custom'", "'attributes'", "'character'", "'uses'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_COMMENT=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalCharacterScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCharacterScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCharacterScriptParser.tokenNames; }
    public String getGrammarFileName() { return "../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g"; }


     
     	private CharacterScriptGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CharacterScriptGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleCharacters"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:60:1: entryRuleCharacters : ruleCharacters EOF ;
    public final void entryRuleCharacters() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:61:1: ( ruleCharacters EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:62:1: ruleCharacters EOF
            {
             before(grammarAccess.getCharactersRule()); 
            pushFollow(FOLLOW_ruleCharacters_in_entryRuleCharacters61);
            ruleCharacters();

            state._fsp--;

             after(grammarAccess.getCharactersRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharacters68); 

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
    // $ANTLR end "entryRuleCharacters"


    // $ANTLR start "ruleCharacters"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:69:1: ruleCharacters : ( ( rule__Characters__Group__0 ) ) ;
    public final void ruleCharacters() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:73:2: ( ( ( rule__Characters__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:74:1: ( ( rule__Characters__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:74:1: ( ( rule__Characters__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:75:1: ( rule__Characters__Group__0 )
            {
             before(grammarAccess.getCharactersAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:76:1: ( rule__Characters__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:76:2: rule__Characters__Group__0
            {
            pushFollow(FOLLOW_rule__Characters__Group__0_in_ruleCharacters94);
            rule__Characters__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharactersAccess().getGroup()); 

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
    // $ANTLR end "ruleCharacters"


    // $ANTLR start "entryRuleImport"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:89:1: ( ruleImport EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:104:1: ( rule__Import__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:104:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleTemplate"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:116:1: entryRuleTemplate : ruleTemplate EOF ;
    public final void entryRuleTemplate() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:117:1: ( ruleTemplate EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:118:1: ruleTemplate EOF
            {
             before(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_ruleTemplate_in_entryRuleTemplate181);
            ruleTemplate();

            state._fsp--;

             after(grammarAccess.getTemplateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplate188); 

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
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:125:1: ruleTemplate : ( ( rule__Template__Group__0 ) ) ;
    public final void ruleTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:129:2: ( ( ( rule__Template__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:130:1: ( ( rule__Template__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:130:1: ( ( rule__Template__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:131:1: ( rule__Template__Group__0 )
            {
             before(grammarAccess.getTemplateAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:132:1: ( rule__Template__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:132:2: rule__Template__Group__0
            {
            pushFollow(FOLLOW_rule__Template__Group__0_in_ruleTemplate214);
            rule__Template__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getGroup()); 

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
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleDefaultAttribute"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:144:1: entryRuleDefaultAttribute : ruleDefaultAttribute EOF ;
    public final void entryRuleDefaultAttribute() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:145:1: ( ruleDefaultAttribute EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:146:1: ruleDefaultAttribute EOF
            {
             before(grammarAccess.getDefaultAttributeRule()); 
            pushFollow(FOLLOW_ruleDefaultAttribute_in_entryRuleDefaultAttribute241);
            ruleDefaultAttribute();

            state._fsp--;

             after(grammarAccess.getDefaultAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultAttribute248); 

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
    // $ANTLR end "entryRuleDefaultAttribute"


    // $ANTLR start "ruleDefaultAttribute"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:153:1: ruleDefaultAttribute : ( ( rule__DefaultAttribute__Alternatives ) ) ;
    public final void ruleDefaultAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:157:2: ( ( ( rule__DefaultAttribute__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:158:1: ( ( rule__DefaultAttribute__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:158:1: ( ( rule__DefaultAttribute__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:159:1: ( rule__DefaultAttribute__Alternatives )
            {
             before(grammarAccess.getDefaultAttributeAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:160:1: ( rule__DefaultAttribute__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:160:2: rule__DefaultAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__DefaultAttribute__Alternatives_in_ruleDefaultAttribute274);
            rule__DefaultAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefaultAttributeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDefaultAttribute"


    // $ANTLR start "entryRuleCustomAttribute"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:172:1: entryRuleCustomAttribute : ruleCustomAttribute EOF ;
    public final void entryRuleCustomAttribute() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:173:1: ( ruleCustomAttribute EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:174:1: ruleCustomAttribute EOF
            {
             before(grammarAccess.getCustomAttributeRule()); 
            pushFollow(FOLLOW_ruleCustomAttribute_in_entryRuleCustomAttribute301);
            ruleCustomAttribute();

            state._fsp--;

             after(grammarAccess.getCustomAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomAttribute308); 

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
    // $ANTLR end "entryRuleCustomAttribute"


    // $ANTLR start "ruleCustomAttribute"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:181:1: ruleCustomAttribute : ( ( rule__CustomAttribute__Group__0 ) ) ;
    public final void ruleCustomAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:185:2: ( ( ( rule__CustomAttribute__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:186:1: ( ( rule__CustomAttribute__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:186:1: ( ( rule__CustomAttribute__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:187:1: ( rule__CustomAttribute__Group__0 )
            {
             before(grammarAccess.getCustomAttributeAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:188:1: ( rule__CustomAttribute__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:188:2: rule__CustomAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group__0_in_ruleCustomAttribute334);
            rule__CustomAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleCustomAttribute"


    // $ANTLR start "entryRuleCustomAttributeName"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:200:1: entryRuleCustomAttributeName : ruleCustomAttributeName EOF ;
    public final void entryRuleCustomAttributeName() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:201:1: ( ruleCustomAttributeName EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:202:1: ruleCustomAttributeName EOF
            {
             before(grammarAccess.getCustomAttributeNameRule()); 
            pushFollow(FOLLOW_ruleCustomAttributeName_in_entryRuleCustomAttributeName361);
            ruleCustomAttributeName();

            state._fsp--;

             after(grammarAccess.getCustomAttributeNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomAttributeName368); 

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
    // $ANTLR end "entryRuleCustomAttributeName"


    // $ANTLR start "ruleCustomAttributeName"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:209:1: ruleCustomAttributeName : ( ( rule__CustomAttributeName__NameAssignment ) ) ;
    public final void ruleCustomAttributeName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:213:2: ( ( ( rule__CustomAttributeName__NameAssignment ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:214:1: ( ( rule__CustomAttributeName__NameAssignment ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:214:1: ( ( rule__CustomAttributeName__NameAssignment ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:215:1: ( rule__CustomAttributeName__NameAssignment )
            {
             before(grammarAccess.getCustomAttributeNameAccess().getNameAssignment()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:216:1: ( rule__CustomAttributeName__NameAssignment )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:216:2: rule__CustomAttributeName__NameAssignment
            {
            pushFollow(FOLLOW_rule__CustomAttributeName__NameAssignment_in_ruleCustomAttributeName394);
            rule__CustomAttributeName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCustomAttributeNameAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleCustomAttributeName"


    // $ANTLR start "entryRuleEnumValue"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:228:1: entryRuleEnumValue : ruleEnumValue EOF ;
    public final void entryRuleEnumValue() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:229:1: ( ruleEnumValue EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:230:1: ruleEnumValue EOF
            {
             before(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_ruleEnumValue_in_entryRuleEnumValue421);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getEnumValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumValue428); 

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
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:237:1: ruleEnumValue : ( ( rule__EnumValue__NameAssignment ) ) ;
    public final void ruleEnumValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:241:2: ( ( ( rule__EnumValue__NameAssignment ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:242:1: ( ( rule__EnumValue__NameAssignment ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:242:1: ( ( rule__EnumValue__NameAssignment ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:243:1: ( rule__EnumValue__NameAssignment )
            {
             before(grammarAccess.getEnumValueAccess().getNameAssignment()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:244:1: ( rule__EnumValue__NameAssignment )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:244:2: rule__EnumValue__NameAssignment
            {
            pushFollow(FOLLOW_rule__EnumValue__NameAssignment_in_ruleEnumValue454);
            rule__EnumValue__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumValueAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleEnumID"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:256:1: entryRuleEnumID : ruleEnumID EOF ;
    public final void entryRuleEnumID() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:257:1: ( ruleEnumID EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:258:1: ruleEnumID EOF
            {
             before(grammarAccess.getEnumIDRule()); 
            pushFollow(FOLLOW_ruleEnumID_in_entryRuleEnumID481);
            ruleEnumID();

            state._fsp--;

             after(grammarAccess.getEnumIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumID488); 

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
    // $ANTLR end "entryRuleEnumID"


    // $ANTLR start "ruleEnumID"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:265:1: ruleEnumID : ( ( rule__EnumID__Alternatives ) ) ;
    public final void ruleEnumID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:269:2: ( ( ( rule__EnumID__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:270:1: ( ( rule__EnumID__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:270:1: ( ( rule__EnumID__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:271:1: ( rule__EnumID__Alternatives )
            {
             before(grammarAccess.getEnumIDAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:272:1: ( rule__EnumID__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:272:2: rule__EnumID__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumID__Alternatives_in_ruleEnumID514);
            rule__EnumID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnumIDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEnumID"


    // $ANTLR start "entryRuleCustoms"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:284:1: entryRuleCustoms : ruleCustoms EOF ;
    public final void entryRuleCustoms() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:285:1: ( ruleCustoms EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:286:1: ruleCustoms EOF
            {
             before(grammarAccess.getCustomsRule()); 
            pushFollow(FOLLOW_ruleCustoms_in_entryRuleCustoms541);
            ruleCustoms();

            state._fsp--;

             after(grammarAccess.getCustomsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustoms548); 

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
    // $ANTLR end "entryRuleCustoms"


    // $ANTLR start "ruleCustoms"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:293:1: ruleCustoms : ( ( rule__Customs__Group__0 ) ) ;
    public final void ruleCustoms() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:297:2: ( ( ( rule__Customs__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:298:1: ( ( rule__Customs__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:298:1: ( ( rule__Customs__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:299:1: ( rule__Customs__Group__0 )
            {
             before(grammarAccess.getCustomsAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:300:1: ( rule__Customs__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:300:2: rule__Customs__Group__0
            {
            pushFollow(FOLLOW_rule__Customs__Group__0_in_ruleCustoms574);
            rule__Customs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomsAccess().getGroup()); 

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
    // $ANTLR end "ruleCustoms"


    // $ANTLR start "entryRuleCharacter"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:312:1: entryRuleCharacter : ruleCharacter EOF ;
    public final void entryRuleCharacter() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:313:1: ( ruleCharacter EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:314:1: ruleCharacter EOF
            {
             before(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_ruleCharacter_in_entryRuleCharacter601);
            ruleCharacter();

            state._fsp--;

             after(grammarAccess.getCharacterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharacter608); 

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
    // $ANTLR end "entryRuleCharacter"


    // $ANTLR start "ruleCharacter"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:321:1: ruleCharacter : ( ( rule__Character__Group__0 ) ) ;
    public final void ruleCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:325:2: ( ( ( rule__Character__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:326:1: ( ( rule__Character__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:326:1: ( ( rule__Character__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:327:1: ( rule__Character__Group__0 )
            {
             before(grammarAccess.getCharacterAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:328:1: ( rule__Character__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:328:2: rule__Character__Group__0
            {
            pushFollow(FOLLOW_rule__Character__Group__0_in_ruleCharacter634);
            rule__Character__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getGroup()); 

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
    // $ANTLR end "ruleCharacter"


    // $ANTLR start "entryRuleProperty"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:340:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:341:1: ( ruleProperty EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:342:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty661);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty668); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:349:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:353:2: ( ( ( rule__Property__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:354:1: ( ( rule__Property__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:354:1: ( ( rule__Property__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:355:1: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:356:1: ( rule__Property__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:356:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_in_ruleProperty694);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleDefaultProperty"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:368:1: entryRuleDefaultProperty : ruleDefaultProperty EOF ;
    public final void entryRuleDefaultProperty() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:369:1: ( ruleDefaultProperty EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:370:1: ruleDefaultProperty EOF
            {
             before(grammarAccess.getDefaultPropertyRule()); 
            pushFollow(FOLLOW_ruleDefaultProperty_in_entryRuleDefaultProperty721);
            ruleDefaultProperty();

            state._fsp--;

             after(grammarAccess.getDefaultPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultProperty728); 

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
    // $ANTLR end "entryRuleDefaultProperty"


    // $ANTLR start "ruleDefaultProperty"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:377:1: ruleDefaultProperty : ( ( rule__DefaultProperty__Alternatives ) ) ;
    public final void ruleDefaultProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:381:2: ( ( ( rule__DefaultProperty__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:382:1: ( ( rule__DefaultProperty__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:382:1: ( ( rule__DefaultProperty__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:383:1: ( rule__DefaultProperty__Alternatives )
            {
             before(grammarAccess.getDefaultPropertyAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:384:1: ( rule__DefaultProperty__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:384:2: rule__DefaultProperty__Alternatives
            {
            pushFollow(FOLLOW_rule__DefaultProperty__Alternatives_in_ruleDefaultProperty754);
            rule__DefaultProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefaultPropertyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDefaultProperty"


    // $ANTLR start "entryRuleFullName"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:396:1: entryRuleFullName : ruleFullName EOF ;
    public final void entryRuleFullName() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:397:1: ( ruleFullName EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:398:1: ruleFullName EOF
            {
             before(grammarAccess.getFullNameRule()); 
            pushFollow(FOLLOW_ruleFullName_in_entryRuleFullName781);
            ruleFullName();

            state._fsp--;

             after(grammarAccess.getFullNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullName788); 

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
    // $ANTLR end "entryRuleFullName"


    // $ANTLR start "ruleFullName"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:405:1: ruleFullName : ( ( rule__FullName__Group__0 ) ) ;
    public final void ruleFullName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:409:2: ( ( ( rule__FullName__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:410:1: ( ( rule__FullName__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:410:1: ( ( rule__FullName__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:411:1: ( rule__FullName__Group__0 )
            {
             before(grammarAccess.getFullNameAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:412:1: ( rule__FullName__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:412:2: rule__FullName__Group__0
            {
            pushFollow(FOLLOW_rule__FullName__Group__0_in_ruleFullName814);
            rule__FullName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFullNameAccess().getGroup()); 

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
    // $ANTLR end "ruleFullName"


    // $ANTLR start "entryRuleDescription"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:424:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:425:1: ( ruleDescription EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:426:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription841);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription848); 

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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:433:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:437:2: ( ( ( rule__Description__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:438:1: ( ( rule__Description__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:438:1: ( ( rule__Description__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:439:1: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:440:1: ( rule__Description__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:440:2: rule__Description__Group__0
            {
            pushFollow(FOLLOW_rule__Description__Group__0_in_ruleDescription874);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleType"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:452:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:453:1: ( ruleType EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:454:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType901);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType908); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:461:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:465:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:466:1: ( ( rule__Type__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:466:1: ( ( rule__Type__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:467:1: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:468:1: ( rule__Type__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:468:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType934);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleAge"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:480:1: entryRuleAge : ruleAge EOF ;
    public final void entryRuleAge() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:481:1: ( ruleAge EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:482:1: ruleAge EOF
            {
             before(grammarAccess.getAgeRule()); 
            pushFollow(FOLLOW_ruleAge_in_entryRuleAge961);
            ruleAge();

            state._fsp--;

             after(grammarAccess.getAgeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAge968); 

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
    // $ANTLR end "entryRuleAge"


    // $ANTLR start "ruleAge"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:489:1: ruleAge : ( ( rule__Age__Group__0 ) ) ;
    public final void ruleAge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:493:2: ( ( ( rule__Age__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:494:1: ( ( rule__Age__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:494:1: ( ( rule__Age__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:495:1: ( rule__Age__Group__0 )
            {
             before(grammarAccess.getAgeAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:496:1: ( rule__Age__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:496:2: rule__Age__Group__0
            {
            pushFollow(FOLLOW_rule__Age__Group__0_in_ruleAge994);
            rule__Age__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAgeAccess().getGroup()); 

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
    // $ANTLR end "ruleAge"


    // $ANTLR start "entryRuleSex"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:508:1: entryRuleSex : ruleSex EOF ;
    public final void entryRuleSex() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:509:1: ( ruleSex EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:510:1: ruleSex EOF
            {
             before(grammarAccess.getSexRule()); 
            pushFollow(FOLLOW_ruleSex_in_entryRuleSex1021);
            ruleSex();

            state._fsp--;

             after(grammarAccess.getSexRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSex1028); 

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
    // $ANTLR end "entryRuleSex"


    // $ANTLR start "ruleSex"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:517:1: ruleSex : ( ( rule__Sex__Group__0 ) ) ;
    public final void ruleSex() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:521:2: ( ( ( rule__Sex__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:522:1: ( ( rule__Sex__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:522:1: ( ( rule__Sex__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:523:1: ( rule__Sex__Group__0 )
            {
             before(grammarAccess.getSexAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:524:1: ( rule__Sex__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:524:2: rule__Sex__Group__0
            {
            pushFollow(FOLLOW_rule__Sex__Group__0_in_ruleSex1054);
            rule__Sex__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSexAccess().getGroup()); 

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
    // $ANTLR end "ruleSex"


    // $ANTLR start "entryRuleCustomProperty"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:536:1: entryRuleCustomProperty : ruleCustomProperty EOF ;
    public final void entryRuleCustomProperty() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:537:1: ( ruleCustomProperty EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:538:1: ruleCustomProperty EOF
            {
             before(grammarAccess.getCustomPropertyRule()); 
            pushFollow(FOLLOW_ruleCustomProperty_in_entryRuleCustomProperty1081);
            ruleCustomProperty();

            state._fsp--;

             after(grammarAccess.getCustomPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomProperty1088); 

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
    // $ANTLR end "entryRuleCustomProperty"


    // $ANTLR start "ruleCustomProperty"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:545:1: ruleCustomProperty : ( ( rule__CustomProperty__Group__0 ) ) ;
    public final void ruleCustomProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:549:2: ( ( ( rule__CustomProperty__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:550:1: ( ( rule__CustomProperty__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:550:1: ( ( rule__CustomProperty__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:551:1: ( rule__CustomProperty__Group__0 )
            {
             before(grammarAccess.getCustomPropertyAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:552:1: ( rule__CustomProperty__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:552:2: rule__CustomProperty__Group__0
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group__0_in_ruleCustomProperty1114);
            rule__CustomProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleCustomProperty"


    // $ANTLR start "ruleAttributeType"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:565:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:569:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:570:1: ( ( rule__AttributeType__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:570:1: ( ( rule__AttributeType__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:571:1: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:572:1: ( rule__AttributeType__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:572:2: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType1151);
            rule__AttributeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "ruleCharaType"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:584:1: ruleCharaType : ( ( rule__CharaType__Alternatives ) ) ;
    public final void ruleCharaType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:588:1: ( ( ( rule__CharaType__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:589:1: ( ( rule__CharaType__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:589:1: ( ( rule__CharaType__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:590:1: ( rule__CharaType__Alternatives )
            {
             before(grammarAccess.getCharaTypeAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:591:1: ( rule__CharaType__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:591:2: rule__CharaType__Alternatives
            {
            pushFollow(FOLLOW_rule__CharaType__Alternatives_in_ruleCharaType1187);
            rule__CharaType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCharaTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCharaType"


    // $ANTLR start "ruleCharaSex"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:603:1: ruleCharaSex : ( ( rule__CharaSex__Alternatives ) ) ;
    public final void ruleCharaSex() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:607:1: ( ( ( rule__CharaSex__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:608:1: ( ( rule__CharaSex__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:608:1: ( ( rule__CharaSex__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:609:1: ( rule__CharaSex__Alternatives )
            {
             before(grammarAccess.getCharaSexAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:610:1: ( rule__CharaSex__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:610:2: rule__CharaSex__Alternatives
            {
            pushFollow(FOLLOW_rule__CharaSex__Alternatives_in_ruleCharaSex1223);
            rule__CharaSex__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCharaSexAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCharaSex"


    // $ANTLR start "rule__DefaultAttribute__Alternatives"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:621:1: rule__DefaultAttribute__Alternatives : ( ( 'full name' ) | ( 'age' ) | ( 'description' ) | ( 'sex' ) | ( 'type' ) );
    public final void rule__DefaultAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:625:1: ( ( 'full name' ) | ( 'age' ) | ( 'description' ) | ( 'sex' ) | ( 'type' ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            case 16:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:626:1: ( 'full name' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:626:1: ( 'full name' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:627:1: 'full name'
                    {
                     before(grammarAccess.getDefaultAttributeAccess().getFullNameKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__DefaultAttribute__Alternatives1259); 
                     after(grammarAccess.getDefaultAttributeAccess().getFullNameKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:634:6: ( 'age' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:634:6: ( 'age' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:635:1: 'age'
                    {
                     before(grammarAccess.getDefaultAttributeAccess().getAgeKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__DefaultAttribute__Alternatives1279); 
                     after(grammarAccess.getDefaultAttributeAccess().getAgeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:642:6: ( 'description' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:642:6: ( 'description' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:643:1: 'description'
                    {
                     before(grammarAccess.getDefaultAttributeAccess().getDescriptionKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__DefaultAttribute__Alternatives1299); 
                     after(grammarAccess.getDefaultAttributeAccess().getDescriptionKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:650:6: ( 'sex' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:650:6: ( 'sex' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:651:1: 'sex'
                    {
                     before(grammarAccess.getDefaultAttributeAccess().getSexKeyword_3()); 
                    match(input,15,FOLLOW_15_in_rule__DefaultAttribute__Alternatives1319); 
                     after(grammarAccess.getDefaultAttributeAccess().getSexKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:658:6: ( 'type' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:658:6: ( 'type' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:659:1: 'type'
                    {
                     before(grammarAccess.getDefaultAttributeAccess().getTypeKeyword_4()); 
                    match(input,16,FOLLOW_16_in_rule__DefaultAttribute__Alternatives1339); 
                     after(grammarAccess.getDefaultAttributeAccess().getTypeKeyword_4()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__DefaultAttribute__Alternatives"


    // $ANTLR start "rule__CustomAttribute__Alternatives_2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:671:1: rule__CustomAttribute__Alternatives_2 : ( ( ( rule__CustomAttribute__TypeAssignment_2_0 ) ) | ( ( rule__CustomAttribute__Group_2_1__0 ) ) );
    public final void rule__CustomAttribute__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:675:1: ( ( ( rule__CustomAttribute__TypeAssignment_2_0 ) ) | ( ( rule__CustomAttribute__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=17 && LA2_0<=18)) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:676:1: ( ( rule__CustomAttribute__TypeAssignment_2_0 ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:676:1: ( ( rule__CustomAttribute__TypeAssignment_2_0 ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:677:1: ( rule__CustomAttribute__TypeAssignment_2_0 )
                    {
                     before(grammarAccess.getCustomAttributeAccess().getTypeAssignment_2_0()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:678:1: ( rule__CustomAttribute__TypeAssignment_2_0 )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:678:2: rule__CustomAttribute__TypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__CustomAttribute__TypeAssignment_2_0_in_rule__CustomAttribute__Alternatives_21373);
                    rule__CustomAttribute__TypeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCustomAttributeAccess().getTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:682:6: ( ( rule__CustomAttribute__Group_2_1__0 ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:682:6: ( ( rule__CustomAttribute__Group_2_1__0 ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:683:1: ( rule__CustomAttribute__Group_2_1__0 )
                    {
                     before(grammarAccess.getCustomAttributeAccess().getGroup_2_1()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:684:1: ( rule__CustomAttribute__Group_2_1__0 )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:684:2: rule__CustomAttribute__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1__0_in_rule__CustomAttribute__Alternatives_21391);
                    rule__CustomAttribute__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCustomAttributeAccess().getGroup_2_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__CustomAttribute__Alternatives_2"


    // $ANTLR start "rule__EnumID__Alternatives"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:693:1: rule__EnumID__Alternatives : ( ( RULE_INT ) | ( RULE_ID ) );
    public final void rule__EnumID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:697:1: ( ( RULE_INT ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:698:1: ( RULE_INT )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:698:1: ( RULE_INT )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:699:1: RULE_INT
                    {
                     before(grammarAccess.getEnumIDAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumID__Alternatives1424); 
                     after(grammarAccess.getEnumIDAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:704:6: ( RULE_ID )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:704:6: ( RULE_ID )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:705:1: RULE_ID
                    {
                     before(grammarAccess.getEnumIDAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumID__Alternatives1441); 
                     after(grammarAccess.getEnumIDAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__EnumID__Alternatives"


    // $ANTLR start "rule__Property__Alternatives"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:715:1: rule__Property__Alternatives : ( ( ruleDefaultProperty ) | ( ruleCustomProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:719:1: ( ( ruleDefaultProperty ) | ( ruleCustomProperty ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=12 && LA4_0<=16)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:720:1: ( ruleDefaultProperty )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:720:1: ( ruleDefaultProperty )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:721:1: ruleDefaultProperty
                    {
                     before(grammarAccess.getPropertyAccess().getDefaultPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefaultProperty_in_rule__Property__Alternatives1473);
                    ruleDefaultProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getDefaultPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:726:6: ( ruleCustomProperty )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:726:6: ( ruleCustomProperty )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:727:1: ruleCustomProperty
                    {
                     before(grammarAccess.getPropertyAccess().getCustomPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCustomProperty_in_rule__Property__Alternatives1490);
                    ruleCustomProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getCustomPropertyParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__DefaultProperty__Alternatives"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:737:1: rule__DefaultProperty__Alternatives : ( ( ruleFullName ) | ( ruleDescription ) | ( ruleType ) | ( ruleAge ) | ( ruleSex ) );
    public final void rule__DefaultProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:741:1: ( ( ruleFullName ) | ( ruleDescription ) | ( ruleType ) | ( ruleAge ) | ( ruleSex ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 13:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:742:1: ( ruleFullName )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:742:1: ( ruleFullName )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:743:1: ruleFullName
                    {
                     before(grammarAccess.getDefaultPropertyAccess().getFullNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFullName_in_rule__DefaultProperty__Alternatives1522);
                    ruleFullName();

                    state._fsp--;

                     after(grammarAccess.getDefaultPropertyAccess().getFullNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:748:6: ( ruleDescription )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:748:6: ( ruleDescription )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:749:1: ruleDescription
                    {
                     before(grammarAccess.getDefaultPropertyAccess().getDescriptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDescription_in_rule__DefaultProperty__Alternatives1539);
                    ruleDescription();

                    state._fsp--;

                     after(grammarAccess.getDefaultPropertyAccess().getDescriptionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:754:6: ( ruleType )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:754:6: ( ruleType )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:755:1: ruleType
                    {
                     before(grammarAccess.getDefaultPropertyAccess().getTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleType_in_rule__DefaultProperty__Alternatives1556);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getDefaultPropertyAccess().getTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:760:6: ( ruleAge )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:760:6: ( ruleAge )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:761:1: ruleAge
                    {
                     before(grammarAccess.getDefaultPropertyAccess().getAgeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleAge_in_rule__DefaultProperty__Alternatives1573);
                    ruleAge();

                    state._fsp--;

                     after(grammarAccess.getDefaultPropertyAccess().getAgeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:766:6: ( ruleSex )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:766:6: ( ruleSex )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:767:1: ruleSex
                    {
                     before(grammarAccess.getDefaultPropertyAccess().getSexParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleSex_in_rule__DefaultProperty__Alternatives1590);
                    ruleSex();

                    state._fsp--;

                     after(grammarAccess.getDefaultPropertyAccess().getSexParserRuleCall_4()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__DefaultProperty__Alternatives"


    // $ANTLR start "rule__CustomProperty__Alternatives_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:777:1: rule__CustomProperty__Alternatives_1 : ( ( ( rule__CustomProperty__StringValueAssignment_1_0 ) ) | ( ( rule__CustomProperty__IntValueAssignment_1_1 ) ) | ( ( rule__CustomProperty__Group_1_2__0 ) ) );
    public final void rule__CustomProperty__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:781:1: ( ( ( rule__CustomProperty__StringValueAssignment_1_0 ) ) | ( ( rule__CustomProperty__IntValueAssignment_1_1 ) ) | ( ( rule__CustomProperty__Group_1_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case RULE_INT:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:782:1: ( ( rule__CustomProperty__StringValueAssignment_1_0 ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:782:1: ( ( rule__CustomProperty__StringValueAssignment_1_0 ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:783:1: ( rule__CustomProperty__StringValueAssignment_1_0 )
                    {
                     before(grammarAccess.getCustomPropertyAccess().getStringValueAssignment_1_0()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:784:1: ( rule__CustomProperty__StringValueAssignment_1_0 )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:784:2: rule__CustomProperty__StringValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__CustomProperty__StringValueAssignment_1_0_in_rule__CustomProperty__Alternatives_11622);
                    rule__CustomProperty__StringValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCustomPropertyAccess().getStringValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:788:6: ( ( rule__CustomProperty__IntValueAssignment_1_1 ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:788:6: ( ( rule__CustomProperty__IntValueAssignment_1_1 ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:789:1: ( rule__CustomProperty__IntValueAssignment_1_1 )
                    {
                     before(grammarAccess.getCustomPropertyAccess().getIntValueAssignment_1_1()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:790:1: ( rule__CustomProperty__IntValueAssignment_1_1 )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:790:2: rule__CustomProperty__IntValueAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__CustomProperty__IntValueAssignment_1_1_in_rule__CustomProperty__Alternatives_11640);
                    rule__CustomProperty__IntValueAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCustomPropertyAccess().getIntValueAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:794:6: ( ( rule__CustomProperty__Group_1_2__0 ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:794:6: ( ( rule__CustomProperty__Group_1_2__0 ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:795:1: ( rule__CustomProperty__Group_1_2__0 )
                    {
                     before(grammarAccess.getCustomPropertyAccess().getGroup_1_2()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:796:1: ( rule__CustomProperty__Group_1_2__0 )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:796:2: rule__CustomProperty__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__CustomProperty__Group_1_2__0_in_rule__CustomProperty__Alternatives_11658);
                    rule__CustomProperty__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCustomPropertyAccess().getGroup_1_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__CustomProperty__Alternatives_1"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:805:1: rule__AttributeType__Alternatives : ( ( ( 'NUMBER' ) ) | ( ( 'TEXT' ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:809:1: ( ( ( 'NUMBER' ) ) | ( ( 'TEXT' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:810:1: ( ( 'NUMBER' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:810:1: ( ( 'NUMBER' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:811:1: ( 'NUMBER' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNUMBEREnumLiteralDeclaration_0()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:812:1: ( 'NUMBER' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:812:3: 'NUMBER'
                    {
                    match(input,17,FOLLOW_17_in_rule__AttributeType__Alternatives1692); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getNUMBEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:817:6: ( ( 'TEXT' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:817:6: ( ( 'TEXT' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:818:1: ( 'TEXT' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getTEXTEnumLiteralDeclaration_1()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:819:1: ( 'TEXT' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:819:3: 'TEXT'
                    {
                    match(input,18,FOLLOW_18_in_rule__AttributeType__Alternatives1713); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getTEXTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__CharaType__Alternatives"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:829:1: rule__CharaType__Alternatives : ( ( ( 'PC' ) ) | ( ( 'NPC' ) ) );
    public final void rule__CharaType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:833:1: ( ( ( 'PC' ) ) | ( ( 'NPC' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:834:1: ( ( 'PC' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:834:1: ( ( 'PC' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:835:1: ( 'PC' )
                    {
                     before(grammarAccess.getCharaTypeAccess().getPCEnumLiteralDeclaration_0()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:836:1: ( 'PC' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:836:3: 'PC'
                    {
                    match(input,19,FOLLOW_19_in_rule__CharaType__Alternatives1749); 

                    }

                     after(grammarAccess.getCharaTypeAccess().getPCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:841:6: ( ( 'NPC' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:841:6: ( ( 'NPC' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:842:1: ( 'NPC' )
                    {
                     before(grammarAccess.getCharaTypeAccess().getNPCEnumLiteralDeclaration_1()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:843:1: ( 'NPC' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:843:3: 'NPC'
                    {
                    match(input,20,FOLLOW_20_in_rule__CharaType__Alternatives1770); 

                    }

                     after(grammarAccess.getCharaTypeAccess().getNPCEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__CharaType__Alternatives"


    // $ANTLR start "rule__CharaSex__Alternatives"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:853:1: rule__CharaSex__Alternatives : ( ( ( 'male' ) ) | ( ( 'female' ) ) );
    public final void rule__CharaSex__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:857:1: ( ( ( 'male' ) ) | ( ( 'female' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:858:1: ( ( 'male' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:858:1: ( ( 'male' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:859:1: ( 'male' )
                    {
                     before(grammarAccess.getCharaSexAccess().getMaleEnumLiteralDeclaration_0()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:860:1: ( 'male' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:860:3: 'male'
                    {
                    match(input,21,FOLLOW_21_in_rule__CharaSex__Alternatives1806); 

                    }

                     after(grammarAccess.getCharaSexAccess().getMaleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:865:6: ( ( 'female' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:865:6: ( ( 'female' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:866:1: ( 'female' )
                    {
                     before(grammarAccess.getCharaSexAccess().getFemaleEnumLiteralDeclaration_1()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:867:1: ( 'female' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:867:3: 'female'
                    {
                    match(input,22,FOLLOW_22_in_rule__CharaSex__Alternatives1827); 

                    }

                     after(grammarAccess.getCharaSexAccess().getFemaleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__CharaSex__Alternatives"


    // $ANTLR start "rule__Characters__Group__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:879:1: rule__Characters__Group__0 : rule__Characters__Group__0__Impl rule__Characters__Group__1 ;
    public final void rule__Characters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:883:1: ( rule__Characters__Group__0__Impl rule__Characters__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:884:2: rule__Characters__Group__0__Impl rule__Characters__Group__1
            {
            pushFollow(FOLLOW_rule__Characters__Group__0__Impl_in_rule__Characters__Group__01860);
            rule__Characters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Characters__Group__1_in_rule__Characters__Group__01863);
            rule__Characters__Group__1();

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
    // $ANTLR end "rule__Characters__Group__0"


    // $ANTLR start "rule__Characters__Group__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:891:1: rule__Characters__Group__0__Impl : ( ( rule__Characters__ImportsAssignment_0 )* ) ;
    public final void rule__Characters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:895:1: ( ( ( rule__Characters__ImportsAssignment_0 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:896:1: ( ( rule__Characters__ImportsAssignment_0 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:896:1: ( ( rule__Characters__ImportsAssignment_0 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:897:1: ( rule__Characters__ImportsAssignment_0 )*
            {
             before(grammarAccess.getCharactersAccess().getImportsAssignment_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:898:1: ( rule__Characters__ImportsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:898:2: rule__Characters__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Characters__ImportsAssignment_0_in_rule__Characters__Group__0__Impl1890);
            	    rule__Characters__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCharactersAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__Characters__Group__0__Impl"


    // $ANTLR start "rule__Characters__Group__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:908:1: rule__Characters__Group__1 : rule__Characters__Group__1__Impl rule__Characters__Group__2 ;
    public final void rule__Characters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:912:1: ( rule__Characters__Group__1__Impl rule__Characters__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:913:2: rule__Characters__Group__1__Impl rule__Characters__Group__2
            {
            pushFollow(FOLLOW_rule__Characters__Group__1__Impl_in_rule__Characters__Group__11921);
            rule__Characters__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Characters__Group__2_in_rule__Characters__Group__11924);
            rule__Characters__Group__2();

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
    // $ANTLR end "rule__Characters__Group__1"


    // $ANTLR start "rule__Characters__Group__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:920:1: rule__Characters__Group__1__Impl : ( ( rule__Characters__TemplatesAssignment_1 )* ) ;
    public final void rule__Characters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:924:1: ( ( ( rule__Characters__TemplatesAssignment_1 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:925:1: ( ( rule__Characters__TemplatesAssignment_1 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:925:1: ( ( rule__Characters__TemplatesAssignment_1 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:926:1: ( rule__Characters__TemplatesAssignment_1 )*
            {
             before(grammarAccess.getCharactersAccess().getTemplatesAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:927:1: ( rule__Characters__TemplatesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:927:2: rule__Characters__TemplatesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Characters__TemplatesAssignment_1_in_rule__Characters__Group__1__Impl1951);
            	    rule__Characters__TemplatesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCharactersAccess().getTemplatesAssignment_1()); 

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
    // $ANTLR end "rule__Characters__Group__1__Impl"


    // $ANTLR start "rule__Characters__Group__2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:937:1: rule__Characters__Group__2 : rule__Characters__Group__2__Impl rule__Characters__Group__3 ;
    public final void rule__Characters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:941:1: ( rule__Characters__Group__2__Impl rule__Characters__Group__3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:942:2: rule__Characters__Group__2__Impl rule__Characters__Group__3
            {
            pushFollow(FOLLOW_rule__Characters__Group__2__Impl_in_rule__Characters__Group__21982);
            rule__Characters__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Characters__Group__3_in_rule__Characters__Group__21985);
            rule__Characters__Group__3();

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
    // $ANTLR end "rule__Characters__Group__2"


    // $ANTLR start "rule__Characters__Group__2__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:949:1: rule__Characters__Group__2__Impl : ( ( rule__Characters__CustomsAssignment_2 )? ) ;
    public final void rule__Characters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:953:1: ( ( ( rule__Characters__CustomsAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:954:1: ( ( rule__Characters__CustomsAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:954:1: ( ( rule__Characters__CustomsAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:955:1: ( rule__Characters__CustomsAssignment_2 )?
            {
             before(grammarAccess.getCharactersAccess().getCustomsAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:956:1: ( rule__Characters__CustomsAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:956:2: rule__Characters__CustomsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Characters__CustomsAssignment_2_in_rule__Characters__Group__2__Impl2012);
                    rule__Characters__CustomsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharactersAccess().getCustomsAssignment_2()); 

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
    // $ANTLR end "rule__Characters__Group__2__Impl"


    // $ANTLR start "rule__Characters__Group__3"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:966:1: rule__Characters__Group__3 : rule__Characters__Group__3__Impl ;
    public final void rule__Characters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:970:1: ( rule__Characters__Group__3__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:971:2: rule__Characters__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Characters__Group__3__Impl_in_rule__Characters__Group__32043);
            rule__Characters__Group__3__Impl();

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
    // $ANTLR end "rule__Characters__Group__3"


    // $ANTLR start "rule__Characters__Group__3__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:977:1: rule__Characters__Group__3__Impl : ( ( rule__Characters__CharactersAssignment_3 )* ) ;
    public final void rule__Characters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:981:1: ( ( ( rule__Characters__CharactersAssignment_3 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:982:1: ( ( rule__Characters__CharactersAssignment_3 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:982:1: ( ( rule__Characters__CharactersAssignment_3 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:983:1: ( rule__Characters__CharactersAssignment_3 )*
            {
             before(grammarAccess.getCharactersAccess().getCharactersAssignment_3()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:984:1: ( rule__Characters__CharactersAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:984:2: rule__Characters__CharactersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Characters__CharactersAssignment_3_in_rule__Characters__Group__3__Impl2070);
            	    rule__Characters__CharactersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getCharactersAccess().getCharactersAssignment_3()); 

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
    // $ANTLR end "rule__Characters__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1002:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1006:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1007:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02109);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02112);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1014:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1018:1: ( ( 'import' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1019:1: ( 'import' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1019:1: ( 'import' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1020:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Import__Group__0__Impl2140); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1033:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1037:1: ( rule__Import__Group__1__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1038:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12171);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1044:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1048:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1049:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1049:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1050:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1051:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1051:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2198);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Template__Group__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1065:1: rule__Template__Group__0 : rule__Template__Group__0__Impl rule__Template__Group__1 ;
    public final void rule__Template__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1069:1: ( rule__Template__Group__0__Impl rule__Template__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1070:2: rule__Template__Group__0__Impl rule__Template__Group__1
            {
            pushFollow(FOLLOW_rule__Template__Group__0__Impl_in_rule__Template__Group__02232);
            rule__Template__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__1_in_rule__Template__Group__02235);
            rule__Template__Group__1();

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
    // $ANTLR end "rule__Template__Group__0"


    // $ANTLR start "rule__Template__Group__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1077:1: rule__Template__Group__0__Impl : ( 'template' ) ;
    public final void rule__Template__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1081:1: ( ( 'template' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1082:1: ( 'template' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1082:1: ( 'template' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1083:1: 'template'
            {
             before(grammarAccess.getTemplateAccess().getTemplateKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Template__Group__0__Impl2263); 
             after(grammarAccess.getTemplateAccess().getTemplateKeyword_0()); 

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
    // $ANTLR end "rule__Template__Group__0__Impl"


    // $ANTLR start "rule__Template__Group__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1096:1: rule__Template__Group__1 : rule__Template__Group__1__Impl rule__Template__Group__2 ;
    public final void rule__Template__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1100:1: ( rule__Template__Group__1__Impl rule__Template__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1101:2: rule__Template__Group__1__Impl rule__Template__Group__2
            {
            pushFollow(FOLLOW_rule__Template__Group__1__Impl_in_rule__Template__Group__12294);
            rule__Template__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__2_in_rule__Template__Group__12297);
            rule__Template__Group__2();

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
    // $ANTLR end "rule__Template__Group__1"


    // $ANTLR start "rule__Template__Group__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1108:1: rule__Template__Group__1__Impl : ( ( rule__Template__NameAssignment_1 ) ) ;
    public final void rule__Template__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1112:1: ( ( ( rule__Template__NameAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1113:1: ( ( rule__Template__NameAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1113:1: ( ( rule__Template__NameAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1114:1: ( rule__Template__NameAssignment_1 )
            {
             before(grammarAccess.getTemplateAccess().getNameAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1115:1: ( rule__Template__NameAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1115:2: rule__Template__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Template__NameAssignment_1_in_rule__Template__Group__1__Impl2324);
            rule__Template__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Template__Group__1__Impl"


    // $ANTLR start "rule__Template__Group__2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1125:1: rule__Template__Group__2 : rule__Template__Group__2__Impl rule__Template__Group__3 ;
    public final void rule__Template__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1129:1: ( rule__Template__Group__2__Impl rule__Template__Group__3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1130:2: rule__Template__Group__2__Impl rule__Template__Group__3
            {
            pushFollow(FOLLOW_rule__Template__Group__2__Impl_in_rule__Template__Group__22354);
            rule__Template__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__3_in_rule__Template__Group__22357);
            rule__Template__Group__3();

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
    // $ANTLR end "rule__Template__Group__2"


    // $ANTLR start "rule__Template__Group__2__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1137:1: rule__Template__Group__2__Impl : ( ( rule__Template__DefaultsAssignment_2 )* ) ;
    public final void rule__Template__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1141:1: ( ( ( rule__Template__DefaultsAssignment_2 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1142:1: ( ( rule__Template__DefaultsAssignment_2 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1142:1: ( ( rule__Template__DefaultsAssignment_2 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1143:1: ( rule__Template__DefaultsAssignment_2 )*
            {
             before(grammarAccess.getTemplateAccess().getDefaultsAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1144:1: ( rule__Template__DefaultsAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=12 && LA14_0<=16)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1144:2: rule__Template__DefaultsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Template__DefaultsAssignment_2_in_rule__Template__Group__2__Impl2384);
            	    rule__Template__DefaultsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTemplateAccess().getDefaultsAssignment_2()); 

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
    // $ANTLR end "rule__Template__Group__2__Impl"


    // $ANTLR start "rule__Template__Group__3"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1154:1: rule__Template__Group__3 : rule__Template__Group__3__Impl rule__Template__Group__4 ;
    public final void rule__Template__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1158:1: ( rule__Template__Group__3__Impl rule__Template__Group__4 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1159:2: rule__Template__Group__3__Impl rule__Template__Group__4
            {
            pushFollow(FOLLOW_rule__Template__Group__3__Impl_in_rule__Template__Group__32415);
            rule__Template__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__4_in_rule__Template__Group__32418);
            rule__Template__Group__4();

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
    // $ANTLR end "rule__Template__Group__3"


    // $ANTLR start "rule__Template__Group__3__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1166:1: rule__Template__Group__3__Impl : ( ( rule__Template__CustomsAssignment_3 )* ) ;
    public final void rule__Template__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1170:1: ( ( ( rule__Template__CustomsAssignment_3 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1171:1: ( ( rule__Template__CustomsAssignment_3 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1171:1: ( ( rule__Template__CustomsAssignment_3 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1172:1: ( rule__Template__CustomsAssignment_3 )*
            {
             before(grammarAccess.getTemplateAccess().getCustomsAssignment_3()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1173:1: ( rule__Template__CustomsAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1173:2: rule__Template__CustomsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Template__CustomsAssignment_3_in_rule__Template__Group__3__Impl2445);
            	    rule__Template__CustomsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTemplateAccess().getCustomsAssignment_3()); 

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
    // $ANTLR end "rule__Template__Group__3__Impl"


    // $ANTLR start "rule__Template__Group__4"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1183:1: rule__Template__Group__4 : rule__Template__Group__4__Impl ;
    public final void rule__Template__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1187:1: ( rule__Template__Group__4__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1188:2: rule__Template__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Template__Group__4__Impl_in_rule__Template__Group__42476);
            rule__Template__Group__4__Impl();

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
    // $ANTLR end "rule__Template__Group__4"


    // $ANTLR start "rule__Template__Group__4__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1194:1: rule__Template__Group__4__Impl : ( 'end' ) ;
    public final void rule__Template__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1198:1: ( ( 'end' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1199:1: ( 'end' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1199:1: ( 'end' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1200:1: 'end'
            {
             before(grammarAccess.getTemplateAccess().getEndKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Template__Group__4__Impl2504); 
             after(grammarAccess.getTemplateAccess().getEndKeyword_4()); 

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
    // $ANTLR end "rule__Template__Group__4__Impl"


    // $ANTLR start "rule__CustomAttribute__Group__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1223:1: rule__CustomAttribute__Group__0 : rule__CustomAttribute__Group__0__Impl rule__CustomAttribute__Group__1 ;
    public final void rule__CustomAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1227:1: ( rule__CustomAttribute__Group__0__Impl rule__CustomAttribute__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1228:2: rule__CustomAttribute__Group__0__Impl rule__CustomAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group__0__Impl_in_rule__CustomAttribute__Group__02545);
            rule__CustomAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group__1_in_rule__CustomAttribute__Group__02548);
            rule__CustomAttribute__Group__1();

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
    // $ANTLR end "rule__CustomAttribute__Group__0"


    // $ANTLR start "rule__CustomAttribute__Group__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1235:1: rule__CustomAttribute__Group__0__Impl : ( ( rule__CustomAttribute__CaNameAssignment_0 ) ) ;
    public final void rule__CustomAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1239:1: ( ( ( rule__CustomAttribute__CaNameAssignment_0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1240:1: ( ( rule__CustomAttribute__CaNameAssignment_0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1240:1: ( ( rule__CustomAttribute__CaNameAssignment_0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1241:1: ( rule__CustomAttribute__CaNameAssignment_0 )
            {
             before(grammarAccess.getCustomAttributeAccess().getCaNameAssignment_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1242:1: ( rule__CustomAttribute__CaNameAssignment_0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1242:2: rule__CustomAttribute__CaNameAssignment_0
            {
            pushFollow(FOLLOW_rule__CustomAttribute__CaNameAssignment_0_in_rule__CustomAttribute__Group__0__Impl2575);
            rule__CustomAttribute__CaNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCustomAttributeAccess().getCaNameAssignment_0()); 

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
    // $ANTLR end "rule__CustomAttribute__Group__0__Impl"


    // $ANTLR start "rule__CustomAttribute__Group__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1252:1: rule__CustomAttribute__Group__1 : rule__CustomAttribute__Group__1__Impl rule__CustomAttribute__Group__2 ;
    public final void rule__CustomAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1256:1: ( rule__CustomAttribute__Group__1__Impl rule__CustomAttribute__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1257:2: rule__CustomAttribute__Group__1__Impl rule__CustomAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group__1__Impl_in_rule__CustomAttribute__Group__12605);
            rule__CustomAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group__2_in_rule__CustomAttribute__Group__12608);
            rule__CustomAttribute__Group__2();

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
    // $ANTLR end "rule__CustomAttribute__Group__1"


    // $ANTLR start "rule__CustomAttribute__Group__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1264:1: rule__CustomAttribute__Group__1__Impl : ( 'as' ) ;
    public final void rule__CustomAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1268:1: ( ( 'as' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1269:1: ( 'as' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1269:1: ( 'as' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1270:1: 'as'
            {
             before(grammarAccess.getCustomAttributeAccess().getAsKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__CustomAttribute__Group__1__Impl2636); 
             after(grammarAccess.getCustomAttributeAccess().getAsKeyword_1()); 

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
    // $ANTLR end "rule__CustomAttribute__Group__1__Impl"


    // $ANTLR start "rule__CustomAttribute__Group__2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1283:1: rule__CustomAttribute__Group__2 : rule__CustomAttribute__Group__2__Impl ;
    public final void rule__CustomAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1287:1: ( rule__CustomAttribute__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1288:2: rule__CustomAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group__2__Impl_in_rule__CustomAttribute__Group__22667);
            rule__CustomAttribute__Group__2__Impl();

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
    // $ANTLR end "rule__CustomAttribute__Group__2"


    // $ANTLR start "rule__CustomAttribute__Group__2__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1294:1: rule__CustomAttribute__Group__2__Impl : ( ( rule__CustomAttribute__Alternatives_2 ) ) ;
    public final void rule__CustomAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1298:1: ( ( ( rule__CustomAttribute__Alternatives_2 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1299:1: ( ( rule__CustomAttribute__Alternatives_2 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1299:1: ( ( rule__CustomAttribute__Alternatives_2 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1300:1: ( rule__CustomAttribute__Alternatives_2 )
            {
             before(grammarAccess.getCustomAttributeAccess().getAlternatives_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1301:1: ( rule__CustomAttribute__Alternatives_2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1301:2: rule__CustomAttribute__Alternatives_2
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Alternatives_2_in_rule__CustomAttribute__Group__2__Impl2694);
            rule__CustomAttribute__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCustomAttributeAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__CustomAttribute__Group__2__Impl"


    // $ANTLR start "rule__CustomAttribute__Group_2_1__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1317:1: rule__CustomAttribute__Group_2_1__0 : rule__CustomAttribute__Group_2_1__0__Impl rule__CustomAttribute__Group_2_1__1 ;
    public final void rule__CustomAttribute__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1321:1: ( rule__CustomAttribute__Group_2_1__0__Impl rule__CustomAttribute__Group_2_1__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1322:2: rule__CustomAttribute__Group_2_1__0__Impl rule__CustomAttribute__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1__0__Impl_in_rule__CustomAttribute__Group_2_1__02730);
            rule__CustomAttribute__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1__1_in_rule__CustomAttribute__Group_2_1__02733);
            rule__CustomAttribute__Group_2_1__1();

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
    // $ANTLR end "rule__CustomAttribute__Group_2_1__0"


    // $ANTLR start "rule__CustomAttribute__Group_2_1__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1329:1: rule__CustomAttribute__Group_2_1__0__Impl : ( '(' ) ;
    public final void rule__CustomAttribute__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1333:1: ( ( '(' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1334:1: ( '(' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1334:1: ( '(' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1335:1: '('
            {
             before(grammarAccess.getCustomAttributeAccess().getLeftParenthesisKeyword_2_1_0()); 
            match(input,27,FOLLOW_27_in_rule__CustomAttribute__Group_2_1__0__Impl2761); 
             after(grammarAccess.getCustomAttributeAccess().getLeftParenthesisKeyword_2_1_0()); 

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
    // $ANTLR end "rule__CustomAttribute__Group_2_1__0__Impl"


    // $ANTLR start "rule__CustomAttribute__Group_2_1__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1348:1: rule__CustomAttribute__Group_2_1__1 : rule__CustomAttribute__Group_2_1__1__Impl rule__CustomAttribute__Group_2_1__2 ;
    public final void rule__CustomAttribute__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1352:1: ( rule__CustomAttribute__Group_2_1__1__Impl rule__CustomAttribute__Group_2_1__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1353:2: rule__CustomAttribute__Group_2_1__1__Impl rule__CustomAttribute__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1__1__Impl_in_rule__CustomAttribute__Group_2_1__12792);
            rule__CustomAttribute__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1__2_in_rule__CustomAttribute__Group_2_1__12795);
            rule__CustomAttribute__Group_2_1__2();

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
    // $ANTLR end "rule__CustomAttribute__Group_2_1__1"


    // $ANTLR start "rule__CustomAttribute__Group_2_1__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1360:1: rule__CustomAttribute__Group_2_1__1__Impl : ( ( rule__CustomAttribute__EnumValuesAssignment_2_1_1 ) ) ;
    public final void rule__CustomAttribute__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1364:1: ( ( ( rule__CustomAttribute__EnumValuesAssignment_2_1_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1365:1: ( ( rule__CustomAttribute__EnumValuesAssignment_2_1_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1365:1: ( ( rule__CustomAttribute__EnumValuesAssignment_2_1_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1366:1: ( rule__CustomAttribute__EnumValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getCustomAttributeAccess().getEnumValuesAssignment_2_1_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1367:1: ( rule__CustomAttribute__EnumValuesAssignment_2_1_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1367:2: rule__CustomAttribute__EnumValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__CustomAttribute__EnumValuesAssignment_2_1_1_in_rule__CustomAttribute__Group_2_1__1__Impl2822);
            rule__CustomAttribute__EnumValuesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomAttributeAccess().getEnumValuesAssignment_2_1_1()); 

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
    // $ANTLR end "rule__CustomAttribute__Group_2_1__1__Impl"


    // $ANTLR start "rule__CustomAttribute__Group_2_1__2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1377:1: rule__CustomAttribute__Group_2_1__2 : rule__CustomAttribute__Group_2_1__2__Impl rule__CustomAttribute__Group_2_1__3 ;
    public final void rule__CustomAttribute__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1381:1: ( rule__CustomAttribute__Group_2_1__2__Impl rule__CustomAttribute__Group_2_1__3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1382:2: rule__CustomAttribute__Group_2_1__2__Impl rule__CustomAttribute__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1__2__Impl_in_rule__CustomAttribute__Group_2_1__22852);
            rule__CustomAttribute__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1__3_in_rule__CustomAttribute__Group_2_1__22855);
            rule__CustomAttribute__Group_2_1__3();

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
    // $ANTLR end "rule__CustomAttribute__Group_2_1__2"


    // $ANTLR start "rule__CustomAttribute__Group_2_1__2__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1389:1: rule__CustomAttribute__Group_2_1__2__Impl : ( ( rule__CustomAttribute__Group_2_1_2__0 )* ) ;
    public final void rule__CustomAttribute__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1393:1: ( ( ( rule__CustomAttribute__Group_2_1_2__0 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1394:1: ( ( rule__CustomAttribute__Group_2_1_2__0 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1394:1: ( ( rule__CustomAttribute__Group_2_1_2__0 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1395:1: ( rule__CustomAttribute__Group_2_1_2__0 )*
            {
             before(grammarAccess.getCustomAttributeAccess().getGroup_2_1_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1396:1: ( rule__CustomAttribute__Group_2_1_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1396:2: rule__CustomAttribute__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1_2__0_in_rule__CustomAttribute__Group_2_1__2__Impl2882);
            	    rule__CustomAttribute__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getCustomAttributeAccess().getGroup_2_1_2()); 

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
    // $ANTLR end "rule__CustomAttribute__Group_2_1__2__Impl"


    // $ANTLR start "rule__CustomAttribute__Group_2_1__3"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1406:1: rule__CustomAttribute__Group_2_1__3 : rule__CustomAttribute__Group_2_1__3__Impl ;
    public final void rule__CustomAttribute__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1410:1: ( rule__CustomAttribute__Group_2_1__3__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1411:2: rule__CustomAttribute__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1__3__Impl_in_rule__CustomAttribute__Group_2_1__32913);
            rule__CustomAttribute__Group_2_1__3__Impl();

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
    // $ANTLR end "rule__CustomAttribute__Group_2_1__3"


    // $ANTLR start "rule__CustomAttribute__Group_2_1__3__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1417:1: rule__CustomAttribute__Group_2_1__3__Impl : ( ')' ) ;
    public final void rule__CustomAttribute__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1421:1: ( ( ')' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1422:1: ( ')' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1422:1: ( ')' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1423:1: ')'
            {
             before(grammarAccess.getCustomAttributeAccess().getRightParenthesisKeyword_2_1_3()); 
            match(input,28,FOLLOW_28_in_rule__CustomAttribute__Group_2_1__3__Impl2941); 
             after(grammarAccess.getCustomAttributeAccess().getRightParenthesisKeyword_2_1_3()); 

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
    // $ANTLR end "rule__CustomAttribute__Group_2_1__3__Impl"


    // $ANTLR start "rule__CustomAttribute__Group_2_1_2__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1444:1: rule__CustomAttribute__Group_2_1_2__0 : rule__CustomAttribute__Group_2_1_2__0__Impl rule__CustomAttribute__Group_2_1_2__1 ;
    public final void rule__CustomAttribute__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1448:1: ( rule__CustomAttribute__Group_2_1_2__0__Impl rule__CustomAttribute__Group_2_1_2__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1449:2: rule__CustomAttribute__Group_2_1_2__0__Impl rule__CustomAttribute__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1_2__0__Impl_in_rule__CustomAttribute__Group_2_1_2__02980);
            rule__CustomAttribute__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1_2__1_in_rule__CustomAttribute__Group_2_1_2__02983);
            rule__CustomAttribute__Group_2_1_2__1();

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
    // $ANTLR end "rule__CustomAttribute__Group_2_1_2__0"


    // $ANTLR start "rule__CustomAttribute__Group_2_1_2__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1456:1: rule__CustomAttribute__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__CustomAttribute__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1460:1: ( ( ',' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1461:1: ( ',' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1461:1: ( ',' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1462:1: ','
            {
             before(grammarAccess.getCustomAttributeAccess().getCommaKeyword_2_1_2_0()); 
            match(input,29,FOLLOW_29_in_rule__CustomAttribute__Group_2_1_2__0__Impl3011); 
             after(grammarAccess.getCustomAttributeAccess().getCommaKeyword_2_1_2_0()); 

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
    // $ANTLR end "rule__CustomAttribute__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__CustomAttribute__Group_2_1_2__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1475:1: rule__CustomAttribute__Group_2_1_2__1 : rule__CustomAttribute__Group_2_1_2__1__Impl ;
    public final void rule__CustomAttribute__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1479:1: ( rule__CustomAttribute__Group_2_1_2__1__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1480:2: rule__CustomAttribute__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1_2__1__Impl_in_rule__CustomAttribute__Group_2_1_2__13042);
            rule__CustomAttribute__Group_2_1_2__1__Impl();

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
    // $ANTLR end "rule__CustomAttribute__Group_2_1_2__1"


    // $ANTLR start "rule__CustomAttribute__Group_2_1_2__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1486:1: rule__CustomAttribute__Group_2_1_2__1__Impl : ( ( rule__CustomAttribute__EnumValuesAssignment_2_1_2_1 ) ) ;
    public final void rule__CustomAttribute__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1490:1: ( ( ( rule__CustomAttribute__EnumValuesAssignment_2_1_2_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1491:1: ( ( rule__CustomAttribute__EnumValuesAssignment_2_1_2_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1491:1: ( ( rule__CustomAttribute__EnumValuesAssignment_2_1_2_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1492:1: ( rule__CustomAttribute__EnumValuesAssignment_2_1_2_1 )
            {
             before(grammarAccess.getCustomAttributeAccess().getEnumValuesAssignment_2_1_2_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1493:1: ( rule__CustomAttribute__EnumValuesAssignment_2_1_2_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1493:2: rule__CustomAttribute__EnumValuesAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__CustomAttribute__EnumValuesAssignment_2_1_2_1_in_rule__CustomAttribute__Group_2_1_2__1__Impl3069);
            rule__CustomAttribute__EnumValuesAssignment_2_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomAttributeAccess().getEnumValuesAssignment_2_1_2_1()); 

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
    // $ANTLR end "rule__CustomAttribute__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__Customs__Group__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1507:1: rule__Customs__Group__0 : rule__Customs__Group__0__Impl rule__Customs__Group__1 ;
    public final void rule__Customs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1511:1: ( rule__Customs__Group__0__Impl rule__Customs__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1512:2: rule__Customs__Group__0__Impl rule__Customs__Group__1
            {
            pushFollow(FOLLOW_rule__Customs__Group__0__Impl_in_rule__Customs__Group__03103);
            rule__Customs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Customs__Group__1_in_rule__Customs__Group__03106);
            rule__Customs__Group__1();

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
    // $ANTLR end "rule__Customs__Group__0"


    // $ANTLR start "rule__Customs__Group__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1519:1: rule__Customs__Group__0__Impl : ( 'custom' ) ;
    public final void rule__Customs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1523:1: ( ( 'custom' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1524:1: ( 'custom' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1524:1: ( 'custom' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1525:1: 'custom'
            {
             before(grammarAccess.getCustomsAccess().getCustomKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Customs__Group__0__Impl3134); 
             after(grammarAccess.getCustomsAccess().getCustomKeyword_0()); 

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
    // $ANTLR end "rule__Customs__Group__0__Impl"


    // $ANTLR start "rule__Customs__Group__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1538:1: rule__Customs__Group__1 : rule__Customs__Group__1__Impl rule__Customs__Group__2 ;
    public final void rule__Customs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1542:1: ( rule__Customs__Group__1__Impl rule__Customs__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1543:2: rule__Customs__Group__1__Impl rule__Customs__Group__2
            {
            pushFollow(FOLLOW_rule__Customs__Group__1__Impl_in_rule__Customs__Group__13165);
            rule__Customs__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Customs__Group__2_in_rule__Customs__Group__13168);
            rule__Customs__Group__2();

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
    // $ANTLR end "rule__Customs__Group__1"


    // $ANTLR start "rule__Customs__Group__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1550:1: rule__Customs__Group__1__Impl : ( 'attributes' ) ;
    public final void rule__Customs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1554:1: ( ( 'attributes' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1555:1: ( 'attributes' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1555:1: ( 'attributes' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1556:1: 'attributes'
            {
             before(grammarAccess.getCustomsAccess().getAttributesKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Customs__Group__1__Impl3196); 
             after(grammarAccess.getCustomsAccess().getAttributesKeyword_1()); 

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
    // $ANTLR end "rule__Customs__Group__1__Impl"


    // $ANTLR start "rule__Customs__Group__2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1569:1: rule__Customs__Group__2 : rule__Customs__Group__2__Impl rule__Customs__Group__3 ;
    public final void rule__Customs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1573:1: ( rule__Customs__Group__2__Impl rule__Customs__Group__3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1574:2: rule__Customs__Group__2__Impl rule__Customs__Group__3
            {
            pushFollow(FOLLOW_rule__Customs__Group__2__Impl_in_rule__Customs__Group__23227);
            rule__Customs__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Customs__Group__3_in_rule__Customs__Group__23230);
            rule__Customs__Group__3();

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
    // $ANTLR end "rule__Customs__Group__2"


    // $ANTLR start "rule__Customs__Group__2__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1581:1: rule__Customs__Group__2__Impl : ( ( rule__Customs__CustomAttributesAssignment_2 ) ) ;
    public final void rule__Customs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1585:1: ( ( ( rule__Customs__CustomAttributesAssignment_2 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1586:1: ( ( rule__Customs__CustomAttributesAssignment_2 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1586:1: ( ( rule__Customs__CustomAttributesAssignment_2 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1587:1: ( rule__Customs__CustomAttributesAssignment_2 )
            {
             before(grammarAccess.getCustomsAccess().getCustomAttributesAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1588:1: ( rule__Customs__CustomAttributesAssignment_2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1588:2: rule__Customs__CustomAttributesAssignment_2
            {
            pushFollow(FOLLOW_rule__Customs__CustomAttributesAssignment_2_in_rule__Customs__Group__2__Impl3257);
            rule__Customs__CustomAttributesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCustomsAccess().getCustomAttributesAssignment_2()); 

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
    // $ANTLR end "rule__Customs__Group__2__Impl"


    // $ANTLR start "rule__Customs__Group__3"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1598:1: rule__Customs__Group__3 : rule__Customs__Group__3__Impl rule__Customs__Group__4 ;
    public final void rule__Customs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1602:1: ( rule__Customs__Group__3__Impl rule__Customs__Group__4 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1603:2: rule__Customs__Group__3__Impl rule__Customs__Group__4
            {
            pushFollow(FOLLOW_rule__Customs__Group__3__Impl_in_rule__Customs__Group__33287);
            rule__Customs__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Customs__Group__4_in_rule__Customs__Group__33290);
            rule__Customs__Group__4();

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
    // $ANTLR end "rule__Customs__Group__3"


    // $ANTLR start "rule__Customs__Group__3__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1610:1: rule__Customs__Group__3__Impl : ( ( rule__Customs__CustomAttributesAssignment_3 )* ) ;
    public final void rule__Customs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1614:1: ( ( ( rule__Customs__CustomAttributesAssignment_3 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1615:1: ( ( rule__Customs__CustomAttributesAssignment_3 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1615:1: ( ( rule__Customs__CustomAttributesAssignment_3 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1616:1: ( rule__Customs__CustomAttributesAssignment_3 )*
            {
             before(grammarAccess.getCustomsAccess().getCustomAttributesAssignment_3()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1617:1: ( rule__Customs__CustomAttributesAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1617:2: rule__Customs__CustomAttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Customs__CustomAttributesAssignment_3_in_rule__Customs__Group__3__Impl3317);
            	    rule__Customs__CustomAttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCustomsAccess().getCustomAttributesAssignment_3()); 

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
    // $ANTLR end "rule__Customs__Group__3__Impl"


    // $ANTLR start "rule__Customs__Group__4"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1627:1: rule__Customs__Group__4 : rule__Customs__Group__4__Impl ;
    public final void rule__Customs__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1631:1: ( rule__Customs__Group__4__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1632:2: rule__Customs__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Customs__Group__4__Impl_in_rule__Customs__Group__43348);
            rule__Customs__Group__4__Impl();

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
    // $ANTLR end "rule__Customs__Group__4"


    // $ANTLR start "rule__Customs__Group__4__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1638:1: rule__Customs__Group__4__Impl : ( 'end' ) ;
    public final void rule__Customs__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1642:1: ( ( 'end' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1643:1: ( 'end' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1643:1: ( 'end' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1644:1: 'end'
            {
             before(grammarAccess.getCustomsAccess().getEndKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Customs__Group__4__Impl3376); 
             after(grammarAccess.getCustomsAccess().getEndKeyword_4()); 

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
    // $ANTLR end "rule__Customs__Group__4__Impl"


    // $ANTLR start "rule__Character__Group__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1667:1: rule__Character__Group__0 : rule__Character__Group__0__Impl rule__Character__Group__1 ;
    public final void rule__Character__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1671:1: ( rule__Character__Group__0__Impl rule__Character__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1672:2: rule__Character__Group__0__Impl rule__Character__Group__1
            {
            pushFollow(FOLLOW_rule__Character__Group__0__Impl_in_rule__Character__Group__03417);
            rule__Character__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__1_in_rule__Character__Group__03420);
            rule__Character__Group__1();

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
    // $ANTLR end "rule__Character__Group__0"


    // $ANTLR start "rule__Character__Group__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1679:1: rule__Character__Group__0__Impl : ( 'character' ) ;
    public final void rule__Character__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1683:1: ( ( 'character' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1684:1: ( 'character' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1684:1: ( 'character' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1685:1: 'character'
            {
             before(grammarAccess.getCharacterAccess().getCharacterKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Character__Group__0__Impl3448); 
             after(grammarAccess.getCharacterAccess().getCharacterKeyword_0()); 

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
    // $ANTLR end "rule__Character__Group__0__Impl"


    // $ANTLR start "rule__Character__Group__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1698:1: rule__Character__Group__1 : rule__Character__Group__1__Impl rule__Character__Group__2 ;
    public final void rule__Character__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1702:1: ( rule__Character__Group__1__Impl rule__Character__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1703:2: rule__Character__Group__1__Impl rule__Character__Group__2
            {
            pushFollow(FOLLOW_rule__Character__Group__1__Impl_in_rule__Character__Group__13479);
            rule__Character__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__2_in_rule__Character__Group__13482);
            rule__Character__Group__2();

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
    // $ANTLR end "rule__Character__Group__1"


    // $ANTLR start "rule__Character__Group__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1710:1: rule__Character__Group__1__Impl : ( ( rule__Character__NameAssignment_1 ) ) ;
    public final void rule__Character__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1714:1: ( ( ( rule__Character__NameAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1715:1: ( ( rule__Character__NameAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1715:1: ( ( rule__Character__NameAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1716:1: ( rule__Character__NameAssignment_1 )
            {
             before(grammarAccess.getCharacterAccess().getNameAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1717:1: ( rule__Character__NameAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1717:2: rule__Character__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Character__NameAssignment_1_in_rule__Character__Group__1__Impl3509);
            rule__Character__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Character__Group__1__Impl"


    // $ANTLR start "rule__Character__Group__2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1727:1: rule__Character__Group__2 : rule__Character__Group__2__Impl rule__Character__Group__3 ;
    public final void rule__Character__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1731:1: ( rule__Character__Group__2__Impl rule__Character__Group__3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1732:2: rule__Character__Group__2__Impl rule__Character__Group__3
            {
            pushFollow(FOLLOW_rule__Character__Group__2__Impl_in_rule__Character__Group__23539);
            rule__Character__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__3_in_rule__Character__Group__23542);
            rule__Character__Group__3();

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
    // $ANTLR end "rule__Character__Group__2"


    // $ANTLR start "rule__Character__Group__2__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1739:1: rule__Character__Group__2__Impl : ( ( rule__Character__Group_2__0 )? ) ;
    public final void rule__Character__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1743:1: ( ( ( rule__Character__Group_2__0 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1744:1: ( ( rule__Character__Group_2__0 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1744:1: ( ( rule__Character__Group_2__0 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1745:1: ( rule__Character__Group_2__0 )?
            {
             before(grammarAccess.getCharacterAccess().getGroup_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1746:1: ( rule__Character__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1746:2: rule__Character__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Character__Group_2__0_in_rule__Character__Group__2__Impl3569);
                    rule__Character__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacterAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Character__Group__2__Impl"


    // $ANTLR start "rule__Character__Group__3"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1756:1: rule__Character__Group__3 : rule__Character__Group__3__Impl rule__Character__Group__4 ;
    public final void rule__Character__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1760:1: ( rule__Character__Group__3__Impl rule__Character__Group__4 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1761:2: rule__Character__Group__3__Impl rule__Character__Group__4
            {
            pushFollow(FOLLOW_rule__Character__Group__3__Impl_in_rule__Character__Group__33600);
            rule__Character__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__4_in_rule__Character__Group__33603);
            rule__Character__Group__4();

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
    // $ANTLR end "rule__Character__Group__3"


    // $ANTLR start "rule__Character__Group__3__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1768:1: rule__Character__Group__3__Impl : ( ( rule__Character__PropertiesAssignment_3 )* ) ;
    public final void rule__Character__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1772:1: ( ( ( rule__Character__PropertiesAssignment_3 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1773:1: ( ( rule__Character__PropertiesAssignment_3 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1773:1: ( ( rule__Character__PropertiesAssignment_3 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1774:1: ( rule__Character__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getCharacterAccess().getPropertiesAssignment_3()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1775:1: ( rule__Character__PropertiesAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=12 && LA19_0<=16)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1775:2: rule__Character__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Character__PropertiesAssignment_3_in_rule__Character__Group__3__Impl3630);
            	    rule__Character__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getCharacterAccess().getPropertiesAssignment_3()); 

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
    // $ANTLR end "rule__Character__Group__3__Impl"


    // $ANTLR start "rule__Character__Group__4"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1785:1: rule__Character__Group__4 : rule__Character__Group__4__Impl ;
    public final void rule__Character__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1789:1: ( rule__Character__Group__4__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1790:2: rule__Character__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Character__Group__4__Impl_in_rule__Character__Group__43661);
            rule__Character__Group__4__Impl();

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
    // $ANTLR end "rule__Character__Group__4"


    // $ANTLR start "rule__Character__Group__4__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1796:1: rule__Character__Group__4__Impl : ( 'end' ) ;
    public final void rule__Character__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1800:1: ( ( 'end' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1801:1: ( 'end' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1801:1: ( 'end' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1802:1: 'end'
            {
             before(grammarAccess.getCharacterAccess().getEndKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Character__Group__4__Impl3689); 
             after(grammarAccess.getCharacterAccess().getEndKeyword_4()); 

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
    // $ANTLR end "rule__Character__Group__4__Impl"


    // $ANTLR start "rule__Character__Group_2__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1825:1: rule__Character__Group_2__0 : rule__Character__Group_2__0__Impl rule__Character__Group_2__1 ;
    public final void rule__Character__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1829:1: ( rule__Character__Group_2__0__Impl rule__Character__Group_2__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1830:2: rule__Character__Group_2__0__Impl rule__Character__Group_2__1
            {
            pushFollow(FOLLOW_rule__Character__Group_2__0__Impl_in_rule__Character__Group_2__03730);
            rule__Character__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group_2__1_in_rule__Character__Group_2__03733);
            rule__Character__Group_2__1();

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
    // $ANTLR end "rule__Character__Group_2__0"


    // $ANTLR start "rule__Character__Group_2__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1837:1: rule__Character__Group_2__0__Impl : ( 'uses' ) ;
    public final void rule__Character__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1841:1: ( ( 'uses' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1842:1: ( 'uses' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1842:1: ( 'uses' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1843:1: 'uses'
            {
             before(grammarAccess.getCharacterAccess().getUsesKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__Character__Group_2__0__Impl3761); 
             after(grammarAccess.getCharacterAccess().getUsesKeyword_2_0()); 

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
    // $ANTLR end "rule__Character__Group_2__0__Impl"


    // $ANTLR start "rule__Character__Group_2__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1856:1: rule__Character__Group_2__1 : rule__Character__Group_2__1__Impl ;
    public final void rule__Character__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1860:1: ( rule__Character__Group_2__1__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1861:2: rule__Character__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Character__Group_2__1__Impl_in_rule__Character__Group_2__13792);
            rule__Character__Group_2__1__Impl();

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
    // $ANTLR end "rule__Character__Group_2__1"


    // $ANTLR start "rule__Character__Group_2__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1867:1: rule__Character__Group_2__1__Impl : ( ( rule__Character__TemplateAssignment_2_1 ) ) ;
    public final void rule__Character__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1871:1: ( ( ( rule__Character__TemplateAssignment_2_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1872:1: ( ( rule__Character__TemplateAssignment_2_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1872:1: ( ( rule__Character__TemplateAssignment_2_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1873:1: ( rule__Character__TemplateAssignment_2_1 )
            {
             before(grammarAccess.getCharacterAccess().getTemplateAssignment_2_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1874:1: ( rule__Character__TemplateAssignment_2_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1874:2: rule__Character__TemplateAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Character__TemplateAssignment_2_1_in_rule__Character__Group_2__1__Impl3819);
            rule__Character__TemplateAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getTemplateAssignment_2_1()); 

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
    // $ANTLR end "rule__Character__Group_2__1__Impl"


    // $ANTLR start "rule__FullName__Group__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1888:1: rule__FullName__Group__0 : rule__FullName__Group__0__Impl rule__FullName__Group__1 ;
    public final void rule__FullName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1892:1: ( rule__FullName__Group__0__Impl rule__FullName__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1893:2: rule__FullName__Group__0__Impl rule__FullName__Group__1
            {
            pushFollow(FOLLOW_rule__FullName__Group__0__Impl_in_rule__FullName__Group__03853);
            rule__FullName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FullName__Group__1_in_rule__FullName__Group__03856);
            rule__FullName__Group__1();

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
    // $ANTLR end "rule__FullName__Group__0"


    // $ANTLR start "rule__FullName__Group__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1900:1: rule__FullName__Group__0__Impl : ( 'full name' ) ;
    public final void rule__FullName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1904:1: ( ( 'full name' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1905:1: ( 'full name' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1905:1: ( 'full name' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1906:1: 'full name'
            {
             before(grammarAccess.getFullNameAccess().getFullNameKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__FullName__Group__0__Impl3884); 
             after(grammarAccess.getFullNameAccess().getFullNameKeyword_0()); 

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
    // $ANTLR end "rule__FullName__Group__0__Impl"


    // $ANTLR start "rule__FullName__Group__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1919:1: rule__FullName__Group__1 : rule__FullName__Group__1__Impl rule__FullName__Group__2 ;
    public final void rule__FullName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1923:1: ( rule__FullName__Group__1__Impl rule__FullName__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1924:2: rule__FullName__Group__1__Impl rule__FullName__Group__2
            {
            pushFollow(FOLLOW_rule__FullName__Group__1__Impl_in_rule__FullName__Group__13915);
            rule__FullName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FullName__Group__2_in_rule__FullName__Group__13918);
            rule__FullName__Group__2();

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
    // $ANTLR end "rule__FullName__Group__1"


    // $ANTLR start "rule__FullName__Group__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1931:1: rule__FullName__Group__1__Impl : ( ( rule__FullName__ValueAssignment_1 ) ) ;
    public final void rule__FullName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1935:1: ( ( ( rule__FullName__ValueAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1936:1: ( ( rule__FullName__ValueAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1936:1: ( ( rule__FullName__ValueAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1937:1: ( rule__FullName__ValueAssignment_1 )
            {
             before(grammarAccess.getFullNameAccess().getValueAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1938:1: ( rule__FullName__ValueAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1938:2: rule__FullName__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__FullName__ValueAssignment_1_in_rule__FullName__Group__1__Impl3945);
            rule__FullName__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFullNameAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__FullName__Group__1__Impl"


    // $ANTLR start "rule__FullName__Group__2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1948:1: rule__FullName__Group__2 : rule__FullName__Group__2__Impl ;
    public final void rule__FullName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1952:1: ( rule__FullName__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1953:2: rule__FullName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FullName__Group__2__Impl_in_rule__FullName__Group__23975);
            rule__FullName__Group__2__Impl();

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
    // $ANTLR end "rule__FullName__Group__2"


    // $ANTLR start "rule__FullName__Group__2__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1959:1: rule__FullName__Group__2__Impl : ( ( rule__FullName__CommentAssignment_2 )? ) ;
    public final void rule__FullName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1963:1: ( ( ( rule__FullName__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1964:1: ( ( rule__FullName__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1964:1: ( ( rule__FullName__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1965:1: ( rule__FullName__CommentAssignment_2 )?
            {
             before(grammarAccess.getFullNameAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1966:1: ( rule__FullName__CommentAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_COMMENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1966:2: rule__FullName__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FullName__CommentAssignment_2_in_rule__FullName__Group__2__Impl4002);
                    rule__FullName__CommentAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFullNameAccess().getCommentAssignment_2()); 

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
    // $ANTLR end "rule__FullName__Group__2__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1982:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1986:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1987:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_rule__Description__Group__0__Impl_in_rule__Description__Group__04039);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Description__Group__1_in_rule__Description__Group__04042);
            rule__Description__Group__1();

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
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1994:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1998:1: ( ( 'description' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1999:1: ( 'description' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1999:1: ( 'description' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2000:1: 'description'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Description__Group__0__Impl4070); 
             after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 

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
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2013:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2017:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2018:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_rule__Description__Group__1__Impl_in_rule__Description__Group__14101);
            rule__Description__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Description__Group__2_in_rule__Description__Group__14104);
            rule__Description__Group__2();

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
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2025:1: rule__Description__Group__1__Impl : ( ( rule__Description__ValueAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2029:1: ( ( ( rule__Description__ValueAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2030:1: ( ( rule__Description__ValueAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2030:1: ( ( rule__Description__ValueAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2031:1: ( rule__Description__ValueAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getValueAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2032:1: ( rule__Description__ValueAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2032:2: rule__Description__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Description__ValueAssignment_1_in_rule__Description__Group__1__Impl4131);
            rule__Description__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Description__Group__2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2042:1: rule__Description__Group__2 : rule__Description__Group__2__Impl ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2046:1: ( rule__Description__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2047:2: rule__Description__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Description__Group__2__Impl_in_rule__Description__Group__24161);
            rule__Description__Group__2__Impl();

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
    // $ANTLR end "rule__Description__Group__2"


    // $ANTLR start "rule__Description__Group__2__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2053:1: rule__Description__Group__2__Impl : ( ( rule__Description__CommentAssignment_2 )? ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2057:1: ( ( ( rule__Description__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2058:1: ( ( rule__Description__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2058:1: ( ( rule__Description__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2059:1: ( rule__Description__CommentAssignment_2 )?
            {
             before(grammarAccess.getDescriptionAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2060:1: ( rule__Description__CommentAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_COMMENT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2060:2: rule__Description__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Description__CommentAssignment_2_in_rule__Description__Group__2__Impl4188);
                    rule__Description__CommentAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDescriptionAccess().getCommentAssignment_2()); 

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
    // $ANTLR end "rule__Description__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2076:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2080:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2081:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__04225);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__04228);
            rule__Type__Group__1();

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
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2088:1: rule__Type__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2092:1: ( ( 'type' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2093:1: ( 'type' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2093:1: ( 'type' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2094:1: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Type__Group__0__Impl4256); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2107:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2111:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2112:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__14287);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__2_in_rule__Type__Group__14290);
            rule__Type__Group__2();

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
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2119:1: rule__Type__Group__1__Impl : ( ( rule__Type__ValueAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2123:1: ( ( ( rule__Type__ValueAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2124:1: ( ( rule__Type__ValueAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2124:1: ( ( rule__Type__ValueAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2125:1: ( rule__Type__ValueAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getValueAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2126:1: ( rule__Type__ValueAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2126:2: rule__Type__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Type__ValueAssignment_1_in_rule__Type__Group__1__Impl4317);
            rule__Type__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2136:1: rule__Type__Group__2 : rule__Type__Group__2__Impl ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2140:1: ( rule__Type__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2141:2: rule__Type__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__24347);
            rule__Type__Group__2__Impl();

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
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2147:1: rule__Type__Group__2__Impl : ( ( rule__Type__CommentAssignment_2 )? ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2151:1: ( ( ( rule__Type__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2152:1: ( ( rule__Type__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2152:1: ( ( rule__Type__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2153:1: ( rule__Type__CommentAssignment_2 )?
            {
             before(grammarAccess.getTypeAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2154:1: ( rule__Type__CommentAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_COMMENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2154:2: rule__Type__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Type__CommentAssignment_2_in_rule__Type__Group__2__Impl4374);
                    rule__Type__CommentAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getCommentAssignment_2()); 

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
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Age__Group__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2170:1: rule__Age__Group__0 : rule__Age__Group__0__Impl rule__Age__Group__1 ;
    public final void rule__Age__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2174:1: ( rule__Age__Group__0__Impl rule__Age__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2175:2: rule__Age__Group__0__Impl rule__Age__Group__1
            {
            pushFollow(FOLLOW_rule__Age__Group__0__Impl_in_rule__Age__Group__04411);
            rule__Age__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Age__Group__1_in_rule__Age__Group__04414);
            rule__Age__Group__1();

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
    // $ANTLR end "rule__Age__Group__0"


    // $ANTLR start "rule__Age__Group__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2182:1: rule__Age__Group__0__Impl : ( 'age' ) ;
    public final void rule__Age__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2186:1: ( ( 'age' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2187:1: ( 'age' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2187:1: ( 'age' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2188:1: 'age'
            {
             before(grammarAccess.getAgeAccess().getAgeKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Age__Group__0__Impl4442); 
             after(grammarAccess.getAgeAccess().getAgeKeyword_0()); 

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
    // $ANTLR end "rule__Age__Group__0__Impl"


    // $ANTLR start "rule__Age__Group__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2201:1: rule__Age__Group__1 : rule__Age__Group__1__Impl rule__Age__Group__2 ;
    public final void rule__Age__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2205:1: ( rule__Age__Group__1__Impl rule__Age__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2206:2: rule__Age__Group__1__Impl rule__Age__Group__2
            {
            pushFollow(FOLLOW_rule__Age__Group__1__Impl_in_rule__Age__Group__14473);
            rule__Age__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Age__Group__2_in_rule__Age__Group__14476);
            rule__Age__Group__2();

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
    // $ANTLR end "rule__Age__Group__1"


    // $ANTLR start "rule__Age__Group__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2213:1: rule__Age__Group__1__Impl : ( ( rule__Age__ValueAssignment_1 ) ) ;
    public final void rule__Age__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2217:1: ( ( ( rule__Age__ValueAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2218:1: ( ( rule__Age__ValueAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2218:1: ( ( rule__Age__ValueAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2219:1: ( rule__Age__ValueAssignment_1 )
            {
             before(grammarAccess.getAgeAccess().getValueAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2220:1: ( rule__Age__ValueAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2220:2: rule__Age__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Age__ValueAssignment_1_in_rule__Age__Group__1__Impl4503);
            rule__Age__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAgeAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Age__Group__1__Impl"


    // $ANTLR start "rule__Age__Group__2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2230:1: rule__Age__Group__2 : rule__Age__Group__2__Impl ;
    public final void rule__Age__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2234:1: ( rule__Age__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2235:2: rule__Age__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Age__Group__2__Impl_in_rule__Age__Group__24533);
            rule__Age__Group__2__Impl();

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
    // $ANTLR end "rule__Age__Group__2"


    // $ANTLR start "rule__Age__Group__2__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2241:1: rule__Age__Group__2__Impl : ( ( rule__Age__CommentAssignment_2 )? ) ;
    public final void rule__Age__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2245:1: ( ( ( rule__Age__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2246:1: ( ( rule__Age__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2246:1: ( ( rule__Age__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2247:1: ( rule__Age__CommentAssignment_2 )?
            {
             before(grammarAccess.getAgeAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2248:1: ( rule__Age__CommentAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_COMMENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2248:2: rule__Age__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Age__CommentAssignment_2_in_rule__Age__Group__2__Impl4560);
                    rule__Age__CommentAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAgeAccess().getCommentAssignment_2()); 

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
    // $ANTLR end "rule__Age__Group__2__Impl"


    // $ANTLR start "rule__Sex__Group__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2264:1: rule__Sex__Group__0 : rule__Sex__Group__0__Impl rule__Sex__Group__1 ;
    public final void rule__Sex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2268:1: ( rule__Sex__Group__0__Impl rule__Sex__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2269:2: rule__Sex__Group__0__Impl rule__Sex__Group__1
            {
            pushFollow(FOLLOW_rule__Sex__Group__0__Impl_in_rule__Sex__Group__04597);
            rule__Sex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sex__Group__1_in_rule__Sex__Group__04600);
            rule__Sex__Group__1();

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
    // $ANTLR end "rule__Sex__Group__0"


    // $ANTLR start "rule__Sex__Group__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2276:1: rule__Sex__Group__0__Impl : ( 'sex' ) ;
    public final void rule__Sex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2280:1: ( ( 'sex' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2281:1: ( 'sex' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2281:1: ( 'sex' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2282:1: 'sex'
            {
             before(grammarAccess.getSexAccess().getSexKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Sex__Group__0__Impl4628); 
             after(grammarAccess.getSexAccess().getSexKeyword_0()); 

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
    // $ANTLR end "rule__Sex__Group__0__Impl"


    // $ANTLR start "rule__Sex__Group__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2295:1: rule__Sex__Group__1 : rule__Sex__Group__1__Impl rule__Sex__Group__2 ;
    public final void rule__Sex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2299:1: ( rule__Sex__Group__1__Impl rule__Sex__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2300:2: rule__Sex__Group__1__Impl rule__Sex__Group__2
            {
            pushFollow(FOLLOW_rule__Sex__Group__1__Impl_in_rule__Sex__Group__14659);
            rule__Sex__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sex__Group__2_in_rule__Sex__Group__14662);
            rule__Sex__Group__2();

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
    // $ANTLR end "rule__Sex__Group__1"


    // $ANTLR start "rule__Sex__Group__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2307:1: rule__Sex__Group__1__Impl : ( ( rule__Sex__ValueAssignment_1 ) ) ;
    public final void rule__Sex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2311:1: ( ( ( rule__Sex__ValueAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2312:1: ( ( rule__Sex__ValueAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2312:1: ( ( rule__Sex__ValueAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2313:1: ( rule__Sex__ValueAssignment_1 )
            {
             before(grammarAccess.getSexAccess().getValueAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2314:1: ( rule__Sex__ValueAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2314:2: rule__Sex__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Sex__ValueAssignment_1_in_rule__Sex__Group__1__Impl4689);
            rule__Sex__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSexAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Sex__Group__1__Impl"


    // $ANTLR start "rule__Sex__Group__2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2324:1: rule__Sex__Group__2 : rule__Sex__Group__2__Impl ;
    public final void rule__Sex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2328:1: ( rule__Sex__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2329:2: rule__Sex__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Sex__Group__2__Impl_in_rule__Sex__Group__24719);
            rule__Sex__Group__2__Impl();

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
    // $ANTLR end "rule__Sex__Group__2"


    // $ANTLR start "rule__Sex__Group__2__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2335:1: rule__Sex__Group__2__Impl : ( ( rule__Sex__CommentAssignment_2 )? ) ;
    public final void rule__Sex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2339:1: ( ( ( rule__Sex__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2340:1: ( ( rule__Sex__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2340:1: ( ( rule__Sex__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2341:1: ( rule__Sex__CommentAssignment_2 )?
            {
             before(grammarAccess.getSexAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2342:1: ( rule__Sex__CommentAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_COMMENT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2342:2: rule__Sex__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Sex__CommentAssignment_2_in_rule__Sex__Group__2__Impl4746);
                    rule__Sex__CommentAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSexAccess().getCommentAssignment_2()); 

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
    // $ANTLR end "rule__Sex__Group__2__Impl"


    // $ANTLR start "rule__CustomProperty__Group__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2358:1: rule__CustomProperty__Group__0 : rule__CustomProperty__Group__0__Impl rule__CustomProperty__Group__1 ;
    public final void rule__CustomProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2362:1: ( rule__CustomProperty__Group__0__Impl rule__CustomProperty__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2363:2: rule__CustomProperty__Group__0__Impl rule__CustomProperty__Group__1
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group__0__Impl_in_rule__CustomProperty__Group__04783);
            rule__CustomProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomProperty__Group__1_in_rule__CustomProperty__Group__04786);
            rule__CustomProperty__Group__1();

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
    // $ANTLR end "rule__CustomProperty__Group__0"


    // $ANTLR start "rule__CustomProperty__Group__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2370:1: rule__CustomProperty__Group__0__Impl : ( ( rule__CustomProperty__CustomAttributeRefAssignment_0 ) ) ;
    public final void rule__CustomProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2374:1: ( ( ( rule__CustomProperty__CustomAttributeRefAssignment_0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2375:1: ( ( rule__CustomProperty__CustomAttributeRefAssignment_0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2375:1: ( ( rule__CustomProperty__CustomAttributeRefAssignment_0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2376:1: ( rule__CustomProperty__CustomAttributeRefAssignment_0 )
            {
             before(grammarAccess.getCustomPropertyAccess().getCustomAttributeRefAssignment_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2377:1: ( rule__CustomProperty__CustomAttributeRefAssignment_0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2377:2: rule__CustomProperty__CustomAttributeRefAssignment_0
            {
            pushFollow(FOLLOW_rule__CustomProperty__CustomAttributeRefAssignment_0_in_rule__CustomProperty__Group__0__Impl4813);
            rule__CustomProperty__CustomAttributeRefAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCustomPropertyAccess().getCustomAttributeRefAssignment_0()); 

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
    // $ANTLR end "rule__CustomProperty__Group__0__Impl"


    // $ANTLR start "rule__CustomProperty__Group__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2387:1: rule__CustomProperty__Group__1 : rule__CustomProperty__Group__1__Impl rule__CustomProperty__Group__2 ;
    public final void rule__CustomProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2391:1: ( rule__CustomProperty__Group__1__Impl rule__CustomProperty__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2392:2: rule__CustomProperty__Group__1__Impl rule__CustomProperty__Group__2
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group__1__Impl_in_rule__CustomProperty__Group__14843);
            rule__CustomProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomProperty__Group__2_in_rule__CustomProperty__Group__14846);
            rule__CustomProperty__Group__2();

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
    // $ANTLR end "rule__CustomProperty__Group__1"


    // $ANTLR start "rule__CustomProperty__Group__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2399:1: rule__CustomProperty__Group__1__Impl : ( ( rule__CustomProperty__Alternatives_1 ) ) ;
    public final void rule__CustomProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2403:1: ( ( ( rule__CustomProperty__Alternatives_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2404:1: ( ( rule__CustomProperty__Alternatives_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2404:1: ( ( rule__CustomProperty__Alternatives_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2405:1: ( rule__CustomProperty__Alternatives_1 )
            {
             before(grammarAccess.getCustomPropertyAccess().getAlternatives_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2406:1: ( rule__CustomProperty__Alternatives_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2406:2: rule__CustomProperty__Alternatives_1
            {
            pushFollow(FOLLOW_rule__CustomProperty__Alternatives_1_in_rule__CustomProperty__Group__1__Impl4873);
            rule__CustomProperty__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomPropertyAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__CustomProperty__Group__1__Impl"


    // $ANTLR start "rule__CustomProperty__Group__2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2416:1: rule__CustomProperty__Group__2 : rule__CustomProperty__Group__2__Impl ;
    public final void rule__CustomProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2420:1: ( rule__CustomProperty__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2421:2: rule__CustomProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group__2__Impl_in_rule__CustomProperty__Group__24903);
            rule__CustomProperty__Group__2__Impl();

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
    // $ANTLR end "rule__CustomProperty__Group__2"


    // $ANTLR start "rule__CustomProperty__Group__2__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2427:1: rule__CustomProperty__Group__2__Impl : ( ( rule__CustomProperty__CommentAssignment_2 )? ) ;
    public final void rule__CustomProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2431:1: ( ( ( rule__CustomProperty__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2432:1: ( ( rule__CustomProperty__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2432:1: ( ( rule__CustomProperty__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2433:1: ( rule__CustomProperty__CommentAssignment_2 )?
            {
             before(grammarAccess.getCustomPropertyAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2434:1: ( rule__CustomProperty__CommentAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_COMMENT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2434:2: rule__CustomProperty__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__CustomProperty__CommentAssignment_2_in_rule__CustomProperty__Group__2__Impl4930);
                    rule__CustomProperty__CommentAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomPropertyAccess().getCommentAssignment_2()); 

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
    // $ANTLR end "rule__CustomProperty__Group__2__Impl"


    // $ANTLR start "rule__CustomProperty__Group_1_2__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2450:1: rule__CustomProperty__Group_1_2__0 : rule__CustomProperty__Group_1_2__0__Impl rule__CustomProperty__Group_1_2__1 ;
    public final void rule__CustomProperty__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2454:1: ( rule__CustomProperty__Group_1_2__0__Impl rule__CustomProperty__Group_1_2__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2455:2: rule__CustomProperty__Group_1_2__0__Impl rule__CustomProperty__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group_1_2__0__Impl_in_rule__CustomProperty__Group_1_2__04967);
            rule__CustomProperty__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomProperty__Group_1_2__1_in_rule__CustomProperty__Group_1_2__04970);
            rule__CustomProperty__Group_1_2__1();

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
    // $ANTLR end "rule__CustomProperty__Group_1_2__0"


    // $ANTLR start "rule__CustomProperty__Group_1_2__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2462:1: rule__CustomProperty__Group_1_2__0__Impl : ( '(' ) ;
    public final void rule__CustomProperty__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2466:1: ( ( '(' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2467:1: ( '(' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2467:1: ( '(' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2468:1: '('
            {
             before(grammarAccess.getCustomPropertyAccess().getLeftParenthesisKeyword_1_2_0()); 
            match(input,27,FOLLOW_27_in_rule__CustomProperty__Group_1_2__0__Impl4998); 
             after(grammarAccess.getCustomPropertyAccess().getLeftParenthesisKeyword_1_2_0()); 

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
    // $ANTLR end "rule__CustomProperty__Group_1_2__0__Impl"


    // $ANTLR start "rule__CustomProperty__Group_1_2__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2481:1: rule__CustomProperty__Group_1_2__1 : rule__CustomProperty__Group_1_2__1__Impl rule__CustomProperty__Group_1_2__2 ;
    public final void rule__CustomProperty__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2485:1: ( rule__CustomProperty__Group_1_2__1__Impl rule__CustomProperty__Group_1_2__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2486:2: rule__CustomProperty__Group_1_2__1__Impl rule__CustomProperty__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group_1_2__1__Impl_in_rule__CustomProperty__Group_1_2__15029);
            rule__CustomProperty__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomProperty__Group_1_2__2_in_rule__CustomProperty__Group_1_2__15032);
            rule__CustomProperty__Group_1_2__2();

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
    // $ANTLR end "rule__CustomProperty__Group_1_2__1"


    // $ANTLR start "rule__CustomProperty__Group_1_2__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2493:1: rule__CustomProperty__Group_1_2__1__Impl : ( ( rule__CustomProperty__EnumValueAssignment_1_2_1 ) ) ;
    public final void rule__CustomProperty__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2497:1: ( ( ( rule__CustomProperty__EnumValueAssignment_1_2_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2498:1: ( ( rule__CustomProperty__EnumValueAssignment_1_2_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2498:1: ( ( rule__CustomProperty__EnumValueAssignment_1_2_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2499:1: ( rule__CustomProperty__EnumValueAssignment_1_2_1 )
            {
             before(grammarAccess.getCustomPropertyAccess().getEnumValueAssignment_1_2_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2500:1: ( rule__CustomProperty__EnumValueAssignment_1_2_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2500:2: rule__CustomProperty__EnumValueAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__CustomProperty__EnumValueAssignment_1_2_1_in_rule__CustomProperty__Group_1_2__1__Impl5059);
            rule__CustomProperty__EnumValueAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomPropertyAccess().getEnumValueAssignment_1_2_1()); 

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
    // $ANTLR end "rule__CustomProperty__Group_1_2__1__Impl"


    // $ANTLR start "rule__CustomProperty__Group_1_2__2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2510:1: rule__CustomProperty__Group_1_2__2 : rule__CustomProperty__Group_1_2__2__Impl ;
    public final void rule__CustomProperty__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2514:1: ( rule__CustomProperty__Group_1_2__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2515:2: rule__CustomProperty__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group_1_2__2__Impl_in_rule__CustomProperty__Group_1_2__25089);
            rule__CustomProperty__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__CustomProperty__Group_1_2__2"


    // $ANTLR start "rule__CustomProperty__Group_1_2__2__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2521:1: rule__CustomProperty__Group_1_2__2__Impl : ( ')' ) ;
    public final void rule__CustomProperty__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2525:1: ( ( ')' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2526:1: ( ')' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2526:1: ( ')' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2527:1: ')'
            {
             before(grammarAccess.getCustomPropertyAccess().getRightParenthesisKeyword_1_2_2()); 
            match(input,28,FOLLOW_28_in_rule__CustomProperty__Group_1_2__2__Impl5117); 
             after(grammarAccess.getCustomPropertyAccess().getRightParenthesisKeyword_1_2_2()); 

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
    // $ANTLR end "rule__CustomProperty__Group_1_2__2__Impl"


    // $ANTLR start "rule__Characters__ImportsAssignment_0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2547:1: rule__Characters__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Characters__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2551:1: ( ( ruleImport ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2552:1: ( ruleImport )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2552:1: ( ruleImport )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2553:1: ruleImport
            {
             before(grammarAccess.getCharactersAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Characters__ImportsAssignment_05159);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getCharactersAccess().getImportsImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Characters__ImportsAssignment_0"


    // $ANTLR start "rule__Characters__TemplatesAssignment_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2562:1: rule__Characters__TemplatesAssignment_1 : ( ruleTemplate ) ;
    public final void rule__Characters__TemplatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2566:1: ( ( ruleTemplate ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2567:1: ( ruleTemplate )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2567:1: ( ruleTemplate )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2568:1: ruleTemplate
            {
             before(grammarAccess.getCharactersAccess().getTemplatesTemplateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTemplate_in_rule__Characters__TemplatesAssignment_15190);
            ruleTemplate();

            state._fsp--;

             after(grammarAccess.getCharactersAccess().getTemplatesTemplateParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Characters__TemplatesAssignment_1"


    // $ANTLR start "rule__Characters__CustomsAssignment_2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2577:1: rule__Characters__CustomsAssignment_2 : ( ruleCustoms ) ;
    public final void rule__Characters__CustomsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2581:1: ( ( ruleCustoms ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2582:1: ( ruleCustoms )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2582:1: ( ruleCustoms )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2583:1: ruleCustoms
            {
             before(grammarAccess.getCharactersAccess().getCustomsCustomsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCustoms_in_rule__Characters__CustomsAssignment_25221);
            ruleCustoms();

            state._fsp--;

             after(grammarAccess.getCharactersAccess().getCustomsCustomsParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Characters__CustomsAssignment_2"


    // $ANTLR start "rule__Characters__CharactersAssignment_3"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2592:1: rule__Characters__CharactersAssignment_3 : ( ruleCharacter ) ;
    public final void rule__Characters__CharactersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2596:1: ( ( ruleCharacter ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2597:1: ( ruleCharacter )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2597:1: ( ruleCharacter )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2598:1: ruleCharacter
            {
             before(grammarAccess.getCharactersAccess().getCharactersCharacterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCharacter_in_rule__Characters__CharactersAssignment_35252);
            ruleCharacter();

            state._fsp--;

             after(grammarAccess.getCharactersAccess().getCharactersCharacterParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Characters__CharactersAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2607:1: rule__Import__ImportedNamespaceAssignment_1 : ( RULE_ID ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2611:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2612:1: ( RULE_ID )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2612:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2613:1: RULE_ID
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Import__ImportedNamespaceAssignment_15283); 
             after(grammarAccess.getImportAccess().getImportedNamespaceIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Template__NameAssignment_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2622:1: rule__Template__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Template__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2626:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2627:1: ( RULE_ID )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2627:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2628:1: RULE_ID
            {
             before(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Template__NameAssignment_15314); 
             after(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Template__NameAssignment_1"


    // $ANTLR start "rule__Template__DefaultsAssignment_2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2637:1: rule__Template__DefaultsAssignment_2 : ( ruleDefaultAttribute ) ;
    public final void rule__Template__DefaultsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2641:1: ( ( ruleDefaultAttribute ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2642:1: ( ruleDefaultAttribute )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2642:1: ( ruleDefaultAttribute )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2643:1: ruleDefaultAttribute
            {
             before(grammarAccess.getTemplateAccess().getDefaultsDefaultAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDefaultAttribute_in_rule__Template__DefaultsAssignment_25345);
            ruleDefaultAttribute();

            state._fsp--;

             after(grammarAccess.getTemplateAccess().getDefaultsDefaultAttributeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Template__DefaultsAssignment_2"


    // $ANTLR start "rule__Template__CustomsAssignment_3"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2652:1: rule__Template__CustomsAssignment_3 : ( ruleCustomAttribute ) ;
    public final void rule__Template__CustomsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2656:1: ( ( ruleCustomAttribute ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2657:1: ( ruleCustomAttribute )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2657:1: ( ruleCustomAttribute )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2658:1: ruleCustomAttribute
            {
             before(grammarAccess.getTemplateAccess().getCustomsCustomAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCustomAttribute_in_rule__Template__CustomsAssignment_35376);
            ruleCustomAttribute();

            state._fsp--;

             after(grammarAccess.getTemplateAccess().getCustomsCustomAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Template__CustomsAssignment_3"


    // $ANTLR start "rule__CustomAttribute__CaNameAssignment_0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2667:1: rule__CustomAttribute__CaNameAssignment_0 : ( ruleCustomAttributeName ) ;
    public final void rule__CustomAttribute__CaNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2671:1: ( ( ruleCustomAttributeName ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2672:1: ( ruleCustomAttributeName )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2672:1: ( ruleCustomAttributeName )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2673:1: ruleCustomAttributeName
            {
             before(grammarAccess.getCustomAttributeAccess().getCaNameCustomAttributeNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCustomAttributeName_in_rule__CustomAttribute__CaNameAssignment_05407);
            ruleCustomAttributeName();

            state._fsp--;

             after(grammarAccess.getCustomAttributeAccess().getCaNameCustomAttributeNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__CustomAttribute__CaNameAssignment_0"


    // $ANTLR start "rule__CustomAttribute__TypeAssignment_2_0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2682:1: rule__CustomAttribute__TypeAssignment_2_0 : ( ruleAttributeType ) ;
    public final void rule__CustomAttribute__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2686:1: ( ( ruleAttributeType ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2687:1: ( ruleAttributeType )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2687:1: ( ruleAttributeType )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2688:1: ruleAttributeType
            {
             before(grammarAccess.getCustomAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleAttributeType_in_rule__CustomAttribute__TypeAssignment_2_05438);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getCustomAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__CustomAttribute__TypeAssignment_2_0"


    // $ANTLR start "rule__CustomAttribute__EnumValuesAssignment_2_1_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2697:1: rule__CustomAttribute__EnumValuesAssignment_2_1_1 : ( ruleEnumValue ) ;
    public final void rule__CustomAttribute__EnumValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2701:1: ( ( ruleEnumValue ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2702:1: ( ruleEnumValue )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2702:1: ( ruleEnumValue )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2703:1: ruleEnumValue
            {
             before(grammarAccess.getCustomAttributeAccess().getEnumValuesEnumValueParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleEnumValue_in_rule__CustomAttribute__EnumValuesAssignment_2_1_15469);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getCustomAttributeAccess().getEnumValuesEnumValueParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__CustomAttribute__EnumValuesAssignment_2_1_1"


    // $ANTLR start "rule__CustomAttribute__EnumValuesAssignment_2_1_2_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2712:1: rule__CustomAttribute__EnumValuesAssignment_2_1_2_1 : ( ruleEnumValue ) ;
    public final void rule__CustomAttribute__EnumValuesAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2716:1: ( ( ruleEnumValue ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2717:1: ( ruleEnumValue )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2717:1: ( ruleEnumValue )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2718:1: ruleEnumValue
            {
             before(grammarAccess.getCustomAttributeAccess().getEnumValuesEnumValueParserRuleCall_2_1_2_1_0()); 
            pushFollow(FOLLOW_ruleEnumValue_in_rule__CustomAttribute__EnumValuesAssignment_2_1_2_15500);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getCustomAttributeAccess().getEnumValuesEnumValueParserRuleCall_2_1_2_1_0()); 

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
    // $ANTLR end "rule__CustomAttribute__EnumValuesAssignment_2_1_2_1"


    // $ANTLR start "rule__CustomAttributeName__NameAssignment"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2727:1: rule__CustomAttributeName__NameAssignment : ( RULE_ID ) ;
    public final void rule__CustomAttributeName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2731:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2732:1: ( RULE_ID )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2732:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2733:1: RULE_ID
            {
             before(grammarAccess.getCustomAttributeNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomAttributeName__NameAssignment5531); 
             after(grammarAccess.getCustomAttributeNameAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__CustomAttributeName__NameAssignment"


    // $ANTLR start "rule__EnumValue__NameAssignment"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2742:1: rule__EnumValue__NameAssignment : ( ruleEnumID ) ;
    public final void rule__EnumValue__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2746:1: ( ( ruleEnumID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2747:1: ( ruleEnumID )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2747:1: ( ruleEnumID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2748:1: ruleEnumID
            {
             before(grammarAccess.getEnumValueAccess().getNameEnumIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEnumID_in_rule__EnumValue__NameAssignment5562);
            ruleEnumID();

            state._fsp--;

             after(grammarAccess.getEnumValueAccess().getNameEnumIDParserRuleCall_0()); 

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
    // $ANTLR end "rule__EnumValue__NameAssignment"


    // $ANTLR start "rule__Customs__CustomAttributesAssignment_2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2757:1: rule__Customs__CustomAttributesAssignment_2 : ( ruleCustomAttribute ) ;
    public final void rule__Customs__CustomAttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2761:1: ( ( ruleCustomAttribute ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2762:1: ( ruleCustomAttribute )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2762:1: ( ruleCustomAttribute )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2763:1: ruleCustomAttribute
            {
             before(grammarAccess.getCustomsAccess().getCustomAttributesCustomAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCustomAttribute_in_rule__Customs__CustomAttributesAssignment_25593);
            ruleCustomAttribute();

            state._fsp--;

             after(grammarAccess.getCustomsAccess().getCustomAttributesCustomAttributeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Customs__CustomAttributesAssignment_2"


    // $ANTLR start "rule__Customs__CustomAttributesAssignment_3"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2772:1: rule__Customs__CustomAttributesAssignment_3 : ( ruleCustomAttribute ) ;
    public final void rule__Customs__CustomAttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2776:1: ( ( ruleCustomAttribute ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2777:1: ( ruleCustomAttribute )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2777:1: ( ruleCustomAttribute )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2778:1: ruleCustomAttribute
            {
             before(grammarAccess.getCustomsAccess().getCustomAttributesCustomAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCustomAttribute_in_rule__Customs__CustomAttributesAssignment_35624);
            ruleCustomAttribute();

            state._fsp--;

             after(grammarAccess.getCustomsAccess().getCustomAttributesCustomAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Customs__CustomAttributesAssignment_3"


    // $ANTLR start "rule__Character__NameAssignment_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2787:1: rule__Character__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Character__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2791:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2792:1: ( RULE_ID )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2792:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2793:1: RULE_ID
            {
             before(grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Character__NameAssignment_15655); 
             after(grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Character__NameAssignment_1"


    // $ANTLR start "rule__Character__TemplateAssignment_2_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2802:1: rule__Character__TemplateAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Character__TemplateAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2806:1: ( ( ( RULE_ID ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2807:1: ( ( RULE_ID ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2807:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2808:1: ( RULE_ID )
            {
             before(grammarAccess.getCharacterAccess().getTemplateTemplateCrossReference_2_1_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2809:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2810:1: RULE_ID
            {
             before(grammarAccess.getCharacterAccess().getTemplateTemplateIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Character__TemplateAssignment_2_15690); 
             after(grammarAccess.getCharacterAccess().getTemplateTemplateIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getCharacterAccess().getTemplateTemplateCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Character__TemplateAssignment_2_1"


    // $ANTLR start "rule__Character__PropertiesAssignment_3"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2821:1: rule__Character__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__Character__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2825:1: ( ( ruleProperty ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2826:1: ( ruleProperty )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2826:1: ( ruleProperty )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2827:1: ruleProperty
            {
             before(grammarAccess.getCharacterAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Character__PropertiesAssignment_35725);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getCharacterAccess().getPropertiesPropertyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Character__PropertiesAssignment_3"


    // $ANTLR start "rule__FullName__ValueAssignment_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2836:1: rule__FullName__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FullName__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2840:1: ( ( RULE_STRING ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2841:1: ( RULE_STRING )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2841:1: ( RULE_STRING )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2842:1: RULE_STRING
            {
             before(grammarAccess.getFullNameAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FullName__ValueAssignment_15756); 
             after(grammarAccess.getFullNameAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FullName__ValueAssignment_1"


    // $ANTLR start "rule__FullName__CommentAssignment_2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2851:1: rule__FullName__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__FullName__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2855:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2856:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2856:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2857:1: RULE_COMMENT
            {
             before(grammarAccess.getFullNameAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__FullName__CommentAssignment_25787); 
             after(grammarAccess.getFullNameAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__FullName__CommentAssignment_2"


    // $ANTLR start "rule__Description__ValueAssignment_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2866:1: rule__Description__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2870:1: ( ( RULE_STRING ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2871:1: ( RULE_STRING )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2871:1: ( RULE_STRING )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2872:1: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Description__ValueAssignment_15818); 
             after(grammarAccess.getDescriptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Description__ValueAssignment_1"


    // $ANTLR start "rule__Description__CommentAssignment_2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2881:1: rule__Description__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__Description__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2885:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2886:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2886:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2887:1: RULE_COMMENT
            {
             before(grammarAccess.getDescriptionAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Description__CommentAssignment_25849); 
             after(grammarAccess.getDescriptionAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Description__CommentAssignment_2"


    // $ANTLR start "rule__Type__ValueAssignment_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2896:1: rule__Type__ValueAssignment_1 : ( ruleCharaType ) ;
    public final void rule__Type__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2900:1: ( ( ruleCharaType ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2901:1: ( ruleCharaType )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2901:1: ( ruleCharaType )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2902:1: ruleCharaType
            {
             before(grammarAccess.getTypeAccess().getValueCharaTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCharaType_in_rule__Type__ValueAssignment_15880);
            ruleCharaType();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getValueCharaTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Type__ValueAssignment_1"


    // $ANTLR start "rule__Type__CommentAssignment_2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2911:1: rule__Type__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__Type__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2915:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2916:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2916:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2917:1: RULE_COMMENT
            {
             before(grammarAccess.getTypeAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Type__CommentAssignment_25911); 
             after(grammarAccess.getTypeAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Type__CommentAssignment_2"


    // $ANTLR start "rule__Age__ValueAssignment_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2926:1: rule__Age__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Age__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2930:1: ( ( RULE_INT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2931:1: ( RULE_INT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2931:1: ( RULE_INT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2932:1: RULE_INT
            {
             before(grammarAccess.getAgeAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Age__ValueAssignment_15942); 
             after(grammarAccess.getAgeAccess().getValueINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Age__ValueAssignment_1"


    // $ANTLR start "rule__Age__CommentAssignment_2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2941:1: rule__Age__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__Age__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2945:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2946:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2946:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2947:1: RULE_COMMENT
            {
             before(grammarAccess.getAgeAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Age__CommentAssignment_25973); 
             after(grammarAccess.getAgeAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Age__CommentAssignment_2"


    // $ANTLR start "rule__Sex__ValueAssignment_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2956:1: rule__Sex__ValueAssignment_1 : ( ruleCharaSex ) ;
    public final void rule__Sex__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2960:1: ( ( ruleCharaSex ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2961:1: ( ruleCharaSex )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2961:1: ( ruleCharaSex )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2962:1: ruleCharaSex
            {
             before(grammarAccess.getSexAccess().getValueCharaSexEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCharaSex_in_rule__Sex__ValueAssignment_16004);
            ruleCharaSex();

            state._fsp--;

             after(grammarAccess.getSexAccess().getValueCharaSexEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Sex__ValueAssignment_1"


    // $ANTLR start "rule__Sex__CommentAssignment_2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2971:1: rule__Sex__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__Sex__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2975:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2976:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2976:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2977:1: RULE_COMMENT
            {
             before(grammarAccess.getSexAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Sex__CommentAssignment_26035); 
             after(grammarAccess.getSexAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Sex__CommentAssignment_2"


    // $ANTLR start "rule__CustomProperty__CustomAttributeRefAssignment_0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2986:1: rule__CustomProperty__CustomAttributeRefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CustomProperty__CustomAttributeRefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2990:1: ( ( ( RULE_ID ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2991:1: ( ( RULE_ID ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2991:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2992:1: ( RULE_ID )
            {
             before(grammarAccess.getCustomPropertyAccess().getCustomAttributeRefCustomAttributeNameCrossReference_0_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2993:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2994:1: RULE_ID
            {
             before(grammarAccess.getCustomPropertyAccess().getCustomAttributeRefCustomAttributeNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomProperty__CustomAttributeRefAssignment_06070); 
             after(grammarAccess.getCustomPropertyAccess().getCustomAttributeRefCustomAttributeNameIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCustomPropertyAccess().getCustomAttributeRefCustomAttributeNameCrossReference_0_0()); 

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
    // $ANTLR end "rule__CustomProperty__CustomAttributeRefAssignment_0"


    // $ANTLR start "rule__CustomProperty__StringValueAssignment_1_0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3005:1: rule__CustomProperty__StringValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__CustomProperty__StringValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3009:1: ( ( RULE_STRING ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3010:1: ( RULE_STRING )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3010:1: ( RULE_STRING )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3011:1: RULE_STRING
            {
             before(grammarAccess.getCustomPropertyAccess().getStringValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomProperty__StringValueAssignment_1_06105); 
             after(grammarAccess.getCustomPropertyAccess().getStringValueSTRINGTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__CustomProperty__StringValueAssignment_1_0"


    // $ANTLR start "rule__CustomProperty__IntValueAssignment_1_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3020:1: rule__CustomProperty__IntValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__CustomProperty__IntValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3024:1: ( ( RULE_INT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3025:1: ( RULE_INT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3025:1: ( RULE_INT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3026:1: RULE_INT
            {
             before(grammarAccess.getCustomPropertyAccess().getIntValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CustomProperty__IntValueAssignment_1_16136); 
             after(grammarAccess.getCustomPropertyAccess().getIntValueINTTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__CustomProperty__IntValueAssignment_1_1"


    // $ANTLR start "rule__CustomProperty__EnumValueAssignment_1_2_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3035:1: rule__CustomProperty__EnumValueAssignment_1_2_1 : ( ( ruleEnumID ) ) ;
    public final void rule__CustomProperty__EnumValueAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3039:1: ( ( ( ruleEnumID ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3040:1: ( ( ruleEnumID ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3040:1: ( ( ruleEnumID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3041:1: ( ruleEnumID )
            {
             before(grammarAccess.getCustomPropertyAccess().getEnumValueEnumValueCrossReference_1_2_1_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3042:1: ( ruleEnumID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3043:1: ruleEnumID
            {
             before(grammarAccess.getCustomPropertyAccess().getEnumValueEnumValueEnumIDParserRuleCall_1_2_1_0_1()); 
            pushFollow(FOLLOW_ruleEnumID_in_rule__CustomProperty__EnumValueAssignment_1_2_16171);
            ruleEnumID();

            state._fsp--;

             after(grammarAccess.getCustomPropertyAccess().getEnumValueEnumValueEnumIDParserRuleCall_1_2_1_0_1()); 

            }

             after(grammarAccess.getCustomPropertyAccess().getEnumValueEnumValueCrossReference_1_2_1_0()); 

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
    // $ANTLR end "rule__CustomProperty__EnumValueAssignment_1_2_1"


    // $ANTLR start "rule__CustomProperty__CommentAssignment_2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3054:1: rule__CustomProperty__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__CustomProperty__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3058:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3059:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3059:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3060:1: RULE_COMMENT
            {
             before(grammarAccess.getCustomPropertyAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__CustomProperty__CommentAssignment_26206); 
             after(grammarAccess.getCustomPropertyAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__CustomProperty__CommentAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCharacters_in_entryRuleCharacters61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharacters68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__Group__0_in_ruleCharacters94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_entryRuleTemplate181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplate188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__0_in_ruleTemplate214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultAttribute_in_entryRuleDefaultAttribute241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultAttribute248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultAttribute__Alternatives_in_ruleDefaultAttribute274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttribute_in_entryRuleCustomAttribute301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomAttribute308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__0_in_ruleCustomAttribute334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttributeName_in_entryRuleCustomAttributeName361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomAttributeName368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributeName__NameAssignment_in_ruleCustomAttributeName394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_entryRuleEnumValue421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumValue428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumValue__NameAssignment_in_ruleEnumValue454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumID_in_entryRuleEnumID481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumID488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumID__Alternatives_in_ruleEnumID514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustoms_in_entryRuleCustoms541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustoms548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customs__Group__0_in_ruleCustoms574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_entryRuleCharacter601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharacter608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__0_in_ruleCharacter634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_in_ruleProperty694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultProperty_in_entryRuleDefaultProperty721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultProperty728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultProperty__Alternatives_in_ruleDefaultProperty754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullName_in_entryRuleFullName781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullName788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__Group__0_in_ruleFullName814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__0_in_ruleDescription874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAge_in_entryRuleAge961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAge968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__Group__0_in_ruleAge994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSex_in_entryRuleSex1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSex1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__Group__0_in_ruleSex1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomProperty_in_entryRuleCustomProperty1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomProperty1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__0_in_ruleCustomProperty1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharaType__Alternatives_in_ruleCharaType1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharaSex__Alternatives_in_ruleCharaSex1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DefaultAttribute__Alternatives1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DefaultAttribute__Alternatives1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DefaultAttribute__Alternatives1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DefaultAttribute__Alternatives1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DefaultAttribute__Alternatives1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__TypeAssignment_2_0_in_rule__CustomAttribute__Alternatives_21373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1__0_in_rule__CustomAttribute__Alternatives_21391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumID__Alternatives1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumID__Alternatives1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultProperty_in_rule__Property__Alternatives1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomProperty_in_rule__Property__Alternatives1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullName_in_rule__DefaultProperty__Alternatives1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__DefaultProperty__Alternatives1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__DefaultProperty__Alternatives1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAge_in_rule__DefaultProperty__Alternatives1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSex_in_rule__DefaultProperty__Alternatives1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__StringValueAssignment_1_0_in_rule__CustomProperty__Alternatives_11622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__IntValueAssignment_1_1_in_rule__CustomProperty__Alternatives_11640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group_1_2__0_in_rule__CustomProperty__Alternatives_11658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AttributeType__Alternatives1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AttributeType__Alternatives1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CharaType__Alternatives1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CharaType__Alternatives1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CharaSex__Alternatives1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CharaSex__Alternatives1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__Group__0__Impl_in_rule__Characters__Group__01860 = new BitSet(new long[]{0x0000000141000000L});
    public static final BitSet FOLLOW_rule__Characters__Group__1_in_rule__Characters__Group__01863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__ImportsAssignment_0_in_rule__Characters__Group__0__Impl1890 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Characters__Group__1__Impl_in_rule__Characters__Group__11921 = new BitSet(new long[]{0x0000000141000000L});
    public static final BitSet FOLLOW_rule__Characters__Group__2_in_rule__Characters__Group__11924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__TemplatesAssignment_1_in_rule__Characters__Group__1__Impl1951 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Characters__Group__2__Impl_in_rule__Characters__Group__21982 = new BitSet(new long[]{0x0000000141000000L});
    public static final BitSet FOLLOW_rule__Characters__Group__3_in_rule__Characters__Group__21985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__CustomsAssignment_2_in_rule__Characters__Group__2__Impl2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__Group__3__Impl_in_rule__Characters__Group__32043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__CharactersAssignment_3_in_rule__Characters__Group__3__Impl2070 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Import__Group__0__Impl2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__0__Impl_in_rule__Template__Group__02232 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Template__Group__1_in_rule__Template__Group__02235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Template__Group__0__Impl2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__1__Impl_in_rule__Template__Group__12294 = new BitSet(new long[]{0x000000000201F020L});
    public static final BitSet FOLLOW_rule__Template__Group__2_in_rule__Template__Group__12297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__NameAssignment_1_in_rule__Template__Group__1__Impl2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__2__Impl_in_rule__Template__Group__22354 = new BitSet(new long[]{0x000000000201F020L});
    public static final BitSet FOLLOW_rule__Template__Group__3_in_rule__Template__Group__22357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__DefaultsAssignment_2_in_rule__Template__Group__2__Impl2384 = new BitSet(new long[]{0x000000000001F002L});
    public static final BitSet FOLLOW_rule__Template__Group__3__Impl_in_rule__Template__Group__32415 = new BitSet(new long[]{0x000000000201F020L});
    public static final BitSet FOLLOW_rule__Template__Group__4_in_rule__Template__Group__32418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__CustomsAssignment_3_in_rule__Template__Group__3__Impl2445 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Template__Group__4__Impl_in_rule__Template__Group__42476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Template__Group__4__Impl2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__0__Impl_in_rule__CustomAttribute__Group__02545 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__1_in_rule__CustomAttribute__Group__02548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__CaNameAssignment_0_in_rule__CustomAttribute__Group__0__Impl2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__1__Impl_in_rule__CustomAttribute__Group__12605 = new BitSet(new long[]{0x0000000008060000L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__2_in_rule__CustomAttribute__Group__12608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CustomAttribute__Group__1__Impl2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__2__Impl_in_rule__CustomAttribute__Group__22667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Alternatives_2_in_rule__CustomAttribute__Group__2__Impl2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1__0__Impl_in_rule__CustomAttribute__Group_2_1__02730 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1__1_in_rule__CustomAttribute__Group_2_1__02733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CustomAttribute__Group_2_1__0__Impl2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1__1__Impl_in_rule__CustomAttribute__Group_2_1__12792 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1__2_in_rule__CustomAttribute__Group_2_1__12795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__EnumValuesAssignment_2_1_1_in_rule__CustomAttribute__Group_2_1__1__Impl2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1__2__Impl_in_rule__CustomAttribute__Group_2_1__22852 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1__3_in_rule__CustomAttribute__Group_2_1__22855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1_2__0_in_rule__CustomAttribute__Group_2_1__2__Impl2882 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1__3__Impl_in_rule__CustomAttribute__Group_2_1__32913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CustomAttribute__Group_2_1__3__Impl2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1_2__0__Impl_in_rule__CustomAttribute__Group_2_1_2__02980 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1_2__1_in_rule__CustomAttribute__Group_2_1_2__02983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CustomAttribute__Group_2_1_2__0__Impl3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1_2__1__Impl_in_rule__CustomAttribute__Group_2_1_2__13042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__EnumValuesAssignment_2_1_2_1_in_rule__CustomAttribute__Group_2_1_2__1__Impl3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customs__Group__0__Impl_in_rule__Customs__Group__03103 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Customs__Group__1_in_rule__Customs__Group__03106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Customs__Group__0__Impl3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customs__Group__1__Impl_in_rule__Customs__Group__13165 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Customs__Group__2_in_rule__Customs__Group__13168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Customs__Group__1__Impl3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customs__Group__2__Impl_in_rule__Customs__Group__23227 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__Customs__Group__3_in_rule__Customs__Group__23230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customs__CustomAttributesAssignment_2_in_rule__Customs__Group__2__Impl3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customs__Group__3__Impl_in_rule__Customs__Group__33287 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__Customs__Group__4_in_rule__Customs__Group__33290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customs__CustomAttributesAssignment_3_in_rule__Customs__Group__3__Impl3317 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Customs__Group__4__Impl_in_rule__Customs__Group__43348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Customs__Group__4__Impl3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__0__Impl_in_rule__Character__Group__03417 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Character__Group__1_in_rule__Character__Group__03420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Character__Group__0__Impl3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__1__Impl_in_rule__Character__Group__13479 = new BitSet(new long[]{0x000000020201F020L});
    public static final BitSet FOLLOW_rule__Character__Group__2_in_rule__Character__Group__13482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__NameAssignment_1_in_rule__Character__Group__1__Impl3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__2__Impl_in_rule__Character__Group__23539 = new BitSet(new long[]{0x000000020201F020L});
    public static final BitSet FOLLOW_rule__Character__Group__3_in_rule__Character__Group__23542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group_2__0_in_rule__Character__Group__2__Impl3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__3__Impl_in_rule__Character__Group__33600 = new BitSet(new long[]{0x000000020201F020L});
    public static final BitSet FOLLOW_rule__Character__Group__4_in_rule__Character__Group__33603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__PropertiesAssignment_3_in_rule__Character__Group__3__Impl3630 = new BitSet(new long[]{0x000000000001F022L});
    public static final BitSet FOLLOW_rule__Character__Group__4__Impl_in_rule__Character__Group__43661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Character__Group__4__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group_2__0__Impl_in_rule__Character__Group_2__03730 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Character__Group_2__1_in_rule__Character__Group_2__03733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Character__Group_2__0__Impl3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group_2__1__Impl_in_rule__Character__Group_2__13792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__TemplateAssignment_2_1_in_rule__Character__Group_2__1__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__Group__0__Impl_in_rule__FullName__Group__03853 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FullName__Group__1_in_rule__FullName__Group__03856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FullName__Group__0__Impl3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__Group__1__Impl_in_rule__FullName__Group__13915 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__FullName__Group__2_in_rule__FullName__Group__13918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__ValueAssignment_1_in_rule__FullName__Group__1__Impl3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__Group__2__Impl_in_rule__FullName__Group__23975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__CommentAssignment_2_in_rule__FullName__Group__2__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__0__Impl_in_rule__Description__Group__04039 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Description__Group__1_in_rule__Description__Group__04042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Description__Group__0__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__1__Impl_in_rule__Description__Group__14101 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Description__Group__2_in_rule__Description__Group__14104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__ValueAssignment_1_in_rule__Description__Group__1__Impl4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__2__Impl_in_rule__Description__Group__24161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__CommentAssignment_2_in_rule__Description__Group__2__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__04225 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__04228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__Group__0__Impl4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__14287 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Type__Group__2_in_rule__Type__Group__14290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ValueAssignment_1_in_rule__Type__Group__1__Impl4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__24347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__CommentAssignment_2_in_rule__Type__Group__2__Impl4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__Group__0__Impl_in_rule__Age__Group__04411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Age__Group__1_in_rule__Age__Group__04414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Age__Group__0__Impl4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__Group__1__Impl_in_rule__Age__Group__14473 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Age__Group__2_in_rule__Age__Group__14476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__ValueAssignment_1_in_rule__Age__Group__1__Impl4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__Group__2__Impl_in_rule__Age__Group__24533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__CommentAssignment_2_in_rule__Age__Group__2__Impl4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__Group__0__Impl_in_rule__Sex__Group__04597 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Sex__Group__1_in_rule__Sex__Group__04600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Sex__Group__0__Impl4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__Group__1__Impl_in_rule__Sex__Group__14659 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Sex__Group__2_in_rule__Sex__Group__14662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__ValueAssignment_1_in_rule__Sex__Group__1__Impl4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__Group__2__Impl_in_rule__Sex__Group__24719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__CommentAssignment_2_in_rule__Sex__Group__2__Impl4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__0__Impl_in_rule__CustomProperty__Group__04783 = new BitSet(new long[]{0x0000000008000050L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__1_in_rule__CustomProperty__Group__04786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__CustomAttributeRefAssignment_0_in_rule__CustomProperty__Group__0__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__1__Impl_in_rule__CustomProperty__Group__14843 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__2_in_rule__CustomProperty__Group__14846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Alternatives_1_in_rule__CustomProperty__Group__1__Impl4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__2__Impl_in_rule__CustomProperty__Group__24903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__CommentAssignment_2_in_rule__CustomProperty__Group__2__Impl4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group_1_2__0__Impl_in_rule__CustomProperty__Group_1_2__04967 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group_1_2__1_in_rule__CustomProperty__Group_1_2__04970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CustomProperty__Group_1_2__0__Impl4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group_1_2__1__Impl_in_rule__CustomProperty__Group_1_2__15029 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group_1_2__2_in_rule__CustomProperty__Group_1_2__15032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__EnumValueAssignment_1_2_1_in_rule__CustomProperty__Group_1_2__1__Impl5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group_1_2__2__Impl_in_rule__CustomProperty__Group_1_2__25089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CustomProperty__Group_1_2__2__Impl5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Characters__ImportsAssignment_05159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_rule__Characters__TemplatesAssignment_15190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustoms_in_rule__Characters__CustomsAssignment_25221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_rule__Characters__CharactersAssignment_35252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Import__ImportedNamespaceAssignment_15283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Template__NameAssignment_15314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultAttribute_in_rule__Template__DefaultsAssignment_25345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttribute_in_rule__Template__CustomsAssignment_35376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttributeName_in_rule__CustomAttribute__CaNameAssignment_05407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_rule__CustomAttribute__TypeAssignment_2_05438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_rule__CustomAttribute__EnumValuesAssignment_2_1_15469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_rule__CustomAttribute__EnumValuesAssignment_2_1_2_15500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomAttributeName__NameAssignment5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumID_in_rule__EnumValue__NameAssignment5562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttribute_in_rule__Customs__CustomAttributesAssignment_25593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttribute_in_rule__Customs__CustomAttributesAssignment_35624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Character__NameAssignment_15655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Character__TemplateAssignment_2_15690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Character__PropertiesAssignment_35725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FullName__ValueAssignment_15756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__FullName__CommentAssignment_25787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Description__ValueAssignment_15818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Description__CommentAssignment_25849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharaType_in_rule__Type__ValueAssignment_15880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Type__CommentAssignment_25911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Age__ValueAssignment_15942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Age__CommentAssignment_25973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharaSex_in_rule__Sex__ValueAssignment_16004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Sex__CommentAssignment_26035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomProperty__CustomAttributeRefAssignment_06070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomProperty__StringValueAssignment_1_06105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CustomProperty__IntValueAssignment_1_16136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumID_in_rule__CustomProperty__EnumValueAssignment_1_2_16171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__CustomProperty__CommentAssignment_26206 = new BitSet(new long[]{0x0000000000000002L});

}