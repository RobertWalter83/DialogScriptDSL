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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'full name'", "'age'", "'description'", "'sex'", "'type'", "'!'", "'required'", "'NUMBER'", "'TEXT'", "'PC'", "'NPC'", "'male'", "'female'", "'import'", "'template'", "'end'", "'as'", "'('", "')'", "','", "'global'", "'attributes'", "'character'", "'uses'"
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
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
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


    // $ANTLR start "entryRuleRequired"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:200:1: entryRuleRequired : ruleRequired EOF ;
    public final void entryRuleRequired() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:201:1: ( ruleRequired EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:202:1: ruleRequired EOF
            {
             before(grammarAccess.getRequiredRule()); 
            pushFollow(FOLLOW_ruleRequired_in_entryRuleRequired361);
            ruleRequired();

            state._fsp--;

             after(grammarAccess.getRequiredRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequired368); 

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
    // $ANTLR end "entryRuleRequired"


    // $ANTLR start "ruleRequired"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:209:1: ruleRequired : ( ( rule__Required__Alternatives ) ) ;
    public final void ruleRequired() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:213:2: ( ( ( rule__Required__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:214:1: ( ( rule__Required__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:214:1: ( ( rule__Required__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:215:1: ( rule__Required__Alternatives )
            {
             before(grammarAccess.getRequiredAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:216:1: ( rule__Required__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:216:2: rule__Required__Alternatives
            {
            pushFollow(FOLLOW_rule__Required__Alternatives_in_ruleRequired394);
            rule__Required__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRequiredAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequired"


    // $ANTLR start "entryRuleCustomAttributeName"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:228:1: entryRuleCustomAttributeName : ruleCustomAttributeName EOF ;
    public final void entryRuleCustomAttributeName() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:229:1: ( ruleCustomAttributeName EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:230:1: ruleCustomAttributeName EOF
            {
             before(grammarAccess.getCustomAttributeNameRule()); 
            pushFollow(FOLLOW_ruleCustomAttributeName_in_entryRuleCustomAttributeName421);
            ruleCustomAttributeName();

            state._fsp--;

             after(grammarAccess.getCustomAttributeNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomAttributeName428); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:237:1: ruleCustomAttributeName : ( ( rule__CustomAttributeName__NameAssignment ) ) ;
    public final void ruleCustomAttributeName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:241:2: ( ( ( rule__CustomAttributeName__NameAssignment ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:242:1: ( ( rule__CustomAttributeName__NameAssignment ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:242:1: ( ( rule__CustomAttributeName__NameAssignment ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:243:1: ( rule__CustomAttributeName__NameAssignment )
            {
             before(grammarAccess.getCustomAttributeNameAccess().getNameAssignment()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:244:1: ( rule__CustomAttributeName__NameAssignment )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:244:2: rule__CustomAttributeName__NameAssignment
            {
            pushFollow(FOLLOW_rule__CustomAttributeName__NameAssignment_in_ruleCustomAttributeName454);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:256:1: entryRuleEnumValue : ruleEnumValue EOF ;
    public final void entryRuleEnumValue() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:257:1: ( ruleEnumValue EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:258:1: ruleEnumValue EOF
            {
             before(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_ruleEnumValue_in_entryRuleEnumValue481);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getEnumValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumValue488); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:265:1: ruleEnumValue : ( ( rule__EnumValue__NameAssignment ) ) ;
    public final void ruleEnumValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:269:2: ( ( ( rule__EnumValue__NameAssignment ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:270:1: ( ( rule__EnumValue__NameAssignment ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:270:1: ( ( rule__EnumValue__NameAssignment ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:271:1: ( rule__EnumValue__NameAssignment )
            {
             before(grammarAccess.getEnumValueAccess().getNameAssignment()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:272:1: ( rule__EnumValue__NameAssignment )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:272:2: rule__EnumValue__NameAssignment
            {
            pushFollow(FOLLOW_rule__EnumValue__NameAssignment_in_ruleEnumValue514);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:284:1: entryRuleEnumID : ruleEnumID EOF ;
    public final void entryRuleEnumID() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:285:1: ( ruleEnumID EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:286:1: ruleEnumID EOF
            {
             before(grammarAccess.getEnumIDRule()); 
            pushFollow(FOLLOW_ruleEnumID_in_entryRuleEnumID541);
            ruleEnumID();

            state._fsp--;

             after(grammarAccess.getEnumIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumID548); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:293:1: ruleEnumID : ( ( rule__EnumID__Alternatives ) ) ;
    public final void ruleEnumID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:297:2: ( ( ( rule__EnumID__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:298:1: ( ( rule__EnumID__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:298:1: ( ( rule__EnumID__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:299:1: ( rule__EnumID__Alternatives )
            {
             before(grammarAccess.getEnumIDAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:300:1: ( rule__EnumID__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:300:2: rule__EnumID__Alternatives
            {
            pushFollow(FOLLOW_rule__EnumID__Alternatives_in_ruleEnumID574);
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


    // $ANTLR start "entryRuleGlobals"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:312:1: entryRuleGlobals : ruleGlobals EOF ;
    public final void entryRuleGlobals() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:313:1: ( ruleGlobals EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:314:1: ruleGlobals EOF
            {
             before(grammarAccess.getGlobalsRule()); 
            pushFollow(FOLLOW_ruleGlobals_in_entryRuleGlobals601);
            ruleGlobals();

            state._fsp--;

             after(grammarAccess.getGlobalsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobals608); 

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
    // $ANTLR end "entryRuleGlobals"


    // $ANTLR start "ruleGlobals"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:321:1: ruleGlobals : ( ( rule__Globals__Group__0 ) ) ;
    public final void ruleGlobals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:325:2: ( ( ( rule__Globals__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:326:1: ( ( rule__Globals__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:326:1: ( ( rule__Globals__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:327:1: ( rule__Globals__Group__0 )
            {
             before(grammarAccess.getGlobalsAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:328:1: ( rule__Globals__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:328:2: rule__Globals__Group__0
            {
            pushFollow(FOLLOW_rule__Globals__Group__0_in_ruleGlobals634);
            rule__Globals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobals"


    // $ANTLR start "entryRuleCharacter"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:340:1: entryRuleCharacter : ruleCharacter EOF ;
    public final void entryRuleCharacter() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:341:1: ( ruleCharacter EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:342:1: ruleCharacter EOF
            {
             before(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_ruleCharacter_in_entryRuleCharacter661);
            ruleCharacter();

            state._fsp--;

             after(grammarAccess.getCharacterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharacter668); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:349:1: ruleCharacter : ( ( rule__Character__Group__0 ) ) ;
    public final void ruleCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:353:2: ( ( ( rule__Character__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:354:1: ( ( rule__Character__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:354:1: ( ( rule__Character__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:355:1: ( rule__Character__Group__0 )
            {
             before(grammarAccess.getCharacterAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:356:1: ( rule__Character__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:356:2: rule__Character__Group__0
            {
            pushFollow(FOLLOW_rule__Character__Group__0_in_ruleCharacter694);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:368:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:369:1: ( ruleProperty EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:370:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty721);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty728); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:377:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:381:2: ( ( ( rule__Property__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:382:1: ( ( rule__Property__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:382:1: ( ( rule__Property__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:383:1: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:384:1: ( rule__Property__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:384:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_in_ruleProperty754);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:396:1: entryRuleDefaultProperty : ruleDefaultProperty EOF ;
    public final void entryRuleDefaultProperty() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:397:1: ( ruleDefaultProperty EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:398:1: ruleDefaultProperty EOF
            {
             before(grammarAccess.getDefaultPropertyRule()); 
            pushFollow(FOLLOW_ruleDefaultProperty_in_entryRuleDefaultProperty781);
            ruleDefaultProperty();

            state._fsp--;

             after(grammarAccess.getDefaultPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultProperty788); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:405:1: ruleDefaultProperty : ( ( rule__DefaultProperty__Alternatives ) ) ;
    public final void ruleDefaultProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:409:2: ( ( ( rule__DefaultProperty__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:410:1: ( ( rule__DefaultProperty__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:410:1: ( ( rule__DefaultProperty__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:411:1: ( rule__DefaultProperty__Alternatives )
            {
             before(grammarAccess.getDefaultPropertyAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:412:1: ( rule__DefaultProperty__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:412:2: rule__DefaultProperty__Alternatives
            {
            pushFollow(FOLLOW_rule__DefaultProperty__Alternatives_in_ruleDefaultProperty814);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:424:1: entryRuleFullName : ruleFullName EOF ;
    public final void entryRuleFullName() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:425:1: ( ruleFullName EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:426:1: ruleFullName EOF
            {
             before(grammarAccess.getFullNameRule()); 
            pushFollow(FOLLOW_ruleFullName_in_entryRuleFullName841);
            ruleFullName();

            state._fsp--;

             after(grammarAccess.getFullNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullName848); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:433:1: ruleFullName : ( ( rule__FullName__Group__0 ) ) ;
    public final void ruleFullName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:437:2: ( ( ( rule__FullName__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:438:1: ( ( rule__FullName__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:438:1: ( ( rule__FullName__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:439:1: ( rule__FullName__Group__0 )
            {
             before(grammarAccess.getFullNameAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:440:1: ( rule__FullName__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:440:2: rule__FullName__Group__0
            {
            pushFollow(FOLLOW_rule__FullName__Group__0_in_ruleFullName874);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:452:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:453:1: ( ruleDescription EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:454:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription901);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription908); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:461:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:465:2: ( ( ( rule__Description__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:466:1: ( ( rule__Description__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:466:1: ( ( rule__Description__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:467:1: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:468:1: ( rule__Description__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:468:2: rule__Description__Group__0
            {
            pushFollow(FOLLOW_rule__Description__Group__0_in_ruleDescription934);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:480:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:481:1: ( ruleType EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:482:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType961);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType968); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:489:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:493:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:494:1: ( ( rule__Type__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:494:1: ( ( rule__Type__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:495:1: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:496:1: ( rule__Type__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:496:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType994);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:508:1: entryRuleAge : ruleAge EOF ;
    public final void entryRuleAge() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:509:1: ( ruleAge EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:510:1: ruleAge EOF
            {
             before(grammarAccess.getAgeRule()); 
            pushFollow(FOLLOW_ruleAge_in_entryRuleAge1021);
            ruleAge();

            state._fsp--;

             after(grammarAccess.getAgeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAge1028); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:517:1: ruleAge : ( ( rule__Age__Group__0 ) ) ;
    public final void ruleAge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:521:2: ( ( ( rule__Age__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:522:1: ( ( rule__Age__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:522:1: ( ( rule__Age__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:523:1: ( rule__Age__Group__0 )
            {
             before(grammarAccess.getAgeAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:524:1: ( rule__Age__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:524:2: rule__Age__Group__0
            {
            pushFollow(FOLLOW_rule__Age__Group__0_in_ruleAge1054);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:536:1: entryRuleSex : ruleSex EOF ;
    public final void entryRuleSex() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:537:1: ( ruleSex EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:538:1: ruleSex EOF
            {
             before(grammarAccess.getSexRule()); 
            pushFollow(FOLLOW_ruleSex_in_entryRuleSex1081);
            ruleSex();

            state._fsp--;

             after(grammarAccess.getSexRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSex1088); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:545:1: ruleSex : ( ( rule__Sex__Group__0 ) ) ;
    public final void ruleSex() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:549:2: ( ( ( rule__Sex__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:550:1: ( ( rule__Sex__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:550:1: ( ( rule__Sex__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:551:1: ( rule__Sex__Group__0 )
            {
             before(grammarAccess.getSexAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:552:1: ( rule__Sex__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:552:2: rule__Sex__Group__0
            {
            pushFollow(FOLLOW_rule__Sex__Group__0_in_ruleSex1114);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:564:1: entryRuleCustomProperty : ruleCustomProperty EOF ;
    public final void entryRuleCustomProperty() throws RecognitionException {
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:565:1: ( ruleCustomProperty EOF )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:566:1: ruleCustomProperty EOF
            {
             before(grammarAccess.getCustomPropertyRule()); 
            pushFollow(FOLLOW_ruleCustomProperty_in_entryRuleCustomProperty1141);
            ruleCustomProperty();

            state._fsp--;

             after(grammarAccess.getCustomPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomProperty1148); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:573:1: ruleCustomProperty : ( ( rule__CustomProperty__Group__0 ) ) ;
    public final void ruleCustomProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:577:2: ( ( ( rule__CustomProperty__Group__0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:578:1: ( ( rule__CustomProperty__Group__0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:578:1: ( ( rule__CustomProperty__Group__0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:579:1: ( rule__CustomProperty__Group__0 )
            {
             before(grammarAccess.getCustomPropertyAccess().getGroup()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:580:1: ( rule__CustomProperty__Group__0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:580:2: rule__CustomProperty__Group__0
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group__0_in_ruleCustomProperty1174);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:593:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:597:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:598:1: ( ( rule__AttributeType__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:598:1: ( ( rule__AttributeType__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:599:1: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:600:1: ( rule__AttributeType__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:600:2: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType1211);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:612:1: ruleCharaType : ( ( rule__CharaType__Alternatives ) ) ;
    public final void ruleCharaType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:616:1: ( ( ( rule__CharaType__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:617:1: ( ( rule__CharaType__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:617:1: ( ( rule__CharaType__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:618:1: ( rule__CharaType__Alternatives )
            {
             before(grammarAccess.getCharaTypeAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:619:1: ( rule__CharaType__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:619:2: rule__CharaType__Alternatives
            {
            pushFollow(FOLLOW_rule__CharaType__Alternatives_in_ruleCharaType1247);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:631:1: ruleCharaSex : ( ( rule__CharaSex__Alternatives ) ) ;
    public final void ruleCharaSex() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:635:1: ( ( ( rule__CharaSex__Alternatives ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:636:1: ( ( rule__CharaSex__Alternatives ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:636:1: ( ( rule__CharaSex__Alternatives ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:637:1: ( rule__CharaSex__Alternatives )
            {
             before(grammarAccess.getCharaSexAccess().getAlternatives()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:638:1: ( rule__CharaSex__Alternatives )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:638:2: rule__CharaSex__Alternatives
            {
            pushFollow(FOLLOW_rule__CharaSex__Alternatives_in_ruleCharaSex1283);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:649:1: rule__DefaultAttribute__Alternatives : ( ( 'full name' ) | ( 'age' ) | ( 'description' ) | ( 'sex' ) | ( 'type' ) );
    public final void rule__DefaultAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:653:1: ( ( 'full name' ) | ( 'age' ) | ( 'description' ) | ( 'sex' ) | ( 'type' ) )
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
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:654:1: ( 'full name' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:654:1: ( 'full name' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:655:1: 'full name'
                    {
                     before(grammarAccess.getDefaultAttributeAccess().getFullNameKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__DefaultAttribute__Alternatives1319); 
                     after(grammarAccess.getDefaultAttributeAccess().getFullNameKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:662:6: ( 'age' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:662:6: ( 'age' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:663:1: 'age'
                    {
                     before(grammarAccess.getDefaultAttributeAccess().getAgeKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__DefaultAttribute__Alternatives1339); 
                     after(grammarAccess.getDefaultAttributeAccess().getAgeKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:670:6: ( 'description' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:670:6: ( 'description' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:671:1: 'description'
                    {
                     before(grammarAccess.getDefaultAttributeAccess().getDescriptionKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__DefaultAttribute__Alternatives1359); 
                     after(grammarAccess.getDefaultAttributeAccess().getDescriptionKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:678:6: ( 'sex' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:678:6: ( 'sex' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:679:1: 'sex'
                    {
                     before(grammarAccess.getDefaultAttributeAccess().getSexKeyword_3()); 
                    match(input,15,FOLLOW_15_in_rule__DefaultAttribute__Alternatives1379); 
                     after(grammarAccess.getDefaultAttributeAccess().getSexKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:686:6: ( 'type' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:686:6: ( 'type' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:687:1: 'type'
                    {
                     before(grammarAccess.getDefaultAttributeAccess().getTypeKeyword_4()); 
                    match(input,16,FOLLOW_16_in_rule__DefaultAttribute__Alternatives1399); 
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


    // $ANTLR start "rule__CustomAttribute__Alternatives_3"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:699:1: rule__CustomAttribute__Alternatives_3 : ( ( ( rule__CustomAttribute__TypeAssignment_3_0 ) ) | ( ( rule__CustomAttribute__Group_3_1__0 ) ) );
    public final void rule__CustomAttribute__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:703:1: ( ( ( rule__CustomAttribute__TypeAssignment_3_0 ) ) | ( ( rule__CustomAttribute__Group_3_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=19 && LA2_0<=20)) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:704:1: ( ( rule__CustomAttribute__TypeAssignment_3_0 ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:704:1: ( ( rule__CustomAttribute__TypeAssignment_3_0 ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:705:1: ( rule__CustomAttribute__TypeAssignment_3_0 )
                    {
                     before(grammarAccess.getCustomAttributeAccess().getTypeAssignment_3_0()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:706:1: ( rule__CustomAttribute__TypeAssignment_3_0 )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:706:2: rule__CustomAttribute__TypeAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__CustomAttribute__TypeAssignment_3_0_in_rule__CustomAttribute__Alternatives_31433);
                    rule__CustomAttribute__TypeAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCustomAttributeAccess().getTypeAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:710:6: ( ( rule__CustomAttribute__Group_3_1__0 ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:710:6: ( ( rule__CustomAttribute__Group_3_1__0 ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:711:1: ( rule__CustomAttribute__Group_3_1__0 )
                    {
                     before(grammarAccess.getCustomAttributeAccess().getGroup_3_1()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:712:1: ( rule__CustomAttribute__Group_3_1__0 )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:712:2: rule__CustomAttribute__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__CustomAttribute__Group_3_1__0_in_rule__CustomAttribute__Alternatives_31451);
                    rule__CustomAttribute__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCustomAttributeAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__CustomAttribute__Alternatives_3"


    // $ANTLR start "rule__Required__Alternatives"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:721:1: rule__Required__Alternatives : ( ( '!' ) | ( 'required' ) );
    public final void rule__Required__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:725:1: ( ( '!' ) | ( 'required' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:726:1: ( '!' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:726:1: ( '!' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:727:1: '!'
                    {
                     before(grammarAccess.getRequiredAccess().getExclamationMarkKeyword_0()); 
                    match(input,17,FOLLOW_17_in_rule__Required__Alternatives1485); 
                     after(grammarAccess.getRequiredAccess().getExclamationMarkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:734:6: ( 'required' )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:734:6: ( 'required' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:735:1: 'required'
                    {
                     before(grammarAccess.getRequiredAccess().getRequiredKeyword_1()); 
                    match(input,18,FOLLOW_18_in_rule__Required__Alternatives1505); 
                     after(grammarAccess.getRequiredAccess().getRequiredKeyword_1()); 

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
    // $ANTLR end "rule__Required__Alternatives"


    // $ANTLR start "rule__EnumID__Alternatives"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:747:1: rule__EnumID__Alternatives : ( ( RULE_INT ) | ( RULE_ID ) );
    public final void rule__EnumID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:751:1: ( ( RULE_INT ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
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
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:752:1: ( RULE_INT )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:752:1: ( RULE_INT )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:753:1: RULE_INT
                    {
                     before(grammarAccess.getEnumIDAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumID__Alternatives1539); 
                     after(grammarAccess.getEnumIDAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:758:6: ( RULE_ID )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:758:6: ( RULE_ID )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:759:1: RULE_ID
                    {
                     before(grammarAccess.getEnumIDAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumID__Alternatives1556); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:769:1: rule__Property__Alternatives : ( ( ruleDefaultProperty ) | ( ruleCustomProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:773:1: ( ( ruleDefaultProperty ) | ( ruleCustomProperty ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=12 && LA5_0<=16)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:774:1: ( ruleDefaultProperty )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:774:1: ( ruleDefaultProperty )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:775:1: ruleDefaultProperty
                    {
                     before(grammarAccess.getPropertyAccess().getDefaultPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefaultProperty_in_rule__Property__Alternatives1588);
                    ruleDefaultProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getDefaultPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:780:6: ( ruleCustomProperty )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:780:6: ( ruleCustomProperty )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:781:1: ruleCustomProperty
                    {
                     before(grammarAccess.getPropertyAccess().getCustomPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCustomProperty_in_rule__Property__Alternatives1605);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:791:1: rule__DefaultProperty__Alternatives : ( ( ruleFullName ) | ( ruleDescription ) | ( ruleType ) | ( ruleAge ) | ( ruleSex ) );
    public final void rule__DefaultProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:795:1: ( ( ruleFullName ) | ( ruleDescription ) | ( ruleType ) | ( ruleAge ) | ( ruleSex ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 13:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:796:1: ( ruleFullName )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:796:1: ( ruleFullName )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:797:1: ruleFullName
                    {
                     before(grammarAccess.getDefaultPropertyAccess().getFullNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFullName_in_rule__DefaultProperty__Alternatives1637);
                    ruleFullName();

                    state._fsp--;

                     after(grammarAccess.getDefaultPropertyAccess().getFullNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:802:6: ( ruleDescription )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:802:6: ( ruleDescription )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:803:1: ruleDescription
                    {
                     before(grammarAccess.getDefaultPropertyAccess().getDescriptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDescription_in_rule__DefaultProperty__Alternatives1654);
                    ruleDescription();

                    state._fsp--;

                     after(grammarAccess.getDefaultPropertyAccess().getDescriptionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:808:6: ( ruleType )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:808:6: ( ruleType )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:809:1: ruleType
                    {
                     before(grammarAccess.getDefaultPropertyAccess().getTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleType_in_rule__DefaultProperty__Alternatives1671);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getDefaultPropertyAccess().getTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:814:6: ( ruleAge )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:814:6: ( ruleAge )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:815:1: ruleAge
                    {
                     before(grammarAccess.getDefaultPropertyAccess().getAgeParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleAge_in_rule__DefaultProperty__Alternatives1688);
                    ruleAge();

                    state._fsp--;

                     after(grammarAccess.getDefaultPropertyAccess().getAgeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:820:6: ( ruleSex )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:820:6: ( ruleSex )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:821:1: ruleSex
                    {
                     before(grammarAccess.getDefaultPropertyAccess().getSexParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleSex_in_rule__DefaultProperty__Alternatives1705);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:831:1: rule__CustomProperty__Alternatives_1 : ( ( ( rule__CustomProperty__StringValueAssignment_1_0 ) ) | ( ( rule__CustomProperty__IntValueAssignment_1_1 ) ) | ( ( rule__CustomProperty__Group_1_2__0 ) ) );
    public final void rule__CustomProperty__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:835:1: ( ( ( rule__CustomProperty__StringValueAssignment_1_0 ) ) | ( ( rule__CustomProperty__IntValueAssignment_1_1 ) ) | ( ( rule__CustomProperty__Group_1_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case 29:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:836:1: ( ( rule__CustomProperty__StringValueAssignment_1_0 ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:836:1: ( ( rule__CustomProperty__StringValueAssignment_1_0 ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:837:1: ( rule__CustomProperty__StringValueAssignment_1_0 )
                    {
                     before(grammarAccess.getCustomPropertyAccess().getStringValueAssignment_1_0()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:838:1: ( rule__CustomProperty__StringValueAssignment_1_0 )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:838:2: rule__CustomProperty__StringValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__CustomProperty__StringValueAssignment_1_0_in_rule__CustomProperty__Alternatives_11737);
                    rule__CustomProperty__StringValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCustomPropertyAccess().getStringValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:842:6: ( ( rule__CustomProperty__IntValueAssignment_1_1 ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:842:6: ( ( rule__CustomProperty__IntValueAssignment_1_1 ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:843:1: ( rule__CustomProperty__IntValueAssignment_1_1 )
                    {
                     before(grammarAccess.getCustomPropertyAccess().getIntValueAssignment_1_1()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:844:1: ( rule__CustomProperty__IntValueAssignment_1_1 )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:844:2: rule__CustomProperty__IntValueAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__CustomProperty__IntValueAssignment_1_1_in_rule__CustomProperty__Alternatives_11755);
                    rule__CustomProperty__IntValueAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCustomPropertyAccess().getIntValueAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:848:6: ( ( rule__CustomProperty__Group_1_2__0 ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:848:6: ( ( rule__CustomProperty__Group_1_2__0 ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:849:1: ( rule__CustomProperty__Group_1_2__0 )
                    {
                     before(grammarAccess.getCustomPropertyAccess().getGroup_1_2()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:850:1: ( rule__CustomProperty__Group_1_2__0 )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:850:2: rule__CustomProperty__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__CustomProperty__Group_1_2__0_in_rule__CustomProperty__Alternatives_11773);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:859:1: rule__AttributeType__Alternatives : ( ( ( 'NUMBER' ) ) | ( ( 'TEXT' ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:863:1: ( ( ( 'NUMBER' ) ) | ( ( 'TEXT' ) ) )
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
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:864:1: ( ( 'NUMBER' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:864:1: ( ( 'NUMBER' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:865:1: ( 'NUMBER' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNUMBEREnumLiteralDeclaration_0()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:866:1: ( 'NUMBER' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:866:3: 'NUMBER'
                    {
                    match(input,19,FOLLOW_19_in_rule__AttributeType__Alternatives1807); 

                    }

                     after(grammarAccess.getAttributeTypeAccess().getNUMBEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:871:6: ( ( 'TEXT' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:871:6: ( ( 'TEXT' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:872:1: ( 'TEXT' )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getTEXTEnumLiteralDeclaration_1()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:873:1: ( 'TEXT' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:873:3: 'TEXT'
                    {
                    match(input,20,FOLLOW_20_in_rule__AttributeType__Alternatives1828); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:883:1: rule__CharaType__Alternatives : ( ( ( 'PC' ) ) | ( ( 'NPC' ) ) );
    public final void rule__CharaType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:887:1: ( ( ( 'PC' ) ) | ( ( 'NPC' ) ) )
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
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:888:1: ( ( 'PC' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:888:1: ( ( 'PC' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:889:1: ( 'PC' )
                    {
                     before(grammarAccess.getCharaTypeAccess().getPCEnumLiteralDeclaration_0()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:890:1: ( 'PC' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:890:3: 'PC'
                    {
                    match(input,21,FOLLOW_21_in_rule__CharaType__Alternatives1864); 

                    }

                     after(grammarAccess.getCharaTypeAccess().getPCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:895:6: ( ( 'NPC' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:895:6: ( ( 'NPC' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:896:1: ( 'NPC' )
                    {
                     before(grammarAccess.getCharaTypeAccess().getNPCEnumLiteralDeclaration_1()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:897:1: ( 'NPC' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:897:3: 'NPC'
                    {
                    match(input,22,FOLLOW_22_in_rule__CharaType__Alternatives1885); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:907:1: rule__CharaSex__Alternatives : ( ( ( 'male' ) ) | ( ( 'female' ) ) );
    public final void rule__CharaSex__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:911:1: ( ( ( 'male' ) ) | ( ( 'female' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:912:1: ( ( 'male' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:912:1: ( ( 'male' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:913:1: ( 'male' )
                    {
                     before(grammarAccess.getCharaSexAccess().getMaleEnumLiteralDeclaration_0()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:914:1: ( 'male' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:914:3: 'male'
                    {
                    match(input,23,FOLLOW_23_in_rule__CharaSex__Alternatives1921); 

                    }

                     after(grammarAccess.getCharaSexAccess().getMaleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:919:6: ( ( 'female' ) )
                    {
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:919:6: ( ( 'female' ) )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:920:1: ( 'female' )
                    {
                     before(grammarAccess.getCharaSexAccess().getFemaleEnumLiteralDeclaration_1()); 
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:921:1: ( 'female' )
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:921:3: 'female'
                    {
                    match(input,24,FOLLOW_24_in_rule__CharaSex__Alternatives1942); 

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:933:1: rule__Characters__Group__0 : rule__Characters__Group__0__Impl rule__Characters__Group__1 ;
    public final void rule__Characters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:937:1: ( rule__Characters__Group__0__Impl rule__Characters__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:938:2: rule__Characters__Group__0__Impl rule__Characters__Group__1
            {
            pushFollow(FOLLOW_rule__Characters__Group__0__Impl_in_rule__Characters__Group__01975);
            rule__Characters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Characters__Group__1_in_rule__Characters__Group__01978);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:945:1: rule__Characters__Group__0__Impl : ( ( rule__Characters__ImportsAssignment_0 )* ) ;
    public final void rule__Characters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:949:1: ( ( ( rule__Characters__ImportsAssignment_0 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:950:1: ( ( rule__Characters__ImportsAssignment_0 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:950:1: ( ( rule__Characters__ImportsAssignment_0 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:951:1: ( rule__Characters__ImportsAssignment_0 )*
            {
             before(grammarAccess.getCharactersAccess().getImportsAssignment_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:952:1: ( rule__Characters__ImportsAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==25) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:952:2: rule__Characters__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Characters__ImportsAssignment_0_in_rule__Characters__Group__0__Impl2005);
            	    rule__Characters__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:962:1: rule__Characters__Group__1 : rule__Characters__Group__1__Impl rule__Characters__Group__2 ;
    public final void rule__Characters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:966:1: ( rule__Characters__Group__1__Impl rule__Characters__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:967:2: rule__Characters__Group__1__Impl rule__Characters__Group__2
            {
            pushFollow(FOLLOW_rule__Characters__Group__1__Impl_in_rule__Characters__Group__12036);
            rule__Characters__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Characters__Group__2_in_rule__Characters__Group__12039);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:974:1: rule__Characters__Group__1__Impl : ( ( rule__Characters__TemplatesAssignment_1 )* ) ;
    public final void rule__Characters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:978:1: ( ( ( rule__Characters__TemplatesAssignment_1 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:979:1: ( ( rule__Characters__TemplatesAssignment_1 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:979:1: ( ( rule__Characters__TemplatesAssignment_1 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:980:1: ( rule__Characters__TemplatesAssignment_1 )*
            {
             before(grammarAccess.getCharactersAccess().getTemplatesAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:981:1: ( rule__Characters__TemplatesAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:981:2: rule__Characters__TemplatesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Characters__TemplatesAssignment_1_in_rule__Characters__Group__1__Impl2066);
            	    rule__Characters__TemplatesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:991:1: rule__Characters__Group__2 : rule__Characters__Group__2__Impl rule__Characters__Group__3 ;
    public final void rule__Characters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:995:1: ( rule__Characters__Group__2__Impl rule__Characters__Group__3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:996:2: rule__Characters__Group__2__Impl rule__Characters__Group__3
            {
            pushFollow(FOLLOW_rule__Characters__Group__2__Impl_in_rule__Characters__Group__22097);
            rule__Characters__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Characters__Group__3_in_rule__Characters__Group__22100);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1003:1: rule__Characters__Group__2__Impl : ( ( rule__Characters__GlobalsAssignment_2 )? ) ;
    public final void rule__Characters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1007:1: ( ( ( rule__Characters__GlobalsAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1008:1: ( ( rule__Characters__GlobalsAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1008:1: ( ( rule__Characters__GlobalsAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1009:1: ( rule__Characters__GlobalsAssignment_2 )?
            {
             before(grammarAccess.getCharactersAccess().getGlobalsAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1010:1: ( rule__Characters__GlobalsAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1010:2: rule__Characters__GlobalsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Characters__GlobalsAssignment_2_in_rule__Characters__Group__2__Impl2127);
                    rule__Characters__GlobalsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharactersAccess().getGlobalsAssignment_2()); 

            }


            }

        }
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1020:1: rule__Characters__Group__3 : rule__Characters__Group__3__Impl ;
    public final void rule__Characters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1024:1: ( rule__Characters__Group__3__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1025:2: rule__Characters__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Characters__Group__3__Impl_in_rule__Characters__Group__32158);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1031:1: rule__Characters__Group__3__Impl : ( ( rule__Characters__CharactersAssignment_3 )* ) ;
    public final void rule__Characters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1035:1: ( ( ( rule__Characters__CharactersAssignment_3 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1036:1: ( ( rule__Characters__CharactersAssignment_3 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1036:1: ( ( rule__Characters__CharactersAssignment_3 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1037:1: ( rule__Characters__CharactersAssignment_3 )*
            {
             before(grammarAccess.getCharactersAccess().getCharactersAssignment_3()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1038:1: ( rule__Characters__CharactersAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1038:2: rule__Characters__CharactersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Characters__CharactersAssignment_3_in_rule__Characters__Group__3__Impl2185);
            	    rule__Characters__CharactersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1056:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1060:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1061:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02224);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02227);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1068:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1072:1: ( ( 'import' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1073:1: ( 'import' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1073:1: ( 'import' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1074:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Import__Group__0__Impl2255); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1087:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1091:1: ( rule__Import__Group__1__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1092:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12286);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1098:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1102:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1103:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1103:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1104:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1105:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1105:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2313);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1119:1: rule__Template__Group__0 : rule__Template__Group__0__Impl rule__Template__Group__1 ;
    public final void rule__Template__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1123:1: ( rule__Template__Group__0__Impl rule__Template__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1124:2: rule__Template__Group__0__Impl rule__Template__Group__1
            {
            pushFollow(FOLLOW_rule__Template__Group__0__Impl_in_rule__Template__Group__02347);
            rule__Template__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__1_in_rule__Template__Group__02350);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1131:1: rule__Template__Group__0__Impl : ( 'template' ) ;
    public final void rule__Template__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1135:1: ( ( 'template' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1136:1: ( 'template' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1136:1: ( 'template' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1137:1: 'template'
            {
             before(grammarAccess.getTemplateAccess().getTemplateKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Template__Group__0__Impl2378); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1150:1: rule__Template__Group__1 : rule__Template__Group__1__Impl rule__Template__Group__2 ;
    public final void rule__Template__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1154:1: ( rule__Template__Group__1__Impl rule__Template__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1155:2: rule__Template__Group__1__Impl rule__Template__Group__2
            {
            pushFollow(FOLLOW_rule__Template__Group__1__Impl_in_rule__Template__Group__12409);
            rule__Template__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__2_in_rule__Template__Group__12412);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1162:1: rule__Template__Group__1__Impl : ( ( rule__Template__NameAssignment_1 ) ) ;
    public final void rule__Template__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1166:1: ( ( ( rule__Template__NameAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1167:1: ( ( rule__Template__NameAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1167:1: ( ( rule__Template__NameAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1168:1: ( rule__Template__NameAssignment_1 )
            {
             before(grammarAccess.getTemplateAccess().getNameAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1169:1: ( rule__Template__NameAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1169:2: rule__Template__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Template__NameAssignment_1_in_rule__Template__Group__1__Impl2439);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1179:1: rule__Template__Group__2 : rule__Template__Group__2__Impl rule__Template__Group__3 ;
    public final void rule__Template__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1183:1: ( rule__Template__Group__2__Impl rule__Template__Group__3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1184:2: rule__Template__Group__2__Impl rule__Template__Group__3
            {
            pushFollow(FOLLOW_rule__Template__Group__2__Impl_in_rule__Template__Group__22469);
            rule__Template__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__3_in_rule__Template__Group__22472);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1191:1: rule__Template__Group__2__Impl : ( ( rule__Template__DefaultsAssignment_2 )* ) ;
    public final void rule__Template__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1195:1: ( ( ( rule__Template__DefaultsAssignment_2 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1196:1: ( ( rule__Template__DefaultsAssignment_2 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1196:1: ( ( rule__Template__DefaultsAssignment_2 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1197:1: ( rule__Template__DefaultsAssignment_2 )*
            {
             before(grammarAccess.getTemplateAccess().getDefaultsAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1198:1: ( rule__Template__DefaultsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=12 && LA15_0<=16)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1198:2: rule__Template__DefaultsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Template__DefaultsAssignment_2_in_rule__Template__Group__2__Impl2499);
            	    rule__Template__DefaultsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1208:1: rule__Template__Group__3 : rule__Template__Group__3__Impl rule__Template__Group__4 ;
    public final void rule__Template__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1212:1: ( rule__Template__Group__3__Impl rule__Template__Group__4 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1213:2: rule__Template__Group__3__Impl rule__Template__Group__4
            {
            pushFollow(FOLLOW_rule__Template__Group__3__Impl_in_rule__Template__Group__32530);
            rule__Template__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__4_in_rule__Template__Group__32533);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1220:1: rule__Template__Group__3__Impl : ( ( rule__Template__CustomsAssignment_3 ) ) ;
    public final void rule__Template__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1224:1: ( ( ( rule__Template__CustomsAssignment_3 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1225:1: ( ( rule__Template__CustomsAssignment_3 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1225:1: ( ( rule__Template__CustomsAssignment_3 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1226:1: ( rule__Template__CustomsAssignment_3 )
            {
             before(grammarAccess.getTemplateAccess().getCustomsAssignment_3()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1227:1: ( rule__Template__CustomsAssignment_3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1227:2: rule__Template__CustomsAssignment_3
            {
            pushFollow(FOLLOW_rule__Template__CustomsAssignment_3_in_rule__Template__Group__3__Impl2560);
            rule__Template__CustomsAssignment_3();

            state._fsp--;


            }

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1237:1: rule__Template__Group__4 : rule__Template__Group__4__Impl rule__Template__Group__5 ;
    public final void rule__Template__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1241:1: ( rule__Template__Group__4__Impl rule__Template__Group__5 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1242:2: rule__Template__Group__4__Impl rule__Template__Group__5
            {
            pushFollow(FOLLOW_rule__Template__Group__4__Impl_in_rule__Template__Group__42590);
            rule__Template__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__5_in_rule__Template__Group__42593);
            rule__Template__Group__5();

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1249:1: rule__Template__Group__4__Impl : ( ( rule__Template__CustomsAssignment_4 )* ) ;
    public final void rule__Template__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1253:1: ( ( ( rule__Template__CustomsAssignment_4 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1254:1: ( ( rule__Template__CustomsAssignment_4 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1254:1: ( ( rule__Template__CustomsAssignment_4 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1255:1: ( rule__Template__CustomsAssignment_4 )*
            {
             before(grammarAccess.getTemplateAccess().getCustomsAssignment_4()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1256:1: ( rule__Template__CustomsAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=17 && LA16_0<=18)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1256:2: rule__Template__CustomsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Template__CustomsAssignment_4_in_rule__Template__Group__4__Impl2620);
            	    rule__Template__CustomsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getTemplateAccess().getCustomsAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Template__Group__5"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1266:1: rule__Template__Group__5 : rule__Template__Group__5__Impl ;
    public final void rule__Template__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1270:1: ( rule__Template__Group__5__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1271:2: rule__Template__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Template__Group__5__Impl_in_rule__Template__Group__52651);
            rule__Template__Group__5__Impl();

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
    // $ANTLR end "rule__Template__Group__5"


    // $ANTLR start "rule__Template__Group__5__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1277:1: rule__Template__Group__5__Impl : ( 'end' ) ;
    public final void rule__Template__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1281:1: ( ( 'end' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1282:1: ( 'end' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1282:1: ( 'end' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1283:1: 'end'
            {
             before(grammarAccess.getTemplateAccess().getEndKeyword_5()); 
            match(input,27,FOLLOW_27_in_rule__Template__Group__5__Impl2679); 
             after(grammarAccess.getTemplateAccess().getEndKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__5__Impl"


    // $ANTLR start "rule__CustomAttribute__Group__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1308:1: rule__CustomAttribute__Group__0 : rule__CustomAttribute__Group__0__Impl rule__CustomAttribute__Group__1 ;
    public final void rule__CustomAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1312:1: ( rule__CustomAttribute__Group__0__Impl rule__CustomAttribute__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1313:2: rule__CustomAttribute__Group__0__Impl rule__CustomAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group__0__Impl_in_rule__CustomAttribute__Group__02722);
            rule__CustomAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group__1_in_rule__CustomAttribute__Group__02725);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1320:1: rule__CustomAttribute__Group__0__Impl : ( ( rule__CustomAttribute__RequiredAssignment_0 )? ) ;
    public final void rule__CustomAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1324:1: ( ( ( rule__CustomAttribute__RequiredAssignment_0 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1325:1: ( ( rule__CustomAttribute__RequiredAssignment_0 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1325:1: ( ( rule__CustomAttribute__RequiredAssignment_0 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1326:1: ( rule__CustomAttribute__RequiredAssignment_0 )?
            {
             before(grammarAccess.getCustomAttributeAccess().getRequiredAssignment_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1327:1: ( rule__CustomAttribute__RequiredAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=17 && LA17_0<=18)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1327:2: rule__CustomAttribute__RequiredAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CustomAttribute__RequiredAssignment_0_in_rule__CustomAttribute__Group__0__Impl2752);
                    rule__CustomAttribute__RequiredAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomAttributeAccess().getRequiredAssignment_0()); 

            }


            }

        }
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1337:1: rule__CustomAttribute__Group__1 : rule__CustomAttribute__Group__1__Impl rule__CustomAttribute__Group__2 ;
    public final void rule__CustomAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1341:1: ( rule__CustomAttribute__Group__1__Impl rule__CustomAttribute__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1342:2: rule__CustomAttribute__Group__1__Impl rule__CustomAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group__1__Impl_in_rule__CustomAttribute__Group__12783);
            rule__CustomAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group__2_in_rule__CustomAttribute__Group__12786);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1349:1: rule__CustomAttribute__Group__1__Impl : ( ( rule__CustomAttribute__CaNameAssignment_1 ) ) ;
    public final void rule__CustomAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1353:1: ( ( ( rule__CustomAttribute__CaNameAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1354:1: ( ( rule__CustomAttribute__CaNameAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1354:1: ( ( rule__CustomAttribute__CaNameAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1355:1: ( rule__CustomAttribute__CaNameAssignment_1 )
            {
             before(grammarAccess.getCustomAttributeAccess().getCaNameAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1356:1: ( rule__CustomAttribute__CaNameAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1356:2: rule__CustomAttribute__CaNameAssignment_1
            {
            pushFollow(FOLLOW_rule__CustomAttribute__CaNameAssignment_1_in_rule__CustomAttribute__Group__1__Impl2813);
            rule__CustomAttribute__CaNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomAttributeAccess().getCaNameAssignment_1()); 

            }


            }

        }
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1366:1: rule__CustomAttribute__Group__2 : rule__CustomAttribute__Group__2__Impl rule__CustomAttribute__Group__3 ;
    public final void rule__CustomAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1370:1: ( rule__CustomAttribute__Group__2__Impl rule__CustomAttribute__Group__3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1371:2: rule__CustomAttribute__Group__2__Impl rule__CustomAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group__2__Impl_in_rule__CustomAttribute__Group__22843);
            rule__CustomAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group__3_in_rule__CustomAttribute__Group__22846);
            rule__CustomAttribute__Group__3();

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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1378:1: rule__CustomAttribute__Group__2__Impl : ( 'as' ) ;
    public final void rule__CustomAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1382:1: ( ( 'as' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1383:1: ( 'as' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1383:1: ( 'as' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1384:1: 'as'
            {
             before(grammarAccess.getCustomAttributeAccess().getAsKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__CustomAttribute__Group__2__Impl2874); 
             after(grammarAccess.getCustomAttributeAccess().getAsKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__CustomAttribute__Group__3"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1397:1: rule__CustomAttribute__Group__3 : rule__CustomAttribute__Group__3__Impl ;
    public final void rule__CustomAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1401:1: ( rule__CustomAttribute__Group__3__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1402:2: rule__CustomAttribute__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group__3__Impl_in_rule__CustomAttribute__Group__32905);
            rule__CustomAttribute__Group__3__Impl();

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
    // $ANTLR end "rule__CustomAttribute__Group__3"


    // $ANTLR start "rule__CustomAttribute__Group__3__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1408:1: rule__CustomAttribute__Group__3__Impl : ( ( rule__CustomAttribute__Alternatives_3 ) ) ;
    public final void rule__CustomAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1412:1: ( ( ( rule__CustomAttribute__Alternatives_3 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1413:1: ( ( rule__CustomAttribute__Alternatives_3 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1413:1: ( ( rule__CustomAttribute__Alternatives_3 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1414:1: ( rule__CustomAttribute__Alternatives_3 )
            {
             before(grammarAccess.getCustomAttributeAccess().getAlternatives_3()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1415:1: ( rule__CustomAttribute__Alternatives_3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1415:2: rule__CustomAttribute__Alternatives_3
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Alternatives_3_in_rule__CustomAttribute__Group__3__Impl2932);
            rule__CustomAttribute__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getCustomAttributeAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttribute__Group__3__Impl"


    // $ANTLR start "rule__CustomAttribute__Group_3_1__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1433:1: rule__CustomAttribute__Group_3_1__0 : rule__CustomAttribute__Group_3_1__0__Impl rule__CustomAttribute__Group_3_1__1 ;
    public final void rule__CustomAttribute__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1437:1: ( rule__CustomAttribute__Group_3_1__0__Impl rule__CustomAttribute__Group_3_1__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1438:2: rule__CustomAttribute__Group_3_1__0__Impl rule__CustomAttribute__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_3_1__0__Impl_in_rule__CustomAttribute__Group_3_1__02970);
            rule__CustomAttribute__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group_3_1__1_in_rule__CustomAttribute__Group_3_1__02973);
            rule__CustomAttribute__Group_3_1__1();

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
    // $ANTLR end "rule__CustomAttribute__Group_3_1__0"


    // $ANTLR start "rule__CustomAttribute__Group_3_1__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1445:1: rule__CustomAttribute__Group_3_1__0__Impl : ( '(' ) ;
    public final void rule__CustomAttribute__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1449:1: ( ( '(' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1450:1: ( '(' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1450:1: ( '(' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1451:1: '('
            {
             before(grammarAccess.getCustomAttributeAccess().getLeftParenthesisKeyword_3_1_0()); 
            match(input,29,FOLLOW_29_in_rule__CustomAttribute__Group_3_1__0__Impl3001); 
             after(grammarAccess.getCustomAttributeAccess().getLeftParenthesisKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttribute__Group_3_1__0__Impl"


    // $ANTLR start "rule__CustomAttribute__Group_3_1__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1464:1: rule__CustomAttribute__Group_3_1__1 : rule__CustomAttribute__Group_3_1__1__Impl rule__CustomAttribute__Group_3_1__2 ;
    public final void rule__CustomAttribute__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1468:1: ( rule__CustomAttribute__Group_3_1__1__Impl rule__CustomAttribute__Group_3_1__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1469:2: rule__CustomAttribute__Group_3_1__1__Impl rule__CustomAttribute__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_3_1__1__Impl_in_rule__CustomAttribute__Group_3_1__13032);
            rule__CustomAttribute__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group_3_1__2_in_rule__CustomAttribute__Group_3_1__13035);
            rule__CustomAttribute__Group_3_1__2();

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
    // $ANTLR end "rule__CustomAttribute__Group_3_1__1"


    // $ANTLR start "rule__CustomAttribute__Group_3_1__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1476:1: rule__CustomAttribute__Group_3_1__1__Impl : ( ( rule__CustomAttribute__EnumValuesAssignment_3_1_1 ) ) ;
    public final void rule__CustomAttribute__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1480:1: ( ( ( rule__CustomAttribute__EnumValuesAssignment_3_1_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1481:1: ( ( rule__CustomAttribute__EnumValuesAssignment_3_1_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1481:1: ( ( rule__CustomAttribute__EnumValuesAssignment_3_1_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1482:1: ( rule__CustomAttribute__EnumValuesAssignment_3_1_1 )
            {
             before(grammarAccess.getCustomAttributeAccess().getEnumValuesAssignment_3_1_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1483:1: ( rule__CustomAttribute__EnumValuesAssignment_3_1_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1483:2: rule__CustomAttribute__EnumValuesAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__CustomAttribute__EnumValuesAssignment_3_1_1_in_rule__CustomAttribute__Group_3_1__1__Impl3062);
            rule__CustomAttribute__EnumValuesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomAttributeAccess().getEnumValuesAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttribute__Group_3_1__1__Impl"


    // $ANTLR start "rule__CustomAttribute__Group_3_1__2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1493:1: rule__CustomAttribute__Group_3_1__2 : rule__CustomAttribute__Group_3_1__2__Impl rule__CustomAttribute__Group_3_1__3 ;
    public final void rule__CustomAttribute__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1497:1: ( rule__CustomAttribute__Group_3_1__2__Impl rule__CustomAttribute__Group_3_1__3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1498:2: rule__CustomAttribute__Group_3_1__2__Impl rule__CustomAttribute__Group_3_1__3
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_3_1__2__Impl_in_rule__CustomAttribute__Group_3_1__23092);
            rule__CustomAttribute__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group_3_1__3_in_rule__CustomAttribute__Group_3_1__23095);
            rule__CustomAttribute__Group_3_1__3();

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
    // $ANTLR end "rule__CustomAttribute__Group_3_1__2"


    // $ANTLR start "rule__CustomAttribute__Group_3_1__2__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1505:1: rule__CustomAttribute__Group_3_1__2__Impl : ( ( rule__CustomAttribute__Group_3_1_2__0 )* ) ;
    public final void rule__CustomAttribute__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1509:1: ( ( ( rule__CustomAttribute__Group_3_1_2__0 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1510:1: ( ( rule__CustomAttribute__Group_3_1_2__0 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1510:1: ( ( rule__CustomAttribute__Group_3_1_2__0 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1511:1: ( rule__CustomAttribute__Group_3_1_2__0 )*
            {
             before(grammarAccess.getCustomAttributeAccess().getGroup_3_1_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1512:1: ( rule__CustomAttribute__Group_3_1_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1512:2: rule__CustomAttribute__Group_3_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__CustomAttribute__Group_3_1_2__0_in_rule__CustomAttribute__Group_3_1__2__Impl3122);
            	    rule__CustomAttribute__Group_3_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getCustomAttributeAccess().getGroup_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttribute__Group_3_1__2__Impl"


    // $ANTLR start "rule__CustomAttribute__Group_3_1__3"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1522:1: rule__CustomAttribute__Group_3_1__3 : rule__CustomAttribute__Group_3_1__3__Impl ;
    public final void rule__CustomAttribute__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1526:1: ( rule__CustomAttribute__Group_3_1__3__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1527:2: rule__CustomAttribute__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_3_1__3__Impl_in_rule__CustomAttribute__Group_3_1__33153);
            rule__CustomAttribute__Group_3_1__3__Impl();

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
    // $ANTLR end "rule__CustomAttribute__Group_3_1__3"


    // $ANTLR start "rule__CustomAttribute__Group_3_1__3__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1533:1: rule__CustomAttribute__Group_3_1__3__Impl : ( ')' ) ;
    public final void rule__CustomAttribute__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1537:1: ( ( ')' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1538:1: ( ')' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1538:1: ( ')' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1539:1: ')'
            {
             before(grammarAccess.getCustomAttributeAccess().getRightParenthesisKeyword_3_1_3()); 
            match(input,30,FOLLOW_30_in_rule__CustomAttribute__Group_3_1__3__Impl3181); 
             after(grammarAccess.getCustomAttributeAccess().getRightParenthesisKeyword_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttribute__Group_3_1__3__Impl"


    // $ANTLR start "rule__CustomAttribute__Group_3_1_2__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1560:1: rule__CustomAttribute__Group_3_1_2__0 : rule__CustomAttribute__Group_3_1_2__0__Impl rule__CustomAttribute__Group_3_1_2__1 ;
    public final void rule__CustomAttribute__Group_3_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1564:1: ( rule__CustomAttribute__Group_3_1_2__0__Impl rule__CustomAttribute__Group_3_1_2__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1565:2: rule__CustomAttribute__Group_3_1_2__0__Impl rule__CustomAttribute__Group_3_1_2__1
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_3_1_2__0__Impl_in_rule__CustomAttribute__Group_3_1_2__03220);
            rule__CustomAttribute__Group_3_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomAttribute__Group_3_1_2__1_in_rule__CustomAttribute__Group_3_1_2__03223);
            rule__CustomAttribute__Group_3_1_2__1();

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
    // $ANTLR end "rule__CustomAttribute__Group_3_1_2__0"


    // $ANTLR start "rule__CustomAttribute__Group_3_1_2__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1572:1: rule__CustomAttribute__Group_3_1_2__0__Impl : ( ',' ) ;
    public final void rule__CustomAttribute__Group_3_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1576:1: ( ( ',' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1577:1: ( ',' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1577:1: ( ',' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1578:1: ','
            {
             before(grammarAccess.getCustomAttributeAccess().getCommaKeyword_3_1_2_0()); 
            match(input,31,FOLLOW_31_in_rule__CustomAttribute__Group_3_1_2__0__Impl3251); 
             after(grammarAccess.getCustomAttributeAccess().getCommaKeyword_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttribute__Group_3_1_2__0__Impl"


    // $ANTLR start "rule__CustomAttribute__Group_3_1_2__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1591:1: rule__CustomAttribute__Group_3_1_2__1 : rule__CustomAttribute__Group_3_1_2__1__Impl ;
    public final void rule__CustomAttribute__Group_3_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1595:1: ( rule__CustomAttribute__Group_3_1_2__1__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1596:2: rule__CustomAttribute__Group_3_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CustomAttribute__Group_3_1_2__1__Impl_in_rule__CustomAttribute__Group_3_1_2__13282);
            rule__CustomAttribute__Group_3_1_2__1__Impl();

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
    // $ANTLR end "rule__CustomAttribute__Group_3_1_2__1"


    // $ANTLR start "rule__CustomAttribute__Group_3_1_2__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1602:1: rule__CustomAttribute__Group_3_1_2__1__Impl : ( ( rule__CustomAttribute__EnumValuesAssignment_3_1_2_1 ) ) ;
    public final void rule__CustomAttribute__Group_3_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1606:1: ( ( ( rule__CustomAttribute__EnumValuesAssignment_3_1_2_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1607:1: ( ( rule__CustomAttribute__EnumValuesAssignment_3_1_2_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1607:1: ( ( rule__CustomAttribute__EnumValuesAssignment_3_1_2_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1608:1: ( rule__CustomAttribute__EnumValuesAssignment_3_1_2_1 )
            {
             before(grammarAccess.getCustomAttributeAccess().getEnumValuesAssignment_3_1_2_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1609:1: ( rule__CustomAttribute__EnumValuesAssignment_3_1_2_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1609:2: rule__CustomAttribute__EnumValuesAssignment_3_1_2_1
            {
            pushFollow(FOLLOW_rule__CustomAttribute__EnumValuesAssignment_3_1_2_1_in_rule__CustomAttribute__Group_3_1_2__1__Impl3309);
            rule__CustomAttribute__EnumValuesAssignment_3_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomAttributeAccess().getEnumValuesAssignment_3_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttribute__Group_3_1_2__1__Impl"


    // $ANTLR start "rule__Globals__Group__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1623:1: rule__Globals__Group__0 : rule__Globals__Group__0__Impl rule__Globals__Group__1 ;
    public final void rule__Globals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1627:1: ( rule__Globals__Group__0__Impl rule__Globals__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1628:2: rule__Globals__Group__0__Impl rule__Globals__Group__1
            {
            pushFollow(FOLLOW_rule__Globals__Group__0__Impl_in_rule__Globals__Group__03343);
            rule__Globals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Globals__Group__1_in_rule__Globals__Group__03346);
            rule__Globals__Group__1();

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
    // $ANTLR end "rule__Globals__Group__0"


    // $ANTLR start "rule__Globals__Group__0__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1635:1: rule__Globals__Group__0__Impl : ( 'global' ) ;
    public final void rule__Globals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1639:1: ( ( 'global' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1640:1: ( 'global' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1640:1: ( 'global' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1641:1: 'global'
            {
             before(grammarAccess.getGlobalsAccess().getGlobalKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Globals__Group__0__Impl3374); 
             after(grammarAccess.getGlobalsAccess().getGlobalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Globals__Group__0__Impl"


    // $ANTLR start "rule__Globals__Group__1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1654:1: rule__Globals__Group__1 : rule__Globals__Group__1__Impl rule__Globals__Group__2 ;
    public final void rule__Globals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1658:1: ( rule__Globals__Group__1__Impl rule__Globals__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1659:2: rule__Globals__Group__1__Impl rule__Globals__Group__2
            {
            pushFollow(FOLLOW_rule__Globals__Group__1__Impl_in_rule__Globals__Group__13405);
            rule__Globals__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Globals__Group__2_in_rule__Globals__Group__13408);
            rule__Globals__Group__2();

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
    // $ANTLR end "rule__Globals__Group__1"


    // $ANTLR start "rule__Globals__Group__1__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1666:1: rule__Globals__Group__1__Impl : ( 'attributes' ) ;
    public final void rule__Globals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1670:1: ( ( 'attributes' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1671:1: ( 'attributes' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1671:1: ( 'attributes' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1672:1: 'attributes'
            {
             before(grammarAccess.getGlobalsAccess().getAttributesKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Globals__Group__1__Impl3436); 
             after(grammarAccess.getGlobalsAccess().getAttributesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Globals__Group__1__Impl"


    // $ANTLR start "rule__Globals__Group__2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1685:1: rule__Globals__Group__2 : rule__Globals__Group__2__Impl rule__Globals__Group__3 ;
    public final void rule__Globals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1689:1: ( rule__Globals__Group__2__Impl rule__Globals__Group__3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1690:2: rule__Globals__Group__2__Impl rule__Globals__Group__3
            {
            pushFollow(FOLLOW_rule__Globals__Group__2__Impl_in_rule__Globals__Group__23467);
            rule__Globals__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Globals__Group__3_in_rule__Globals__Group__23470);
            rule__Globals__Group__3();

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
    // $ANTLR end "rule__Globals__Group__2"


    // $ANTLR start "rule__Globals__Group__2__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1697:1: rule__Globals__Group__2__Impl : ( ( rule__Globals__CustomsAssignment_2 ) ) ;
    public final void rule__Globals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1701:1: ( ( ( rule__Globals__CustomsAssignment_2 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1702:1: ( ( rule__Globals__CustomsAssignment_2 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1702:1: ( ( rule__Globals__CustomsAssignment_2 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1703:1: ( rule__Globals__CustomsAssignment_2 )
            {
             before(grammarAccess.getGlobalsAccess().getCustomsAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1704:1: ( rule__Globals__CustomsAssignment_2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1704:2: rule__Globals__CustomsAssignment_2
            {
            pushFollow(FOLLOW_rule__Globals__CustomsAssignment_2_in_rule__Globals__Group__2__Impl3497);
            rule__Globals__CustomsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalsAccess().getCustomsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Globals__Group__2__Impl"


    // $ANTLR start "rule__Globals__Group__3"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1714:1: rule__Globals__Group__3 : rule__Globals__Group__3__Impl rule__Globals__Group__4 ;
    public final void rule__Globals__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1718:1: ( rule__Globals__Group__3__Impl rule__Globals__Group__4 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1719:2: rule__Globals__Group__3__Impl rule__Globals__Group__4
            {
            pushFollow(FOLLOW_rule__Globals__Group__3__Impl_in_rule__Globals__Group__33527);
            rule__Globals__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Globals__Group__4_in_rule__Globals__Group__33530);
            rule__Globals__Group__4();

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
    // $ANTLR end "rule__Globals__Group__3"


    // $ANTLR start "rule__Globals__Group__3__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1726:1: rule__Globals__Group__3__Impl : ( ( rule__Globals__CustomsAssignment_3 )* ) ;
    public final void rule__Globals__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1730:1: ( ( ( rule__Globals__CustomsAssignment_3 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1731:1: ( ( rule__Globals__CustomsAssignment_3 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1731:1: ( ( rule__Globals__CustomsAssignment_3 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1732:1: ( rule__Globals__CustomsAssignment_3 )*
            {
             before(grammarAccess.getGlobalsAccess().getCustomsAssignment_3()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1733:1: ( rule__Globals__CustomsAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||(LA19_0>=17 && LA19_0<=18)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1733:2: rule__Globals__CustomsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Globals__CustomsAssignment_3_in_rule__Globals__Group__3__Impl3557);
            	    rule__Globals__CustomsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getGlobalsAccess().getCustomsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Globals__Group__3__Impl"


    // $ANTLR start "rule__Globals__Group__4"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1743:1: rule__Globals__Group__4 : rule__Globals__Group__4__Impl ;
    public final void rule__Globals__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1747:1: ( rule__Globals__Group__4__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1748:2: rule__Globals__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Globals__Group__4__Impl_in_rule__Globals__Group__43588);
            rule__Globals__Group__4__Impl();

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
    // $ANTLR end "rule__Globals__Group__4"


    // $ANTLR start "rule__Globals__Group__4__Impl"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1754:1: rule__Globals__Group__4__Impl : ( 'end' ) ;
    public final void rule__Globals__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1758:1: ( ( 'end' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1759:1: ( 'end' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1759:1: ( 'end' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1760:1: 'end'
            {
             before(grammarAccess.getGlobalsAccess().getEndKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Globals__Group__4__Impl3616); 
             after(grammarAccess.getGlobalsAccess().getEndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Globals__Group__4__Impl"


    // $ANTLR start "rule__Character__Group__0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1783:1: rule__Character__Group__0 : rule__Character__Group__0__Impl rule__Character__Group__1 ;
    public final void rule__Character__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1787:1: ( rule__Character__Group__0__Impl rule__Character__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1788:2: rule__Character__Group__0__Impl rule__Character__Group__1
            {
            pushFollow(FOLLOW_rule__Character__Group__0__Impl_in_rule__Character__Group__03657);
            rule__Character__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__1_in_rule__Character__Group__03660);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1795:1: rule__Character__Group__0__Impl : ( 'character' ) ;
    public final void rule__Character__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1799:1: ( ( 'character' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1800:1: ( 'character' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1800:1: ( 'character' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1801:1: 'character'
            {
             before(grammarAccess.getCharacterAccess().getCharacterKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Character__Group__0__Impl3688); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1814:1: rule__Character__Group__1 : rule__Character__Group__1__Impl rule__Character__Group__2 ;
    public final void rule__Character__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1818:1: ( rule__Character__Group__1__Impl rule__Character__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1819:2: rule__Character__Group__1__Impl rule__Character__Group__2
            {
            pushFollow(FOLLOW_rule__Character__Group__1__Impl_in_rule__Character__Group__13719);
            rule__Character__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__2_in_rule__Character__Group__13722);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1826:1: rule__Character__Group__1__Impl : ( ( rule__Character__NameAssignment_1 ) ) ;
    public final void rule__Character__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1830:1: ( ( ( rule__Character__NameAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1831:1: ( ( rule__Character__NameAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1831:1: ( ( rule__Character__NameAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1832:1: ( rule__Character__NameAssignment_1 )
            {
             before(grammarAccess.getCharacterAccess().getNameAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1833:1: ( rule__Character__NameAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1833:2: rule__Character__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Character__NameAssignment_1_in_rule__Character__Group__1__Impl3749);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1843:1: rule__Character__Group__2 : rule__Character__Group__2__Impl rule__Character__Group__3 ;
    public final void rule__Character__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1847:1: ( rule__Character__Group__2__Impl rule__Character__Group__3 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1848:2: rule__Character__Group__2__Impl rule__Character__Group__3
            {
            pushFollow(FOLLOW_rule__Character__Group__2__Impl_in_rule__Character__Group__23779);
            rule__Character__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__3_in_rule__Character__Group__23782);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1855:1: rule__Character__Group__2__Impl : ( ( rule__Character__Group_2__0 )? ) ;
    public final void rule__Character__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1859:1: ( ( ( rule__Character__Group_2__0 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1860:1: ( ( rule__Character__Group_2__0 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1860:1: ( ( rule__Character__Group_2__0 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1861:1: ( rule__Character__Group_2__0 )?
            {
             before(grammarAccess.getCharacterAccess().getGroup_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1862:1: ( rule__Character__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1862:2: rule__Character__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Character__Group_2__0_in_rule__Character__Group__2__Impl3809);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1872:1: rule__Character__Group__3 : rule__Character__Group__3__Impl rule__Character__Group__4 ;
    public final void rule__Character__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1876:1: ( rule__Character__Group__3__Impl rule__Character__Group__4 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1877:2: rule__Character__Group__3__Impl rule__Character__Group__4
            {
            pushFollow(FOLLOW_rule__Character__Group__3__Impl_in_rule__Character__Group__33840);
            rule__Character__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group__4_in_rule__Character__Group__33843);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1884:1: rule__Character__Group__3__Impl : ( ( rule__Character__PropertiesAssignment_3 )* ) ;
    public final void rule__Character__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1888:1: ( ( ( rule__Character__PropertiesAssignment_3 )* ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1889:1: ( ( rule__Character__PropertiesAssignment_3 )* )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1889:1: ( ( rule__Character__PropertiesAssignment_3 )* )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1890:1: ( rule__Character__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getCharacterAccess().getPropertiesAssignment_3()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1891:1: ( rule__Character__PropertiesAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=12 && LA21_0<=16)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1891:2: rule__Character__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Character__PropertiesAssignment_3_in_rule__Character__Group__3__Impl3870);
            	    rule__Character__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1901:1: rule__Character__Group__4 : rule__Character__Group__4__Impl ;
    public final void rule__Character__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1905:1: ( rule__Character__Group__4__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1906:2: rule__Character__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Character__Group__4__Impl_in_rule__Character__Group__43901);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1912:1: rule__Character__Group__4__Impl : ( 'end' ) ;
    public final void rule__Character__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1916:1: ( ( 'end' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1917:1: ( 'end' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1917:1: ( 'end' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1918:1: 'end'
            {
             before(grammarAccess.getCharacterAccess().getEndKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Character__Group__4__Impl3929); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1941:1: rule__Character__Group_2__0 : rule__Character__Group_2__0__Impl rule__Character__Group_2__1 ;
    public final void rule__Character__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1945:1: ( rule__Character__Group_2__0__Impl rule__Character__Group_2__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1946:2: rule__Character__Group_2__0__Impl rule__Character__Group_2__1
            {
            pushFollow(FOLLOW_rule__Character__Group_2__0__Impl_in_rule__Character__Group_2__03970);
            rule__Character__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Character__Group_2__1_in_rule__Character__Group_2__03973);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1953:1: rule__Character__Group_2__0__Impl : ( 'uses' ) ;
    public final void rule__Character__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1957:1: ( ( 'uses' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1958:1: ( 'uses' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1958:1: ( 'uses' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1959:1: 'uses'
            {
             before(grammarAccess.getCharacterAccess().getUsesKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__Character__Group_2__0__Impl4001); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1972:1: rule__Character__Group_2__1 : rule__Character__Group_2__1__Impl ;
    public final void rule__Character__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1976:1: ( rule__Character__Group_2__1__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1977:2: rule__Character__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Character__Group_2__1__Impl_in_rule__Character__Group_2__14032);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1983:1: rule__Character__Group_2__1__Impl : ( ( rule__Character__TemplateAssignment_2_1 ) ) ;
    public final void rule__Character__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1987:1: ( ( ( rule__Character__TemplateAssignment_2_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1988:1: ( ( rule__Character__TemplateAssignment_2_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1988:1: ( ( rule__Character__TemplateAssignment_2_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1989:1: ( rule__Character__TemplateAssignment_2_1 )
            {
             before(grammarAccess.getCharacterAccess().getTemplateAssignment_2_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1990:1: ( rule__Character__TemplateAssignment_2_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:1990:2: rule__Character__TemplateAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Character__TemplateAssignment_2_1_in_rule__Character__Group_2__1__Impl4059);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2004:1: rule__FullName__Group__0 : rule__FullName__Group__0__Impl rule__FullName__Group__1 ;
    public final void rule__FullName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2008:1: ( rule__FullName__Group__0__Impl rule__FullName__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2009:2: rule__FullName__Group__0__Impl rule__FullName__Group__1
            {
            pushFollow(FOLLOW_rule__FullName__Group__0__Impl_in_rule__FullName__Group__04093);
            rule__FullName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FullName__Group__1_in_rule__FullName__Group__04096);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2016:1: rule__FullName__Group__0__Impl : ( 'full name' ) ;
    public final void rule__FullName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2020:1: ( ( 'full name' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2021:1: ( 'full name' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2021:1: ( 'full name' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2022:1: 'full name'
            {
             before(grammarAccess.getFullNameAccess().getFullNameKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__FullName__Group__0__Impl4124); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2035:1: rule__FullName__Group__1 : rule__FullName__Group__1__Impl rule__FullName__Group__2 ;
    public final void rule__FullName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2039:1: ( rule__FullName__Group__1__Impl rule__FullName__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2040:2: rule__FullName__Group__1__Impl rule__FullName__Group__2
            {
            pushFollow(FOLLOW_rule__FullName__Group__1__Impl_in_rule__FullName__Group__14155);
            rule__FullName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FullName__Group__2_in_rule__FullName__Group__14158);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2047:1: rule__FullName__Group__1__Impl : ( ( rule__FullName__ValueAssignment_1 ) ) ;
    public final void rule__FullName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2051:1: ( ( ( rule__FullName__ValueAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2052:1: ( ( rule__FullName__ValueAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2052:1: ( ( rule__FullName__ValueAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2053:1: ( rule__FullName__ValueAssignment_1 )
            {
             before(grammarAccess.getFullNameAccess().getValueAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2054:1: ( rule__FullName__ValueAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2054:2: rule__FullName__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__FullName__ValueAssignment_1_in_rule__FullName__Group__1__Impl4185);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2064:1: rule__FullName__Group__2 : rule__FullName__Group__2__Impl ;
    public final void rule__FullName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2068:1: ( rule__FullName__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2069:2: rule__FullName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FullName__Group__2__Impl_in_rule__FullName__Group__24215);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2075:1: rule__FullName__Group__2__Impl : ( ( rule__FullName__CommentAssignment_2 )? ) ;
    public final void rule__FullName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2079:1: ( ( ( rule__FullName__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2080:1: ( ( rule__FullName__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2080:1: ( ( rule__FullName__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2081:1: ( rule__FullName__CommentAssignment_2 )?
            {
             before(grammarAccess.getFullNameAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2082:1: ( rule__FullName__CommentAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_COMMENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2082:2: rule__FullName__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FullName__CommentAssignment_2_in_rule__FullName__Group__2__Impl4242);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2098:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2102:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2103:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_rule__Description__Group__0__Impl_in_rule__Description__Group__04279);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Description__Group__1_in_rule__Description__Group__04282);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2110:1: rule__Description__Group__0__Impl : ( 'description' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2114:1: ( ( 'description' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2115:1: ( 'description' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2115:1: ( 'description' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2116:1: 'description'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Description__Group__0__Impl4310); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2129:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2133:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2134:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_rule__Description__Group__1__Impl_in_rule__Description__Group__14341);
            rule__Description__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Description__Group__2_in_rule__Description__Group__14344);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2141:1: rule__Description__Group__1__Impl : ( ( rule__Description__ValueAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2145:1: ( ( ( rule__Description__ValueAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2146:1: ( ( rule__Description__ValueAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2146:1: ( ( rule__Description__ValueAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2147:1: ( rule__Description__ValueAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getValueAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2148:1: ( rule__Description__ValueAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2148:2: rule__Description__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Description__ValueAssignment_1_in_rule__Description__Group__1__Impl4371);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2158:1: rule__Description__Group__2 : rule__Description__Group__2__Impl ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2162:1: ( rule__Description__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2163:2: rule__Description__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Description__Group__2__Impl_in_rule__Description__Group__24401);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2169:1: rule__Description__Group__2__Impl : ( ( rule__Description__CommentAssignment_2 )? ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2173:1: ( ( ( rule__Description__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2174:1: ( ( rule__Description__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2174:1: ( ( rule__Description__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2175:1: ( rule__Description__CommentAssignment_2 )?
            {
             before(grammarAccess.getDescriptionAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2176:1: ( rule__Description__CommentAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_COMMENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2176:2: rule__Description__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Description__CommentAssignment_2_in_rule__Description__Group__2__Impl4428);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2192:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2196:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2197:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__04465);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__04468);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2204:1: rule__Type__Group__0__Impl : ( 'type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2208:1: ( ( 'type' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2209:1: ( 'type' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2209:1: ( 'type' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2210:1: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Type__Group__0__Impl4496); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2223:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2227:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2228:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__14527);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__2_in_rule__Type__Group__14530);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2235:1: rule__Type__Group__1__Impl : ( ( rule__Type__ValueAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2239:1: ( ( ( rule__Type__ValueAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2240:1: ( ( rule__Type__ValueAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2240:1: ( ( rule__Type__ValueAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2241:1: ( rule__Type__ValueAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getValueAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2242:1: ( rule__Type__ValueAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2242:2: rule__Type__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Type__ValueAssignment_1_in_rule__Type__Group__1__Impl4557);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2252:1: rule__Type__Group__2 : rule__Type__Group__2__Impl ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2256:1: ( rule__Type__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2257:2: rule__Type__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__24587);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2263:1: rule__Type__Group__2__Impl : ( ( rule__Type__CommentAssignment_2 )? ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2267:1: ( ( ( rule__Type__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2268:1: ( ( rule__Type__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2268:1: ( ( rule__Type__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2269:1: ( rule__Type__CommentAssignment_2 )?
            {
             before(grammarAccess.getTypeAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2270:1: ( rule__Type__CommentAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_COMMENT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2270:2: rule__Type__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Type__CommentAssignment_2_in_rule__Type__Group__2__Impl4614);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2286:1: rule__Age__Group__0 : rule__Age__Group__0__Impl rule__Age__Group__1 ;
    public final void rule__Age__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2290:1: ( rule__Age__Group__0__Impl rule__Age__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2291:2: rule__Age__Group__0__Impl rule__Age__Group__1
            {
            pushFollow(FOLLOW_rule__Age__Group__0__Impl_in_rule__Age__Group__04651);
            rule__Age__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Age__Group__1_in_rule__Age__Group__04654);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2298:1: rule__Age__Group__0__Impl : ( 'age' ) ;
    public final void rule__Age__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2302:1: ( ( 'age' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2303:1: ( 'age' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2303:1: ( 'age' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2304:1: 'age'
            {
             before(grammarAccess.getAgeAccess().getAgeKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Age__Group__0__Impl4682); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2317:1: rule__Age__Group__1 : rule__Age__Group__1__Impl rule__Age__Group__2 ;
    public final void rule__Age__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2321:1: ( rule__Age__Group__1__Impl rule__Age__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2322:2: rule__Age__Group__1__Impl rule__Age__Group__2
            {
            pushFollow(FOLLOW_rule__Age__Group__1__Impl_in_rule__Age__Group__14713);
            rule__Age__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Age__Group__2_in_rule__Age__Group__14716);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2329:1: rule__Age__Group__1__Impl : ( ( rule__Age__ValueAssignment_1 ) ) ;
    public final void rule__Age__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2333:1: ( ( ( rule__Age__ValueAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2334:1: ( ( rule__Age__ValueAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2334:1: ( ( rule__Age__ValueAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2335:1: ( rule__Age__ValueAssignment_1 )
            {
             before(grammarAccess.getAgeAccess().getValueAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2336:1: ( rule__Age__ValueAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2336:2: rule__Age__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Age__ValueAssignment_1_in_rule__Age__Group__1__Impl4743);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2346:1: rule__Age__Group__2 : rule__Age__Group__2__Impl ;
    public final void rule__Age__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2350:1: ( rule__Age__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2351:2: rule__Age__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Age__Group__2__Impl_in_rule__Age__Group__24773);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2357:1: rule__Age__Group__2__Impl : ( ( rule__Age__CommentAssignment_2 )? ) ;
    public final void rule__Age__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2361:1: ( ( ( rule__Age__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2362:1: ( ( rule__Age__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2362:1: ( ( rule__Age__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2363:1: ( rule__Age__CommentAssignment_2 )?
            {
             before(grammarAccess.getAgeAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2364:1: ( rule__Age__CommentAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_COMMENT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2364:2: rule__Age__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Age__CommentAssignment_2_in_rule__Age__Group__2__Impl4800);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2380:1: rule__Sex__Group__0 : rule__Sex__Group__0__Impl rule__Sex__Group__1 ;
    public final void rule__Sex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2384:1: ( rule__Sex__Group__0__Impl rule__Sex__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2385:2: rule__Sex__Group__0__Impl rule__Sex__Group__1
            {
            pushFollow(FOLLOW_rule__Sex__Group__0__Impl_in_rule__Sex__Group__04837);
            rule__Sex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sex__Group__1_in_rule__Sex__Group__04840);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2392:1: rule__Sex__Group__0__Impl : ( 'sex' ) ;
    public final void rule__Sex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2396:1: ( ( 'sex' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2397:1: ( 'sex' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2397:1: ( 'sex' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2398:1: 'sex'
            {
             before(grammarAccess.getSexAccess().getSexKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Sex__Group__0__Impl4868); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2411:1: rule__Sex__Group__1 : rule__Sex__Group__1__Impl rule__Sex__Group__2 ;
    public final void rule__Sex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2415:1: ( rule__Sex__Group__1__Impl rule__Sex__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2416:2: rule__Sex__Group__1__Impl rule__Sex__Group__2
            {
            pushFollow(FOLLOW_rule__Sex__Group__1__Impl_in_rule__Sex__Group__14899);
            rule__Sex__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sex__Group__2_in_rule__Sex__Group__14902);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2423:1: rule__Sex__Group__1__Impl : ( ( rule__Sex__ValueAssignment_1 ) ) ;
    public final void rule__Sex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2427:1: ( ( ( rule__Sex__ValueAssignment_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2428:1: ( ( rule__Sex__ValueAssignment_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2428:1: ( ( rule__Sex__ValueAssignment_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2429:1: ( rule__Sex__ValueAssignment_1 )
            {
             before(grammarAccess.getSexAccess().getValueAssignment_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2430:1: ( rule__Sex__ValueAssignment_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2430:2: rule__Sex__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Sex__ValueAssignment_1_in_rule__Sex__Group__1__Impl4929);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2440:1: rule__Sex__Group__2 : rule__Sex__Group__2__Impl ;
    public final void rule__Sex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2444:1: ( rule__Sex__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2445:2: rule__Sex__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Sex__Group__2__Impl_in_rule__Sex__Group__24959);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2451:1: rule__Sex__Group__2__Impl : ( ( rule__Sex__CommentAssignment_2 )? ) ;
    public final void rule__Sex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2455:1: ( ( ( rule__Sex__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2456:1: ( ( rule__Sex__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2456:1: ( ( rule__Sex__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2457:1: ( rule__Sex__CommentAssignment_2 )?
            {
             before(grammarAccess.getSexAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2458:1: ( rule__Sex__CommentAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_COMMENT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2458:2: rule__Sex__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Sex__CommentAssignment_2_in_rule__Sex__Group__2__Impl4986);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2474:1: rule__CustomProperty__Group__0 : rule__CustomProperty__Group__0__Impl rule__CustomProperty__Group__1 ;
    public final void rule__CustomProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2478:1: ( rule__CustomProperty__Group__0__Impl rule__CustomProperty__Group__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2479:2: rule__CustomProperty__Group__0__Impl rule__CustomProperty__Group__1
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group__0__Impl_in_rule__CustomProperty__Group__05023);
            rule__CustomProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomProperty__Group__1_in_rule__CustomProperty__Group__05026);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2486:1: rule__CustomProperty__Group__0__Impl : ( ( rule__CustomProperty__CustomAttributeRefAssignment_0 ) ) ;
    public final void rule__CustomProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2490:1: ( ( ( rule__CustomProperty__CustomAttributeRefAssignment_0 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2491:1: ( ( rule__CustomProperty__CustomAttributeRefAssignment_0 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2491:1: ( ( rule__CustomProperty__CustomAttributeRefAssignment_0 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2492:1: ( rule__CustomProperty__CustomAttributeRefAssignment_0 )
            {
             before(grammarAccess.getCustomPropertyAccess().getCustomAttributeRefAssignment_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2493:1: ( rule__CustomProperty__CustomAttributeRefAssignment_0 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2493:2: rule__CustomProperty__CustomAttributeRefAssignment_0
            {
            pushFollow(FOLLOW_rule__CustomProperty__CustomAttributeRefAssignment_0_in_rule__CustomProperty__Group__0__Impl5053);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2503:1: rule__CustomProperty__Group__1 : rule__CustomProperty__Group__1__Impl rule__CustomProperty__Group__2 ;
    public final void rule__CustomProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2507:1: ( rule__CustomProperty__Group__1__Impl rule__CustomProperty__Group__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2508:2: rule__CustomProperty__Group__1__Impl rule__CustomProperty__Group__2
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group__1__Impl_in_rule__CustomProperty__Group__15083);
            rule__CustomProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomProperty__Group__2_in_rule__CustomProperty__Group__15086);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2515:1: rule__CustomProperty__Group__1__Impl : ( ( rule__CustomProperty__Alternatives_1 ) ) ;
    public final void rule__CustomProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2519:1: ( ( ( rule__CustomProperty__Alternatives_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2520:1: ( ( rule__CustomProperty__Alternatives_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2520:1: ( ( rule__CustomProperty__Alternatives_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2521:1: ( rule__CustomProperty__Alternatives_1 )
            {
             before(grammarAccess.getCustomPropertyAccess().getAlternatives_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2522:1: ( rule__CustomProperty__Alternatives_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2522:2: rule__CustomProperty__Alternatives_1
            {
            pushFollow(FOLLOW_rule__CustomProperty__Alternatives_1_in_rule__CustomProperty__Group__1__Impl5113);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2532:1: rule__CustomProperty__Group__2 : rule__CustomProperty__Group__2__Impl ;
    public final void rule__CustomProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2536:1: ( rule__CustomProperty__Group__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2537:2: rule__CustomProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group__2__Impl_in_rule__CustomProperty__Group__25143);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2543:1: rule__CustomProperty__Group__2__Impl : ( ( rule__CustomProperty__CommentAssignment_2 )? ) ;
    public final void rule__CustomProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2547:1: ( ( ( rule__CustomProperty__CommentAssignment_2 )? ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2548:1: ( ( rule__CustomProperty__CommentAssignment_2 )? )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2548:1: ( ( rule__CustomProperty__CommentAssignment_2 )? )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2549:1: ( rule__CustomProperty__CommentAssignment_2 )?
            {
             before(grammarAccess.getCustomPropertyAccess().getCommentAssignment_2()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2550:1: ( rule__CustomProperty__CommentAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_COMMENT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2550:2: rule__CustomProperty__CommentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__CustomProperty__CommentAssignment_2_in_rule__CustomProperty__Group__2__Impl5170);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2566:1: rule__CustomProperty__Group_1_2__0 : rule__CustomProperty__Group_1_2__0__Impl rule__CustomProperty__Group_1_2__1 ;
    public final void rule__CustomProperty__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2570:1: ( rule__CustomProperty__Group_1_2__0__Impl rule__CustomProperty__Group_1_2__1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2571:2: rule__CustomProperty__Group_1_2__0__Impl rule__CustomProperty__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group_1_2__0__Impl_in_rule__CustomProperty__Group_1_2__05207);
            rule__CustomProperty__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomProperty__Group_1_2__1_in_rule__CustomProperty__Group_1_2__05210);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2578:1: rule__CustomProperty__Group_1_2__0__Impl : ( '(' ) ;
    public final void rule__CustomProperty__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2582:1: ( ( '(' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2583:1: ( '(' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2583:1: ( '(' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2584:1: '('
            {
             before(grammarAccess.getCustomPropertyAccess().getLeftParenthesisKeyword_1_2_0()); 
            match(input,29,FOLLOW_29_in_rule__CustomProperty__Group_1_2__0__Impl5238); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2597:1: rule__CustomProperty__Group_1_2__1 : rule__CustomProperty__Group_1_2__1__Impl rule__CustomProperty__Group_1_2__2 ;
    public final void rule__CustomProperty__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2601:1: ( rule__CustomProperty__Group_1_2__1__Impl rule__CustomProperty__Group_1_2__2 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2602:2: rule__CustomProperty__Group_1_2__1__Impl rule__CustomProperty__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group_1_2__1__Impl_in_rule__CustomProperty__Group_1_2__15269);
            rule__CustomProperty__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CustomProperty__Group_1_2__2_in_rule__CustomProperty__Group_1_2__15272);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2609:1: rule__CustomProperty__Group_1_2__1__Impl : ( ( rule__CustomProperty__EnumValueAssignment_1_2_1 ) ) ;
    public final void rule__CustomProperty__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2613:1: ( ( ( rule__CustomProperty__EnumValueAssignment_1_2_1 ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2614:1: ( ( rule__CustomProperty__EnumValueAssignment_1_2_1 ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2614:1: ( ( rule__CustomProperty__EnumValueAssignment_1_2_1 ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2615:1: ( rule__CustomProperty__EnumValueAssignment_1_2_1 )
            {
             before(grammarAccess.getCustomPropertyAccess().getEnumValueAssignment_1_2_1()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2616:1: ( rule__CustomProperty__EnumValueAssignment_1_2_1 )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2616:2: rule__CustomProperty__EnumValueAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__CustomProperty__EnumValueAssignment_1_2_1_in_rule__CustomProperty__Group_1_2__1__Impl5299);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2626:1: rule__CustomProperty__Group_1_2__2 : rule__CustomProperty__Group_1_2__2__Impl ;
    public final void rule__CustomProperty__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2630:1: ( rule__CustomProperty__Group_1_2__2__Impl )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2631:2: rule__CustomProperty__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CustomProperty__Group_1_2__2__Impl_in_rule__CustomProperty__Group_1_2__25329);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2637:1: rule__CustomProperty__Group_1_2__2__Impl : ( ')' ) ;
    public final void rule__CustomProperty__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2641:1: ( ( ')' ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2642:1: ( ')' )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2642:1: ( ')' )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2643:1: ')'
            {
             before(grammarAccess.getCustomPropertyAccess().getRightParenthesisKeyword_1_2_2()); 
            match(input,30,FOLLOW_30_in_rule__CustomProperty__Group_1_2__2__Impl5357); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2663:1: rule__Characters__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Characters__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2667:1: ( ( ruleImport ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2668:1: ( ruleImport )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2668:1: ( ruleImport )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2669:1: ruleImport
            {
             before(grammarAccess.getCharactersAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Characters__ImportsAssignment_05399);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2678:1: rule__Characters__TemplatesAssignment_1 : ( ruleTemplate ) ;
    public final void rule__Characters__TemplatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2682:1: ( ( ruleTemplate ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2683:1: ( ruleTemplate )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2683:1: ( ruleTemplate )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2684:1: ruleTemplate
            {
             before(grammarAccess.getCharactersAccess().getTemplatesTemplateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTemplate_in_rule__Characters__TemplatesAssignment_15430);
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


    // $ANTLR start "rule__Characters__GlobalsAssignment_2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2693:1: rule__Characters__GlobalsAssignment_2 : ( ruleGlobals ) ;
    public final void rule__Characters__GlobalsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2697:1: ( ( ruleGlobals ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2698:1: ( ruleGlobals )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2698:1: ( ruleGlobals )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2699:1: ruleGlobals
            {
             before(grammarAccess.getCharactersAccess().getGlobalsGlobalsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGlobals_in_rule__Characters__GlobalsAssignment_25461);
            ruleGlobals();

            state._fsp--;

             after(grammarAccess.getCharactersAccess().getGlobalsGlobalsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Characters__GlobalsAssignment_2"


    // $ANTLR start "rule__Characters__CharactersAssignment_3"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2708:1: rule__Characters__CharactersAssignment_3 : ( ruleCharacter ) ;
    public final void rule__Characters__CharactersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2712:1: ( ( ruleCharacter ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2713:1: ( ruleCharacter )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2713:1: ( ruleCharacter )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2714:1: ruleCharacter
            {
             before(grammarAccess.getCharactersAccess().getCharactersCharacterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCharacter_in_rule__Characters__CharactersAssignment_35492);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2723:1: rule__Import__ImportedNamespaceAssignment_1 : ( RULE_ID ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2727:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2728:1: ( RULE_ID )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2728:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2729:1: RULE_ID
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Import__ImportedNamespaceAssignment_15523); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2738:1: rule__Template__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Template__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2742:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2743:1: ( RULE_ID )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2743:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2744:1: RULE_ID
            {
             before(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Template__NameAssignment_15554); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2753:1: rule__Template__DefaultsAssignment_2 : ( ruleDefaultAttribute ) ;
    public final void rule__Template__DefaultsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2757:1: ( ( ruleDefaultAttribute ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2758:1: ( ruleDefaultAttribute )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2758:1: ( ruleDefaultAttribute )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2759:1: ruleDefaultAttribute
            {
             before(grammarAccess.getTemplateAccess().getDefaultsDefaultAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDefaultAttribute_in_rule__Template__DefaultsAssignment_25585);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2768:1: rule__Template__CustomsAssignment_3 : ( ruleCustomAttribute ) ;
    public final void rule__Template__CustomsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2772:1: ( ( ruleCustomAttribute ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2773:1: ( ruleCustomAttribute )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2773:1: ( ruleCustomAttribute )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2774:1: ruleCustomAttribute
            {
             before(grammarAccess.getTemplateAccess().getCustomsCustomAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCustomAttribute_in_rule__Template__CustomsAssignment_35616);
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


    // $ANTLR start "rule__Template__CustomsAssignment_4"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2783:1: rule__Template__CustomsAssignment_4 : ( ruleCustomAttribute ) ;
    public final void rule__Template__CustomsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2787:1: ( ( ruleCustomAttribute ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2788:1: ( ruleCustomAttribute )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2788:1: ( ruleCustomAttribute )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2789:1: ruleCustomAttribute
            {
             before(grammarAccess.getTemplateAccess().getCustomsCustomAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleCustomAttribute_in_rule__Template__CustomsAssignment_45647);
            ruleCustomAttribute();

            state._fsp--;

             after(grammarAccess.getTemplateAccess().getCustomsCustomAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__CustomsAssignment_4"


    // $ANTLR start "rule__CustomAttribute__RequiredAssignment_0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2798:1: rule__CustomAttribute__RequiredAssignment_0 : ( ruleRequired ) ;
    public final void rule__CustomAttribute__RequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2802:1: ( ( ruleRequired ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2803:1: ( ruleRequired )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2803:1: ( ruleRequired )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2804:1: ruleRequired
            {
             before(grammarAccess.getCustomAttributeAccess().getRequiredRequiredParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRequired_in_rule__CustomAttribute__RequiredAssignment_05678);
            ruleRequired();

            state._fsp--;

             after(grammarAccess.getCustomAttributeAccess().getRequiredRequiredParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttribute__RequiredAssignment_0"


    // $ANTLR start "rule__CustomAttribute__CaNameAssignment_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2813:1: rule__CustomAttribute__CaNameAssignment_1 : ( ruleCustomAttributeName ) ;
    public final void rule__CustomAttribute__CaNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2817:1: ( ( ruleCustomAttributeName ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2818:1: ( ruleCustomAttributeName )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2818:1: ( ruleCustomAttributeName )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2819:1: ruleCustomAttributeName
            {
             before(grammarAccess.getCustomAttributeAccess().getCaNameCustomAttributeNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCustomAttributeName_in_rule__CustomAttribute__CaNameAssignment_15709);
            ruleCustomAttributeName();

            state._fsp--;

             after(grammarAccess.getCustomAttributeAccess().getCaNameCustomAttributeNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttribute__CaNameAssignment_1"


    // $ANTLR start "rule__CustomAttribute__TypeAssignment_3_0"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2828:1: rule__CustomAttribute__TypeAssignment_3_0 : ( ruleAttributeType ) ;
    public final void rule__CustomAttribute__TypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2832:1: ( ( ruleAttributeType ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2833:1: ( ruleAttributeType )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2833:1: ( ruleAttributeType )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2834:1: ruleAttributeType
            {
             before(grammarAccess.getCustomAttributeAccess().getTypeAttributeTypeEnumRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleAttributeType_in_rule__CustomAttribute__TypeAssignment_3_05740);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getCustomAttributeAccess().getTypeAttributeTypeEnumRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttribute__TypeAssignment_3_0"


    // $ANTLR start "rule__CustomAttribute__EnumValuesAssignment_3_1_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2843:1: rule__CustomAttribute__EnumValuesAssignment_3_1_1 : ( ruleEnumValue ) ;
    public final void rule__CustomAttribute__EnumValuesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2847:1: ( ( ruleEnumValue ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2848:1: ( ruleEnumValue )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2848:1: ( ruleEnumValue )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2849:1: ruleEnumValue
            {
             before(grammarAccess.getCustomAttributeAccess().getEnumValuesEnumValueParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_ruleEnumValue_in_rule__CustomAttribute__EnumValuesAssignment_3_1_15771);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getCustomAttributeAccess().getEnumValuesEnumValueParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttribute__EnumValuesAssignment_3_1_1"


    // $ANTLR start "rule__CustomAttribute__EnumValuesAssignment_3_1_2_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2858:1: rule__CustomAttribute__EnumValuesAssignment_3_1_2_1 : ( ruleEnumValue ) ;
    public final void rule__CustomAttribute__EnumValuesAssignment_3_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2862:1: ( ( ruleEnumValue ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2863:1: ( ruleEnumValue )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2863:1: ( ruleEnumValue )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2864:1: ruleEnumValue
            {
             before(grammarAccess.getCustomAttributeAccess().getEnumValuesEnumValueParserRuleCall_3_1_2_1_0()); 
            pushFollow(FOLLOW_ruleEnumValue_in_rule__CustomAttribute__EnumValuesAssignment_3_1_2_15802);
            ruleEnumValue();

            state._fsp--;

             after(grammarAccess.getCustomAttributeAccess().getEnumValuesEnumValueParserRuleCall_3_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomAttribute__EnumValuesAssignment_3_1_2_1"


    // $ANTLR start "rule__CustomAttributeName__NameAssignment"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2873:1: rule__CustomAttributeName__NameAssignment : ( RULE_ID ) ;
    public final void rule__CustomAttributeName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2877:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2878:1: ( RULE_ID )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2878:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2879:1: RULE_ID
            {
             before(grammarAccess.getCustomAttributeNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomAttributeName__NameAssignment5833); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2888:1: rule__EnumValue__NameAssignment : ( ruleEnumID ) ;
    public final void rule__EnumValue__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2892:1: ( ( ruleEnumID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2893:1: ( ruleEnumID )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2893:1: ( ruleEnumID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2894:1: ruleEnumID
            {
             before(grammarAccess.getEnumValueAccess().getNameEnumIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEnumID_in_rule__EnumValue__NameAssignment5864);
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


    // $ANTLR start "rule__Globals__CustomsAssignment_2"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2903:1: rule__Globals__CustomsAssignment_2 : ( ruleCustomAttribute ) ;
    public final void rule__Globals__CustomsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2907:1: ( ( ruleCustomAttribute ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2908:1: ( ruleCustomAttribute )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2908:1: ( ruleCustomAttribute )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2909:1: ruleCustomAttribute
            {
             before(grammarAccess.getGlobalsAccess().getCustomsCustomAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCustomAttribute_in_rule__Globals__CustomsAssignment_25895);
            ruleCustomAttribute();

            state._fsp--;

             after(grammarAccess.getGlobalsAccess().getCustomsCustomAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Globals__CustomsAssignment_2"


    // $ANTLR start "rule__Globals__CustomsAssignment_3"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2918:1: rule__Globals__CustomsAssignment_3 : ( ruleCustomAttribute ) ;
    public final void rule__Globals__CustomsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2922:1: ( ( ruleCustomAttribute ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2923:1: ( ruleCustomAttribute )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2923:1: ( ruleCustomAttribute )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2924:1: ruleCustomAttribute
            {
             before(grammarAccess.getGlobalsAccess().getCustomsCustomAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCustomAttribute_in_rule__Globals__CustomsAssignment_35926);
            ruleCustomAttribute();

            state._fsp--;

             after(grammarAccess.getGlobalsAccess().getCustomsCustomAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Globals__CustomsAssignment_3"


    // $ANTLR start "rule__Character__NameAssignment_1"
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2933:1: rule__Character__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Character__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2937:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2938:1: ( RULE_ID )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2938:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2939:1: RULE_ID
            {
             before(grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Character__NameAssignment_15957); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2948:1: rule__Character__TemplateAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Character__TemplateAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2952:1: ( ( ( RULE_ID ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2953:1: ( ( RULE_ID ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2953:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2954:1: ( RULE_ID )
            {
             before(grammarAccess.getCharacterAccess().getTemplateTemplateCrossReference_2_1_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2955:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2956:1: RULE_ID
            {
             before(grammarAccess.getCharacterAccess().getTemplateTemplateIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Character__TemplateAssignment_2_15992); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2967:1: rule__Character__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__Character__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2971:1: ( ( ruleProperty ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2972:1: ( ruleProperty )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2972:1: ( ruleProperty )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2973:1: ruleProperty
            {
             before(grammarAccess.getCharacterAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Character__PropertiesAssignment_36027);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2982:1: rule__FullName__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FullName__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2986:1: ( ( RULE_STRING ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2987:1: ( RULE_STRING )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2987:1: ( RULE_STRING )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2988:1: RULE_STRING
            {
             before(grammarAccess.getFullNameAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FullName__ValueAssignment_16058); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:2997:1: rule__FullName__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__FullName__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3001:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3002:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3002:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3003:1: RULE_COMMENT
            {
             before(grammarAccess.getFullNameAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__FullName__CommentAssignment_26089); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3012:1: rule__Description__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Description__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3016:1: ( ( RULE_STRING ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3017:1: ( RULE_STRING )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3017:1: ( RULE_STRING )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3018:1: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Description__ValueAssignment_16120); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3027:1: rule__Description__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__Description__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3031:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3032:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3032:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3033:1: RULE_COMMENT
            {
             before(grammarAccess.getDescriptionAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Description__CommentAssignment_26151); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3042:1: rule__Type__ValueAssignment_1 : ( ruleCharaType ) ;
    public final void rule__Type__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3046:1: ( ( ruleCharaType ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3047:1: ( ruleCharaType )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3047:1: ( ruleCharaType )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3048:1: ruleCharaType
            {
             before(grammarAccess.getTypeAccess().getValueCharaTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCharaType_in_rule__Type__ValueAssignment_16182);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3057:1: rule__Type__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__Type__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3061:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3062:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3062:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3063:1: RULE_COMMENT
            {
             before(grammarAccess.getTypeAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Type__CommentAssignment_26213); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3072:1: rule__Age__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Age__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3076:1: ( ( RULE_INT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3077:1: ( RULE_INT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3077:1: ( RULE_INT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3078:1: RULE_INT
            {
             before(grammarAccess.getAgeAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Age__ValueAssignment_16244); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3087:1: rule__Age__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__Age__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3091:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3092:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3092:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3093:1: RULE_COMMENT
            {
             before(grammarAccess.getAgeAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Age__CommentAssignment_26275); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3102:1: rule__Sex__ValueAssignment_1 : ( ruleCharaSex ) ;
    public final void rule__Sex__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3106:1: ( ( ruleCharaSex ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3107:1: ( ruleCharaSex )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3107:1: ( ruleCharaSex )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3108:1: ruleCharaSex
            {
             before(grammarAccess.getSexAccess().getValueCharaSexEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCharaSex_in_rule__Sex__ValueAssignment_16306);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3117:1: rule__Sex__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__Sex__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3121:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3122:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3122:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3123:1: RULE_COMMENT
            {
             before(grammarAccess.getSexAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Sex__CommentAssignment_26337); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3132:1: rule__CustomProperty__CustomAttributeRefAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CustomProperty__CustomAttributeRefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3136:1: ( ( ( RULE_ID ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3137:1: ( ( RULE_ID ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3137:1: ( ( RULE_ID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3138:1: ( RULE_ID )
            {
             before(grammarAccess.getCustomPropertyAccess().getCustomAttributeRefCustomAttributeNameCrossReference_0_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3139:1: ( RULE_ID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3140:1: RULE_ID
            {
             before(grammarAccess.getCustomPropertyAccess().getCustomAttributeRefCustomAttributeNameIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CustomProperty__CustomAttributeRefAssignment_06372); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3151:1: rule__CustomProperty__StringValueAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__CustomProperty__StringValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3155:1: ( ( RULE_STRING ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3156:1: ( RULE_STRING )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3156:1: ( RULE_STRING )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3157:1: RULE_STRING
            {
             before(grammarAccess.getCustomPropertyAccess().getStringValueSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CustomProperty__StringValueAssignment_1_06407); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3166:1: rule__CustomProperty__IntValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__CustomProperty__IntValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3170:1: ( ( RULE_INT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3171:1: ( RULE_INT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3171:1: ( RULE_INT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3172:1: RULE_INT
            {
             before(grammarAccess.getCustomPropertyAccess().getIntValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CustomProperty__IntValueAssignment_1_16438); 
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3181:1: rule__CustomProperty__EnumValueAssignment_1_2_1 : ( ( ruleEnumID ) ) ;
    public final void rule__CustomProperty__EnumValueAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3185:1: ( ( ( ruleEnumID ) ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3186:1: ( ( ruleEnumID ) )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3186:1: ( ( ruleEnumID ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3187:1: ( ruleEnumID )
            {
             before(grammarAccess.getCustomPropertyAccess().getEnumValueEnumValueCrossReference_1_2_1_0()); 
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3188:1: ( ruleEnumID )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3189:1: ruleEnumID
            {
             before(grammarAccess.getCustomPropertyAccess().getEnumValueEnumValueEnumIDParserRuleCall_1_2_1_0_1()); 
            pushFollow(FOLLOW_ruleEnumID_in_rule__CustomProperty__EnumValueAssignment_1_2_16473);
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
    // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3200:1: rule__CustomProperty__CommentAssignment_2 : ( RULE_COMMENT ) ;
    public final void rule__CustomProperty__CommentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3204:1: ( ( RULE_COMMENT ) )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3205:1: ( RULE_COMMENT )
            {
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3205:1: ( RULE_COMMENT )
            // ../de.unidue.ecg.characterScript.ui/src-gen/de/unidue/ecg/characterScript/ui/contentassist/antlr/internal/InternalCharacterScript.g:3206:1: RULE_COMMENT
            {
             before(grammarAccess.getCustomPropertyAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__CustomProperty__CommentAssignment_26508); 
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
    public static final BitSet FOLLOW_ruleRequired_in_entryRuleRequired361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequired368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Required__Alternatives_in_ruleRequired394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttributeName_in_entryRuleCustomAttributeName421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomAttributeName428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttributeName__NameAssignment_in_ruleCustomAttributeName454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_entryRuleEnumValue481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumValue488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumValue__NameAssignment_in_ruleEnumValue514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumID_in_entryRuleEnumID541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumID548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumID__Alternatives_in_ruleEnumID574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobals_in_entryRuleGlobals601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobals608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globals__Group__0_in_ruleGlobals634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_entryRuleCharacter661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharacter668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__0_in_ruleCharacter694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_in_ruleProperty754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultProperty_in_entryRuleDefaultProperty781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultProperty788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultProperty__Alternatives_in_ruleDefaultProperty814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullName_in_entryRuleFullName841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullName848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__Group__0_in_ruleFullName874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__0_in_ruleDescription934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAge_in_entryRuleAge1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAge1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__Group__0_in_ruleAge1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSex_in_entryRuleSex1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSex1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__Group__0_in_ruleSex1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomProperty_in_entryRuleCustomProperty1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomProperty1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__0_in_ruleCustomProperty1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharaType__Alternatives_in_ruleCharaType1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CharaSex__Alternatives_in_ruleCharaSex1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DefaultAttribute__Alternatives1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DefaultAttribute__Alternatives1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DefaultAttribute__Alternatives1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DefaultAttribute__Alternatives1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DefaultAttribute__Alternatives1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__TypeAssignment_3_0_in_rule__CustomAttribute__Alternatives_31433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_3_1__0_in_rule__CustomAttribute__Alternatives_31451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Required__Alternatives1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Required__Alternatives1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumID__Alternatives1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumID__Alternatives1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultProperty_in_rule__Property__Alternatives1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomProperty_in_rule__Property__Alternatives1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullName_in_rule__DefaultProperty__Alternatives1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__DefaultProperty__Alternatives1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__DefaultProperty__Alternatives1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAge_in_rule__DefaultProperty__Alternatives1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSex_in_rule__DefaultProperty__Alternatives1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__StringValueAssignment_1_0_in_rule__CustomProperty__Alternatives_11737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__IntValueAssignment_1_1_in_rule__CustomProperty__Alternatives_11755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group_1_2__0_in_rule__CustomProperty__Alternatives_11773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AttributeType__Alternatives1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AttributeType__Alternatives1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CharaType__Alternatives1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CharaType__Alternatives1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CharaSex__Alternatives1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CharaSex__Alternatives1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__Group__0__Impl_in_rule__Characters__Group__01975 = new BitSet(new long[]{0x0000000504000000L});
    public static final BitSet FOLLOW_rule__Characters__Group__1_in_rule__Characters__Group__01978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__ImportsAssignment_0_in_rule__Characters__Group__0__Impl2005 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Characters__Group__1__Impl_in_rule__Characters__Group__12036 = new BitSet(new long[]{0x0000000504000000L});
    public static final BitSet FOLLOW_rule__Characters__Group__2_in_rule__Characters__Group__12039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__TemplatesAssignment_1_in_rule__Characters__Group__1__Impl2066 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Characters__Group__2__Impl_in_rule__Characters__Group__22097 = new BitSet(new long[]{0x0000000504000000L});
    public static final BitSet FOLLOW_rule__Characters__Group__3_in_rule__Characters__Group__22100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__GlobalsAssignment_2_in_rule__Characters__Group__2__Impl2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__Group__3__Impl_in_rule__Characters__Group__32158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Characters__CharactersAssignment_3_in_rule__Characters__Group__3__Impl2185 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02224 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Import__Group__0__Impl2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__0__Impl_in_rule__Template__Group__02347 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Template__Group__1_in_rule__Template__Group__02350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Template__Group__0__Impl2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__1__Impl_in_rule__Template__Group__12409 = new BitSet(new long[]{0x000000000007F020L});
    public static final BitSet FOLLOW_rule__Template__Group__2_in_rule__Template__Group__12412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__NameAssignment_1_in_rule__Template__Group__1__Impl2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__2__Impl_in_rule__Template__Group__22469 = new BitSet(new long[]{0x000000000007F020L});
    public static final BitSet FOLLOW_rule__Template__Group__3_in_rule__Template__Group__22472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__DefaultsAssignment_2_in_rule__Template__Group__2__Impl2499 = new BitSet(new long[]{0x000000000001F002L});
    public static final BitSet FOLLOW_rule__Template__Group__3__Impl_in_rule__Template__Group__32530 = new BitSet(new long[]{0x000000000807F020L});
    public static final BitSet FOLLOW_rule__Template__Group__4_in_rule__Template__Group__32533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__CustomsAssignment_3_in_rule__Template__Group__3__Impl2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__4__Impl_in_rule__Template__Group__42590 = new BitSet(new long[]{0x000000000807F020L});
    public static final BitSet FOLLOW_rule__Template__Group__5_in_rule__Template__Group__42593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__CustomsAssignment_4_in_rule__Template__Group__4__Impl2620 = new BitSet(new long[]{0x000000000007F022L});
    public static final BitSet FOLLOW_rule__Template__Group__5__Impl_in_rule__Template__Group__52651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Template__Group__5__Impl2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__0__Impl_in_rule__CustomAttribute__Group__02722 = new BitSet(new long[]{0x000000000007F020L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__1_in_rule__CustomAttribute__Group__02725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__RequiredAssignment_0_in_rule__CustomAttribute__Group__0__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__1__Impl_in_rule__CustomAttribute__Group__12783 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__2_in_rule__CustomAttribute__Group__12786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__CaNameAssignment_1_in_rule__CustomAttribute__Group__1__Impl2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__2__Impl_in_rule__CustomAttribute__Group__22843 = new BitSet(new long[]{0x0000000020180000L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__3_in_rule__CustomAttribute__Group__22846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CustomAttribute__Group__2__Impl2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group__3__Impl_in_rule__CustomAttribute__Group__32905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Alternatives_3_in_rule__CustomAttribute__Group__3__Impl2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_3_1__0__Impl_in_rule__CustomAttribute__Group_3_1__02970 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_3_1__1_in_rule__CustomAttribute__Group_3_1__02973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CustomAttribute__Group_3_1__0__Impl3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_3_1__1__Impl_in_rule__CustomAttribute__Group_3_1__13032 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_3_1__2_in_rule__CustomAttribute__Group_3_1__13035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__EnumValuesAssignment_3_1_1_in_rule__CustomAttribute__Group_3_1__1__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_3_1__2__Impl_in_rule__CustomAttribute__Group_3_1__23092 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_3_1__3_in_rule__CustomAttribute__Group_3_1__23095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_3_1_2__0_in_rule__CustomAttribute__Group_3_1__2__Impl3122 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_3_1__3__Impl_in_rule__CustomAttribute__Group_3_1__33153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CustomAttribute__Group_3_1__3__Impl3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_3_1_2__0__Impl_in_rule__CustomAttribute__Group_3_1_2__03220 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_3_1_2__1_in_rule__CustomAttribute__Group_3_1_2__03223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CustomAttribute__Group_3_1_2__0__Impl3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__Group_3_1_2__1__Impl_in_rule__CustomAttribute__Group_3_1_2__13282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomAttribute__EnumValuesAssignment_3_1_2_1_in_rule__CustomAttribute__Group_3_1_2__1__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globals__Group__0__Impl_in_rule__Globals__Group__03343 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Globals__Group__1_in_rule__Globals__Group__03346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Globals__Group__0__Impl3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globals__Group__1__Impl_in_rule__Globals__Group__13405 = new BitSet(new long[]{0x000000000007F020L});
    public static final BitSet FOLLOW_rule__Globals__Group__2_in_rule__Globals__Group__13408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Globals__Group__1__Impl3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globals__Group__2__Impl_in_rule__Globals__Group__23467 = new BitSet(new long[]{0x000000000807F020L});
    public static final BitSet FOLLOW_rule__Globals__Group__3_in_rule__Globals__Group__23470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globals__CustomsAssignment_2_in_rule__Globals__Group__2__Impl3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globals__Group__3__Impl_in_rule__Globals__Group__33527 = new BitSet(new long[]{0x000000000807F020L});
    public static final BitSet FOLLOW_rule__Globals__Group__4_in_rule__Globals__Group__33530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globals__CustomsAssignment_3_in_rule__Globals__Group__3__Impl3557 = new BitSet(new long[]{0x000000000007F022L});
    public static final BitSet FOLLOW_rule__Globals__Group__4__Impl_in_rule__Globals__Group__43588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Globals__Group__4__Impl3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__0__Impl_in_rule__Character__Group__03657 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Character__Group__1_in_rule__Character__Group__03660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Character__Group__0__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__1__Impl_in_rule__Character__Group__13719 = new BitSet(new long[]{0x000000080801F020L});
    public static final BitSet FOLLOW_rule__Character__Group__2_in_rule__Character__Group__13722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__NameAssignment_1_in_rule__Character__Group__1__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__2__Impl_in_rule__Character__Group__23779 = new BitSet(new long[]{0x000000080801F020L});
    public static final BitSet FOLLOW_rule__Character__Group__3_in_rule__Character__Group__23782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group_2__0_in_rule__Character__Group__2__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group__3__Impl_in_rule__Character__Group__33840 = new BitSet(new long[]{0x000000080801F020L});
    public static final BitSet FOLLOW_rule__Character__Group__4_in_rule__Character__Group__33843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__PropertiesAssignment_3_in_rule__Character__Group__3__Impl3870 = new BitSet(new long[]{0x000000000001F022L});
    public static final BitSet FOLLOW_rule__Character__Group__4__Impl_in_rule__Character__Group__43901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Character__Group__4__Impl3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group_2__0__Impl_in_rule__Character__Group_2__03970 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Character__Group_2__1_in_rule__Character__Group_2__03973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Character__Group_2__0__Impl4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__Group_2__1__Impl_in_rule__Character__Group_2__14032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Character__TemplateAssignment_2_1_in_rule__Character__Group_2__1__Impl4059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__Group__0__Impl_in_rule__FullName__Group__04093 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FullName__Group__1_in_rule__FullName__Group__04096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FullName__Group__0__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__Group__1__Impl_in_rule__FullName__Group__14155 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__FullName__Group__2_in_rule__FullName__Group__14158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__ValueAssignment_1_in_rule__FullName__Group__1__Impl4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__Group__2__Impl_in_rule__FullName__Group__24215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FullName__CommentAssignment_2_in_rule__FullName__Group__2__Impl4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__0__Impl_in_rule__Description__Group__04279 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Description__Group__1_in_rule__Description__Group__04282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Description__Group__0__Impl4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__1__Impl_in_rule__Description__Group__14341 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Description__Group__2_in_rule__Description__Group__14344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__ValueAssignment_1_in_rule__Description__Group__1__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__2__Impl_in_rule__Description__Group__24401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__CommentAssignment_2_in_rule__Description__Group__2__Impl4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__04465 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__04468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__Group__0__Impl4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__14527 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Type__Group__2_in_rule__Type__Group__14530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__ValueAssignment_1_in_rule__Type__Group__1__Impl4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__24587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__CommentAssignment_2_in_rule__Type__Group__2__Impl4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__Group__0__Impl_in_rule__Age__Group__04651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Age__Group__1_in_rule__Age__Group__04654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Age__Group__0__Impl4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__Group__1__Impl_in_rule__Age__Group__14713 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Age__Group__2_in_rule__Age__Group__14716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__ValueAssignment_1_in_rule__Age__Group__1__Impl4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__Group__2__Impl_in_rule__Age__Group__24773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Age__CommentAssignment_2_in_rule__Age__Group__2__Impl4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__Group__0__Impl_in_rule__Sex__Group__04837 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Sex__Group__1_in_rule__Sex__Group__04840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Sex__Group__0__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__Group__1__Impl_in_rule__Sex__Group__14899 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Sex__Group__2_in_rule__Sex__Group__14902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__ValueAssignment_1_in_rule__Sex__Group__1__Impl4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__Group__2__Impl_in_rule__Sex__Group__24959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sex__CommentAssignment_2_in_rule__Sex__Group__2__Impl4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__0__Impl_in_rule__CustomProperty__Group__05023 = new BitSet(new long[]{0x0000000020000050L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__1_in_rule__CustomProperty__Group__05026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__CustomAttributeRefAssignment_0_in_rule__CustomProperty__Group__0__Impl5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__1__Impl_in_rule__CustomProperty__Group__15083 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__2_in_rule__CustomProperty__Group__15086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Alternatives_1_in_rule__CustomProperty__Group__1__Impl5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group__2__Impl_in_rule__CustomProperty__Group__25143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__CommentAssignment_2_in_rule__CustomProperty__Group__2__Impl5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group_1_2__0__Impl_in_rule__CustomProperty__Group_1_2__05207 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group_1_2__1_in_rule__CustomProperty__Group_1_2__05210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CustomProperty__Group_1_2__0__Impl5238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group_1_2__1__Impl_in_rule__CustomProperty__Group_1_2__15269 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group_1_2__2_in_rule__CustomProperty__Group_1_2__15272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__EnumValueAssignment_1_2_1_in_rule__CustomProperty__Group_1_2__1__Impl5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CustomProperty__Group_1_2__2__Impl_in_rule__CustomProperty__Group_1_2__25329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CustomProperty__Group_1_2__2__Impl5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Characters__ImportsAssignment_05399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_rule__Characters__TemplatesAssignment_15430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobals_in_rule__Characters__GlobalsAssignment_25461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_rule__Characters__CharactersAssignment_35492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Import__ImportedNamespaceAssignment_15523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Template__NameAssignment_15554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultAttribute_in_rule__Template__DefaultsAssignment_25585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttribute_in_rule__Template__CustomsAssignment_35616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttribute_in_rule__Template__CustomsAssignment_45647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequired_in_rule__CustomAttribute__RequiredAssignment_05678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttributeName_in_rule__CustomAttribute__CaNameAssignment_15709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_rule__CustomAttribute__TypeAssignment_3_05740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_rule__CustomAttribute__EnumValuesAssignment_3_1_15771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_rule__CustomAttribute__EnumValuesAssignment_3_1_2_15802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomAttributeName__NameAssignment5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumID_in_rule__EnumValue__NameAssignment5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttribute_in_rule__Globals__CustomsAssignment_25895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttribute_in_rule__Globals__CustomsAssignment_35926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Character__NameAssignment_15957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Character__TemplateAssignment_2_15992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Character__PropertiesAssignment_36027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FullName__ValueAssignment_16058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__FullName__CommentAssignment_26089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Description__ValueAssignment_16120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Description__CommentAssignment_26151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharaType_in_rule__Type__ValueAssignment_16182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Type__CommentAssignment_26213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Age__ValueAssignment_16244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Age__CommentAssignment_26275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharaSex_in_rule__Sex__ValueAssignment_16306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Sex__CommentAssignment_26337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CustomProperty__CustomAttributeRefAssignment_06372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CustomProperty__StringValueAssignment_1_06407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CustomProperty__IntValueAssignment_1_16438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumID_in_rule__CustomProperty__EnumValueAssignment_1_2_16473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__CustomProperty__CommentAssignment_26508 = new BitSet(new long[]{0x0000000000000002L});

}