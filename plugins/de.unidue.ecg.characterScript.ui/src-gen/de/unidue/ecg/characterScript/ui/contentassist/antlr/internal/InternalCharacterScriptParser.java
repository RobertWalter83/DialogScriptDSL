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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_COMMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'full name'", "'age'", "'description'", "'sex'", "'type'", "'NUMBER'", "'TEXT'", "'PC'", "'NPC'", "'male'", "'female'", "'import'", "'template'", "'end'", "'as'", "'('", "')'", "','", "'custom'", "'attributes'", "'character'", "'uses'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_COMMENT=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
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


    // $ANTLR start "entryRuleCustoms"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:256:1: entryRuleCustoms : ruleCustoms EOF ;
    public final void entryRuleCustoms() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:257:1: ( ruleCustoms EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:258:1: ruleCustoms EOF
            {
             before(grammarAccess.getCustomsRule()); 
            pushFollow(FOLLOW_ruleCustoms_in_entryRuleCustoms481);
            ruleCustoms();

            state._fsp--;

             after(grammarAccess.getCustomsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustoms488); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:265:1: ruleCustoms : ( ( rule__Customs__Group__0 ) ) ;
    public final void ruleCustoms() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:269:2: ( ( ( rule__Customs__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:270:1: ( ( rule__Customs__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:270:1: ( ( rule__Customs__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:271:1: ( rule__Customs__Group__0 )
            {
             before(grammarAccess.getCustomsAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:272:1: ( rule__Customs__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:272:2: rule__Customs__Group__0
            {
            pushFollow(FOLLOW_rule__Customs__Group__0_in_ruleCustoms514);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:284:1: entryRuleCharacter : ruleCharacter EOF ;
    public final void entryRuleCharacter() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:285:1: ( ruleCharacter EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:286:1: ruleCharacter EOF
            {
             before(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_ruleCharacter_in_entryRuleCharacter541);
            ruleCharacter();

            state._fsp--;

             after(grammarAccess.getCharacterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharacter548); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:293:1: ruleCharacter : ( ( rule__Character__Group__0 ) ) ;
    public final void ruleCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:297:2: ( ( ( rule__Character__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:298:1: ( ( rule__Character__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:298:1: ( ( rule__Character__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:299:1: ( rule__Character__Group__0 )
            {
             before(grammarAccess.getCharacterAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:300:1: ( rule__Character__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:300:2: rule__Character__Group__0
            {
            pushFollow(FOLLOW_rule__Character__Group__0_in_ruleCharacter574);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:312:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:313:1: ( ruleProperty EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:314:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty601);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty608); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:321:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:325:2: ( ( ( rule__Property__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:326:1: ( ( rule__Property__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:326:1: ( ( rule__Property__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:327:1: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:328:1: ( rule__Property__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:328:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_in_ruleProperty634);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:340:1: entryRuleDefaultProperty : ruleDefaultProperty EOF ;
    public final void entryRuleDefaultProperty() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:341:1: ( ruleDefaultProperty EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:342:1: ruleDefaultProperty EOF
            {
             before(grammarAccess.getDefaultPropertyRule()); 
            pushFollow(FOLLOW_ruleDefaultProperty_in_entryRuleDefaultProperty661);
            ruleDefaultProperty();

            state._fsp--;

             after(grammarAccess.getDefaultPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultProperty668); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:349:1: ruleDefaultProperty : ( ( rule__DefaultProperty__Alternatives ) ) ;
    public final void ruleDefaultProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:353:2: ( ( ( rule__DefaultProperty__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:354:1: ( ( rule__DefaultProperty__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:354:1: ( ( rule__DefaultProperty__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:355:1: ( rule__DefaultProperty__Alternatives )
            {
             before(grammarAccess.getDefaultPropertyAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:356:1: ( rule__DefaultProperty__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:356:2: rule__DefaultProperty__Alternatives
            {
            pushFollow(FOLLOW_rule__DefaultProperty__Alternatives_in_ruleDefaultProperty694);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:368:1: entryRuleFullName : ruleFullName EOF ;
    public final void entryRuleFullName() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:369:1: ( ruleFullName EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:370:1: ruleFullName EOF
            {
             before(grammarAccess.getFullNameRule()); 
            pushFollow(FOLLOW_ruleFullName_in_entryRuleFullName721);
            ruleFullName();

            state._fsp--;

             after(grammarAccess.getFullNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullName728); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:377:1: ruleFullName : ( ( rule__FullName__Group__0 ) ) ;
    public final void ruleFullName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:381:2: ( ( ( rule__FullName__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:382:1: ( ( rule__FullName__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:382:1: ( ( rule__FullName__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:383:1: ( rule__FullName__Group__0 )
            {
             before(grammarAccess.getFullNameAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:384:1: ( rule__FullName__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:384:2: rule__FullName__Group__0
            {
            pushFollow(FOLLOW_rule__FullName__Group__0_in_ruleFullName754);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:396:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:397:1: ( ruleDescription EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:398:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription781);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription788); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:405:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:409:2: ( ( ( rule__Description__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:410:1: ( ( rule__Description__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:410:1: ( ( rule__Description__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:411:1: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:412:1: ( rule__Description__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:412:2: rule__Description__Group__0
            {
            pushFollow(FOLLOW_rule__Description__Group__0_in_ruleDescription814);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:424:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:425:1: ( ruleType EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:426:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType841);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType848); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:433:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:437:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:438:1: ( ( rule__Type__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:438:1: ( ( rule__Type__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:439:1: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:440:1: ( rule__Type__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:440:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType874);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:452:1: entryRuleAge : ruleAge EOF ;
    public final void entryRuleAge() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:453:1: ( ruleAge EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:454:1: ruleAge EOF
            {
             before(grammarAccess.getAgeRule()); 
            pushFollow(FOLLOW_ruleAge_in_entryRuleAge901);
            ruleAge();

            state._fsp--;

             after(grammarAccess.getAgeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAge908); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:461:1: ruleAge : ( ( rule__Age__Group__0 ) ) ;
    public final void ruleAge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:465:2: ( ( ( rule__Age__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:466:1: ( ( rule__Age__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:466:1: ( ( rule__Age__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:467:1: ( rule__Age__Group__0 )
            {
             before(grammarAccess.getAgeAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:468:1: ( rule__Age__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:468:2: rule__Age__Group__0
            {
            pushFollow(FOLLOW_rule__Age__Group__0_in_ruleAge934);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:480:1: entryRuleSex : ruleSex EOF ;
    public final void entryRuleSex() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:481:1: ( ruleSex EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:482:1: ruleSex EOF
            {
             before(grammarAccess.getSexRule()); 
            pushFollow(FOLLOW_ruleSex_in_entryRuleSex961);
            ruleSex();

            state._fsp--;

             after(grammarAccess.getSexRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSex968); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:489:1: ruleSex : ( ( rule__Sex__Group__0 ) ) ;
    public final void ruleSex() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:493:2: ( ( ( rule__Sex__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:494:1: ( ( rule__Sex__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:494:1: ( ( rule__Sex__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:495:1: ( rule__Sex__Group__0 )
            {
             before(grammarAccess.getSexAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:496:1: ( rule__Sex__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:496:2: rule__Sex__Group__0
            {
            pushFollow(FOLLOW_rule__Sex__Group__0_in_ruleSex994);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:508:1: entryRuleCustomProperty : ruleCustomProperty EOF ;
    public final void entryRuleCustomProperty() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:509:1: ( ruleCustomProperty EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:510:1: ruleCustomProperty EOF
            {
             before(grammarAccess.getCustomPropertyRule()); 
            pushFollow(FOLLOW_ruleCustomProperty_in_entryRuleCustomProperty1021);
            ruleCustomProperty();

            state._fsp--;

             after(grammarAccess.getCustomPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomProperty1028); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:517:1: ruleCustomProperty : ( ( rule__CustomProperty__Group__0 ) ) ;
    public final void ruleCustomProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:521:2: ( ( ( rule__CustomProperty__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:522:1: ( ( rule__CustomProperty__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:522:1: ( ( rule__CustomProperty__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:523:1: ( rule__CustomProperty__Group__0 )
            {
             before(grammarAccess.getCustomPropertyAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:524:1: ( rule__CustomProperty__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:524:2: rule__CustomProperty__Group__0
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group__0_in_ruleCustomProperty1054);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:537:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:541:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:542:1: ( ( rule__AttributeType__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:542:1: ( ( rule__AttributeType__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:543:1: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:544:1: ( rule__AttributeType__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:544:2: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType1091);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:556:1: ruleCharaType : ( ( rule__CharaType__Alternatives ) ) ;
    public final void ruleCharaType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:560:1: ( ( ( rule__CharaType__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:561:1: ( ( rule__CharaType__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:561:1: ( ( rule__CharaType__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:562:1: ( rule__CharaType__Alternatives )
            {
             before(grammarAccess.getCharaTypeAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:563:1: ( rule__CharaType__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:563:2: rule__CharaType__Alternatives
            {
            pushFollow(FOLLOW_rule__CharaType__Alternatives_in_ruleCharaType1127);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:575:1: ruleCharaSex : ( ( rule__CharaSex__Alternatives ) ) ;
    public final void ruleCharaSex() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:579:1: ( ( ( rule__CharaSex__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:580:1: ( ( rule__CharaSex__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:580:1: ( ( rule__CharaSex__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:581:1: ( rule__CharaSex__Alternatives )
            {
             before(grammarAccess.getCharaSexAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:582:1: ( rule__CharaSex__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:582:2: rule__CharaSex__Alternatives
            {
            pushFollow(FOLLOW_rule__CharaSex__Alternatives_in_ruleCharaSex1163);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:593:1: rule__DefaultAttribute__Alternatives : ( ( 'full name' ) | ( 'age' ) | ( 'description' ) | ( 'sex' ) | ( 'type' ) );
    public final void rule__DefaultAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:597:1: ( ( 'full name' ) | ( 'age' ) | ( 'description' ) | ( 'sex' ) | ( 'type' ) )
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
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:598:1: ( 'full name' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:598:1: ( 'full name' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:599:1: 'full name'
                    {
                     before(grammarAccess.getDefaultAttributeAccess().getFullNameKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__DefaultAttribute__Alternatives1199); 
                     after(grammarAccess.getDefaultAttributeAccess().getFullNameKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:606:6: ( 'age' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:606:6: ( 'age' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:607:1: 'age'
                    {
                     before(grammarAccess.getDefaultAttributeAccess().getAgeKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__DefaultAttribute__Alternatives1219); 
                     after(grammarAccess.getDefaultAttributeAccess().getAgeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:614:6: ( 'description' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:614:6: ( 'description' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:615:1: 'description'
                    {
                     before(grammarAccess.getDefaultAttributeAccess().getDescriptionKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__DefaultAttribute__Alternatives1239); 
                     after(grammarAccess.getDefaultAttributeAccess().getDescriptionKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:622:6: ( 'sex' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:622:6: ( 'sex' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:623:1: 'sex'
                    {
                     before(grammarAccess.getDefaultAttributeAccess().getSexKeyword_3()); 
                    match(input,15,FOLLOW_15_in_rule__DefaultAttribute__Alternatives1259); 
                     after(grammarAccess.getDefaultAttributeAccess().getSexKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:630:6: ( 'type' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:630:6: ( 'type' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:631:1: 'type'
                    {
                     before(grammarAccess.getDefaultAttributeAccess().getTypeKeyword_4()); 
                    match(input,16,FOLLOW_16_in_rule__DefaultAttribute__Alternatives1279); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:643:1: rule__CustomAttribute__Alternatives_2 : ( ( ( rule__CustomAttribute__TypeAssignment_2_0 ) ) | ( ( rule__CustomAttribute__Group_2_1__0 ) ) );
    public final void rule__CustomAttribute__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:647:1: ( ( ( rule__CustomAttribute__TypeAssignment_2_0 ) ) | ( ( rule__CustomAttribute__Group_2_1__0 ) ) )
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
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:648:1: ( ( rule__CustomAttribute__TypeAssignment_2_0 ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:648:1: ( ( rule__CustomAttribute__TypeAssignment_2_0 ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:649:1: ( rule__CustomAttribute__TypeAssignment_2_0 )
                    {
                     before(grammarAccess.getCustomAttributeAccess().getTypeAssignment_2_0()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:650:1: ( rule__CustomAttribute__TypeAssignment_2_0 )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:650:2: rule__CustomAttribute__TypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__CustomAttribute__TypeAssignment_2_0_in_rule__CustomAttribute__Alternatives_21313);
                    rule__CustomAttribute__TypeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCustomAttributeAccess().getTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:654:6: ( ( rule__CustomAttribute__Group_2_1__0 ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:654:6: ( ( rule__CustomAttribute__Group_2_1__0 ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:655:1: ( rule__CustomAttribute__Group_2_1__0 )
                    {
                     before(grammarAccess.getCustomAttributeAccess().getGroup_2_1()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:656:1: ( rule__CustomAttribute__Group_2_1__0 )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:656:2: rule__CustomAttribute__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1__0_in_rule__CustomAttribute__Alternatives_21331);
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


    // $ANTLR start "rule__Property__Alternatives"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:665:1: rule__Property__Alternatives : ( ( ruleDefaultProperty ) | ( ruleCustomProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:669:1: ( ( ruleDefaultProperty ) | ( ruleCustomProperty ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=12 && LA3_0<=16)) ) {
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
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:670:1: ( ruleDefaultProperty )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:670:1: ( ruleDefaultProperty )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:671:1: ruleDefaultProperty
                    {
                     before(grammarAccess.getPropertyAccess().getDefaultPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefaultProperty_in_rule__Property__Alternatives1364);
                    ruleDefaultProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getDefaultPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:676:6: ( ruleCustomProperty )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:676:6: ( ruleCustomProperty )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:677:1: ruleCustomProperty
                    {
                     before(grammarAccess.getPropertyAccess().getCustomPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCustomProperty_in_rule__Property__Alternatives1381);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:687:1: rule__DefaultProperty__Alternatives : ( ( ruleFullName ) | ( ruleDescription ) | ( ruleType ) | ( ruleAge ) | ( ruleSex ) );
    public final void rule__DefaultProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:691:1: ( ( ruleFullName ) | ( ruleDescription ) | ( ruleType ) | ( ruleAge ) | ( ruleSex ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 13:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:692:1: ( ruleFullName )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:692:1: ( ruleFullName )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:693:1: ruleFullName
                    {
                     before(grammarAccess.getDefaultPropertyAccess().getFullNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFullName_in_rule__DefaultProperty__Alternatives1413);
                    ruleFullName();

                    state._fsp--;

                     after(grammarAccess.getDefaultPropertyAccess().getFullNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:698:6: ( ruleDescription )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:698:6: ( ruleDescription )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:699:1: ruleDescription
                    {
                     before(grammarAccess.getDefaultPropertyAccess().getDescriptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDescription_in_rule__DefaultProperty__Alternatives1430);
                    ruleDescription();

                    state._fsp--;

                     after(grammarAccess.getDefaultPropertyAccess().getDescriptionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:704:6: ( ruleType )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:704:6: ( ruleType )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:705:1: ruleType
                    {
                     before(grammarAccess.getDefaultPropertyAccess().getTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleType_in_rule__DefaultProperty__Alternatives1447);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getDefaultPropertyAccess().getTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:710:6: ( ruleAge )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:710:6: ( ruleAge )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:711:1: ruleAge
                    {
                     before(grammarAccess.getDefaultPropertyAccess().getAgeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleAge_in_rule__DefaultProperty__Alternatives1464);
                    ruleAge();

                    state._fsp--;

                     after(grammarAccess.getDefaultPropertyAccess().getAgeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:716:6: ( ruleSex )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:716:6: ( ruleSex )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:717:1: ruleSex
                    {
                     before(grammarAccess.getDefaultPropertyAccess().getSexParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleSex_in_rule__DefaultProperty__Alternatives1481);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:727:1: rule__CustomProperty__Alternatives_1 : ( ( ( rule__CustomProperty__StringValueAssignment_1_0 ) ) | ( ( rule__CustomProperty__IntValueAssignment_1_1 ) ) | ( ( rule__CustomProperty__EnumValueAssignment_1_2 ) ) );
    public final void rule__CustomProperty__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:731:1: ( ( ( rule__CustomProperty__StringValueAssignment_1_0 ) ) | ( ( rule__CustomProperty__IntValueAssignment_1_1 ) ) | ( ( rule__CustomProperty__EnumValueAssignment_1_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:732:1: ( ( rule__CustomProperty__StringValueAssignment_1_0 ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:732:1: ( ( rule__CustomProperty__StringValueAssignment_1_0 ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:733:1: ( rule__CustomProperty__StringValueAssignment_1_0 )
                    {
                     before(grammarAccess.getCustomPropertyAccess().getStringValueAssignment_1_0()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:734:1: ( rule__CustomProperty__StringValueAssignment_1_0 )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:734:2: rule__CustomProperty__StringValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__CustomProperty__StringValueAssignment_1_0_in_rule__CustomProperty__Alternatives_11513);
                    rule__CustomProperty__StringValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCustomPropertyAccess().getStringValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:738:6: ( ( rule__CustomProperty__IntValueAssignment_1_1 ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:738:6: ( ( rule__CustomProperty__IntValueAssignment_1_1 ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:739:1: ( rule__CustomProperty__IntValueAssignment_1_1 )
                    {
                     before(grammarAccess.getCustomPropertyAccess().getIntValueAssignment_1_1()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:740:1: ( rule__CustomProperty__IntValueAssignment_1_1 )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:740:2: rule__CustomProperty__IntValueAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__CustomProperty__IntValueAssignment_1_1_in_rule__CustomProperty__Alternatives_11531);
                    rule__CustomProperty__IntValueAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCustomPropertyAccess().getIntValueAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:744:6: ( ( rule__CustomProperty__EnumValueAssignment_1_2 ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:744:6: ( ( rule__CustomProperty__EnumValueAssignment_1_2 ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:745:1: ( rule__CustomProperty__EnumValueAssignment_1_2 )
                    {
                     before(grammarAccess.getCustomPropertyAccess().getEnumValueAssignment_1_2()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:746:1: ( rule__CustomProperty__EnumValueAssignment_1_2 )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:746:2: rule__CustomProperty__EnumValueAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__CustomProperty__EnumValueAssignment_1_2_in_rule__CustomProperty__Alternatives_11549);
                    rule__CustomProperty__EnumValueAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getCustomPropertyAccess().getEnumValueAssignment_1_2()); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:755:1: rule__AttributeType__Alternatives : ( ( ( 'NUMBER' ) ) | ( ( 'TEXT' ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:759:1: ( ( ( 'NUMBER' ) ) | ( ( 'TEXT' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:760:1: ( ( 'NUMBER' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:760:1: ( ( 'NUMBER' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:761:1: ( 'NUMBER' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNUMBEREnumLiteralDeclaration_0()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:762:1: ( 'NUMBER' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:762:3: 'NUMBER'
                    {
                    match(input,17,FOLLOW_17_in_rule__AttributeType__Alternatives1583); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getNUMBEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:767:6: ( ( 'TEXT' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:767:6: ( ( 'TEXT' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:768:1: ( 'TEXT' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getTEXTEnumLiteralDeclaration_1()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:769:1: ( 'TEXT' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:769:3: 'TEXT'
                    {
                    match(input,18,FOLLOW_18_in_rule__AttributeType__Alternatives1604); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:779:1: rule__CharaType__Alternatives : ( ( ( 'PC' ) ) | ( ( 'NPC' ) ) );
    public final void rule__CharaType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:783:1: ( ( ( 'PC' ) ) | ( ( 'NPC' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:784:1: ( ( 'PC' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:784:1: ( ( 'PC' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:785:1: ( 'PC' )
                    {
                     before(grammarAccess.getCharaTypeAccess().getPCEnumLiteralDeclaration_0()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:786:1: ( 'PC' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:786:3: 'PC'
                    {
                    match(input,19,FOLLOW_19_in_rule__CharaType__Alternatives1640); 

                    }

                     after(grammarAccess.getCharaTypeAccess().getPCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:791:6: ( ( 'NPC' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:791:6: ( ( 'NPC' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:792:1: ( 'NPC' )
                    {
                     before(grammarAccess.getCharaTypeAccess().getNPCEnumLiteralDeclaration_1()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:793:1: ( 'NPC' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:793:3: 'NPC'
                    {
                    match(input,20,FOLLOW_20_in_rule__CharaType__Alternatives1661); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:803:1: rule__CharaSex__Alternatives : ( ( ( 'male' ) ) | ( ( 'female' ) ) );
    public final void rule__CharaSex__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:807:1: ( ( ( 'male' ) ) | ( ( 'female' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:808:1: ( ( 'male' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:808:1: ( ( 'male' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:809:1: ( 'male' )
                    {
                     before(grammarAccess.getCharaSexAccess().getMaleEnumLiteralDeclaration_0()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:810:1: ( 'male' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:810:3: 'male'
                    {
                    match(input,21,FOLLOW_21_in_rule__CharaSex__Alternatives1697); 

                    }

                     after(grammarAccess.getCharaSexAccess().getMaleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:815:6: ( ( 'female' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:815:6: ( ( 'female' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:816:1: ( 'female' )
                    {
                     before(grammarAccess.getCharaSexAccess().getFemaleEnumLiteralDeclaration_1()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:817:1: ( 'female' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:817:3: 'female'
                    {
                    match(input,22,FOLLOW_22_in_rule__CharaSex__Alternatives1718); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:829:1: rule__Characters__Group__0 : rule__Characters__Group__0__Impl rule__Characters__Group__1 ;
    public final void rule__Characters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:833:1: ( rule__Characters__Group__0__Impl rule__Characters__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:834:2: rule__Characters__Group__0__Impl rule__Characters__Group__1
            {
            pushFollow(FOLLOW_rule__Characters__Group__0__Impl_in_rule__Characters__Group__01751);
            rule__Characters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Characters__Group__1_in_rule__Characters__Group__01754);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:841:1: rule__Characters__Group__0__Impl : ( ( rule__Characters__ImportsAssignment_0 )* ) ;
    public final void rule__Characters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:845:1: ( ( ( rule__Characters__ImportsAssignment_0 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:846:1: ( ( rule__Characters__ImportsAssignment_0 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:846:1: ( ( rule__Characters__ImportsAssignment_0 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:847:1: ( rule__Characters__ImportsAssignment_0 )*
            {
             before(grammarAccess.getCharactersAccess().getImportsAssignment_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:848:1: ( rule__Characters__ImportsAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:848:2: rule__Characters__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Characters__ImportsAssignment_0_in_rule__Characters__Group__0__Impl1781);
            	    rule__Characters__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:858:1: rule__Characters__Group__1 : rule__Characters__Group__1__Impl rule__Characters__Group__2 ;
    public final void rule__Characters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:862:1: ( rule__Characters__Group__1__Impl rule__Characters__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:863:2: rule__Characters__Group__1__Impl rule__Characters__Group__2
            {
            pushFollow(FOLLOW_rule__Characters__Group__1__Impl_in_rule__Characters__Group__11812);
            rule__Characters__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Characters__Group__2_in_rule__Characters__Group__11815);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:870:1: rule__Characters__Group__1__Impl : ( ( rule__Characters__TemplatesAssignment_1 )* ) ;
    public final void rule__Characters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:874:1: ( ( ( rule__Characters__TemplatesAssignment_1 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:875:1: ( ( rule__Characters__TemplatesAssignment_1 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:875:1: ( ( rule__Characters__TemplatesAssignment_1 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:876:1: ( rule__Characters__TemplatesAssignment_1 )*
            {
             before(grammarAccess.getCharactersAccess().getTemplatesAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:877:1: ( rule__Characters__TemplatesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:877:2: rule__Characters__TemplatesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Characters__TemplatesAssignment_1_in_rule__Characters__Group__1__Impl1842);
            	    rule__Characters__TemplatesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:887:1: rule__Characters__Group__2 : rule__Characters__Group__2__Impl rule__Characters__Group__3 ;
    public final void rule__Characters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:891:1: ( rule__Characters__Group__2__Impl rule__Characters__Group__3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:892:2: rule__Characters__Group__2__Impl rule__Characters__Group__3
            {
            pushFollow(FOLLOW_rule__Characters__Group__2__Impl_in_rule__Characters__Group__21873);
            rule__Characters__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Characters__Group__3_in_rule__Characters__Group__21876);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:899:1: rule__Characters__Group__2__Impl : ( ( rule__Characters__CustomsAssignment_2 )? ) ;
    public final void rule__Characters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:903:1: ( ( ( rule__Characters__CustomsAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:904:1: ( ( rule__Characters__CustomsAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:904:1: ( ( rule__Characters__CustomsAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:905:1: ( rule__Characters__CustomsAssignment_2 )?
            {
             before(grammarAccess.getCharactersAccess().getCustomsAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:906:1: ( rule__Characters__CustomsAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:906:2: rule__Characters__CustomsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Characters__CustomsAssignment_2_in_rule__Characters__Group__2__Impl1903);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:916:1: rule__Characters__Group__3 : rule__Characters__Group__3__Impl ;
    public final void rule__Characters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:920:1: ( rule__Characters__Group__3__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:921:2: rule__Characters__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Characters__Group__3__Impl_in_rule__Characters__Group__31934);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:927:1: rule__Characters__Group__3__Impl : ( ( rule__Characters__CharactersAssignment_3 )* ) ;
    public final void rule__Characters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:931:1: ( ( ( rule__Characters__CharactersAssignment_3 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:932:1: ( ( rule__Characters__CharactersAssignment_3 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:932:1: ( ( rule__Characters__CharactersAssignment_3 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:933:1: ( rule__Characters__CharactersAssignment_3 )*
            {
             before(grammarAccess.getCharactersAccess().getCharactersAssignment_3()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:934:1: ( rule__Characters__CharactersAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:934:2: rule__Characters__CharactersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Characters__CharactersAssignment_3_in_rule__Characters__Group__3__Impl1961);
            	    rule__Characters__CharactersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:952:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:956:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:957:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02000);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02003);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:964:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:968:1: ( ( 'import' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:969:1: ( 'import' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:969:1: ( 'import' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:970:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Import__Group__0__Impl2031); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:983:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:987:1: ( rule__Import__Group__1__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:988:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12062);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:994:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:998:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:999:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:999:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1000:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1001:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1001:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2089);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1015:1: rule__Template__Group__0 : rule__Template__Group__0__Impl rule__Template__Group__1 ;
    public final void rule__Template__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1019:1: ( rule__Template__Group__0__Impl rule__Template__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1020:2: rule__Template__Group__0__Impl rule__Template__Group__1
            {
            pushFollow(FOLLOW_rule__Template__Group__0__Impl_in_rule__Template__Group__02123);
            rule__Template__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__1_in_rule__Template__Group__02126);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1027:1: rule__Template__Group__0__Impl : ( 'template' ) ;
    public final void rule__Template__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1031:1: ( ( 'template' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1032:1: ( 'template' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1032:1: ( 'template' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1033:1: 'template'
            {
             before(grammarAccess.getTemplateAccess().getTemplateKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Template__Group__0__Impl2154); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1046:1: rule__Template__Group__1 : rule__Template__Group__1__Impl rule__Template__Group__2 ;
    public final void rule__Template__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1050:1: ( rule__Template__Group__1__Impl rule__Template__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1051:2: rule__Template__Group__1__Impl rule__Template__Group__2
            {
            pushFollow(FOLLOW_rule__Template__Group__1__Impl_in_rule__Template__Group__12185);
            rule__Template__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__2_in_rule__Template__Group__12188);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1058:1: rule__Template__Group__1__Impl : ( ( rule__Template__NameAssignment_1 ) ) ;
    public final void rule__Template__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1062:1: ( ( ( rule__Template__NameAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1063:1: ( ( rule__Template__NameAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1063:1: ( ( rule__Template__NameAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1064:1: ( rule__Template__NameAssignment_1 )
            {
             before(grammarAccess.getTemplateAccess().getNameAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1065:1: ( rule__Template__NameAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1065:2: rule__Template__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Template__NameAssignment_1_in_rule__Template__Group__1__Impl2215);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1075:1: rule__Template__Group__2 : rule__Template__Group__2__Impl rule__Template__Group__3 ;
    public final void rule__Template__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1079:1: ( rule__Template__Group__2__Impl rule__Template__Group__3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1080:2: rule__Template__Group__2__Impl rule__Template__Group__3
            {
            pushFollow(FOLLOW_rule__Template__Group__2__Impl_in_rule__Template__Group__22245);
            rule__Template__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__3_in_rule__Template__Group__22248);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1087:1: rule__Template__Group__2__Impl : ( ( rule__Template__DefaultsAssignment_2 )* ) ;
    public final void rule__Template__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1091:1: ( ( ( rule__Template__DefaultsAssignment_2 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1092:1: ( ( rule__Template__DefaultsAssignment_2 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1092:1: ( ( rule__Template__DefaultsAssignment_2 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1093:1: ( rule__Template__DefaultsAssignment_2 )*
            {
             before(grammarAccess.getTemplateAccess().getDefaultsAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1094:1: ( rule__Template__DefaultsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=12 && LA13_0<=16)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1094:2: rule__Template__DefaultsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Template__DefaultsAssignment_2_in_rule__Template__Group__2__Impl2275);
            	    rule__Template__DefaultsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1104:1: rule__Template__Group__3 : rule__Template__Group__3__Impl rule__Template__Group__4 ;
    public final void rule__Template__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1108:1: ( rule__Template__Group__3__Impl rule__Template__Group__4 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1109:2: rule__Template__Group__3__Impl rule__Template__Group__4
            {
            pushFollow(FOLLOW_rule__Template__Group__3__Impl_in_rule__Template__Group__32306);
            rule__Template__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__4_in_rule__Template__Group__32309);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1116:1: rule__Template__Group__3__Impl : ( ( rule__Template__CustomsAssignment_3 )* ) ;
    public final void rule__Template__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1120:1: ( ( ( rule__Template__CustomsAssignment_3 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1121:1: ( ( rule__Template__CustomsAssignment_3 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1121:1: ( ( rule__Template__CustomsAssignment_3 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1122:1: ( rule__Template__CustomsAssignment_3 )*
            {
             before(grammarAccess.getTemplateAccess().getCustomsAssignment_3()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1123:1: ( rule__Template__CustomsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1123:2: rule__Template__CustomsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Template__CustomsAssignment_3_in_rule__Template__Group__3__Impl2336);
            	    rule__Template__CustomsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1133:1: rule__Template__Group__4 : rule__Template__Group__4__Impl ;
    public final void rule__Template__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1137:1: ( rule__Template__Group__4__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1138:2: rule__Template__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Template__Group__4__Impl_in_rule__Template__Group__42367);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1144:1: rule__Template__Group__4__Impl : ( 'end' ) ;
    public final void rule__Template__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1148:1: ( ( 'end' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1149:1: ( 'end' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1149:1: ( 'end' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1150:1: 'end'
            {
             before(grammarAccess.getTemplateAccess().getEndKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Template__Group__4__Impl2395); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1173:1: rule__CustomAttribute__Group__0 : rule__CustomAttribute__Group__0__Impl rule__CustomAttribute__Group__1 ;
    public final void rule__CustomAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1177:1: ( rule__CustomAttribute__Group__0__Impl rule__CustomAttribute__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1178:2: rule__CustomAttribute__Group__0__Impl rule__CustomAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group__0__Impl_in_rule__CustomAttribute__Group__02436);
            rule__CustomAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group__1_in_rule__CustomAttribute__Group__02439);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1185:1: rule__CustomAttribute__Group__0__Impl : ( ( rule__CustomAttribute__CaNameAssignment_0 ) ) ;
    public final void rule__CustomAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1189:1: ( ( ( rule__CustomAttribute__CaNameAssignment_0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1190:1: ( ( rule__CustomAttribute__CaNameAssignment_0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1190:1: ( ( rule__CustomAttribute__CaNameAssignment_0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1191:1: ( rule__CustomAttribute__CaNameAssignment_0 )
            {
             before(grammarAccess.getCustomAttributeAccess().getCaNameAssignment_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1192:1: ( rule__CustomAttribute__CaNameAssignment_0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1192:2: rule__CustomAttribute__CaNameAssignment_0
            {
            pushFollow(FOLLOW_rule__CustomAttribute__CaNameAssignment_0_in_rule__CustomAttribute__Group__0__Impl2466);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1202:1: rule__CustomAttribute__Group__1 : rule__CustomAttribute__Group__1__Impl rule__CustomAttribute__Group__2 ;
    public final void rule__CustomAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1206:1: ( rule__CustomAttribute__Group__1__Impl rule__CustomAttribute__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1207:2: rule__CustomAttribute__Group__1__Impl rule__CustomAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group__1__Impl_in_rule__CustomAttribute__Group__12496);
            rule__CustomAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group__2_in_rule__CustomAttribute__Group__12499);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1214:1: rule__CustomAttribute__Group__1__Impl : ( 'as' ) ;
    public final void rule__CustomAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1218:1: ( ( 'as' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1219:1: ( 'as' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1219:1: ( 'as' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1220:1: 'as'
            {
             before(grammarAccess.getCustomAttributeAccess().getAsKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__CustomAttribute__Group__1__Impl2527); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1233:1: rule__CustomAttribute__Group__2 : rule__CustomAttribute__Group__2__Impl ;
    public final void rule__CustomAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1237:1: ( rule__CustomAttribute__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1238:2: rule__CustomAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group__2__Impl_in_rule__CustomAttribute__Group__22558);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1244:1: rule__CustomAttribute__Group__2__Impl : ( ( rule__CustomAttribute__Alternatives_2 ) ) ;
    public final void rule__CustomAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1248:1: ( ( ( rule__CustomAttribute__Alternatives_2 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1249:1: ( ( rule__CustomAttribute__Alternatives_2 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1249:1: ( ( rule__CustomAttribute__Alternatives_2 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1250:1: ( rule__CustomAttribute__Alternatives_2 )
            {
             before(grammarAccess.getCustomAttributeAccess().getAlternatives_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1251:1: ( rule__CustomAttribute__Alternatives_2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1251:2: rule__CustomAttribute__Alternatives_2
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Alternatives_2_in_rule__CustomAttribute__Group__2__Impl2585);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1267:1: rule__CustomAttribute__Group_2_1__0 : rule__CustomAttribute__Group_2_1__0__Impl rule__CustomAttribute__Group_2_1__1 ;
    public final void rule__CustomAttribute__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1271:1: ( rule__CustomAttribute__Group_2_1__0__Impl rule__CustomAttribute__Group_2_1__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1272:2: rule__CustomAttribute__Group_2_1__0__Impl rule__CustomAttribute__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1__0__Impl_in_rule__CustomAttribute__Group_2_1__02621);
            rule__CustomAttribute__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1__1_in_rule__CustomAttribute__Group_2_1__02624);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1279:1: rule__CustomAttribute__Group_2_1__0__Impl : ( '(' ) ;
    public final void rule__CustomAttribute__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1283:1: ( ( '(' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1284:1: ( '(' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1284:1: ( '(' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1285:1: '('
            {
             before(grammarAccess.getCustomAttributeAccess().getLeftParenthesisKeyword_2_1_0()); 
            match(input,27,FOLLOW_27_in_rule__CustomAttribute__Group_2_1__0__Impl2652); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1298:1: rule__CustomAttribute__Group_2_1__1 : rule__CustomAttribute__Group_2_1__1__Impl rule__CustomAttribute__Group_2_1__2 ;
    public final void rule__CustomAttribute__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1302:1: ( rule__CustomAttribute__Group_2_1__1__Impl rule__CustomAttribute__Group_2_1__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1303:2: rule__CustomAttribute__Group_2_1__1__Impl rule__CustomAttribute__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1__1__Impl_in_rule__CustomAttribute__Group_2_1__12683);
            rule__CustomAttribute__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1__2_in_rule__CustomAttribute__Group_2_1__12686);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1310:1: rule__CustomAttribute__Group_2_1__1__Impl : ( ( rule__CustomAttribute__EnumValuesAssignment_2_1_1 ) ) ;
    public final void rule__CustomAttribute__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1314:1: ( ( ( rule__CustomAttribute__EnumValuesAssignment_2_1_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1315:1: ( ( rule__CustomAttribute__EnumValuesAssignment_2_1_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1315:1: ( ( rule__CustomAttribute__EnumValuesAssignment_2_1_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1316:1: ( rule__CustomAttribute__EnumValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getCustomAttributeAccess().getEnumValuesAssignment_2_1_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1317:1: ( rule__CustomAttribute__EnumValuesAssignment_2_1_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1317:2: rule__CustomAttribute__EnumValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__CustomAttribute__EnumValuesAssignment_2_1_1_in_rule__CustomAttribute__Group_2_1__1__Impl2713);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1327:1: rule__CustomAttribute__Group_2_1__2 : rule__CustomAttribute__Group_2_1__2__Impl rule__CustomAttribute__Group_2_1__3 ;
    public final void rule__CustomAttribute__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1331:1: ( rule__CustomAttribute__Group_2_1__2__Impl rule__CustomAttribute__Group_2_1__3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1332:2: rule__CustomAttribute__Group_2_1__2__Impl rule__CustomAttribute__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1__2__Impl_in_rule__CustomAttribute__Group_2_1__22743);
            rule__CustomAttribute__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1__3_in_rule__CustomAttribute__Group_2_1__22746);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1339:1: rule__CustomAttribute__Group_2_1__2__Impl : ( ( rule__CustomAttribute__Group_2_1_2__0 )* ) ;
    public final void rule__CustomAttribute__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1343:1: ( ( ( rule__CustomAttribute__Group_2_1_2__0 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1344:1: ( ( rule__CustomAttribute__Group_2_1_2__0 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1344:1: ( ( rule__CustomAttribute__Group_2_1_2__0 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1345:1: ( rule__CustomAttribute__Group_2_1_2__0 )*
            {
             before(grammarAccess.getCustomAttributeAccess().getGroup_2_1_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1346:1: ( rule__CustomAttribute__Group_2_1_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1346:2: rule__CustomAttribute__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1_2__0_in_rule__CustomAttribute__Group_2_1__2__Impl2773);
            	    rule__CustomAttribute__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1356:1: rule__CustomAttribute__Group_2_1__3 : rule__CustomAttribute__Group_2_1__3__Impl ;
    public final void rule__CustomAttribute__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1360:1: ( rule__CustomAttribute__Group_2_1__3__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1361:2: rule__CustomAttribute__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1__3__Impl_in_rule__CustomAttribute__Group_2_1__32804);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1367:1: rule__CustomAttribute__Group_2_1__3__Impl : ( ')' ) ;
    public final void rule__CustomAttribute__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1371:1: ( ( ')' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1372:1: ( ')' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1372:1: ( ')' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1373:1: ')'
            {
             before(grammarAccess.getCustomAttributeAccess().getRightParenthesisKeyword_2_1_3()); 
            match(input,28,FOLLOW_28_in_rule__CustomAttribute__Group_2_1__3__Impl2832); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1394:1: rule__CustomAttribute__Group_2_1_2__0 : rule__CustomAttribute__Group_2_1_2__0__Impl rule__CustomAttribute__Group_2_1_2__1 ;
    public final void rule__CustomAttribute__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1398:1: ( rule__CustomAttribute__Group_2_1_2__0__Impl rule__CustomAttribute__Group_2_1_2__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1399:2: rule__CustomAttribute__Group_2_1_2__0__Impl rule__CustomAttribute__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1_2__0__Impl_in_rule__CustomAttribute__Group_2_1_2__02871);
            rule__CustomAttribute__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1_2__1_in_rule__CustomAttribute__Group_2_1_2__02874);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1406:1: rule__CustomAttribute__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__CustomAttribute__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1410:1: ( ( ',' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1411:1: ( ',' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1411:1: ( ',' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1412:1: ','
            {
             before(grammarAccess.getCustomAttributeAccess().getCommaKeyword_2_1_2_0()); 
            match(input,29,FOLLOW_29_in_rule__CustomAttribute__Group_2_1_2__0__Impl2902); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1425:1: rule__CustomAttribute__Group_2_1_2__1 : rule__CustomAttribute__Group_2_1_2__1__Impl ;
    public final void rule__CustomAttribute__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1429:1: ( rule__CustomAttribute__Group_2_1_2__1__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1430:2: rule__CustomAttribute__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_2_1_2__1__Impl_in_rule__CustomAttribute__Group_2_1_2__12933);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1436:1: rule__CustomAttribute__Group_2_1_2__1__Impl : ( ( rule__CustomAttribute__EnumValuesAssignment_2_1_2_1 ) ) ;
    public final void rule__CustomAttribute__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1440:1: ( ( ( rule__CustomAttribute__EnumValuesAssignment_2_1_2_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1441:1: ( ( rule__CustomAttribute__EnumValuesAssignment_2_1_2_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1441:1: ( ( rule__CustomAttribute__EnumValuesAssignment_2_1_2_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1442:1: ( rule__CustomAttribute__EnumValuesAssignment_2_1_2_1 )
            {
             before(grammarAccess.getCustomAttributeAccess().getEnumValuesAssignment_2_1_2_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1443:1: ( rule__CustomAttribute__EnumValuesAssignment_2_1_2_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1443:2: rule__CustomAttribute__EnumValuesAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__CustomAttribute__EnumValuesAssignment_2_1_2_1_in_rule__CustomAttribute__Group_2_1_2__1__Impl2960);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1457:1: rule__Customs__Group__0 : rule__Customs__Group__0__Impl rule__Customs__Group__1 ;
    public final void rule__Customs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1461:1: ( rule__Customs__Group__0__Impl rule__Customs__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1462:2: rule__Customs__Group__0__Impl rule__Customs__Group__1
            {
            pushFollow(FOLLOW_rule__Customs__Group__0__Impl_in_rule__Customs__Group__02994);
            rule__Customs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Customs__Group__1_in_rule__Customs__Group__02997);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1469:1: rule__Customs__Group__0__Impl : ( 'custom' ) ;
    public final void rule__Customs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1473:1: ( ( 'custom' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1474:1: ( 'custom' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1474:1: ( 'custom' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1475:1: 'custom'
            {
             before(grammarAccess.getCustomsAccess().getCustomKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Customs__Group__0__Impl3025); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1488:1: rule__Customs__Group__1 : rule__Customs__Group__1__Impl rule__Customs__Group__2 ;
    public final void rule__Customs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1492:1: ( rule__Customs__Group__1__Impl rule__Customs__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1493:2: rule__Customs__Group__1__Impl rule__Customs__Group__2
            {
            pushFollow(FOLLOW_rule__Customs__Group__1__Impl_in_rule__Customs__Group__13056);
            rule__Customs__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Customs__Group__2_in_rule__Customs__Group__13059);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1500:1: rule__Customs__Group__1__Impl : ( 'attributes' ) ;
    public final void rule__Customs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1504:1: ( ( 'attributes' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1505:1: ( 'attributes' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1505:1: ( 'attributes' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1506:1: 'attributes'
            {
             before(grammarAccess.getCustomsAccess().getAttributesKeyword_1()); 
            match(input,31,FOLLOW_31_in_rule__Customs__Group__1__Impl3087); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1519:1: rule__Customs__Group__2 : rule__Customs__Group__2__Impl rule__Customs__Group__3 ;
    public final void rule__Customs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1523:1: ( rule__Customs__Group__2__Impl rule__Customs__Group__3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1524:2: rule__Customs__Group__2__Impl rule__Customs__Group__3
            {
            pushFollow(FOLLOW_rule__Customs__Group__2__Impl_in_rule__Customs__Group__23118);
            rule__Customs__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Customs__Group__3_in_rule__Customs__Group__23121);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1531:1: rule__Customs__Group__2__Impl : ( ( rule__Customs__CustomAttributesAssignment_2 ) ) ;
    public final void rule__Customs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1535:1: ( ( ( rule__Customs__CustomAttributesAssignment_2 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1536:1: ( ( rule__Customs__CustomAttributesAssignment_2 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1536:1: ( ( rule__Customs__CustomAttributesAssignment_2 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1537:1: ( rule__Customs__CustomAttributesAssignment_2 )
            {
             before(grammarAccess.getCustomsAccess().getCustomAttributesAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1538:1: ( rule__Customs__CustomAttributesAssignment_2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1538:2: rule__Customs__CustomAttributesAssignment_2
            {
            pushFollow(FOLLOW_rule__Customs__CustomAttributesAssignment_2_in_rule__Customs__Group__2__Impl3148);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1548:1: rule__Customs__Group__3 : rule__Customs__Group__3__Impl rule__Customs__Group__4 ;
    public final void rule__Customs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1552:1: ( rule__Customs__Group__3__Impl rule__Customs__Group__4 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1553:2: rule__Customs__Group__3__Impl rule__Customs__Group__4
            {
            pushFollow(FOLLOW_rule__Customs__Group__3__Impl_in_rule__Customs__Group__33178);
            rule__Customs__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Customs__Group__4_in_rule__Customs__Group__33181);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1560:1: rule__Customs__Group__3__Impl : ( ( rule__Customs__CustomAttributesAssignment_3 )* ) ;
    public final void rule__Customs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1564:1: ( ( ( rule__Customs__CustomAttributesAssignment_3 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1565:1: ( ( rule__Customs__CustomAttributesAssignment_3 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1565:1: ( ( rule__Customs__CustomAttributesAssignment_3 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1566:1: ( rule__Customs__CustomAttributesAssignment_3 )*
            {
             before(grammarAccess.getCustomsAccess().getCustomAttributesAssignment_3()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1567:1: ( rule__Customs__CustomAttributesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1567:2: rule__Customs__CustomAttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Customs__CustomAttributesAssignment_3_in_rule__Customs__Group__3__Impl3208);
            	    rule__Customs__CustomAttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1577:1: rule__Customs__Group__4 : rule__Customs__Group__4__Impl ;
    public final void rule__Customs__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1581:1: ( rule__Customs__Group__4__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1582:2: rule__Customs__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Customs__Group__4__Impl_in_rule__Customs__Group__43239);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1588:1: rule__Customs__Group__4__Impl : ( 'end' ) ;
    public final void rule__Customs__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1592:1: ( ( 'end' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1593:1: ( 'end' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1593:1: ( 'end' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1594:1: 'end'
            {
             before(grammarAccess.getCustomsAccess().getEndKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Customs__Group__4__Impl3267); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1617:1: rule__Character__Group__0 : rule__Character__Group__0__Impl rule__Character__Group__1 ;
    public final void rule__Character__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1621:1: ( rule__Character__Group__0__Impl rule__Character__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1622:2: rule__Character__Group__0__Impl rule__Character__Group__1
            {
            pushFollow(FOLLOW_rule__Character__Group__0__Impl_in_rule__Character__Group__03308);
            rule__Character__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__1_in_rule__Character__Group__03311);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1629:1: rule__Character__Group__0__Impl : ( 'character' ) ;
    public final void rule__Character__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1633:1: ( ( 'character' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1634:1: ( 'character' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1634:1: ( 'character' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1635:1: 'character'
            {
             before(grammarAccess.getCharacterAccess().getCharacterKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Character__Group__0__Impl3339); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1648:1: rule__Character__Group__1 : rule__Character__Group__1__Impl rule__Character__Group__2 ;
    public final void rule__Character__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1652:1: ( rule__Character__Group__1__Impl rule__Character__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1653:2: rule__Character__Group__1__Impl rule__Character__Group__2
            {
            pushFollow(FOLLOW_rule__Character__Group__1__Impl_in_rule__Character__Group__13370);
            rule__Character__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__2_in_rule__Character__Group__13373);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1660:1: rule__Character__Group__1__Impl : ( ( rule__Character__NameAssignment_1 ) ) ;
    public final void rule__Character__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1664:1: ( ( ( rule__Character__NameAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1665:1: ( ( rule__Character__NameAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1665:1: ( ( rule__Character__NameAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1666:1: ( rule__Character__NameAssignment_1 )
            {
             before(grammarAccess.getCharacterAccess().getNameAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1667:1: ( rule__Character__NameAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1667:2: rule__Character__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Character__NameAssignment_1_in_rule__Character__Group__1__Impl3400);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1677:1: rule__Character__Group__2 : rule__Character__Group__2__Impl rule__Character__Group__3 ;
    public final void rule__Character__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1681:1: ( rule__Character__Group__2__Impl rule__Character__Group__3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1682:2: rule__Character__Group__2__Impl rule__Character__Group__3
            {
            pushFollow(FOLLOW_rule__Character__Group__2__Impl_in_rule__Character__Group__23430);
            rule__Character__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__3_in_rule__Character__Group__23433);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1689:1: rule__Character__Group__2__Impl : ( ( rule__Character__Group_2__0 )? ) ;
    public final void rule__Character__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1693:1: ( ( ( rule__Character__Group_2__0 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1694:1: ( ( rule__Character__Group_2__0 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1694:1: ( ( rule__Character__Group_2__0 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1695:1: ( rule__Character__Group_2__0 )?
            {
             before(grammarAccess.getCharacterAccess().getGroup_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1696:1: ( rule__Character__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1696:2: rule__Character__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Character__Group_2__0_in_rule__Character__Group__2__Impl3460);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1706:1: rule__Character__Group__3 : rule__Character__Group__3__Impl rule__Character__Group__4 ;
    public final void rule__Character__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1710:1: ( rule__Character__Group__3__Impl rule__Character__Group__4 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1711:2: rule__Character__Group__3__Impl rule__Character__Group__4
            {
            pushFollow(FOLLOW_rule__Character__Group__3__Impl_in_rule__Character__Group__33491);
            rule__Character__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__4_in_rule__Character__Group__33494);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1718:1: rule__Character__Group__3__Impl : ( ( rule__Character__PropertiesAssignment_3 )* ) ;
    public final void rule__Character__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1722:1: ( ( ( rule__Character__PropertiesAssignment_3 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1723:1: ( ( rule__Character__PropertiesAssignment_3 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1723:1: ( ( rule__Character__PropertiesAssignment_3 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1724:1: ( rule__Character__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getCharacterAccess().getPropertiesAssignment_3()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1725:1: ( rule__Character__PropertiesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=12 && LA18_0<=16)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1725:2: rule__Character__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Character__PropertiesAssignment_3_in_rule__Character__Group__3__Impl3521);
            	    rule__Character__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1735:1: rule__Character__Group__4 : rule__Character__Group__4__Impl ;
    public final void rule__Character__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1739:1: ( rule__Character__Group__4__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1740:2: rule__Character__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Character__Group__4__Impl_in_rule__Character__Group__43552);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1746:1: rule__Character__Group__4__Impl : ( 'end' ) ;
    public final void rule__Character__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1750:1: ( ( 'end' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1751:1: ( 'end' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1751:1: ( 'end' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1752:1: 'end'
            {
             before(grammarAccess.getCharacterAccess().getEndKeyword_4()); 
            match(input,25,FOLLOW_25_in_rule__Character__Group__4__Impl3580); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1775:1: rule__Character__Group_2__0 : rule__Character__Group_2__0__Impl rule__Character__Group_2__1 ;
    public final void rule__Character__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1779:1: ( rule__Character__Group_2__0__Impl rule__Character__Group_2__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1780:2: rule__Character__Group_2__0__Impl rule__Character__Group_2__1
            {
            pushFollow(FOLLOW_rule__Character__Group_2__0__Impl_in_rule__Character__Group_2__03621);
            rule__Character__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group_2__1_in_rule__Character__Group_2__03624);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1787:1: rule__Character__Group_2__0__Impl : ( 'uses' ) ;
    public final void rule__Character__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1791:1: ( ( 'uses' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1792:1: ( 'uses' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1792:1: ( 'uses' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1793:1: 'uses'
            {
             before(grammarAccess.getCharacterAccess().getUsesKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__Character__Group_2__0__Impl3652); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1806:1: rule__Character__Group_2__1 : rule__Character__Group_2__1__Impl ;
    public final void rule__Character__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1810:1: ( rule__Character__Group_2__1__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1811:2: rule__Character__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Character__Group_2__1__Impl_in_rule__Character__Group_2__13683);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1817:1: rule__Character__Group_2__1__Impl : ( ( rule__Character__TemplateAssignment_2_1 ) ) ;
    public final void rule__Character__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1821:1: ( ( ( rule__Character__TemplateAssignment_2_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1822:1: ( ( rule__Character__TemplateAssignment_2_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1822:1: ( ( rule__Character__TemplateAssignment_2_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1823:1: ( rule__Character__TemplateAssignment_2_1 )
            {
             before(grammarAccess.getCharacterAccess().getTemplateAssignment_2_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1824:1: ( rule__Character__TemplateAssignment_2_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1824:2: rule__Character__TemplateAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Character__TemplateAssignment_2_1_in_rule__Character__Group_2__1__Impl3710);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1838:1: rule__FullName__Group__0 : rule__FullName__Group__0__Impl rule__FullName__Group__1 ;
    public final void rule__FullName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1842:1: ( rule__FullName__Group__0__Impl rule__FullName__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1843:2: rule__FullName__Group__0__Impl rule__FullName__Group__1
            {
            pushFollow(FOLLOW_rule__FullName__Group__0__Impl_in_rule__FullName__Group__03744);
            rule__FullName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FullName__Group__1_in_rule__FullName__Group__03747);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1850:1: rule__FullName__Group__0__Impl : ( 'full name' ) ;
    public final void rule__FullName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1854:1: ( ( 'full name' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1855:1: ( 'full name' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1855:1: ( 'full name' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1856:1: 'full name'
            {
             before(grammarAccess.getFullNameAccess().getFullNameKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__FullName__Group__0__Impl3775); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1869:1: rule__FullName__Group__1 : rule__FullName__Group__1__Impl rule__FullName__Group__2 ;
    public final void rule__FullName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1873:1: ( rule__FullName__Group__1__Impl rule__FullName__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1874:2: rule__FullName__Group__1__Impl rule__FullName__Group__2
            {
            pushFollow(FOLLOW_rule__FullName__Group__1__Impl_in_rule__FullName__Group__13806);
            rule__FullName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FullName__Group__2_in_rule__FullName__Group__13809);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1881:1: rule__FullName__Group__1__Impl : ( ( rule__FullName__ValueAssignment_1 ) ) ;
    public final void rule__FullName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1885:1: ( ( ( rule__FullName__ValueAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1886:1: ( ( rule__FullName__ValueAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1886:1: ( ( rule__FullName__ValueAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1887:1: ( rule__FullName__ValueAssignment_1 )
            {
             before(grammarAccess.getFullNameAccess().getValueAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1888:1: ( rule__FullName__ValueAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1888:2: rule__FullName__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__FullName__ValueAssignment_1_in_rule__FullName__Group__1__Impl3836);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1898:1: rule__FullName__Group__2 : rule__FullName__Group__2__Impl ;
    public final void rule__FullName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1902:1: ( rule__FullName__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1903:2: rule__FullName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FullName__Group__2__Impl_in_rule__FullName__Group__23866);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1909:1: rule__FullName__Group__2__Impl : ( ( rule__FullName__CommentAssignment_2 )? ) ;
    public final void rule__FullName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1913:1: ( ( ( rule__FullName__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1914:1: ( ( rule__FullName__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1914:1: ( ( rule__FullName__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1915:1: ( rule__FullName__CommentAssignment_2 )?
            {
             before(grammarAccess.getFullNameAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1916:1: ( rule__FullName__CommentAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_COMMENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1916:2: rule__FullName__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FullName__CommentAssignment_2_in_rule__FullName__Group__2__Impl3893);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1932:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1936:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1937:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_rule__Description__Group__0__Impl_in_rule__Description__Group__03930);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Description__Group__1_in_rule__Description__Group__03933);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1944:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1948:1: ( ( 'description' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1949:1: ( 'description' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1949:1: ( 'description' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1950:1: 'description'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Description__Group__0__Impl3961); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1963:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1967:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1968:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_rule__Description__Group__1__Impl_in_rule__Description__Group__13992);
            rule__Description__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Description__Group__2_in_rule__Description__Group__13995);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1975:1: rule__Description__Group__1__Impl : ( ( rule__Description__ValueAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1979:1: ( ( ( rule__Description__ValueAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1980:1: ( ( rule__Description__ValueAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1980:1: ( ( rule__Description__ValueAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1981:1: ( rule__Description__ValueAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getValueAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1982:1: ( rule__Description__ValueAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1982:2: rule__Description__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Description__ValueAssignment_1_in_rule__Description__Group__1__Impl4022);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1992:1: rule__Description__Group__2 : rule__Description__Group__2__Impl ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1996:1: ( rule__Description__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1997:2: rule__Description__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Description__Group__2__Impl_in_rule__Description__Group__24052);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2003:1: rule__Description__Group__2__Impl : ( ( rule__Description__CommentAssignment_2 )? ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2007:1: ( ( ( rule__Description__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2008:1: ( ( rule__Description__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2008:1: ( ( rule__Description__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2009:1: ( rule__Description__CommentAssignment_2 )?
            {
             before(grammarAccess.getDescriptionAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2010:1: ( rule__Description__CommentAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_COMMENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2010:2: rule__Description__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Description__CommentAssignment_2_in_rule__Description__Group__2__Impl4079);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2026:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2030:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2031:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__04116);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__04119);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2038:1: rule__Type__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2042:1: ( ( 'type' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2043:1: ( 'type' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2043:1: ( 'type' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2044:1: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Type__Group__0__Impl4147); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2057:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2061:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2062:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__14178);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__2_in_rule__Type__Group__14181);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2069:1: rule__Type__Group__1__Impl : ( ( rule__Type__ValueAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2073:1: ( ( ( rule__Type__ValueAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2074:1: ( ( rule__Type__ValueAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2074:1: ( ( rule__Type__ValueAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2075:1: ( rule__Type__ValueAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getValueAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2076:1: ( rule__Type__ValueAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2076:2: rule__Type__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Type__ValueAssignment_1_in_rule__Type__Group__1__Impl4208);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2086:1: rule__Type__Group__2 : rule__Type__Group__2__Impl ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2090:1: ( rule__Type__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2091:2: rule__Type__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__24238);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2097:1: rule__Type__Group__2__Impl : ( ( rule__Type__CommentAssignment_2 )? ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2101:1: ( ( ( rule__Type__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2102:1: ( ( rule__Type__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2102:1: ( ( rule__Type__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2103:1: ( rule__Type__CommentAssignment_2 )?
            {
             before(grammarAccess.getTypeAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2104:1: ( rule__Type__CommentAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_COMMENT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2104:2: rule__Type__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Type__CommentAssignment_2_in_rule__Type__Group__2__Impl4265);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2120:1: rule__Age__Group__0 : rule__Age__Group__0__Impl rule__Age__Group__1 ;
    public final void rule__Age__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2124:1: ( rule__Age__Group__0__Impl rule__Age__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2125:2: rule__Age__Group__0__Impl rule__Age__Group__1
            {
            pushFollow(FOLLOW_rule__Age__Group__0__Impl_in_rule__Age__Group__04302);
            rule__Age__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Age__Group__1_in_rule__Age__Group__04305);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2132:1: rule__Age__Group__0__Impl : ( 'age' ) ;
    public final void rule__Age__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2136:1: ( ( 'age' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2137:1: ( 'age' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2137:1: ( 'age' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2138:1: 'age'
            {
             before(grammarAccess.getAgeAccess().getAgeKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Age__Group__0__Impl4333); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2151:1: rule__Age__Group__1 : rule__Age__Group__1__Impl rule__Age__Group__2 ;
    public final void rule__Age__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2155:1: ( rule__Age__Group__1__Impl rule__Age__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2156:2: rule__Age__Group__1__Impl rule__Age__Group__2
            {
            pushFollow(FOLLOW_rule__Age__Group__1__Impl_in_rule__Age__Group__14364);
            rule__Age__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Age__Group__2_in_rule__Age__Group__14367);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2163:1: rule__Age__Group__1__Impl : ( ( rule__Age__ValueAssignment_1 ) ) ;
    public final void rule__Age__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2167:1: ( ( ( rule__Age__ValueAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2168:1: ( ( rule__Age__ValueAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2168:1: ( ( rule__Age__ValueAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2169:1: ( rule__Age__ValueAssignment_1 )
            {
             before(grammarAccess.getAgeAccess().getValueAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2170:1: ( rule__Age__ValueAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2170:2: rule__Age__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Age__ValueAssignment_1_in_rule__Age__Group__1__Impl4394);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2180:1: rule__Age__Group__2 : rule__Age__Group__2__Impl ;
    public final void rule__Age__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2184:1: ( rule__Age__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2185:2: rule__Age__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Age__Group__2__Impl_in_rule__Age__Group__24424);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2191:1: rule__Age__Group__2__Impl : ( ( rule__Age__CommentAssignment_2 )? ) ;
    public final void rule__Age__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2195:1: ( ( ( rule__Age__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2196:1: ( ( rule__Age__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2196:1: ( ( rule__Age__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2197:1: ( rule__Age__CommentAssignment_2 )?
            {
             before(grammarAccess.getAgeAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2198:1: ( rule__Age__CommentAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_COMMENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2198:2: rule__Age__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Age__CommentAssignment_2_in_rule__Age__Group__2__Impl4451);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2214:1: rule__Sex__Group__0 : rule__Sex__Group__0__Impl rule__Sex__Group__1 ;
    public final void rule__Sex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2218:1: ( rule__Sex__Group__0__Impl rule__Sex__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2219:2: rule__Sex__Group__0__Impl rule__Sex__Group__1
            {
            pushFollow(FOLLOW_rule__Sex__Group__0__Impl_in_rule__Sex__Group__04488);
            rule__Sex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sex__Group__1_in_rule__Sex__Group__04491);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2226:1: rule__Sex__Group__0__Impl : ( 'sex' ) ;
    public final void rule__Sex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2230:1: ( ( 'sex' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2231:1: ( 'sex' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2231:1: ( 'sex' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2232:1: 'sex'
            {
             before(grammarAccess.getSexAccess().getSexKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Sex__Group__0__Impl4519); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2245:1: rule__Sex__Group__1 : rule__Sex__Group__1__Impl rule__Sex__Group__2 ;
    public final void rule__Sex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2249:1: ( rule__Sex__Group__1__Impl rule__Sex__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2250:2: rule__Sex__Group__1__Impl rule__Sex__Group__2
            {
            pushFollow(FOLLOW_rule__Sex__Group__1__Impl_in_rule__Sex__Group__14550);
            rule__Sex__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sex__Group__2_in_rule__Sex__Group__14553);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2257:1: rule__Sex__Group__1__Impl : ( ( rule__Sex__ValueAssignment_1 ) ) ;
    public final void rule__Sex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2261:1: ( ( ( rule__Sex__ValueAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2262:1: ( ( rule__Sex__ValueAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2262:1: ( ( rule__Sex__ValueAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2263:1: ( rule__Sex__ValueAssignment_1 )
            {
             before(grammarAccess.getSexAccess().getValueAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2264:1: ( rule__Sex__ValueAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2264:2: rule__Sex__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Sex__ValueAssignment_1_in_rule__Sex__Group__1__Impl4580);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2274:1: rule__Sex__Group__2 : rule__Sex__Group__2__Impl ;
    public final void rule__Sex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2278:1: ( rule__Sex__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2279:2: rule__Sex__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Sex__Group__2__Impl_in_rule__Sex__Group__24610);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2285:1: rule__Sex__Group__2__Impl : ( ( rule__Sex__CommentAssignment_2 )? ) ;
    public final void rule__Sex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2289:1: ( ( ( rule__Sex__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2290:1: ( ( rule__Sex__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2290:1: ( ( rule__Sex__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2291:1: ( rule__Sex__CommentAssignment_2 )?
            {
             before(grammarAccess.getSexAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2292:1: ( rule__Sex__CommentAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_COMMENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2292:2: rule__Sex__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Sex__CommentAssignment_2_in_rule__Sex__Group__2__Impl4637);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2308:1: rule__CustomProperty__Group__0 : rule__CustomProperty__Group__0__Impl rule__CustomProperty__Group__1 ;
    public final void rule__CustomProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2312:1: ( rule__CustomProperty__Group__0__Impl rule__CustomProperty__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2313:2: rule__CustomProperty__Group__0__Impl rule__CustomProperty__Group__1
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group__0__Impl_in_rule__CustomProperty__Group__04674);
            rule__CustomProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomProperty__Group__1_in_rule__CustomProperty__Group__04677);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2320:1: rule__CustomProperty__Group__0__Impl : ( ( rule__CustomProperty__CustomAttributeRefAssignment_0 ) ) ;
    public final void rule__CustomProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2324:1: ( ( ( rule__CustomProperty__CustomAttributeRefAssignment_0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2325:1: ( ( rule__CustomProperty__CustomAttributeRefAssignment_0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2325:1: ( ( rule__CustomProperty__CustomAttributeRefAssignment_0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2326:1: ( rule__CustomProperty__CustomAttributeRefAssignment_0 )
            {
             before(grammarAccess.getCustomPropertyAccess().getCustomAttributeRefAssignment_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2327:1: ( rule__CustomProperty__CustomAttributeRefAssignment_0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2327:2: rule__CustomProperty__CustomAttributeRefAssignment_0
            {
            pushFollow(FOLLOW_rule__CustomProperty__CustomAttributeRefAssignment_0_in_rule__CustomProperty__Group__0__Impl4704);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2337:1: rule__CustomProperty__Group__1 : rule__CustomProperty__Group__1__Impl rule__CustomProperty__Group__2 ;
    public final void rule__CustomProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2341:1: ( rule__CustomProperty__Group__1__Impl rule__CustomProperty__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2342:2: rule__CustomProperty__Group__1__Impl rule__CustomProperty__Group__2
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group__1__Impl_in_rule__CustomProperty__Group__14734);
            rule__CustomProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomProperty__Group__2_in_rule__CustomProperty__Group__14737);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2349:1: rule__CustomProperty__Group__1__Impl : ( ( rule__CustomProperty__Alternatives_1 ) ) ;
    public final void rule__CustomProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2353:1: ( ( ( rule__CustomProperty__Alternatives_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2354:1: ( ( rule__CustomProperty__Alternatives_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2354:1: ( ( rule__CustomProperty__Alternatives_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2355:1: ( rule__CustomProperty__Alternatives_1 )
            {
             before(grammarAccess.getCustomPropertyAccess().getAlternatives_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2356:1: ( rule__CustomProperty__Alternatives_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2356:2: rule__CustomProperty__Alternatives_1
            {
            pushFollow(FOLLOW_rule__CustomProperty__Alternatives_1_in_rule__CustomProperty__Group__1__Impl4764);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2366:1: rule__CustomProperty__Group__2 : rule__CustomProperty__Group__2__Impl ;
    public final void rule__CustomProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2370:1: ( rule__CustomProperty__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2371:2: rule__CustomProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group__2__Impl_in_rule__CustomProperty__Group__24794);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2377:1: rule__CustomProperty__Group__2__Impl : ( ( rule__CustomProperty__CommentAssignment_2 )? ) ;
    public final void rule__CustomProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2381:1: ( ( ( rule__CustomProperty__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2382:1: ( ( rule__CustomProperty__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2382:1: ( ( rule__CustomProperty__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2383:1: ( rule__CustomProperty__CommentAssignment_2 )?
            {
             before(grammarAccess.getCustomPropertyAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2384:1: ( rule__CustomProperty__CommentAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_COMMENT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2384:2: rule__CustomProperty__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__CustomProperty__CommentAssignment_2_in_rule__CustomProperty__Group__2__Impl4821);
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


    // $ANTLR start "rule__Characters__ImportsAssignment_0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2401:1: rule__Characters__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Characters__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2405:1: ( ( ruleImport ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2406:1: ( ruleImport )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2406:1: ( ruleImport )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2407:1: ruleImport
            {
             before(grammarAccess.getCharactersAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Characters__ImportsAssignment_04863);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2416:1: rule__Characters__TemplatesAssignment_1 : ( ruleTemplate ) ;
    public final void rule__Characters__TemplatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2420:1: ( ( ruleTemplate ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2421:1: ( ruleTemplate )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2421:1: ( ruleTemplate )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2422:1: ruleTemplate
            {
             before(grammarAccess.getCharactersAccess().getTemplatesTemplateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTemplate_in_rule__Characters__TemplatesAssignment_14894);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2431:1: rule__Characters__CustomsAssignment_2 : ( ruleCustoms ) ;
    public final void rule__Characters__CustomsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2435:1: ( ( ruleCustoms ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2436:1: ( ruleCustoms )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2436:1: ( ruleCustoms )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2437:1: ruleCustoms
            {
             before(grammarAccess.getCharactersAccess().getCustomsCustomsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCustoms_in_rule__Characters__CustomsAssignment_24925);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2446:1: rule__Characters__CharactersAssignment_3 : ( ruleCharacter ) ;
    public final void rule__Characters__CharactersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2450:1: ( ( ruleCharacter ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2451:1: ( ruleCharacter )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2451:1: ( ruleCharacter )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2452:1: ruleCharacter
            {
             before(grammarAccess.getCharactersAccess().getCharactersCharacterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCharacter_in_rule__Characters__CharactersAssignment_34956);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2461:1: rule__Import__ImportedNamespaceAssignment_1 : ( RULE_ID ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2465:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2466:1: ( RULE_ID )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2466:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2467:1: RULE_ID
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Import__ImportedNamespaceAssignment_14987); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2476:1: rule__Template__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Template__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2480:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2481:1: ( RULE_ID )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2481:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2482:1: RULE_ID
            {
             before(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Template__NameAssignment_15018); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2491:1: rule__Template__DefaultsAssignment_2 : ( ruleDefaultAttribute ) ;
    public final void rule__Template__DefaultsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2495:1: ( ( ruleDefaultAttribute ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2496:1: ( ruleDefaultAttribute )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2496:1: ( ruleDefaultAttribute )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2497:1: ruleDefaultAttribute
            {
             before(grammarAccess.getTemplateAccess().getDefaultsDefaultAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDefaultAttribute_in_rule__Template__DefaultsAssignment_25049);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2506:1: rule__Template__CustomsAssignment_3 : ( ruleCustomAttribute ) ;
    public final void rule__Template__CustomsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2510:1: ( ( ruleCustomAttribute ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2511:1: ( ruleCustomAttribute )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2511:1: ( ruleCustomAttribute )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2512:1: ruleCustomAttribute
            {
             before(grammarAccess.getTemplateAccess().getCustomsCustomAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCustomAttribute_in_rule__Template__CustomsAssignment_35080);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2521:1: rule__CustomAttribute__CaNameAssignment_0 : ( ruleCustomAttributeName ) ;
    public final void rule__CustomAttribute__CaNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2525:1: ( ( ruleCustomAttributeName ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2526:1: ( ruleCustomAttributeName )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2526:1: ( ruleCustomAttributeName )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2527:1: ruleCustomAttributeName
            {
             before(grammarAccess.getCustomAttributeAccess().getCaNameCustomAttributeNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCustomAttributeName_in_rule__CustomAttribute__CaNameAssignment_05111);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2536:1: rule__CustomAttribute__TypeAssignment_2_0 : ( ruleAttributeType ) ;
    public final void rule__CustomAttribute__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2540:1: ( ( ruleAttributeType ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2541:1: ( ruleAttributeType )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2541:1: ( ruleAttributeType )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2542:1: ruleAttributeType
            {
             before(grammarAccess.getCustomAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleAttributeType_in_rule__CustomAttribute__TypeAssignment_2_05142);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2551:1: rule__CustomAttribute__EnumValuesAssignment_2_1_1 : ( ruleEnumValue ) ;
    public final void rule__CustomAttribute__EnumValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2555:1: ( ( ruleEnumValue ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2556:1: ( ruleEnumValue )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2556:1: ( ruleEnumValue )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2557:1: ruleEnumValue
            {
             before(grammarAccess.getCustomAttributeAccess().getEnumValuesEnumValueParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleEnumValue_in_rule__CustomAttribute__EnumValuesAssignment_2_1_15173);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2566:1: rule__CustomAttribute__EnumValuesAssignment_2_1_2_1 : ( ruleEnumValue ) ;
    public final void rule__CustomAttribute__EnumValuesAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2570:1: ( ( ruleEnumValue ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2571:1: ( ruleEnumValue )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2571:1: ( ruleEnumValue )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2572:1: ruleEnumValue
            {
             before(grammarAccess.getCustomAttributeAccess().getEnumValuesEnumValueParserRuleCall_2_1_2_1_0()); 
            pushFollow(FOLLOW_ruleEnumValue_in_rule__CustomAttribute__EnumValuesAssignment_2_1_2_15204);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2581:1: rule__CustomAttributeName__NameAssignment : ( RULE_ID ) ;
    public final void rule__CustomAttributeName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2585:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2586:1: ( RULE_ID )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2586:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2587:1: RULE_ID
            {
             before(grammarAccess.getCustomAttributeNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomAttributeName__NameAssignment5235); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2596:1: rule__EnumValue__NameAssignment : ( RULE_ID ) ;
    public final void rule__EnumValue__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2600:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2601:1: ( RULE_ID )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2601:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2602:1: RULE_ID
            {
             before(grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumValue__NameAssignment5266); 
             after(grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_0()); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2611:1: rule__Customs__CustomAttributesAssignment_2 : ( ruleCustomAttribute ) ;
    public final void rule__Customs__CustomAttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2615:1: ( ( ruleCustomAttribute ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2616:1: ( ruleCustomAttribute )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2616:1: ( ruleCustomAttribute )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2617:1: ruleCustomAttribute
            {
             before(grammarAccess.getCustomsAccess().getCustomAttributesCustomAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCustomAttribute_in_rule__Customs__CustomAttributesAssignment_25297);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2626:1: rule__Customs__CustomAttributesAssignment_3 : ( ruleCustomAttribute ) ;
    public final void rule__Customs__CustomAttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2630:1: ( ( ruleCustomAttribute ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2631:1: ( ruleCustomAttribute )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2631:1: ( ruleCustomAttribute )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2632:1: ruleCustomAttribute
            {
             before(grammarAccess.getCustomsAccess().getCustomAttributesCustomAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCustomAttribute_in_rule__Customs__CustomAttributesAssignment_35328);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2641:1: rule__Character__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Character__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2645:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2646:1: ( RULE_ID )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2646:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2647:1: RULE_ID
            {
             before(grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Character__NameAssignment_15359); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2656:1: rule__Character__TemplateAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Character__TemplateAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2660:1: ( ( ( RULE_ID ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2661:1: ( ( RULE_ID ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2661:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2662:1: ( RULE_ID )
            {
             before(grammarAccess.getCharacterAccess().getTemplateTemplateCrossReference_2_1_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2663:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2664:1: RULE_ID
            {
             before(grammarAccess.getCharacterAccess().getTemplateTemplateIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Character__TemplateAssignment_2_15394); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2675:1: rule__Character__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__Character__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2679:1: ( ( ruleProperty ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2680:1: ( ruleProperty )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2680:1: ( ruleProperty )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2681:1: ruleProperty
            {
             before(grammarAccess.getCharacterAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Character__PropertiesAssignment_35429);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2690:1: rule__FullName__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FullName__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2694:1: ( ( RULE_STRING ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2695:1: ( RULE_STRING )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2695:1: ( RULE_STRING )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2696:1: RULE_STRING
            {
             before(grammarAccess.getFullNameAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FullName__ValueAssignment_15460); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2705:1: rule__FullName__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__FullName__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2709:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2710:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2710:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2711:1: RULE_COMMENT
            {
             before(grammarAccess.getFullNameAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__FullName__CommentAssignment_25491); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2720:1: rule__Description__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2724:1: ( ( RULE_STRING ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2725:1: ( RULE_STRING )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2725:1: ( RULE_STRING )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2726:1: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Description__ValueAssignment_15522); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2735:1: rule__Description__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__Description__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2739:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2740:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2740:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2741:1: RULE_COMMENT
            {
             before(grammarAccess.getDescriptionAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Description__CommentAssignment_25553); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2750:1: rule__Type__ValueAssignment_1 : ( ruleCharaType ) ;
    public final void rule__Type__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2754:1: ( ( ruleCharaType ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2755:1: ( ruleCharaType )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2755:1: ( ruleCharaType )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2756:1: ruleCharaType
            {
             before(grammarAccess.getTypeAccess().getValueCharaTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCharaType_in_rule__Type__ValueAssignment_15584);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2765:1: rule__Type__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__Type__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2769:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2770:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2770:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2771:1: RULE_COMMENT
            {
             before(grammarAccess.getTypeAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Type__CommentAssignment_25615); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2780:1: rule__Age__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Age__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2784:1: ( ( RULE_INT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2785:1: ( RULE_INT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2785:1: ( RULE_INT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2786:1: RULE_INT
            {
             before(grammarAccess.getAgeAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Age__ValueAssignment_15646); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2795:1: rule__Age__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__Age__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2799:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2800:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2800:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2801:1: RULE_COMMENT
            {
             before(grammarAccess.getAgeAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Age__CommentAssignment_25677); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2810:1: rule__Sex__ValueAssignment_1 : ( ruleCharaSex ) ;
    public final void rule__Sex__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2814:1: ( ( ruleCharaSex ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2815:1: ( ruleCharaSex )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2815:1: ( ruleCharaSex )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2816:1: ruleCharaSex
            {
             before(grammarAccess.getSexAccess().getValueCharaSexEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCharaSex_in_rule__Sex__ValueAssignment_15708);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2825:1: rule__Sex__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__Sex__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2829:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2830:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2830:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2831:1: RULE_COMMENT
            {
             before(grammarAccess.getSexAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Sex__CommentAssignment_25739); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2840:1: rule__CustomProperty__CustomAttributeRefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CustomProperty__CustomAttributeRefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2844:1: ( ( ( RULE_ID ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2845:1: ( ( RULE_ID ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2845:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2846:1: ( RULE_ID )
            {
             before(grammarAccess.getCustomPropertyAccess().getCustomAttributeRefCustomAttributeNameCrossReference_0_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2847:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2848:1: RULE_ID
            {
             before(grammarAccess.getCustomPropertyAccess().getCustomAttributeRefCustomAttributeNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomProperty__CustomAttributeRefAssignment_05774); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2859:1: rule__CustomProperty__StringValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__CustomProperty__StringValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2863:1: ( ( RULE_STRING ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2864:1: ( RULE_STRING )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2864:1: ( RULE_STRING )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2865:1: RULE_STRING
            {
             before(grammarAccess.getCustomPropertyAccess().getStringValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomProperty__StringValueAssignment_1_05809); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2874:1: rule__CustomProperty__IntValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__CustomProperty__IntValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2878:1: ( ( RULE_INT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2879:1: ( RULE_INT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2879:1: ( RULE_INT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2880:1: RULE_INT
            {
             before(grammarAccess.getCustomPropertyAccess().getIntValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CustomProperty__IntValueAssignment_1_15840); 
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


    // $ANTLR start "rule__CustomProperty__EnumValueAssignment_1_2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2889:1: rule__CustomProperty__EnumValueAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__CustomProperty__EnumValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2893:1: ( ( ( RULE_ID ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2894:1: ( ( RULE_ID ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2894:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2895:1: ( RULE_ID )
            {
             before(grammarAccess.getCustomPropertyAccess().getEnumValueEnumValueCrossReference_1_2_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2896:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2897:1: RULE_ID
            {
             before(grammarAccess.getCustomPropertyAccess().getEnumValueEnumValueIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomProperty__EnumValueAssignment_1_25875); 
             after(grammarAccess.getCustomPropertyAccess().getEnumValueEnumValueIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getCustomPropertyAccess().getEnumValueEnumValueCrossReference_1_2_0()); 

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
    // $ANTLR end "rule__CustomProperty__EnumValueAssignment_1_2"


    // $ANTLR start "rule__CustomProperty__CommentAssignment_2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2908:1: rule__CustomProperty__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__CustomProperty__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2912:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2913:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2913:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2914:1: RULE_COMMENT
            {
             before(grammarAccess.getCustomPropertyAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__CustomProperty__CommentAssignment_25910); 
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
    public static final BitSet FOLLOW_ruleCustoms_in_entryRuleCustoms481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustoms488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customs__Group__0_in_ruleCustoms514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_entryRuleCharacter541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharacter548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__0_in_ruleCharacter574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_in_ruleProperty634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultProperty_in_entryRuleDefaultProperty661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultProperty668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultProperty__Alternatives_in_ruleDefaultProperty694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullName_in_entryRuleFullName721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullName728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__Group__0_in_ruleFullName754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__0_in_ruleDescription814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAge_in_entryRuleAge901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAge908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__Group__0_in_ruleAge934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSex_in_entryRuleSex961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSex968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__Group__0_in_ruleSex994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomProperty_in_entryRuleCustomProperty1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomProperty1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__0_in_ruleCustomProperty1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharaType__Alternatives_in_ruleCharaType1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharaSex__Alternatives_in_ruleCharaSex1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DefaultAttribute__Alternatives1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DefaultAttribute__Alternatives1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DefaultAttribute__Alternatives1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DefaultAttribute__Alternatives1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DefaultAttribute__Alternatives1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__TypeAssignment_2_0_in_rule__CustomAttribute__Alternatives_21313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1__0_in_rule__CustomAttribute__Alternatives_21331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultProperty_in_rule__Property__Alternatives1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomProperty_in_rule__Property__Alternatives1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullName_in_rule__DefaultProperty__Alternatives1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__DefaultProperty__Alternatives1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__DefaultProperty__Alternatives1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAge_in_rule__DefaultProperty__Alternatives1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSex_in_rule__DefaultProperty__Alternatives1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__StringValueAssignment_1_0_in_rule__CustomProperty__Alternatives_11513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__IntValueAssignment_1_1_in_rule__CustomProperty__Alternatives_11531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__EnumValueAssignment_1_2_in_rule__CustomProperty__Alternatives_11549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AttributeType__Alternatives1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AttributeType__Alternatives1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CharaType__Alternatives1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CharaType__Alternatives1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CharaSex__Alternatives1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CharaSex__Alternatives1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__Group__0__Impl_in_rule__Characters__Group__01751 = new BitSet(new long[]{0x0000000141000000L});
    public static final BitSet FOLLOW_rule__Characters__Group__1_in_rule__Characters__Group__01754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__ImportsAssignment_0_in_rule__Characters__Group__0__Impl1781 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Characters__Group__1__Impl_in_rule__Characters__Group__11812 = new BitSet(new long[]{0x0000000141000000L});
    public static final BitSet FOLLOW_rule__Characters__Group__2_in_rule__Characters__Group__11815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__TemplatesAssignment_1_in_rule__Characters__Group__1__Impl1842 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Characters__Group__2__Impl_in_rule__Characters__Group__21873 = new BitSet(new long[]{0x0000000141000000L});
    public static final BitSet FOLLOW_rule__Characters__Group__3_in_rule__Characters__Group__21876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__CustomsAssignment_2_in_rule__Characters__Group__2__Impl1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__Group__3__Impl_in_rule__Characters__Group__31934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__CharactersAssignment_3_in_rule__Characters__Group__3__Impl1961 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Import__Group__0__Impl2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__0__Impl_in_rule__Template__Group__02123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Template__Group__1_in_rule__Template__Group__02126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Template__Group__0__Impl2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__1__Impl_in_rule__Template__Group__12185 = new BitSet(new long[]{0x000000000201F010L});
    public static final BitSet FOLLOW_rule__Template__Group__2_in_rule__Template__Group__12188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__NameAssignment_1_in_rule__Template__Group__1__Impl2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__2__Impl_in_rule__Template__Group__22245 = new BitSet(new long[]{0x000000000201F010L});
    public static final BitSet FOLLOW_rule__Template__Group__3_in_rule__Template__Group__22248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__DefaultsAssignment_2_in_rule__Template__Group__2__Impl2275 = new BitSet(new long[]{0x000000000001F002L});
    public static final BitSet FOLLOW_rule__Template__Group__3__Impl_in_rule__Template__Group__32306 = new BitSet(new long[]{0x000000000201F010L});
    public static final BitSet FOLLOW_rule__Template__Group__4_in_rule__Template__Group__32309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__CustomsAssignment_3_in_rule__Template__Group__3__Impl2336 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Template__Group__4__Impl_in_rule__Template__Group__42367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Template__Group__4__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__0__Impl_in_rule__CustomAttribute__Group__02436 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__1_in_rule__CustomAttribute__Group__02439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__CaNameAssignment_0_in_rule__CustomAttribute__Group__0__Impl2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__1__Impl_in_rule__CustomAttribute__Group__12496 = new BitSet(new long[]{0x0000000008060000L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__2_in_rule__CustomAttribute__Group__12499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CustomAttribute__Group__1__Impl2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__2__Impl_in_rule__CustomAttribute__Group__22558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Alternatives_2_in_rule__CustomAttribute__Group__2__Impl2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1__0__Impl_in_rule__CustomAttribute__Group_2_1__02621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1__1_in_rule__CustomAttribute__Group_2_1__02624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CustomAttribute__Group_2_1__0__Impl2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1__1__Impl_in_rule__CustomAttribute__Group_2_1__12683 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1__2_in_rule__CustomAttribute__Group_2_1__12686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__EnumValuesAssignment_2_1_1_in_rule__CustomAttribute__Group_2_1__1__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1__2__Impl_in_rule__CustomAttribute__Group_2_1__22743 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1__3_in_rule__CustomAttribute__Group_2_1__22746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1_2__0_in_rule__CustomAttribute__Group_2_1__2__Impl2773 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1__3__Impl_in_rule__CustomAttribute__Group_2_1__32804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CustomAttribute__Group_2_1__3__Impl2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1_2__0__Impl_in_rule__CustomAttribute__Group_2_1_2__02871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1_2__1_in_rule__CustomAttribute__Group_2_1_2__02874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CustomAttribute__Group_2_1_2__0__Impl2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_2_1_2__1__Impl_in_rule__CustomAttribute__Group_2_1_2__12933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__EnumValuesAssignment_2_1_2_1_in_rule__CustomAttribute__Group_2_1_2__1__Impl2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customs__Group__0__Impl_in_rule__Customs__Group__02994 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Customs__Group__1_in_rule__Customs__Group__02997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Customs__Group__0__Impl3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customs__Group__1__Impl_in_rule__Customs__Group__13056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Customs__Group__2_in_rule__Customs__Group__13059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Customs__Group__1__Impl3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customs__Group__2__Impl_in_rule__Customs__Group__23118 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Customs__Group__3_in_rule__Customs__Group__23121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customs__CustomAttributesAssignment_2_in_rule__Customs__Group__2__Impl3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customs__Group__3__Impl_in_rule__Customs__Group__33178 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rule__Customs__Group__4_in_rule__Customs__Group__33181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Customs__CustomAttributesAssignment_3_in_rule__Customs__Group__3__Impl3208 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Customs__Group__4__Impl_in_rule__Customs__Group__43239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Customs__Group__4__Impl3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__0__Impl_in_rule__Character__Group__03308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Character__Group__1_in_rule__Character__Group__03311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Character__Group__0__Impl3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__1__Impl_in_rule__Character__Group__13370 = new BitSet(new long[]{0x000000020201F010L});
    public static final BitSet FOLLOW_rule__Character__Group__2_in_rule__Character__Group__13373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__NameAssignment_1_in_rule__Character__Group__1__Impl3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__2__Impl_in_rule__Character__Group__23430 = new BitSet(new long[]{0x000000020201F010L});
    public static final BitSet FOLLOW_rule__Character__Group__3_in_rule__Character__Group__23433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group_2__0_in_rule__Character__Group__2__Impl3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__3__Impl_in_rule__Character__Group__33491 = new BitSet(new long[]{0x000000020201F010L});
    public static final BitSet FOLLOW_rule__Character__Group__4_in_rule__Character__Group__33494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__PropertiesAssignment_3_in_rule__Character__Group__3__Impl3521 = new BitSet(new long[]{0x000000000001F012L});
    public static final BitSet FOLLOW_rule__Character__Group__4__Impl_in_rule__Character__Group__43552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Character__Group__4__Impl3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group_2__0__Impl_in_rule__Character__Group_2__03621 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Character__Group_2__1_in_rule__Character__Group_2__03624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Character__Group_2__0__Impl3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group_2__1__Impl_in_rule__Character__Group_2__13683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__TemplateAssignment_2_1_in_rule__Character__Group_2__1__Impl3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__Group__0__Impl_in_rule__FullName__Group__03744 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FullName__Group__1_in_rule__FullName__Group__03747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FullName__Group__0__Impl3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__Group__1__Impl_in_rule__FullName__Group__13806 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FullName__Group__2_in_rule__FullName__Group__13809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__ValueAssignment_1_in_rule__FullName__Group__1__Impl3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__Group__2__Impl_in_rule__FullName__Group__23866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__CommentAssignment_2_in_rule__FullName__Group__2__Impl3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__0__Impl_in_rule__Description__Group__03930 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Description__Group__1_in_rule__Description__Group__03933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Description__Group__0__Impl3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__1__Impl_in_rule__Description__Group__13992 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Description__Group__2_in_rule__Description__Group__13995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__ValueAssignment_1_in_rule__Description__Group__1__Impl4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__2__Impl_in_rule__Description__Group__24052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__CommentAssignment_2_in_rule__Description__Group__2__Impl4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__04116 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__04119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__Group__0__Impl4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__14178 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Type__Group__2_in_rule__Type__Group__14181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ValueAssignment_1_in_rule__Type__Group__1__Impl4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__24238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__CommentAssignment_2_in_rule__Type__Group__2__Impl4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__Group__0__Impl_in_rule__Age__Group__04302 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Age__Group__1_in_rule__Age__Group__04305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Age__Group__0__Impl4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__Group__1__Impl_in_rule__Age__Group__14364 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Age__Group__2_in_rule__Age__Group__14367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__ValueAssignment_1_in_rule__Age__Group__1__Impl4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__Group__2__Impl_in_rule__Age__Group__24424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__CommentAssignment_2_in_rule__Age__Group__2__Impl4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__Group__0__Impl_in_rule__Sex__Group__04488 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Sex__Group__1_in_rule__Sex__Group__04491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Sex__Group__0__Impl4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__Group__1__Impl_in_rule__Sex__Group__14550 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Sex__Group__2_in_rule__Sex__Group__14553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__ValueAssignment_1_in_rule__Sex__Group__1__Impl4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__Group__2__Impl_in_rule__Sex__Group__24610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__CommentAssignment_2_in_rule__Sex__Group__2__Impl4637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__0__Impl_in_rule__CustomProperty__Group__04674 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__1_in_rule__CustomProperty__Group__04677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__CustomAttributeRefAssignment_0_in_rule__CustomProperty__Group__0__Impl4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__1__Impl_in_rule__CustomProperty__Group__14734 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__2_in_rule__CustomProperty__Group__14737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Alternatives_1_in_rule__CustomProperty__Group__1__Impl4764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__2__Impl_in_rule__CustomProperty__Group__24794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__CommentAssignment_2_in_rule__CustomProperty__Group__2__Impl4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Characters__ImportsAssignment_04863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_rule__Characters__TemplatesAssignment_14894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustoms_in_rule__Characters__CustomsAssignment_24925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_rule__Characters__CharactersAssignment_34956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Import__ImportedNamespaceAssignment_14987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Template__NameAssignment_15018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultAttribute_in_rule__Template__DefaultsAssignment_25049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttribute_in_rule__Template__CustomsAssignment_35080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttributeName_in_rule__CustomAttribute__CaNameAssignment_05111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_rule__CustomAttribute__TypeAssignment_2_05142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_rule__CustomAttribute__EnumValuesAssignment_2_1_15173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_rule__CustomAttribute__EnumValuesAssignment_2_1_2_15204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomAttributeName__NameAssignment5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumValue__NameAssignment5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttribute_in_rule__Customs__CustomAttributesAssignment_25297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttribute_in_rule__Customs__CustomAttributesAssignment_35328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Character__NameAssignment_15359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Character__TemplateAssignment_2_15394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Character__PropertiesAssignment_35429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FullName__ValueAssignment_15460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__FullName__CommentAssignment_25491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Description__ValueAssignment_15522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Description__CommentAssignment_25553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharaType_in_rule__Type__ValueAssignment_15584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Type__CommentAssignment_25615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Age__ValueAssignment_15646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Age__CommentAssignment_25677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharaSex_in_rule__Sex__ValueAssignment_15708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Sex__CommentAssignment_25739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomProperty__CustomAttributeRefAssignment_05774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomProperty__StringValueAssignment_1_05809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CustomProperty__IntValueAssignment_1_15840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomProperty__EnumValueAssignment_1_25875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__CustomProperty__CommentAssignment_25910 = new BitSet(new long[]{0x0000000000000002L});

}