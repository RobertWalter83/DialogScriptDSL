package de.unidue.ecg.characterScript.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.unidue.ecg.characterScript.services.CharacterScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCharacterScriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'template'", "'end'", "'full name'", "'age'", "'description'", "'sex'", "'type'", "'as'", "'('", "','", "')'", "'custom'", "'attributes'", "'character'", "'uses'", "'NUMBER'", "'TEXT'", "'PC'", "'NPC'", "'male'", "'female'"
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
    public static final int RULE_INT=5;
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
    public String getGrammarFileName() { return "../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g"; }



     	private CharacterScriptGrammarAccess grammarAccess;
     	
        public InternalCharacterScriptParser(TokenStream input, CharacterScriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Characters";	
       	}
       	
       	@Override
       	protected CharacterScriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCharacters"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:68:1: entryRuleCharacters returns [EObject current=null] : iv_ruleCharacters= ruleCharacters EOF ;
    public final EObject entryRuleCharacters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacters = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:69:2: (iv_ruleCharacters= ruleCharacters EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:70:2: iv_ruleCharacters= ruleCharacters EOF
            {
             newCompositeNode(grammarAccess.getCharactersRule()); 
            pushFollow(FOLLOW_ruleCharacters_in_entryRuleCharacters75);
            iv_ruleCharacters=ruleCharacters();

            state._fsp--;

             current =iv_ruleCharacters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharacters85); 

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
    // $ANTLR end "entryRuleCharacters"


    // $ANTLR start "ruleCharacters"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:77:1: ruleCharacters returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_templates_1_0= ruleTemplate ) )* ( (lv_customs_2_0= ruleCustoms ) )? ( (lv_characters_3_0= ruleCharacter ) )* ) ;
    public final EObject ruleCharacters() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_templates_1_0 = null;

        EObject lv_customs_2_0 = null;

        EObject lv_characters_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_templates_1_0= ruleTemplate ) )* ( (lv_customs_2_0= ruleCustoms ) )? ( (lv_characters_3_0= ruleCharacter ) )* ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_templates_1_0= ruleTemplate ) )* ( (lv_customs_2_0= ruleCustoms ) )? ( (lv_characters_3_0= ruleCharacter ) )* )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_templates_1_0= ruleTemplate ) )* ( (lv_customs_2_0= ruleCustoms ) )? ( (lv_characters_3_0= ruleCharacter ) )* )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:81:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_templates_1_0= ruleTemplate ) )* ( (lv_customs_2_0= ruleCustoms ) )? ( (lv_characters_3_0= ruleCharacter ) )*
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:82:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:82:1: (lv_imports_0_0= ruleImport )
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:83:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCharactersAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleCharacters131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCharactersRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:99:3: ( (lv_templates_1_0= ruleTemplate ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:100:1: (lv_templates_1_0= ruleTemplate )
            	    {
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:100:1: (lv_templates_1_0= ruleTemplate )
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:101:3: lv_templates_1_0= ruleTemplate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCharactersAccess().getTemplatesTemplateParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTemplate_in_ruleCharacters153);
            	    lv_templates_1_0=ruleTemplate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCharactersRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"templates",
            	            		lv_templates_1_0, 
            	            		"Template");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:117:3: ( (lv_customs_2_0= ruleCustoms ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:118:1: (lv_customs_2_0= ruleCustoms )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:118:1: (lv_customs_2_0= ruleCustoms )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:119:3: lv_customs_2_0= ruleCustoms
                    {
                     
                    	        newCompositeNode(grammarAccess.getCharactersAccess().getCustomsCustomsParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCustoms_in_ruleCharacters175);
                    lv_customs_2_0=ruleCustoms();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCharactersRule());
                    	        }
                           		set(
                           			current, 
                           			"customs",
                            		lv_customs_2_0, 
                            		"Customs");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:135:3: ( (lv_characters_3_0= ruleCharacter ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:136:1: (lv_characters_3_0= ruleCharacter )
            	    {
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:136:1: (lv_characters_3_0= ruleCharacter )
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:137:3: lv_characters_3_0= ruleCharacter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCharactersAccess().getCharactersCharacterParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCharacter_in_ruleCharacters197);
            	    lv_characters_3_0=ruleCharacter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCharactersRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"characters",
            	            		lv_characters_3_0, 
            	            		"Character");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleCharacters"


    // $ANTLR start "entryRuleImport"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:161:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:162:2: (iv_ruleImport= ruleImport EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:163:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport234);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport244); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:170:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= RULE_ID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importedNamespace_1_0=null;

         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:173:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= RULE_ID ) ) ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:174:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= RULE_ID ) ) )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:174:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= RULE_ID ) ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:174:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleImport281); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:178:1: ( (lv_importedNamespace_1_0= RULE_ID ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:179:1: (lv_importedNamespace_1_0= RULE_ID )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:179:1: (lv_importedNamespace_1_0= RULE_ID )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:180:3: lv_importedNamespace_1_0= RULE_ID
            {
            lv_importedNamespace_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImport298); 

            			newLeafNode(lv_importedNamespace_1_0, grammarAccess.getImportAccess().getImportedNamespaceIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleTemplate"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:204:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:205:2: (iv_ruleTemplate= ruleTemplate EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:206:2: iv_ruleTemplate= ruleTemplate EOF
            {
             newCompositeNode(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_ruleTemplate_in_entryRuleTemplate339);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;

             current =iv_ruleTemplate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplate349); 

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
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:213:1: ruleTemplate returns [EObject current=null] : (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) ( (lv_defaults_2_0= ruleDefaultAttribute ) )* ( (lv_customs_3_0= ruleCustomAttribute ) )* otherlv_4= 'end' ) ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_defaults_2_0 = null;

        EObject lv_customs_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:216:28: ( (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) ( (lv_defaults_2_0= ruleDefaultAttribute ) )* ( (lv_customs_3_0= ruleCustomAttribute ) )* otherlv_4= 'end' ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:217:1: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) ( (lv_defaults_2_0= ruleDefaultAttribute ) )* ( (lv_customs_3_0= ruleCustomAttribute ) )* otherlv_4= 'end' )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:217:1: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) ( (lv_defaults_2_0= ruleDefaultAttribute ) )* ( (lv_customs_3_0= ruleCustomAttribute ) )* otherlv_4= 'end' )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:217:3: otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) ( (lv_defaults_2_0= ruleDefaultAttribute ) )* ( (lv_customs_3_0= ruleCustomAttribute ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleTemplate386); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateAccess().getTemplateKeyword_0());
                
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:221:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:222:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:222:1: (lv_name_1_0= RULE_ID )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:223:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplate403); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTemplateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:239:2: ( (lv_defaults_2_0= ruleDefaultAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=15 && LA5_0<=19)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:240:1: (lv_defaults_2_0= ruleDefaultAttribute )
            	    {
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:240:1: (lv_defaults_2_0= ruleDefaultAttribute )
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:241:3: lv_defaults_2_0= ruleDefaultAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemplateAccess().getDefaultsDefaultAttributeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefaultAttribute_in_ruleTemplate429);
            	    lv_defaults_2_0=ruleDefaultAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTemplateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"defaults",
            	            		lv_defaults_2_0, 
            	            		"DefaultAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:257:3: ( (lv_customs_3_0= ruleCustomAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:258:1: (lv_customs_3_0= ruleCustomAttribute )
            	    {
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:258:1: (lv_customs_3_0= ruleCustomAttribute )
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:259:3: lv_customs_3_0= ruleCustomAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemplateAccess().getCustomsCustomAttributeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCustomAttribute_in_ruleTemplate451);
            	    lv_customs_3_0=ruleCustomAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTemplateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"customs",
            	            		lv_customs_3_0, 
            	            		"CustomAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTemplate464); 

                	newLeafNode(otherlv_4, grammarAccess.getTemplateAccess().getEndKeyword_4());
                

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
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleDefaultAttribute"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:287:1: entryRuleDefaultAttribute returns [String current=null] : iv_ruleDefaultAttribute= ruleDefaultAttribute EOF ;
    public final String entryRuleDefaultAttribute() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefaultAttribute = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:288:2: (iv_ruleDefaultAttribute= ruleDefaultAttribute EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:289:2: iv_ruleDefaultAttribute= ruleDefaultAttribute EOF
            {
             newCompositeNode(grammarAccess.getDefaultAttributeRule()); 
            pushFollow(FOLLOW_ruleDefaultAttribute_in_entryRuleDefaultAttribute501);
            iv_ruleDefaultAttribute=ruleDefaultAttribute();

            state._fsp--;

             current =iv_ruleDefaultAttribute.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultAttribute512); 

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
    // $ANTLR end "entryRuleDefaultAttribute"


    // $ANTLR start "ruleDefaultAttribute"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:296:1: ruleDefaultAttribute returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'full name' | kw= 'age' | kw= 'description' | kw= 'sex' | kw= 'type' ) ;
    public final AntlrDatatypeRuleToken ruleDefaultAttribute() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:299:28: ( (kw= 'full name' | kw= 'age' | kw= 'description' | kw= 'sex' | kw= 'type' ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:300:1: (kw= 'full name' | kw= 'age' | kw= 'description' | kw= 'sex' | kw= 'type' )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:300:1: (kw= 'full name' | kw= 'age' | kw= 'description' | kw= 'sex' | kw= 'type' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case 18:
                {
                alt7=4;
                }
                break;
            case 19:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:301:2: kw= 'full name'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleDefaultAttribute550); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDefaultAttributeAccess().getFullNameKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:308:2: kw= 'age'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleDefaultAttribute569); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDefaultAttributeAccess().getAgeKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:315:2: kw= 'description'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleDefaultAttribute588); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDefaultAttributeAccess().getDescriptionKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:322:2: kw= 'sex'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleDefaultAttribute607); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDefaultAttributeAccess().getSexKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:329:2: kw= 'type'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleDefaultAttribute626); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDefaultAttributeAccess().getTypeKeyword_4()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleDefaultAttribute"


    // $ANTLR start "entryRuleCustomAttribute"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:342:1: entryRuleCustomAttribute returns [EObject current=null] : iv_ruleCustomAttribute= ruleCustomAttribute EOF ;
    public final EObject entryRuleCustomAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomAttribute = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:343:2: (iv_ruleCustomAttribute= ruleCustomAttribute EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:344:2: iv_ruleCustomAttribute= ruleCustomAttribute EOF
            {
             newCompositeNode(grammarAccess.getCustomAttributeRule()); 
            pushFollow(FOLLOW_ruleCustomAttribute_in_entryRuleCustomAttribute666);
            iv_ruleCustomAttribute=ruleCustomAttribute();

            state._fsp--;

             current =iv_ruleCustomAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomAttribute676); 

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
    // $ANTLR end "entryRuleCustomAttribute"


    // $ANTLR start "ruleCustomAttribute"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:351:1: ruleCustomAttribute returns [EObject current=null] : ( ( (lv_caName_0_0= ruleCustomAttributeName ) ) otherlv_1= 'as' ( ( (lv_type_2_0= ruleAttributeType ) ) | (otherlv_3= '(' ( (lv_enumValues_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_enumValues_6_0= ruleEnumValue ) ) )* otherlv_7= ')' ) ) ) ;
    public final EObject ruleCustomAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_caName_0_0 = null;

        Enumerator lv_type_2_0 = null;

        EObject lv_enumValues_4_0 = null;

        EObject lv_enumValues_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:354:28: ( ( ( (lv_caName_0_0= ruleCustomAttributeName ) ) otherlv_1= 'as' ( ( (lv_type_2_0= ruleAttributeType ) ) | (otherlv_3= '(' ( (lv_enumValues_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_enumValues_6_0= ruleEnumValue ) ) )* otherlv_7= ')' ) ) ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:355:1: ( ( (lv_caName_0_0= ruleCustomAttributeName ) ) otherlv_1= 'as' ( ( (lv_type_2_0= ruleAttributeType ) ) | (otherlv_3= '(' ( (lv_enumValues_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_enumValues_6_0= ruleEnumValue ) ) )* otherlv_7= ')' ) ) )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:355:1: ( ( (lv_caName_0_0= ruleCustomAttributeName ) ) otherlv_1= 'as' ( ( (lv_type_2_0= ruleAttributeType ) ) | (otherlv_3= '(' ( (lv_enumValues_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_enumValues_6_0= ruleEnumValue ) ) )* otherlv_7= ')' ) ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:355:2: ( (lv_caName_0_0= ruleCustomAttributeName ) ) otherlv_1= 'as' ( ( (lv_type_2_0= ruleAttributeType ) ) | (otherlv_3= '(' ( (lv_enumValues_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_enumValues_6_0= ruleEnumValue ) ) )* otherlv_7= ')' ) )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:355:2: ( (lv_caName_0_0= ruleCustomAttributeName ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:356:1: (lv_caName_0_0= ruleCustomAttributeName )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:356:1: (lv_caName_0_0= ruleCustomAttributeName )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:357:3: lv_caName_0_0= ruleCustomAttributeName
            {
             
            	        newCompositeNode(grammarAccess.getCustomAttributeAccess().getCaNameCustomAttributeNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCustomAttributeName_in_ruleCustomAttribute722);
            lv_caName_0_0=ruleCustomAttributeName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"caName",
                    		lv_caName_0_0, 
                    		"CustomAttributeName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCustomAttribute734); 

                	newLeafNode(otherlv_1, grammarAccess.getCustomAttributeAccess().getAsKeyword_1());
                
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:377:1: ( ( (lv_type_2_0= ruleAttributeType ) ) | (otherlv_3= '(' ( (lv_enumValues_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_enumValues_6_0= ruleEnumValue ) ) )* otherlv_7= ')' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=28 && LA9_0<=29)) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:377:2: ( (lv_type_2_0= ruleAttributeType ) )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:377:2: ( (lv_type_2_0= ruleAttributeType ) )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:378:1: (lv_type_2_0= ruleAttributeType )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:378:1: (lv_type_2_0= ruleAttributeType )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:379:3: lv_type_2_0= ruleAttributeType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCustomAttributeAccess().getTypeAttributeTypeEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeType_in_ruleCustomAttribute756);
                    lv_type_2_0=ruleAttributeType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCustomAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_2_0, 
                            		"AttributeType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:396:6: (otherlv_3= '(' ( (lv_enumValues_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_enumValues_6_0= ruleEnumValue ) ) )* otherlv_7= ')' )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:396:6: (otherlv_3= '(' ( (lv_enumValues_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_enumValues_6_0= ruleEnumValue ) ) )* otherlv_7= ')' )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:396:8: otherlv_3= '(' ( (lv_enumValues_4_0= ruleEnumValue ) ) (otherlv_5= ',' ( (lv_enumValues_6_0= ruleEnumValue ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleCustomAttribute775); 

                        	newLeafNode(otherlv_3, grammarAccess.getCustomAttributeAccess().getLeftParenthesisKeyword_2_1_0());
                        
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:400:1: ( (lv_enumValues_4_0= ruleEnumValue ) )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:401:1: (lv_enumValues_4_0= ruleEnumValue )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:401:1: (lv_enumValues_4_0= ruleEnumValue )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:402:3: lv_enumValues_4_0= ruleEnumValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getCustomAttributeAccess().getEnumValuesEnumValueParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnumValue_in_ruleCustomAttribute796);
                    lv_enumValues_4_0=ruleEnumValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCustomAttributeRule());
                    	        }
                           		add(
                           			current, 
                           			"enumValues",
                            		lv_enumValues_4_0, 
                            		"EnumValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:418:2: (otherlv_5= ',' ( (lv_enumValues_6_0= ruleEnumValue ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==22) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:418:4: otherlv_5= ',' ( (lv_enumValues_6_0= ruleEnumValue ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleCustomAttribute809); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getCustomAttributeAccess().getCommaKeyword_2_1_2_0());
                    	        
                    	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:422:1: ( (lv_enumValues_6_0= ruleEnumValue ) )
                    	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:423:1: (lv_enumValues_6_0= ruleEnumValue )
                    	    {
                    	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:423:1: (lv_enumValues_6_0= ruleEnumValue )
                    	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:424:3: lv_enumValues_6_0= ruleEnumValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCustomAttributeAccess().getEnumValuesEnumValueParserRuleCall_2_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEnumValue_in_ruleCustomAttribute830);
                    	    lv_enumValues_6_0=ruleEnumValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCustomAttributeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"enumValues",
                    	            		lv_enumValues_6_0, 
                    	            		"EnumValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleCustomAttribute844); 

                        	newLeafNode(otherlv_7, grammarAccess.getCustomAttributeAccess().getRightParenthesisKeyword_2_1_3());
                        

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
    // $ANTLR end "ruleCustomAttribute"


    // $ANTLR start "entryRuleCustomAttributeName"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:452:1: entryRuleCustomAttributeName returns [EObject current=null] : iv_ruleCustomAttributeName= ruleCustomAttributeName EOF ;
    public final EObject entryRuleCustomAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomAttributeName = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:453:2: (iv_ruleCustomAttributeName= ruleCustomAttributeName EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:454:2: iv_ruleCustomAttributeName= ruleCustomAttributeName EOF
            {
             newCompositeNode(grammarAccess.getCustomAttributeNameRule()); 
            pushFollow(FOLLOW_ruleCustomAttributeName_in_entryRuleCustomAttributeName882);
            iv_ruleCustomAttributeName=ruleCustomAttributeName();

            state._fsp--;

             current =iv_ruleCustomAttributeName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomAttributeName892); 

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
    // $ANTLR end "entryRuleCustomAttributeName"


    // $ANTLR start "ruleCustomAttributeName"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:461:1: ruleCustomAttributeName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCustomAttributeName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:464:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:465:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:465:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:466:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:466:1: (lv_name_0_0= RULE_ID )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:467:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomAttributeName933); 

            			newLeafNode(lv_name_0_0, grammarAccess.getCustomAttributeNameAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomAttributeNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleCustomAttributeName"


    // $ANTLR start "entryRuleEnumValue"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:491:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:492:2: (iv_ruleEnumValue= ruleEnumValue EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:493:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
             newCompositeNode(grammarAccess.getEnumValueRule()); 
            pushFollow(FOLLOW_ruleEnumValue_in_entryRuleEnumValue973);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;

             current =iv_ruleEnumValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumValue983); 

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
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:500:1: ruleEnumValue returns [EObject current=null] : ( (lv_name_0_0= ruleEnumID ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:503:28: ( ( (lv_name_0_0= ruleEnumID ) ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:504:1: ( (lv_name_0_0= ruleEnumID ) )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:504:1: ( (lv_name_0_0= ruleEnumID ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:505:1: (lv_name_0_0= ruleEnumID )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:505:1: (lv_name_0_0= ruleEnumID )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:506:3: lv_name_0_0= ruleEnumID
            {
             
            	        newCompositeNode(grammarAccess.getEnumValueAccess().getNameEnumIDParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumID_in_ruleEnumValue1028);
            lv_name_0_0=ruleEnumID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumValueRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EnumID");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleEnumID"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:530:1: entryRuleEnumID returns [String current=null] : iv_ruleEnumID= ruleEnumID EOF ;
    public final String entryRuleEnumID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEnumID = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:531:2: (iv_ruleEnumID= ruleEnumID EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:532:2: iv_ruleEnumID= ruleEnumID EOF
            {
             newCompositeNode(grammarAccess.getEnumIDRule()); 
            pushFollow(FOLLOW_ruleEnumID_in_entryRuleEnumID1064);
            iv_ruleEnumID=ruleEnumID();

            state._fsp--;

             current =iv_ruleEnumID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumID1075); 

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
    // $ANTLR end "entryRuleEnumID"


    // $ANTLR start "ruleEnumID"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:539:1: ruleEnumID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEnumID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:542:28: ( (this_INT_0= RULE_INT | this_ID_1= RULE_ID ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:543:1: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:543:1: (this_INT_0= RULE_INT | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:543:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumID1115); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getEnumIDAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:551:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumID1141); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEnumIDAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleEnumID"


    // $ANTLR start "entryRuleCustoms"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:566:1: entryRuleCustoms returns [EObject current=null] : iv_ruleCustoms= ruleCustoms EOF ;
    public final EObject entryRuleCustoms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustoms = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:567:2: (iv_ruleCustoms= ruleCustoms EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:568:2: iv_ruleCustoms= ruleCustoms EOF
            {
             newCompositeNode(grammarAccess.getCustomsRule()); 
            pushFollow(FOLLOW_ruleCustoms_in_entryRuleCustoms1186);
            iv_ruleCustoms=ruleCustoms();

            state._fsp--;

             current =iv_ruleCustoms; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustoms1196); 

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
    // $ANTLR end "entryRuleCustoms"


    // $ANTLR start "ruleCustoms"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:575:1: ruleCustoms returns [EObject current=null] : (otherlv_0= 'custom' otherlv_1= 'attributes' ( (lv_customAttributes_2_0= ruleCustomAttribute ) ) ( (lv_customAttributes_3_0= ruleCustomAttribute ) )* otherlv_4= 'end' ) ;
    public final EObject ruleCustoms() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_customAttributes_2_0 = null;

        EObject lv_customAttributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:578:28: ( (otherlv_0= 'custom' otherlv_1= 'attributes' ( (lv_customAttributes_2_0= ruleCustomAttribute ) ) ( (lv_customAttributes_3_0= ruleCustomAttribute ) )* otherlv_4= 'end' ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:579:1: (otherlv_0= 'custom' otherlv_1= 'attributes' ( (lv_customAttributes_2_0= ruleCustomAttribute ) ) ( (lv_customAttributes_3_0= ruleCustomAttribute ) )* otherlv_4= 'end' )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:579:1: (otherlv_0= 'custom' otherlv_1= 'attributes' ( (lv_customAttributes_2_0= ruleCustomAttribute ) ) ( (lv_customAttributes_3_0= ruleCustomAttribute ) )* otherlv_4= 'end' )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:579:3: otherlv_0= 'custom' otherlv_1= 'attributes' ( (lv_customAttributes_2_0= ruleCustomAttribute ) ) ( (lv_customAttributes_3_0= ruleCustomAttribute ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleCustoms1233); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomsAccess().getCustomKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleCustoms1245); 

                	newLeafNode(otherlv_1, grammarAccess.getCustomsAccess().getAttributesKeyword_1());
                
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:587:1: ( (lv_customAttributes_2_0= ruleCustomAttribute ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:588:1: (lv_customAttributes_2_0= ruleCustomAttribute )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:588:1: (lv_customAttributes_2_0= ruleCustomAttribute )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:589:3: lv_customAttributes_2_0= ruleCustomAttribute
            {
             
            	        newCompositeNode(grammarAccess.getCustomsAccess().getCustomAttributesCustomAttributeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCustomAttribute_in_ruleCustoms1266);
            lv_customAttributes_2_0=ruleCustomAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomsRule());
            	        }
                   		add(
                   			current, 
                   			"customAttributes",
                    		lv_customAttributes_2_0, 
                    		"CustomAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:605:2: ( (lv_customAttributes_3_0= ruleCustomAttribute ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:606:1: (lv_customAttributes_3_0= ruleCustomAttribute )
            	    {
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:606:1: (lv_customAttributes_3_0= ruleCustomAttribute )
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:607:3: lv_customAttributes_3_0= ruleCustomAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCustomsAccess().getCustomAttributesCustomAttributeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCustomAttribute_in_ruleCustoms1287);
            	    lv_customAttributes_3_0=ruleCustomAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCustomsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"customAttributes",
            	            		lv_customAttributes_3_0, 
            	            		"CustomAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleCustoms1300); 

                	newLeafNode(otherlv_4, grammarAccess.getCustomsAccess().getEndKeyword_4());
                

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
    // $ANTLR end "ruleCustoms"


    // $ANTLR start "entryRuleCharacter"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:635:1: entryRuleCharacter returns [EObject current=null] : iv_ruleCharacter= ruleCharacter EOF ;
    public final EObject entryRuleCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacter = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:636:2: (iv_ruleCharacter= ruleCharacter EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:637:2: iv_ruleCharacter= ruleCharacter EOF
            {
             newCompositeNode(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_ruleCharacter_in_entryRuleCharacter1336);
            iv_ruleCharacter=ruleCharacter();

            state._fsp--;

             current =iv_ruleCharacter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharacter1346); 

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
    // $ANTLR end "entryRuleCharacter"


    // $ANTLR start "ruleCharacter"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:644:1: ruleCharacter returns [EObject current=null] : (otherlv_0= 'character' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= 'end' ) ;
    public final EObject ruleCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:647:28: ( (otherlv_0= 'character' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= 'end' ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:648:1: (otherlv_0= 'character' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= 'end' )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:648:1: (otherlv_0= 'character' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= 'end' )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:648:3: otherlv_0= 'character' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? ( (lv_properties_4_0= ruleProperty ) )* otherlv_5= 'end'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleCharacter1383); 

                	newLeafNode(otherlv_0, grammarAccess.getCharacterAccess().getCharacterKeyword_0());
                
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:652:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:653:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:653:1: (lv_name_1_0= RULE_ID )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:654:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCharacter1400); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCharacterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:670:2: (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:670:4: otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleCharacter1418); 

                        	newLeafNode(otherlv_2, grammarAccess.getCharacterAccess().getUsesKeyword_2_0());
                        
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:674:1: ( (otherlv_3= RULE_ID ) )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:675:1: (otherlv_3= RULE_ID )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:675:1: (otherlv_3= RULE_ID )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:676:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCharacterRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCharacter1438); 

                    		newLeafNode(otherlv_3, grammarAccess.getCharacterAccess().getTemplateTemplateCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:687:4: ( (lv_properties_4_0= ruleProperty ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=15 && LA13_0<=19)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:688:1: (lv_properties_4_0= ruleProperty )
            	    {
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:688:1: (lv_properties_4_0= ruleProperty )
            	    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:689:3: lv_properties_4_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCharacterAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleCharacter1461);
            	    lv_properties_4_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCharacterRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_4_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleCharacter1474); 

                	newLeafNode(otherlv_5, grammarAccess.getCharacterAccess().getEndKeyword_4());
                

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
    // $ANTLR end "ruleCharacter"


    // $ANTLR start "entryRuleProperty"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:717:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:718:2: (iv_ruleProperty= ruleProperty EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:719:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1510);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1520); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:726:1: ruleProperty returns [EObject current=null] : (this_DefaultProperty_0= ruleDefaultProperty | this_CustomProperty_1= ruleCustomProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_DefaultProperty_0 = null;

        EObject this_CustomProperty_1 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:729:28: ( (this_DefaultProperty_0= ruleDefaultProperty | this_CustomProperty_1= ruleCustomProperty ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:730:1: (this_DefaultProperty_0= ruleDefaultProperty | this_CustomProperty_1= ruleCustomProperty )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:730:1: (this_DefaultProperty_0= ruleDefaultProperty | this_CustomProperty_1= ruleCustomProperty )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=15 && LA14_0<=19)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:731:5: this_DefaultProperty_0= ruleDefaultProperty
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getDefaultPropertyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDefaultProperty_in_ruleProperty1567);
                    this_DefaultProperty_0=ruleDefaultProperty();

                    state._fsp--;

                     
                            current = this_DefaultProperty_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:741:5: this_CustomProperty_1= ruleCustomProperty
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getCustomPropertyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCustomProperty_in_ruleProperty1594);
                    this_CustomProperty_1=ruleCustomProperty();

                    state._fsp--;

                     
                            current = this_CustomProperty_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleDefaultProperty"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:757:1: entryRuleDefaultProperty returns [EObject current=null] : iv_ruleDefaultProperty= ruleDefaultProperty EOF ;
    public final EObject entryRuleDefaultProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultProperty = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:758:2: (iv_ruleDefaultProperty= ruleDefaultProperty EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:759:2: iv_ruleDefaultProperty= ruleDefaultProperty EOF
            {
             newCompositeNode(grammarAccess.getDefaultPropertyRule()); 
            pushFollow(FOLLOW_ruleDefaultProperty_in_entryRuleDefaultProperty1629);
            iv_ruleDefaultProperty=ruleDefaultProperty();

            state._fsp--;

             current =iv_ruleDefaultProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultProperty1639); 

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
    // $ANTLR end "entryRuleDefaultProperty"


    // $ANTLR start "ruleDefaultProperty"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:766:1: ruleDefaultProperty returns [EObject current=null] : (this_FullName_0= ruleFullName | this_Description_1= ruleDescription | this_Type_2= ruleType | this_Age_3= ruleAge | this_Sex_4= ruleSex ) ;
    public final EObject ruleDefaultProperty() throws RecognitionException {
        EObject current = null;

        EObject this_FullName_0 = null;

        EObject this_Description_1 = null;

        EObject this_Type_2 = null;

        EObject this_Age_3 = null;

        EObject this_Sex_4 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:769:28: ( (this_FullName_0= ruleFullName | this_Description_1= ruleDescription | this_Type_2= ruleType | this_Age_3= ruleAge | this_Sex_4= ruleSex ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:770:1: (this_FullName_0= ruleFullName | this_Description_1= ruleDescription | this_Type_2= ruleType | this_Age_3= ruleAge | this_Sex_4= ruleSex )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:770:1: (this_FullName_0= ruleFullName | this_Description_1= ruleDescription | this_Type_2= ruleType | this_Age_3= ruleAge | this_Sex_4= ruleSex )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt15=1;
                }
                break;
            case 17:
                {
                alt15=2;
                }
                break;
            case 19:
                {
                alt15=3;
                }
                break;
            case 16:
                {
                alt15=4;
                }
                break;
            case 18:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:771:5: this_FullName_0= ruleFullName
                    {
                     
                            newCompositeNode(grammarAccess.getDefaultPropertyAccess().getFullNameParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFullName_in_ruleDefaultProperty1686);
                    this_FullName_0=ruleFullName();

                    state._fsp--;

                     
                            current = this_FullName_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:781:5: this_Description_1= ruleDescription
                    {
                     
                            newCompositeNode(grammarAccess.getDefaultPropertyAccess().getDescriptionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDescription_in_ruleDefaultProperty1713);
                    this_Description_1=ruleDescription();

                    state._fsp--;

                     
                            current = this_Description_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:791:5: this_Type_2= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getDefaultPropertyAccess().getTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleDefaultProperty1740);
                    this_Type_2=ruleType();

                    state._fsp--;

                     
                            current = this_Type_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:801:5: this_Age_3= ruleAge
                    {
                     
                            newCompositeNode(grammarAccess.getDefaultPropertyAccess().getAgeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAge_in_ruleDefaultProperty1767);
                    this_Age_3=ruleAge();

                    state._fsp--;

                     
                            current = this_Age_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:811:5: this_Sex_4= ruleSex
                    {
                     
                            newCompositeNode(grammarAccess.getDefaultPropertyAccess().getSexParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSex_in_ruleDefaultProperty1794);
                    this_Sex_4=ruleSex();

                    state._fsp--;

                     
                            current = this_Sex_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleDefaultProperty"


    // $ANTLR start "entryRuleFullName"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:827:1: entryRuleFullName returns [EObject current=null] : iv_ruleFullName= ruleFullName EOF ;
    public final EObject entryRuleFullName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullName = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:828:2: (iv_ruleFullName= ruleFullName EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:829:2: iv_ruleFullName= ruleFullName EOF
            {
             newCompositeNode(grammarAccess.getFullNameRule()); 
            pushFollow(FOLLOW_ruleFullName_in_entryRuleFullName1829);
            iv_ruleFullName=ruleFullName();

            state._fsp--;

             current =iv_ruleFullName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullName1839); 

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
    // $ANTLR end "entryRuleFullName"


    // $ANTLR start "ruleFullName"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:836:1: ruleFullName returns [EObject current=null] : (otherlv_0= 'full name' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? ) ;
    public final EObject ruleFullName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token lv_comment_2_0=null;

         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:839:28: ( (otherlv_0= 'full name' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:840:1: (otherlv_0= 'full name' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:840:1: (otherlv_0= 'full name' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:840:3: otherlv_0= 'full name' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_COMMENT ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleFullName1876); 

                	newLeafNode(otherlv_0, grammarAccess.getFullNameAccess().getFullNameKeyword_0());
                
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:844:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:845:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:845:1: (lv_value_1_0= RULE_STRING )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:846:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFullName1893); 

            			newLeafNode(lv_value_1_0, grammarAccess.getFullNameAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFullNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:862:2: ( (lv_comment_2_0= RULE_COMMENT ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_COMMENT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:863:1: (lv_comment_2_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:863:1: (lv_comment_2_0= RULE_COMMENT )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:864:3: lv_comment_2_0= RULE_COMMENT
                    {
                    lv_comment_2_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleFullName1915); 

                    			newLeafNode(lv_comment_2_0, grammarAccess.getFullNameAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFullNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_2_0, 
                            		"COMMENT");
                    	    

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
    // $ANTLR end "ruleFullName"


    // $ANTLR start "entryRuleDescription"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:888:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:889:2: (iv_ruleDescription= ruleDescription EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:890:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription1957);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription1967); 

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
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:897:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token lv_comment_2_0=null;

         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:900:28: ( (otherlv_0= 'description' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:901:1: (otherlv_0= 'description' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:901:1: (otherlv_0= 'description' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:901:3: otherlv_0= 'description' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_comment_2_0= RULE_COMMENT ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleDescription2004); 

                	newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
                
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:905:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:906:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:906:1: (lv_value_1_0= RULE_STRING )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:907:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDescription2021); 

            			newLeafNode(lv_value_1_0, grammarAccess.getDescriptionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDescriptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:923:2: ( (lv_comment_2_0= RULE_COMMENT ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_COMMENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:924:1: (lv_comment_2_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:924:1: (lv_comment_2_0= RULE_COMMENT )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:925:3: lv_comment_2_0= RULE_COMMENT
                    {
                    lv_comment_2_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleDescription2043); 

                    			newLeafNode(lv_comment_2_0, grammarAccess.getDescriptionAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDescriptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_2_0, 
                            		"COMMENT");
                    	    

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
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleType"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:949:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:950:2: (iv_ruleType= ruleType EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:951:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2085);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2095); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:958:1: ruleType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_value_1_0= ruleCharaType ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_comment_2_0=null;
        Enumerator lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:961:28: ( (otherlv_0= 'type' ( (lv_value_1_0= ruleCharaType ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:962:1: (otherlv_0= 'type' ( (lv_value_1_0= ruleCharaType ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:962:1: (otherlv_0= 'type' ( (lv_value_1_0= ruleCharaType ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:962:3: otherlv_0= 'type' ( (lv_value_1_0= ruleCharaType ) ) ( (lv_comment_2_0= RULE_COMMENT ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleType2132); 

                	newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
                
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:966:1: ( (lv_value_1_0= ruleCharaType ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:967:1: (lv_value_1_0= ruleCharaType )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:967:1: (lv_value_1_0= ruleCharaType )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:968:3: lv_value_1_0= ruleCharaType
            {
             
            	        newCompositeNode(grammarAccess.getTypeAccess().getValueCharaTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCharaType_in_ruleType2153);
            lv_value_1_0=ruleCharaType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"CharaType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:984:2: ( (lv_comment_2_0= RULE_COMMENT ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_COMMENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:985:1: (lv_comment_2_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:985:1: (lv_comment_2_0= RULE_COMMENT )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:986:3: lv_comment_2_0= RULE_COMMENT
                    {
                    lv_comment_2_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleType2170); 

                    			newLeafNode(lv_comment_2_0, grammarAccess.getTypeAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_2_0, 
                            		"COMMENT");
                    	    

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleAge"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1010:1: entryRuleAge returns [EObject current=null] : iv_ruleAge= ruleAge EOF ;
    public final EObject entryRuleAge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAge = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1011:2: (iv_ruleAge= ruleAge EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1012:2: iv_ruleAge= ruleAge EOF
            {
             newCompositeNode(grammarAccess.getAgeRule()); 
            pushFollow(FOLLOW_ruleAge_in_entryRuleAge2212);
            iv_ruleAge=ruleAge();

            state._fsp--;

             current =iv_ruleAge; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAge2222); 

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
    // $ANTLR end "entryRuleAge"


    // $ANTLR start "ruleAge"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1019:1: ruleAge returns [EObject current=null] : (otherlv_0= 'age' ( (lv_value_1_0= RULE_INT ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? ) ;
    public final EObject ruleAge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token lv_comment_2_0=null;

         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1022:28: ( (otherlv_0= 'age' ( (lv_value_1_0= RULE_INT ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1023:1: (otherlv_0= 'age' ( (lv_value_1_0= RULE_INT ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1023:1: (otherlv_0= 'age' ( (lv_value_1_0= RULE_INT ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1023:3: otherlv_0= 'age' ( (lv_value_1_0= RULE_INT ) ) ( (lv_comment_2_0= RULE_COMMENT ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAge2259); 

                	newLeafNode(otherlv_0, grammarAccess.getAgeAccess().getAgeKeyword_0());
                
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1027:1: ( (lv_value_1_0= RULE_INT ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1028:1: (lv_value_1_0= RULE_INT )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1028:1: (lv_value_1_0= RULE_INT )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1029:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAge2276); 

            			newLeafNode(lv_value_1_0, grammarAccess.getAgeAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAgeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

            }


            }

            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1045:2: ( (lv_comment_2_0= RULE_COMMENT ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_COMMENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1046:1: (lv_comment_2_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1046:1: (lv_comment_2_0= RULE_COMMENT )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1047:3: lv_comment_2_0= RULE_COMMENT
                    {
                    lv_comment_2_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleAge2298); 

                    			newLeafNode(lv_comment_2_0, grammarAccess.getAgeAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAgeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_2_0, 
                            		"COMMENT");
                    	    

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
    // $ANTLR end "ruleAge"


    // $ANTLR start "entryRuleSex"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1071:1: entryRuleSex returns [EObject current=null] : iv_ruleSex= ruleSex EOF ;
    public final EObject entryRuleSex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSex = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1072:2: (iv_ruleSex= ruleSex EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1073:2: iv_ruleSex= ruleSex EOF
            {
             newCompositeNode(grammarAccess.getSexRule()); 
            pushFollow(FOLLOW_ruleSex_in_entryRuleSex2340);
            iv_ruleSex=ruleSex();

            state._fsp--;

             current =iv_ruleSex; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSex2350); 

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
    // $ANTLR end "entryRuleSex"


    // $ANTLR start "ruleSex"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1080:1: ruleSex returns [EObject current=null] : (otherlv_0= 'sex' ( (lv_value_1_0= ruleCharaSex ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? ) ;
    public final EObject ruleSex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_comment_2_0=null;
        Enumerator lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1083:28: ( (otherlv_0= 'sex' ( (lv_value_1_0= ruleCharaSex ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1084:1: (otherlv_0= 'sex' ( (lv_value_1_0= ruleCharaSex ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1084:1: (otherlv_0= 'sex' ( (lv_value_1_0= ruleCharaSex ) ) ( (lv_comment_2_0= RULE_COMMENT ) )? )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1084:3: otherlv_0= 'sex' ( (lv_value_1_0= ruleCharaSex ) ) ( (lv_comment_2_0= RULE_COMMENT ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleSex2387); 

                	newLeafNode(otherlv_0, grammarAccess.getSexAccess().getSexKeyword_0());
                
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1088:1: ( (lv_value_1_0= ruleCharaSex ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1089:1: (lv_value_1_0= ruleCharaSex )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1089:1: (lv_value_1_0= ruleCharaSex )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1090:3: lv_value_1_0= ruleCharaSex
            {
             
            	        newCompositeNode(grammarAccess.getSexAccess().getValueCharaSexEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleCharaSex_in_ruleSex2408);
            lv_value_1_0=ruleCharaSex();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSexRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"CharaSex");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1106:2: ( (lv_comment_2_0= RULE_COMMENT ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_COMMENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1107:1: (lv_comment_2_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1107:1: (lv_comment_2_0= RULE_COMMENT )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1108:3: lv_comment_2_0= RULE_COMMENT
                    {
                    lv_comment_2_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleSex2425); 

                    			newLeafNode(lv_comment_2_0, grammarAccess.getSexAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSexRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_2_0, 
                            		"COMMENT");
                    	    

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
    // $ANTLR end "ruleSex"


    // $ANTLR start "entryRuleCustomProperty"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1132:1: entryRuleCustomProperty returns [EObject current=null] : iv_ruleCustomProperty= ruleCustomProperty EOF ;
    public final EObject entryRuleCustomProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomProperty = null;


        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1133:2: (iv_ruleCustomProperty= ruleCustomProperty EOF )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1134:2: iv_ruleCustomProperty= ruleCustomProperty EOF
            {
             newCompositeNode(grammarAccess.getCustomPropertyRule()); 
            pushFollow(FOLLOW_ruleCustomProperty_in_entryRuleCustomProperty2467);
            iv_ruleCustomProperty=ruleCustomProperty();

            state._fsp--;

             current =iv_ruleCustomProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomProperty2477); 

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
    // $ANTLR end "entryRuleCustomProperty"


    // $ANTLR start "ruleCustomProperty"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1141:1: ruleCustomProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_intValue_2_0= RULE_INT ) ) | (otherlv_3= '(' ( ( ruleEnumID ) ) otherlv_5= ')' ) ) ( (lv_comment_6_0= RULE_COMMENT ) )? ) ;
    public final EObject ruleCustomProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stringValue_1_0=null;
        Token lv_intValue_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_comment_6_0=null;

         enterRule(); 
            
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1144:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_intValue_2_0= RULE_INT ) ) | (otherlv_3= '(' ( ( ruleEnumID ) ) otherlv_5= ')' ) ) ( (lv_comment_6_0= RULE_COMMENT ) )? ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1145:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_intValue_2_0= RULE_INT ) ) | (otherlv_3= '(' ( ( ruleEnumID ) ) otherlv_5= ')' ) ) ( (lv_comment_6_0= RULE_COMMENT ) )? )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1145:1: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_intValue_2_0= RULE_INT ) ) | (otherlv_3= '(' ( ( ruleEnumID ) ) otherlv_5= ')' ) ) ( (lv_comment_6_0= RULE_COMMENT ) )? )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1145:2: ( (otherlv_0= RULE_ID ) ) ( ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_intValue_2_0= RULE_INT ) ) | (otherlv_3= '(' ( ( ruleEnumID ) ) otherlv_5= ')' ) ) ( (lv_comment_6_0= RULE_COMMENT ) )?
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1145:2: ( (otherlv_0= RULE_ID ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1146:1: (otherlv_0= RULE_ID )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1146:1: (otherlv_0= RULE_ID )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1147:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCustomPropertyRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomProperty2522); 

            		newLeafNode(otherlv_0, grammarAccess.getCustomPropertyAccess().getCustomAttributeRefCustomAttributeNameCrossReference_0_0()); 
            	

            }


            }

            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1158:2: ( ( (lv_stringValue_1_0= RULE_STRING ) ) | ( (lv_intValue_2_0= RULE_INT ) ) | (otherlv_3= '(' ( ( ruleEnumID ) ) otherlv_5= ')' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt21=1;
                }
                break;
            case RULE_INT:
                {
                alt21=2;
                }
                break;
            case 21:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1158:3: ( (lv_stringValue_1_0= RULE_STRING ) )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1158:3: ( (lv_stringValue_1_0= RULE_STRING ) )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1159:1: (lv_stringValue_1_0= RULE_STRING )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1159:1: (lv_stringValue_1_0= RULE_STRING )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1160:3: lv_stringValue_1_0= RULE_STRING
                    {
                    lv_stringValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCustomProperty2540); 

                    			newLeafNode(lv_stringValue_1_0, grammarAccess.getCustomPropertyAccess().getStringValueSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCustomPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"stringValue",
                            		lv_stringValue_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1177:6: ( (lv_intValue_2_0= RULE_INT ) )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1177:6: ( (lv_intValue_2_0= RULE_INT ) )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1178:1: (lv_intValue_2_0= RULE_INT )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1178:1: (lv_intValue_2_0= RULE_INT )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1179:3: lv_intValue_2_0= RULE_INT
                    {
                    lv_intValue_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCustomProperty2568); 

                    			newLeafNode(lv_intValue_2_0, grammarAccess.getCustomPropertyAccess().getIntValueINTTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCustomPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"intValue",
                            		lv_intValue_2_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1196:6: (otherlv_3= '(' ( ( ruleEnumID ) ) otherlv_5= ')' )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1196:6: (otherlv_3= '(' ( ( ruleEnumID ) ) otherlv_5= ')' )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1196:8: otherlv_3= '(' ( ( ruleEnumID ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleCustomProperty2592); 

                        	newLeafNode(otherlv_3, grammarAccess.getCustomPropertyAccess().getLeftParenthesisKeyword_1_2_0());
                        
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1200:1: ( ( ruleEnumID ) )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1201:1: ( ruleEnumID )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1201:1: ( ruleEnumID )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1202:3: ruleEnumID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCustomPropertyRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCustomPropertyAccess().getEnumValueEnumValueCrossReference_1_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnumID_in_ruleCustomProperty2615);
                    ruleEnumID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleCustomProperty2627); 

                        	newLeafNode(otherlv_5, grammarAccess.getCustomPropertyAccess().getRightParenthesisKeyword_1_2_2());
                        

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1219:3: ( (lv_comment_6_0= RULE_COMMENT ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_COMMENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1220:1: (lv_comment_6_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1220:1: (lv_comment_6_0= RULE_COMMENT )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1221:3: lv_comment_6_0= RULE_COMMENT
                    {
                    lv_comment_6_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleCustomProperty2646); 

                    			newLeafNode(lv_comment_6_0, grammarAccess.getCustomPropertyAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCustomPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_6_0, 
                            		"COMMENT");
                    	    

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
    // $ANTLR end "ruleCustomProperty"


    // $ANTLR start "ruleAttributeType"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1245:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'NUMBER' ) | (enumLiteral_1= 'TEXT' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1247:28: ( ( (enumLiteral_0= 'NUMBER' ) | (enumLiteral_1= 'TEXT' ) ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1248:1: ( (enumLiteral_0= 'NUMBER' ) | (enumLiteral_1= 'TEXT' ) )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1248:1: ( (enumLiteral_0= 'NUMBER' ) | (enumLiteral_1= 'TEXT' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            else if ( (LA23_0==29) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1248:2: (enumLiteral_0= 'NUMBER' )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1248:2: (enumLiteral_0= 'NUMBER' )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1248:4: enumLiteral_0= 'NUMBER'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_ruleAttributeType2702); 

                            current = grammarAccess.getAttributeTypeAccess().getNUMBEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getNUMBEREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1254:6: (enumLiteral_1= 'TEXT' )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1254:6: (enumLiteral_1= 'TEXT' )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1254:8: enumLiteral_1= 'TEXT'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleAttributeType2719); 

                            current = grammarAccess.getAttributeTypeAccess().getTEXTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getTEXTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "ruleCharaType"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1264:1: ruleCharaType returns [Enumerator current=null] : ( (enumLiteral_0= 'PC' ) | (enumLiteral_1= 'NPC' ) ) ;
    public final Enumerator ruleCharaType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1266:28: ( ( (enumLiteral_0= 'PC' ) | (enumLiteral_1= 'NPC' ) ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1267:1: ( (enumLiteral_0= 'PC' ) | (enumLiteral_1= 'NPC' ) )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1267:1: ( (enumLiteral_0= 'PC' ) | (enumLiteral_1= 'NPC' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            else if ( (LA24_0==31) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1267:2: (enumLiteral_0= 'PC' )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1267:2: (enumLiteral_0= 'PC' )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1267:4: enumLiteral_0= 'PC'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_30_in_ruleCharaType2764); 

                            current = grammarAccess.getCharaTypeAccess().getPCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCharaTypeAccess().getPCEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1273:6: (enumLiteral_1= 'NPC' )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1273:6: (enumLiteral_1= 'NPC' )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1273:8: enumLiteral_1= 'NPC'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_31_in_ruleCharaType2781); 

                            current = grammarAccess.getCharaTypeAccess().getNPCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCharaTypeAccess().getNPCEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleCharaType"


    // $ANTLR start "ruleCharaSex"
    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1283:1: ruleCharaSex returns [Enumerator current=null] : ( (enumLiteral_0= 'male' ) | (enumLiteral_1= 'female' ) ) ;
    public final Enumerator ruleCharaSex() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1285:28: ( ( (enumLiteral_0= 'male' ) | (enumLiteral_1= 'female' ) ) )
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1286:1: ( (enumLiteral_0= 'male' ) | (enumLiteral_1= 'female' ) )
            {
            // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1286:1: ( (enumLiteral_0= 'male' ) | (enumLiteral_1= 'female' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            else if ( (LA25_0==33) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1286:2: (enumLiteral_0= 'male' )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1286:2: (enumLiteral_0= 'male' )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1286:4: enumLiteral_0= 'male'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_32_in_ruleCharaSex2826); 

                            current = grammarAccess.getCharaSexAccess().getMaleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCharaSexAccess().getMaleEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1292:6: (enumLiteral_1= 'female' )
                    {
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1292:6: (enumLiteral_1= 'female' )
                    // ../de.unidue.ecg.characterScript/src-gen/de/unidue/ecg/characterScript/parser/antlr/internal/InternalCharacterScript.g:1292:8: enumLiteral_1= 'female'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_33_in_ruleCharaSex2843); 

                            current = grammarAccess.getCharaSexAccess().getFemaleEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCharaSexAccess().getFemaleEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleCharaSex"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCharacters_in_entryRuleCharacters75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharacters85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleCharacters131 = new BitSet(new long[]{0x0000000005003002L});
    public static final BitSet FOLLOW_ruleTemplate_in_ruleCharacters153 = new BitSet(new long[]{0x0000000005002002L});
    public static final BitSet FOLLOW_ruleCustoms_in_ruleCharacters175 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_ruleCharacters197 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleImport281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImport298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_entryRuleTemplate339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplate349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTemplate386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplate403 = new BitSet(new long[]{0x00000000000FC010L});
    public static final BitSet FOLLOW_ruleDefaultAttribute_in_ruleTemplate429 = new BitSet(new long[]{0x00000000000FC010L});
    public static final BitSet FOLLOW_ruleCustomAttribute_in_ruleTemplate451 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleTemplate464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultAttribute_in_entryRuleDefaultAttribute501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultAttribute512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDefaultAttribute550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDefaultAttribute569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDefaultAttribute588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDefaultAttribute607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDefaultAttribute626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttribute_in_entryRuleCustomAttribute666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomAttribute676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttributeName_in_ruleCustomAttribute722 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCustomAttribute734 = new BitSet(new long[]{0x0000000030200000L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleCustomAttribute756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCustomAttribute775 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEnumValue_in_ruleCustomAttribute796 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleCustomAttribute809 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEnumValue_in_ruleCustomAttribute830 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleCustomAttribute844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomAttributeName_in_entryRuleCustomAttributeName882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomAttributeName892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomAttributeName933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumValue_in_entryRuleEnumValue973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumValue983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumID_in_ruleEnumValue1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumID_in_entryRuleEnumID1064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumID1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumID1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumID1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustoms_in_entryRuleCustoms1186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustoms1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCustoms1233 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCustoms1245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCustomAttribute_in_ruleCustoms1266 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleCustomAttribute_in_ruleCustoms1287 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleCustoms1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharacter_in_entryRuleCharacter1336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharacter1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCharacter1383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCharacter1400 = new BitSet(new long[]{0x00000000080FC010L});
    public static final BitSet FOLLOW_27_in_ruleCharacter1418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCharacter1438 = new BitSet(new long[]{0x00000000000FC010L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleCharacter1461 = new BitSet(new long[]{0x00000000000FC010L});
    public static final BitSet FOLLOW_14_in_ruleCharacter1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultProperty_in_ruleProperty1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomProperty_in_ruleProperty1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultProperty_in_entryRuleDefaultProperty1629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultProperty1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullName_in_ruleDefaultProperty1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_ruleDefaultProperty1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleDefaultProperty1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAge_in_ruleDefaultProperty1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSex_in_ruleDefaultProperty1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullName_in_entryRuleFullName1829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullName1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleFullName1876 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFullName1893 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleFullName1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription1957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDescription2004 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDescription2021 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleDescription2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleType2132 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleCharaType_in_ruleType2153 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleType2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAge_in_entryRuleAge2212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAge2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAge2259 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAge2276 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleAge2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSex_in_entryRuleSex2340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSex2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSex2387 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_ruleCharaSex_in_ruleSex2408 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleSex2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomProperty_in_entryRuleCustomProperty2467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomProperty2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomProperty2522 = new BitSet(new long[]{0x0000000000200060L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCustomProperty2540 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCustomProperty2568 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_21_in_ruleCustomProperty2592 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEnumID_in_ruleCustomProperty2615 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCustomProperty2627 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleCustomProperty2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAttributeType2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAttributeType2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCharaType2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCharaType2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCharaSex2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCharaSex2843 = new BitSet(new long[]{0x0000000000000002L});

}