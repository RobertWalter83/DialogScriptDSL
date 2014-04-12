package de.unidue.ecg.dialogScript.parser.antlr.internal; 

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
import de.unidue.ecg.dialogScript.services.DialogScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDialogScriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_COMMENT", "RULE_STRING", "RULE_WILDCARD", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'characters'", "':'", "','", "'switches'", "'is'", "'conditions'", "'end'", "'set'", "'when'", "'scene'", "'defaults'", "'first'", "'time'", "'else'", "'parting'", "'hidden'", "'hub'", "'choices'", "'if'", "'('", "')'", "'choice'", "'or'", "'enter'", "'exit'", "'and'", "'switch'", "'off'", "'on'", "'single'", "'random'"
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
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_COMMENT=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_WILDCARD=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalDialogScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDialogScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDialogScriptParser.tokenNames; }
    public String getGrammarFileName() { return "../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g"; }



     	private DialogScriptGrammarAccess grammarAccess;
     	
        public InternalDialogScriptParser(TokenStream input, DialogScriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Script";	
       	}
       	
       	@Override
       	protected DialogScriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleScript"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:68:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:69:2: (iv_ruleScript= ruleScript EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:70:2: iv_ruleScript= ruleScript EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScriptRule()); 
            }
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript75);
            iv_ruleScript=ruleScript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScript; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:77:1: ruleScript returns [EObject current=null] : ( () ( (lv_charactersDefinition_1_0= ruleCharactersDefinition ) )? ( (lv_switchesDefinition_2_0= ruleSwitchesDefinition ) )? ( (lv_conditionsDefinition_3_0= ruleConditionsDefinition ) )? ( (lv_scenes_4_0= ruleScene ) )* ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        EObject lv_charactersDefinition_1_0 = null;

        EObject lv_switchesDefinition_2_0 = null;

        EObject lv_conditionsDefinition_3_0 = null;

        EObject lv_scenes_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:80:28: ( ( () ( (lv_charactersDefinition_1_0= ruleCharactersDefinition ) )? ( (lv_switchesDefinition_2_0= ruleSwitchesDefinition ) )? ( (lv_conditionsDefinition_3_0= ruleConditionsDefinition ) )? ( (lv_scenes_4_0= ruleScene ) )* ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:81:1: ( () ( (lv_charactersDefinition_1_0= ruleCharactersDefinition ) )? ( (lv_switchesDefinition_2_0= ruleSwitchesDefinition ) )? ( (lv_conditionsDefinition_3_0= ruleConditionsDefinition ) )? ( (lv_scenes_4_0= ruleScene ) )* )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:81:1: ( () ( (lv_charactersDefinition_1_0= ruleCharactersDefinition ) )? ( (lv_switchesDefinition_2_0= ruleSwitchesDefinition ) )? ( (lv_conditionsDefinition_3_0= ruleConditionsDefinition ) )? ( (lv_scenes_4_0= ruleScene ) )* )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:81:2: () ( (lv_charactersDefinition_1_0= ruleCharactersDefinition ) )? ( (lv_switchesDefinition_2_0= ruleSwitchesDefinition ) )? ( (lv_conditionsDefinition_3_0= ruleConditionsDefinition ) )? ( (lv_scenes_4_0= ruleScene ) )*
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:81:2: ()
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getScriptAccess().getScriptAction_0(),
                          current);
                  
            }

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:87:2: ( (lv_charactersDefinition_1_0= ruleCharactersDefinition ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:88:1: (lv_charactersDefinition_1_0= ruleCharactersDefinition )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:88:1: (lv_charactersDefinition_1_0= ruleCharactersDefinition )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:89:3: lv_charactersDefinition_1_0= ruleCharactersDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScriptAccess().getCharactersDefinitionCharactersDefinitionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCharactersDefinition_in_ruleScript140);
                    lv_charactersDefinition_1_0=ruleCharactersDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScriptRule());
                      	        }
                             		set(
                             			current, 
                             			"charactersDefinition",
                              		lv_charactersDefinition_1_0, 
                              		"CharactersDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:105:3: ( (lv_switchesDefinition_2_0= ruleSwitchesDefinition ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:106:1: (lv_switchesDefinition_2_0= ruleSwitchesDefinition )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:106:1: (lv_switchesDefinition_2_0= ruleSwitchesDefinition )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:107:3: lv_switchesDefinition_2_0= ruleSwitchesDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScriptAccess().getSwitchesDefinitionSwitchesDefinitionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSwitchesDefinition_in_ruleScript162);
                    lv_switchesDefinition_2_0=ruleSwitchesDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScriptRule());
                      	        }
                             		set(
                             			current, 
                             			"switchesDefinition",
                              		lv_switchesDefinition_2_0, 
                              		"SwitchesDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:123:3: ( (lv_conditionsDefinition_3_0= ruleConditionsDefinition ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:124:1: (lv_conditionsDefinition_3_0= ruleConditionsDefinition )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:124:1: (lv_conditionsDefinition_3_0= ruleConditionsDefinition )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:125:3: lv_conditionsDefinition_3_0= ruleConditionsDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScriptAccess().getConditionsDefinitionConditionsDefinitionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionsDefinition_in_ruleScript184);
                    lv_conditionsDefinition_3_0=ruleConditionsDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScriptRule());
                      	        }
                             		set(
                             			current, 
                             			"conditionsDefinition",
                              		lv_conditionsDefinition_3_0, 
                              		"ConditionsDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:141:3: ( (lv_scenes_4_0= ruleScene ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:142:1: (lv_scenes_4_0= ruleScene )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:142:1: (lv_scenes_4_0= ruleScene )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:143:3: lv_scenes_4_0= ruleScene
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScriptAccess().getScenesSceneParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleScene_in_ruleScript206);
            	    lv_scenes_4_0=ruleScene();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scenes",
            	              		lv_scenes_4_0, 
            	              		"Scene");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleCharactersDefinition"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:167:1: entryRuleCharactersDefinition returns [EObject current=null] : iv_ruleCharactersDefinition= ruleCharactersDefinition EOF ;
    public final EObject entryRuleCharactersDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharactersDefinition = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:168:2: (iv_ruleCharactersDefinition= ruleCharactersDefinition EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:169:2: iv_ruleCharactersDefinition= ruleCharactersDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharactersDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleCharactersDefinition_in_entryRuleCharactersDefinition243);
            iv_ruleCharactersDefinition=ruleCharactersDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCharactersDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharactersDefinition253); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCharactersDefinition"


    // $ANTLR start "ruleCharactersDefinition"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:176:1: ruleCharactersDefinition returns [EObject current=null] : (otherlv_0= 'characters' otherlv_1= ':' ( (lv_characters_2_0= ruleCharacterDefinition ) ) (otherlv_3= ',' ( (lv_characters_4_0= ruleCharacterDefinition ) ) )* ) ;
    public final EObject ruleCharactersDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_characters_2_0 = null;

        EObject lv_characters_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:179:28: ( (otherlv_0= 'characters' otherlv_1= ':' ( (lv_characters_2_0= ruleCharacterDefinition ) ) (otherlv_3= ',' ( (lv_characters_4_0= ruleCharacterDefinition ) ) )* ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:180:1: (otherlv_0= 'characters' otherlv_1= ':' ( (lv_characters_2_0= ruleCharacterDefinition ) ) (otherlv_3= ',' ( (lv_characters_4_0= ruleCharacterDefinition ) ) )* )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:180:1: (otherlv_0= 'characters' otherlv_1= ':' ( (lv_characters_2_0= ruleCharacterDefinition ) ) (otherlv_3= ',' ( (lv_characters_4_0= ruleCharacterDefinition ) ) )* )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:180:3: otherlv_0= 'characters' otherlv_1= ':' ( (lv_characters_2_0= ruleCharacterDefinition ) ) (otherlv_3= ',' ( (lv_characters_4_0= ruleCharacterDefinition ) ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleCharactersDefinition290); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCharactersDefinitionAccess().getCharactersKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleCharactersDefinition302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCharactersDefinitionAccess().getColonKeyword_1());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:188:1: ( (lv_characters_2_0= ruleCharacterDefinition ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:189:1: (lv_characters_2_0= ruleCharacterDefinition )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:189:1: (lv_characters_2_0= ruleCharacterDefinition )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:190:3: lv_characters_2_0= ruleCharacterDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCharactersDefinitionAccess().getCharactersCharacterDefinitionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCharacterDefinition_in_ruleCharactersDefinition323);
            lv_characters_2_0=ruleCharacterDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCharactersDefinitionRule());
              	        }
                     		add(
                     			current, 
                     			"characters",
                      		lv_characters_2_0, 
                      		"CharacterDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:206:2: (otherlv_3= ',' ( (lv_characters_4_0= ruleCharacterDefinition ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:206:4: otherlv_3= ',' ( (lv_characters_4_0= ruleCharacterDefinition ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleCharactersDefinition336); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getCharactersDefinitionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:210:1: ( (lv_characters_4_0= ruleCharacterDefinition ) )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:211:1: (lv_characters_4_0= ruleCharacterDefinition )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:211:1: (lv_characters_4_0= ruleCharacterDefinition )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:212:3: lv_characters_4_0= ruleCharacterDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCharactersDefinitionAccess().getCharactersCharacterDefinitionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCharacterDefinition_in_ruleCharactersDefinition357);
            	    lv_characters_4_0=ruleCharacterDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCharactersDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"characters",
            	              		lv_characters_4_0, 
            	              		"CharacterDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCharactersDefinition"


    // $ANTLR start "entryRuleCharacterDefinition"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:236:1: entryRuleCharacterDefinition returns [EObject current=null] : iv_ruleCharacterDefinition= ruleCharacterDefinition EOF ;
    public final EObject entryRuleCharacterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacterDefinition = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:237:2: (iv_ruleCharacterDefinition= ruleCharacterDefinition EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:238:2: iv_ruleCharacterDefinition= ruleCharacterDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharacterDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleCharacterDefinition_in_entryRuleCharacterDefinition395);
            iv_ruleCharacterDefinition=ruleCharacterDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCharacterDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCharacterDefinition405); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCharacterDefinition"


    // $ANTLR start "ruleCharacterDefinition"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:245:1: ruleCharacterDefinition returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleCharacterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:248:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:249:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:249:1: ( (lv_name_0_0= RULE_ID ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:250:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:250:1: (lv_name_0_0= RULE_ID )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:251:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCharacterDefinition446); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getCharacterDefinitionAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCharacterDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCharacterDefinition"


    // $ANTLR start "entryRuleSwitchesDefinition"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:275:1: entryRuleSwitchesDefinition returns [EObject current=null] : iv_ruleSwitchesDefinition= ruleSwitchesDefinition EOF ;
    public final EObject entryRuleSwitchesDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchesDefinition = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:276:2: (iv_ruleSwitchesDefinition= ruleSwitchesDefinition EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:277:2: iv_ruleSwitchesDefinition= ruleSwitchesDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchesDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchesDefinition_in_entryRuleSwitchesDefinition486);
            iv_ruleSwitchesDefinition=ruleSwitchesDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchesDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchesDefinition496); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitchesDefinition"


    // $ANTLR start "ruleSwitchesDefinition"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:284:1: ruleSwitchesDefinition returns [EObject current=null] : (otherlv_0= 'switches' otherlv_1= ':' ( (lv_switches_2_0= ruleSwitchDefinition ) ) (otherlv_3= ',' ( (lv_switches_4_0= ruleSwitchDefinition ) ) )* ) ;
    public final EObject ruleSwitchesDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_switches_2_0 = null;

        EObject lv_switches_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:287:28: ( (otherlv_0= 'switches' otherlv_1= ':' ( (lv_switches_2_0= ruleSwitchDefinition ) ) (otherlv_3= ',' ( (lv_switches_4_0= ruleSwitchDefinition ) ) )* ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:288:1: (otherlv_0= 'switches' otherlv_1= ':' ( (lv_switches_2_0= ruleSwitchDefinition ) ) (otherlv_3= ',' ( (lv_switches_4_0= ruleSwitchDefinition ) ) )* )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:288:1: (otherlv_0= 'switches' otherlv_1= ':' ( (lv_switches_2_0= ruleSwitchDefinition ) ) (otherlv_3= ',' ( (lv_switches_4_0= ruleSwitchDefinition ) ) )* )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:288:3: otherlv_0= 'switches' otherlv_1= ':' ( (lv_switches_2_0= ruleSwitchDefinition ) ) (otherlv_3= ',' ( (lv_switches_4_0= ruleSwitchDefinition ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSwitchesDefinition533); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchesDefinitionAccess().getSwitchesKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSwitchesDefinition545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchesDefinitionAccess().getColonKeyword_1());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:296:1: ( (lv_switches_2_0= ruleSwitchDefinition ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:297:1: (lv_switches_2_0= ruleSwitchDefinition )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:297:1: (lv_switches_2_0= ruleSwitchDefinition )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:298:3: lv_switches_2_0= ruleSwitchDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchesDefinitionAccess().getSwitchesSwitchDefinitionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSwitchDefinition_in_ruleSwitchesDefinition566);
            lv_switches_2_0=ruleSwitchDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchesDefinitionRule());
              	        }
                     		add(
                     			current, 
                     			"switches",
                      		lv_switches_2_0, 
                      		"SwitchDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:314:2: (otherlv_3= ',' ( (lv_switches_4_0= ruleSwitchDefinition ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:314:4: otherlv_3= ',' ( (lv_switches_4_0= ruleSwitchDefinition ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSwitchesDefinition579); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSwitchesDefinitionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:318:1: ( (lv_switches_4_0= ruleSwitchDefinition ) )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:319:1: (lv_switches_4_0= ruleSwitchDefinition )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:319:1: (lv_switches_4_0= ruleSwitchDefinition )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:320:3: lv_switches_4_0= ruleSwitchDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchesDefinitionAccess().getSwitchesSwitchDefinitionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSwitchDefinition_in_ruleSwitchesDefinition600);
            	    lv_switches_4_0=ruleSwitchDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitchesDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"switches",
            	              		lv_switches_4_0, 
            	              		"SwitchDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSwitchesDefinition"


    // $ANTLR start "entryRuleSwitchDefinition"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:344:1: entryRuleSwitchDefinition returns [EObject current=null] : iv_ruleSwitchDefinition= ruleSwitchDefinition EOF ;
    public final EObject entryRuleSwitchDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchDefinition = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:345:2: (iv_ruleSwitchDefinition= ruleSwitchDefinition EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:346:2: iv_ruleSwitchDefinition= ruleSwitchDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchDefinition_in_entryRuleSwitchDefinition638);
            iv_ruleSwitchDefinition=ruleSwitchDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchDefinition648); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitchDefinition"


    // $ANTLR start "ruleSwitchDefinition"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:353:1: ruleSwitchDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_value_2_0= ruleSwitchValue ) ) )? ) ;
    public final EObject ruleSwitchDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:356:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_value_2_0= ruleSwitchValue ) ) )? ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:357:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_value_2_0= ruleSwitchValue ) ) )? )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:357:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_value_2_0= ruleSwitchValue ) ) )? )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:357:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'is' ( (lv_value_2_0= ruleSwitchValue ) ) )?
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:357:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:358:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:358:1: (lv_name_0_0= RULE_ID )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:359:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSwitchDefinition690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getSwitchDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSwitchDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:375:2: (otherlv_1= 'is' ( (lv_value_2_0= ruleSwitchValue ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:375:4: otherlv_1= 'is' ( (lv_value_2_0= ruleSwitchValue ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleSwitchDefinition708); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSwitchDefinitionAccess().getIsKeyword_1_0());
                          
                    }
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:379:1: ( (lv_value_2_0= ruleSwitchValue ) )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:380:1: (lv_value_2_0= ruleSwitchValue )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:380:1: (lv_value_2_0= ruleSwitchValue )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:381:3: lv_value_2_0= ruleSwitchValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSwitchDefinitionAccess().getValueSwitchValueEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSwitchValue_in_ruleSwitchDefinition729);
                    lv_value_2_0=ruleSwitchValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSwitchDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"SwitchValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSwitchDefinition"


    // $ANTLR start "entryRuleConditionsDefinition"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:405:1: entryRuleConditionsDefinition returns [EObject current=null] : iv_ruleConditionsDefinition= ruleConditionsDefinition EOF ;
    public final EObject entryRuleConditionsDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionsDefinition = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:406:2: (iv_ruleConditionsDefinition= ruleConditionsDefinition EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:407:2: iv_ruleConditionsDefinition= ruleConditionsDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionsDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionsDefinition_in_entryRuleConditionsDefinition767);
            iv_ruleConditionsDefinition=ruleConditionsDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionsDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionsDefinition777); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConditionsDefinition"


    // $ANTLR start "ruleConditionsDefinition"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:414:1: ruleConditionsDefinition returns [EObject current=null] : (otherlv_0= 'conditions' ( (lv_conditions_1_0= ruleConditionDefinition ) ) ( (lv_conditions_2_0= ruleConditionDefinition ) )* otherlv_3= 'end' ) ;
    public final EObject ruleConditionsDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_conditions_1_0 = null;

        EObject lv_conditions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:417:28: ( (otherlv_0= 'conditions' ( (lv_conditions_1_0= ruleConditionDefinition ) ) ( (lv_conditions_2_0= ruleConditionDefinition ) )* otherlv_3= 'end' ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:418:1: (otherlv_0= 'conditions' ( (lv_conditions_1_0= ruleConditionDefinition ) ) ( (lv_conditions_2_0= ruleConditionDefinition ) )* otherlv_3= 'end' )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:418:1: (otherlv_0= 'conditions' ( (lv_conditions_1_0= ruleConditionDefinition ) ) ( (lv_conditions_2_0= ruleConditionDefinition ) )* otherlv_3= 'end' )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:418:3: otherlv_0= 'conditions' ( (lv_conditions_1_0= ruleConditionDefinition ) ) ( (lv_conditions_2_0= ruleConditionDefinition ) )* otherlv_3= 'end'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleConditionsDefinition814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConditionsDefinitionAccess().getConditionsKeyword_0());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:422:1: ( (lv_conditions_1_0= ruleConditionDefinition ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:423:1: (lv_conditions_1_0= ruleConditionDefinition )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:423:1: (lv_conditions_1_0= ruleConditionDefinition )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:424:3: lv_conditions_1_0= ruleConditionDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionsDefinitionAccess().getConditionsConditionDefinitionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionDefinition_in_ruleConditionsDefinition835);
            lv_conditions_1_0=ruleConditionDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionsDefinitionRule());
              	        }
                     		add(
                     			current, 
                     			"conditions",
                      		lv_conditions_1_0, 
                      		"ConditionDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:440:2: ( (lv_conditions_2_0= ruleConditionDefinition ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:441:1: (lv_conditions_2_0= ruleConditionDefinition )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:441:1: (lv_conditions_2_0= ruleConditionDefinition )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:442:3: lv_conditions_2_0= ruleConditionDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionsDefinitionAccess().getConditionsConditionDefinitionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConditionDefinition_in_ruleConditionsDefinition856);
            	    lv_conditions_2_0=ruleConditionDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionsDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"conditions",
            	              		lv_conditions_2_0, 
            	              		"ConditionDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleConditionsDefinition869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConditionsDefinitionAccess().getEndKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConditionsDefinition"


    // $ANTLR start "entryRuleConditionDefinition"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:470:1: entryRuleConditionDefinition returns [EObject current=null] : iv_ruleConditionDefinition= ruleConditionDefinition EOF ;
    public final EObject entryRuleConditionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionDefinition = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:471:2: (iv_ruleConditionDefinition= ruleConditionDefinition EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:472:2: iv_ruleConditionDefinition= ruleConditionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleConditionDefinition_in_entryRuleConditionDefinition905);
            iv_ruleConditionDefinition=ruleConditionDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionDefinition915); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConditionDefinition"


    // $ANTLR start "ruleConditionDefinition"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:479:1: ruleConditionDefinition returns [EObject current=null] : (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'when' ( (lv_switchList_3_0= ruleSwitchList ) ) ) ;
    public final EObject ruleConditionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_switchList_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:482:28: ( (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'when' ( (lv_switchList_3_0= ruleSwitchList ) ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:483:1: (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'when' ( (lv_switchList_3_0= ruleSwitchList ) ) )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:483:1: (otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'when' ( (lv_switchList_3_0= ruleSwitchList ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:483:3: otherlv_0= 'set' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'when' ( (lv_switchList_3_0= ruleSwitchList ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleConditionDefinition952); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConditionDefinitionAccess().getSetKeyword_0());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:487:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:488:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:488:1: (lv_name_1_0= RULE_ID )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:489:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConditionDefinition969); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getConditionDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConditionDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleConditionDefinition986); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConditionDefinitionAccess().getWhenKeyword_2());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:509:1: ( (lv_switchList_3_0= ruleSwitchList ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:510:1: (lv_switchList_3_0= ruleSwitchList )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:510:1: (lv_switchList_3_0= ruleSwitchList )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:511:3: lv_switchList_3_0= ruleSwitchList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionDefinitionAccess().getSwitchListSwitchListParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSwitchList_in_ruleConditionDefinition1007);
            lv_switchList_3_0=ruleSwitchList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"switchList",
                      		lv_switchList_3_0, 
                      		"SwitchList");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConditionDefinition"


    // $ANTLR start "entryRuleScene"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:535:1: entryRuleScene returns [EObject current=null] : iv_ruleScene= ruleScene EOF ;
    public final EObject entryRuleScene() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScene = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:536:2: (iv_ruleScene= ruleScene EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:537:2: iv_ruleScene= ruleScene EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSceneRule()); 
            }
            pushFollow(FOLLOW_ruleScene_in_entryRuleScene1043);
            iv_ruleScene=ruleScene();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScene; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleScene1053); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScene"


    // $ANTLR start "ruleScene"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:544:1: ruleScene returns [EObject current=null] : ( () otherlv_1= 'scene' ( (lv_name_2_0= ruleStringID ) ) ( (lv_dialog_3_0= ruleDialog ) ) otherlv_4= 'end' otherlv_5= 'scene' ) ;
    public final EObject ruleScene() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_dialog_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:547:28: ( ( () otherlv_1= 'scene' ( (lv_name_2_0= ruleStringID ) ) ( (lv_dialog_3_0= ruleDialog ) ) otherlv_4= 'end' otherlv_5= 'scene' ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:548:1: ( () otherlv_1= 'scene' ( (lv_name_2_0= ruleStringID ) ) ( (lv_dialog_3_0= ruleDialog ) ) otherlv_4= 'end' otherlv_5= 'scene' )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:548:1: ( () otherlv_1= 'scene' ( (lv_name_2_0= ruleStringID ) ) ( (lv_dialog_3_0= ruleDialog ) ) otherlv_4= 'end' otherlv_5= 'scene' )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:548:2: () otherlv_1= 'scene' ( (lv_name_2_0= ruleStringID ) ) ( (lv_dialog_3_0= ruleDialog ) ) otherlv_4= 'end' otherlv_5= 'scene'
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:548:2: ()
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:549:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSceneAccess().getSceneAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleScene1099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSceneAccess().getSceneKeyword_1());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:558:1: ( (lv_name_2_0= ruleStringID ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:559:1: (lv_name_2_0= ruleStringID )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:559:1: (lv_name_2_0= ruleStringID )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:560:3: lv_name_2_0= ruleStringID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSceneAccess().getNameStringIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStringID_in_ruleScene1120);
            lv_name_2_0=ruleStringID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSceneRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"StringID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:576:2: ( (lv_dialog_3_0= ruleDialog ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:577:1: (lv_dialog_3_0= ruleDialog )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:577:1: (lv_dialog_3_0= ruleDialog )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:578:3: lv_dialog_3_0= ruleDialog
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSceneAccess().getDialogDialogParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDialog_in_ruleScene1141);
            lv_dialog_3_0=ruleDialog();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSceneRule());
              	        }
                     		set(
                     			current, 
                     			"dialog",
                      		lv_dialog_3_0, 
                      		"Dialog");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleScene1153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSceneAccess().getEndKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleScene1165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSceneAccess().getSceneKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleScene"


    // $ANTLR start "entryRuleDialog"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:610:1: entryRuleDialog returns [EObject current=null] : iv_ruleDialog= ruleDialog EOF ;
    public final EObject entryRuleDialog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialog = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:611:2: (iv_ruleDialog= ruleDialog EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:612:2: iv_ruleDialog= ruleDialog EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDialogRule()); 
            }
            pushFollow(FOLLOW_ruleDialog_in_entryRuleDialog1201);
            iv_ruleDialog=ruleDialog();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDialog; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialog1211); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDialog"


    // $ANTLR start "ruleDialog"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:619:1: ruleDialog returns [EObject current=null] : ( () ( (lv_defaults_1_0= ruleDefaults ) )? ( (lv_firstTime_2_0= ruleFirstTime ) )? ( (lv_recursives_3_0= ruleRecursive ) )* ( (lv_partingLines_4_0= rulePartingLines ) )? ) ;
    public final EObject ruleDialog() throws RecognitionException {
        EObject current = null;

        EObject lv_defaults_1_0 = null;

        EObject lv_firstTime_2_0 = null;

        EObject lv_recursives_3_0 = null;

        EObject lv_partingLines_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:622:28: ( ( () ( (lv_defaults_1_0= ruleDefaults ) )? ( (lv_firstTime_2_0= ruleFirstTime ) )? ( (lv_recursives_3_0= ruleRecursive ) )* ( (lv_partingLines_4_0= rulePartingLines ) )? ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:623:1: ( () ( (lv_defaults_1_0= ruleDefaults ) )? ( (lv_firstTime_2_0= ruleFirstTime ) )? ( (lv_recursives_3_0= ruleRecursive ) )* ( (lv_partingLines_4_0= rulePartingLines ) )? )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:623:1: ( () ( (lv_defaults_1_0= ruleDefaults ) )? ( (lv_firstTime_2_0= ruleFirstTime ) )? ( (lv_recursives_3_0= ruleRecursive ) )* ( (lv_partingLines_4_0= rulePartingLines ) )? )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:623:2: () ( (lv_defaults_1_0= ruleDefaults ) )? ( (lv_firstTime_2_0= ruleFirstTime ) )? ( (lv_recursives_3_0= ruleRecursive ) )* ( (lv_partingLines_4_0= rulePartingLines ) )?
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:623:2: ()
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:624:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDialogAccess().getDialogAction_0(),
                          current);
                  
            }

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:629:2: ( (lv_defaults_1_0= ruleDefaults ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:630:1: (lv_defaults_1_0= ruleDefaults )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:630:1: (lv_defaults_1_0= ruleDefaults )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:631:3: lv_defaults_1_0= ruleDefaults
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDialogAccess().getDefaultsDefaultsParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefaults_in_ruleDialog1266);
                    lv_defaults_1_0=ruleDefaults();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDialogRule());
                      	        }
                             		set(
                             			current, 
                             			"defaults",
                              		lv_defaults_1_0, 
                              		"Defaults");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:647:3: ( (lv_firstTime_2_0= ruleFirstTime ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:648:1: (lv_firstTime_2_0= ruleFirstTime )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:648:1: (lv_firstTime_2_0= ruleFirstTime )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:649:3: lv_firstTime_2_0= ruleFirstTime
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDialogAccess().getFirstTimeFirstTimeParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFirstTime_in_ruleDialog1288);
                    lv_firstTime_2_0=ruleFirstTime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDialogRule());
                      	        }
                             		set(
                             			current, 
                             			"firstTime",
                              		lv_firstTime_2_0, 
                              		"FirstTime");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:665:3: ( (lv_recursives_3_0= ruleRecursive ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=28 && LA11_0<=29)||LA11_0==31||(LA11_0>=42 && LA11_0<=43)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:666:1: (lv_recursives_3_0= ruleRecursive )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:666:1: (lv_recursives_3_0= ruleRecursive )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:667:3: lv_recursives_3_0= ruleRecursive
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDialogAccess().getRecursivesRecursiveParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRecursive_in_ruleDialog1310);
            	    lv_recursives_3_0=ruleRecursive();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDialogRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"recursives",
            	              		lv_recursives_3_0, 
            	              		"Recursive");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:683:3: ( (lv_partingLines_4_0= rulePartingLines ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:684:1: (lv_partingLines_4_0= rulePartingLines )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:684:1: (lv_partingLines_4_0= rulePartingLines )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:685:3: lv_partingLines_4_0= rulePartingLines
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDialogAccess().getPartingLinesPartingLinesParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePartingLines_in_ruleDialog1332);
                    lv_partingLines_4_0=rulePartingLines();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDialogRule());
                      	        }
                             		set(
                             			current, 
                             			"partingLines",
                              		lv_partingLines_4_0, 
                              		"PartingLines");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDialog"


    // $ANTLR start "entryRuleRecursive"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:709:1: entryRuleRecursive returns [EObject current=null] : iv_ruleRecursive= ruleRecursive EOF ;
    public final EObject entryRuleRecursive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecursive = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:710:2: (iv_ruleRecursive= ruleRecursive EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:711:2: iv_ruleRecursive= ruleRecursive EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecursiveRule()); 
            }
            pushFollow(FOLLOW_ruleRecursive_in_entryRuleRecursive1369);
            iv_ruleRecursive=ruleRecursive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecursive; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecursive1379); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRecursive"


    // $ANTLR start "ruleRecursive"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:718:1: ruleRecursive returns [EObject current=null] : (this_Hub_0= ruleHub | this_Statement_1= ruleStatement ) ;
    public final EObject ruleRecursive() throws RecognitionException {
        EObject current = null;

        EObject this_Hub_0 = null;

        EObject this_Statement_1 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:721:28: ( (this_Hub_0= ruleHub | this_Statement_1= ruleStatement ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:722:1: (this_Hub_0= ruleHub | this_Statement_1= ruleStatement )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:722:1: (this_Hub_0= ruleHub | this_Statement_1= ruleStatement )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=28 && LA13_0<=29)) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID||LA13_0==31||(LA13_0>=42 && LA13_0<=43)) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:723:5: this_Hub_0= ruleHub
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRecursiveAccess().getHubParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHub_in_ruleRecursive1426);
                    this_Hub_0=ruleHub();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Hub_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:733:5: this_Statement_1= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRecursiveAccess().getStatementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleRecursive1453);
                    this_Statement_1=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRecursive"


    // $ANTLR start "entryRuleDefaults"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:749:1: entryRuleDefaults returns [EObject current=null] : iv_ruleDefaults= ruleDefaults EOF ;
    public final EObject entryRuleDefaults() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaults = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:750:2: (iv_ruleDefaults= ruleDefaults EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:751:2: iv_ruleDefaults= ruleDefaults EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultsRule()); 
            }
            pushFollow(FOLLOW_ruleDefaults_in_entryRuleDefaults1488);
            iv_ruleDefaults=ruleDefaults();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaults; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaults1498); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefaults"


    // $ANTLR start "ruleDefaults"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:758:1: ruleDefaults returns [EObject current=null] : ( () otherlv_1= 'defaults' ( (lv_comment_2_0= RULE_COMMENT ) )? ( (lv_body_3_0= ruleConditionalBody ) ) otherlv_4= 'end' ) ;
    public final EObject ruleDefaults() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_comment_2_0=null;
        Token otherlv_4=null;
        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:761:28: ( ( () otherlv_1= 'defaults' ( (lv_comment_2_0= RULE_COMMENT ) )? ( (lv_body_3_0= ruleConditionalBody ) ) otherlv_4= 'end' ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:762:1: ( () otherlv_1= 'defaults' ( (lv_comment_2_0= RULE_COMMENT ) )? ( (lv_body_3_0= ruleConditionalBody ) ) otherlv_4= 'end' )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:762:1: ( () otherlv_1= 'defaults' ( (lv_comment_2_0= RULE_COMMENT ) )? ( (lv_body_3_0= ruleConditionalBody ) ) otherlv_4= 'end' )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:762:2: () otherlv_1= 'defaults' ( (lv_comment_2_0= RULE_COMMENT ) )? ( (lv_body_3_0= ruleConditionalBody ) ) otherlv_4= 'end'
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:762:2: ()
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:763:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDefaultsAccess().getDefaultsAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleDefaults1544); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefaultsAccess().getDefaultsKeyword_1());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:772:1: ( (lv_comment_2_0= RULE_COMMENT ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_COMMENT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:773:1: (lv_comment_2_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:773:1: (lv_comment_2_0= RULE_COMMENT )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:774:3: lv_comment_2_0= RULE_COMMENT
                    {
                    lv_comment_2_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleDefaults1561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_comment_2_0, grammarAccess.getDefaultsAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDefaultsRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"comment",
                              		lv_comment_2_0, 
                              		"COMMENT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:790:3: ( (lv_body_3_0= ruleConditionalBody ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:791:1: (lv_body_3_0= ruleConditionalBody )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:791:1: (lv_body_3_0= ruleConditionalBody )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:792:3: lv_body_3_0= ruleConditionalBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefaultsAccess().getBodyConditionalBodyParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalBody_in_ruleDefaults1588);
            lv_body_3_0=ruleConditionalBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefaultsRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_3_0, 
                      		"ConditionalBody");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleDefaults1600); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDefaultsAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDefaults"


    // $ANTLR start "entryRuleFirstTime"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:820:1: entryRuleFirstTime returns [EObject current=null] : iv_ruleFirstTime= ruleFirstTime EOF ;
    public final EObject entryRuleFirstTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstTime = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:821:2: (iv_ruleFirstTime= ruleFirstTime EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:822:2: iv_ruleFirstTime= ruleFirstTime EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFirstTimeRule()); 
            }
            pushFollow(FOLLOW_ruleFirstTime_in_entryRuleFirstTime1636);
            iv_ruleFirstTime=ruleFirstTime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFirstTime; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFirstTime1646); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFirstTime"


    // $ANTLR start "ruleFirstTime"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:829:1: ruleFirstTime returns [EObject current=null] : ( () otherlv_1= 'first' otherlv_2= 'time' ( (lv_comment_3_0= RULE_COMMENT ) )? ( (lv_body_4_0= ruleConditionalBody ) ) ( (lv_otherTimes_5_0= ruleOtherTimes ) )? otherlv_6= 'end' ) ;
    public final EObject ruleFirstTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_comment_3_0=null;
        Token otherlv_6=null;
        EObject lv_body_4_0 = null;

        EObject lv_otherTimes_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:832:28: ( ( () otherlv_1= 'first' otherlv_2= 'time' ( (lv_comment_3_0= RULE_COMMENT ) )? ( (lv_body_4_0= ruleConditionalBody ) ) ( (lv_otherTimes_5_0= ruleOtherTimes ) )? otherlv_6= 'end' ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:833:1: ( () otherlv_1= 'first' otherlv_2= 'time' ( (lv_comment_3_0= RULE_COMMENT ) )? ( (lv_body_4_0= ruleConditionalBody ) ) ( (lv_otherTimes_5_0= ruleOtherTimes ) )? otherlv_6= 'end' )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:833:1: ( () otherlv_1= 'first' otherlv_2= 'time' ( (lv_comment_3_0= RULE_COMMENT ) )? ( (lv_body_4_0= ruleConditionalBody ) ) ( (lv_otherTimes_5_0= ruleOtherTimes ) )? otherlv_6= 'end' )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:833:2: () otherlv_1= 'first' otherlv_2= 'time' ( (lv_comment_3_0= RULE_COMMENT ) )? ( (lv_body_4_0= ruleConditionalBody ) ) ( (lv_otherTimes_5_0= ruleOtherTimes ) )? otherlv_6= 'end'
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:833:2: ()
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:834:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFirstTimeAccess().getFirstTimeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleFirstTime1692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFirstTimeAccess().getFirstKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleFirstTime1704); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFirstTimeAccess().getTimeKeyword_2());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:847:1: ( (lv_comment_3_0= RULE_COMMENT ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_COMMENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:848:1: (lv_comment_3_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:848:1: (lv_comment_3_0= RULE_COMMENT )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:849:3: lv_comment_3_0= RULE_COMMENT
                    {
                    lv_comment_3_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleFirstTime1721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_comment_3_0, grammarAccess.getFirstTimeAccess().getCommentCOMMENTTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFirstTimeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"comment",
                              		lv_comment_3_0, 
                              		"COMMENT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:865:3: ( (lv_body_4_0= ruleConditionalBody ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:866:1: (lv_body_4_0= ruleConditionalBody )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:866:1: (lv_body_4_0= ruleConditionalBody )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:867:3: lv_body_4_0= ruleConditionalBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFirstTimeAccess().getBodyConditionalBodyParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalBody_in_ruleFirstTime1748);
            lv_body_4_0=ruleConditionalBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFirstTimeRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_4_0, 
                      		"ConditionalBody");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:883:2: ( (lv_otherTimes_5_0= ruleOtherTimes ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:884:1: (lv_otherTimes_5_0= ruleOtherTimes )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:884:1: (lv_otherTimes_5_0= ruleOtherTimes )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:885:3: lv_otherTimes_5_0= ruleOtherTimes
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFirstTimeAccess().getOtherTimesOtherTimesParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOtherTimes_in_ruleFirstTime1769);
                    lv_otherTimes_5_0=ruleOtherTimes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFirstTimeRule());
                      	        }
                             		set(
                             			current, 
                             			"otherTimes",
                              		lv_otherTimes_5_0, 
                              		"OtherTimes");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleFirstTime1782); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFirstTimeAccess().getEndKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFirstTime"


    // $ANTLR start "entryRuleOtherTimes"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:913:1: entryRuleOtherTimes returns [EObject current=null] : iv_ruleOtherTimes= ruleOtherTimes EOF ;
    public final EObject entryRuleOtherTimes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherTimes = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:914:2: (iv_ruleOtherTimes= ruleOtherTimes EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:915:2: iv_ruleOtherTimes= ruleOtherTimes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherTimesRule()); 
            }
            pushFollow(FOLLOW_ruleOtherTimes_in_entryRuleOtherTimes1818);
            iv_ruleOtherTimes=ruleOtherTimes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherTimes; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherTimes1828); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOtherTimes"


    // $ANTLR start "ruleOtherTimes"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:922:1: ruleOtherTimes returns [EObject current=null] : ( () otherlv_1= 'else' ( (lv_comment_2_0= RULE_COMMENT ) )? ( (lv_body_3_0= ruleConditionalBody ) ) ) ;
    public final EObject ruleOtherTimes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_comment_2_0=null;
        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:925:28: ( ( () otherlv_1= 'else' ( (lv_comment_2_0= RULE_COMMENT ) )? ( (lv_body_3_0= ruleConditionalBody ) ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:926:1: ( () otherlv_1= 'else' ( (lv_comment_2_0= RULE_COMMENT ) )? ( (lv_body_3_0= ruleConditionalBody ) ) )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:926:1: ( () otherlv_1= 'else' ( (lv_comment_2_0= RULE_COMMENT ) )? ( (lv_body_3_0= ruleConditionalBody ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:926:2: () otherlv_1= 'else' ( (lv_comment_2_0= RULE_COMMENT ) )? ( (lv_body_3_0= ruleConditionalBody ) )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:926:2: ()
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:927:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOtherTimesAccess().getOtherTimesAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleOtherTimes1874); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOtherTimesAccess().getElseKeyword_1());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:936:1: ( (lv_comment_2_0= RULE_COMMENT ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_COMMENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:937:1: (lv_comment_2_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:937:1: (lv_comment_2_0= RULE_COMMENT )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:938:3: lv_comment_2_0= RULE_COMMENT
                    {
                    lv_comment_2_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleOtherTimes1891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_comment_2_0, grammarAccess.getOtherTimesAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOtherTimesRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"comment",
                              		lv_comment_2_0, 
                              		"COMMENT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:954:3: ( (lv_body_3_0= ruleConditionalBody ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:955:1: (lv_body_3_0= ruleConditionalBody )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:955:1: (lv_body_3_0= ruleConditionalBody )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:956:3: lv_body_3_0= ruleConditionalBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOtherTimesAccess().getBodyConditionalBodyParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalBody_in_ruleOtherTimes1918);
            lv_body_3_0=ruleConditionalBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOtherTimesRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_3_0, 
                      		"ConditionalBody");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOtherTimes"


    // $ANTLR start "entryRulePartingLines"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:980:1: entryRulePartingLines returns [EObject current=null] : iv_rulePartingLines= rulePartingLines EOF ;
    public final EObject entryRulePartingLines() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartingLines = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:981:2: (iv_rulePartingLines= rulePartingLines EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:982:2: iv_rulePartingLines= rulePartingLines EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartingLinesRule()); 
            }
            pushFollow(FOLLOW_rulePartingLines_in_entryRulePartingLines1954);
            iv_rulePartingLines=rulePartingLines();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartingLines; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePartingLines1964); if (state.failed) return current;

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
    // $ANTLR end "entryRulePartingLines"


    // $ANTLR start "rulePartingLines"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:989:1: rulePartingLines returns [EObject current=null] : ( () otherlv_1= 'parting' ( (lv_comment_2_0= RULE_COMMENT ) )? ( (lv_body_3_0= ruleConditionalBody ) ) otherlv_4= 'end' ) ;
    public final EObject rulePartingLines() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_comment_2_0=null;
        Token otherlv_4=null;
        EObject lv_body_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:992:28: ( ( () otherlv_1= 'parting' ( (lv_comment_2_0= RULE_COMMENT ) )? ( (lv_body_3_0= ruleConditionalBody ) ) otherlv_4= 'end' ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:993:1: ( () otherlv_1= 'parting' ( (lv_comment_2_0= RULE_COMMENT ) )? ( (lv_body_3_0= ruleConditionalBody ) ) otherlv_4= 'end' )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:993:1: ( () otherlv_1= 'parting' ( (lv_comment_2_0= RULE_COMMENT ) )? ( (lv_body_3_0= ruleConditionalBody ) ) otherlv_4= 'end' )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:993:2: () otherlv_1= 'parting' ( (lv_comment_2_0= RULE_COMMENT ) )? ( (lv_body_3_0= ruleConditionalBody ) ) otherlv_4= 'end'
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:993:2: ()
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:994:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getPartingLinesAccess().getPartingLinesAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_rulePartingLines2010); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPartingLinesAccess().getPartingKeyword_1());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1003:1: ( (lv_comment_2_0= RULE_COMMENT ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_COMMENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1004:1: (lv_comment_2_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1004:1: (lv_comment_2_0= RULE_COMMENT )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1005:3: lv_comment_2_0= RULE_COMMENT
                    {
                    lv_comment_2_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rulePartingLines2027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_comment_2_0, grammarAccess.getPartingLinesAccess().getCommentCOMMENTTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPartingLinesRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"comment",
                              		lv_comment_2_0, 
                              		"COMMENT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1021:3: ( (lv_body_3_0= ruleConditionalBody ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1022:1: (lv_body_3_0= ruleConditionalBody )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1022:1: (lv_body_3_0= ruleConditionalBody )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1023:3: lv_body_3_0= ruleConditionalBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPartingLinesAccess().getBodyConditionalBodyParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalBody_in_rulePartingLines2054);
            lv_body_3_0=ruleConditionalBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPartingLinesRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_3_0, 
                      		"ConditionalBody");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_rulePartingLines2066); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPartingLinesAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePartingLines"


    // $ANTLR start "entryRuleHub"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1051:1: entryRuleHub returns [EObject current=null] : iv_ruleHub= ruleHub EOF ;
    public final EObject entryRuleHub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHub = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1052:2: (iv_ruleHub= ruleHub EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1053:2: iv_ruleHub= ruleHub EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHubRule()); 
            }
            pushFollow(FOLLOW_ruleHub_in_entryRuleHub2102);
            iv_ruleHub=ruleHub();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHub; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHub2112); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHub"


    // $ANTLR start "ruleHub"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1060:1: ruleHub returns [EObject current=null] : ( ( (lv_isHidden_0_0= 'hidden' ) )? otherlv_1= 'hub' ( (lv_name_2_0= ruleStringID ) ) ( (lv_hubComment_3_0= RULE_COMMENT ) )? ( (lv_hubFragments_4_0= ruleHubFragment ) )* otherlv_5= 'end' ) ;
    public final EObject ruleHub() throws RecognitionException {
        EObject current = null;

        Token lv_isHidden_0_0=null;
        Token otherlv_1=null;
        Token lv_hubComment_3_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_hubFragments_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1063:28: ( ( ( (lv_isHidden_0_0= 'hidden' ) )? otherlv_1= 'hub' ( (lv_name_2_0= ruleStringID ) ) ( (lv_hubComment_3_0= RULE_COMMENT ) )? ( (lv_hubFragments_4_0= ruleHubFragment ) )* otherlv_5= 'end' ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1064:1: ( ( (lv_isHidden_0_0= 'hidden' ) )? otherlv_1= 'hub' ( (lv_name_2_0= ruleStringID ) ) ( (lv_hubComment_3_0= RULE_COMMENT ) )? ( (lv_hubFragments_4_0= ruleHubFragment ) )* otherlv_5= 'end' )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1064:1: ( ( (lv_isHidden_0_0= 'hidden' ) )? otherlv_1= 'hub' ( (lv_name_2_0= ruleStringID ) ) ( (lv_hubComment_3_0= RULE_COMMENT ) )? ( (lv_hubFragments_4_0= ruleHubFragment ) )* otherlv_5= 'end' )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1064:2: ( (lv_isHidden_0_0= 'hidden' ) )? otherlv_1= 'hub' ( (lv_name_2_0= ruleStringID ) ) ( (lv_hubComment_3_0= RULE_COMMENT ) )? ( (lv_hubFragments_4_0= ruleHubFragment ) )* otherlv_5= 'end'
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1064:2: ( (lv_isHidden_0_0= 'hidden' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1065:1: (lv_isHidden_0_0= 'hidden' )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1065:1: (lv_isHidden_0_0= 'hidden' )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1066:3: lv_isHidden_0_0= 'hidden'
                    {
                    lv_isHidden_0_0=(Token)match(input,28,FOLLOW_28_in_ruleHub2155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isHidden_0_0, grammarAccess.getHubAccess().getIsHiddenHiddenKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHubRule());
                      	        }
                             		setWithLastConsumed(current, "isHidden", true, "hidden");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleHub2181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getHubAccess().getHubKeyword_1());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1083:1: ( (lv_name_2_0= ruleStringID ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1084:1: (lv_name_2_0= ruleStringID )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1084:1: (lv_name_2_0= ruleStringID )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1085:3: lv_name_2_0= ruleStringID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHubAccess().getNameStringIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStringID_in_ruleHub2202);
            lv_name_2_0=ruleStringID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHubRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"StringID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1101:2: ( (lv_hubComment_3_0= RULE_COMMENT ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_COMMENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1102:1: (lv_hubComment_3_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1102:1: (lv_hubComment_3_0= RULE_COMMENT )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1103:3: lv_hubComment_3_0= RULE_COMMENT
                    {
                    lv_hubComment_3_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleHub2219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_hubComment_3_0, grammarAccess.getHubAccess().getHubCommentCOMMENTTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHubRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"hubComment",
                              		lv_hubComment_3_0, 
                              		"COMMENT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1119:3: ( (lv_hubFragments_4_0= ruleHubFragment ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||(LA21_0>=30 && LA21_0<=31)||LA21_0==34||(LA21_0>=42 && LA21_0<=43)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1120:1: (lv_hubFragments_4_0= ruleHubFragment )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1120:1: (lv_hubFragments_4_0= ruleHubFragment )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1121:3: lv_hubFragments_4_0= ruleHubFragment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHubAccess().getHubFragmentsHubFragmentParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleHubFragment_in_ruleHub2246);
            	    lv_hubFragments_4_0=ruleHubFragment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHubRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"hubFragments",
            	              		lv_hubFragments_4_0, 
            	              		"HubFragment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleHub2259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getHubAccess().getEndKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHub"


    // $ANTLR start "entryRuleHubFragment"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1149:1: entryRuleHubFragment returns [EObject current=null] : iv_ruleHubFragment= ruleHubFragment EOF ;
    public final EObject entryRuleHubFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHubFragment = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1150:2: (iv_ruleHubFragment= ruleHubFragment EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1151:2: iv_ruleHubFragment= ruleHubFragment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHubFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleHubFragment_in_entryRuleHubFragment2295);
            iv_ruleHubFragment=ruleHubFragment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHubFragment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHubFragment2305); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHubFragment"


    // $ANTLR start "ruleHubFragment"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1158:1: ruleHubFragment returns [EObject current=null] : (this_ChoiceDialog_0= ruleChoiceDialog | this_ConditionalChoiceDialog_1= ruleConditionalChoiceDialog | this_Statement_2= ruleStatement ) ;
    public final EObject ruleHubFragment() throws RecognitionException {
        EObject current = null;

        EObject this_ChoiceDialog_0 = null;

        EObject this_ConditionalChoiceDialog_1 = null;

        EObject this_Statement_2 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1161:28: ( (this_ChoiceDialog_0= ruleChoiceDialog | this_ConditionalChoiceDialog_1= ruleConditionalChoiceDialog | this_Statement_2= ruleStatement ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1162:1: (this_ChoiceDialog_0= ruleChoiceDialog | this_ConditionalChoiceDialog_1= ruleConditionalChoiceDialog | this_Statement_2= ruleStatement )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1162:1: (this_ChoiceDialog_0= ruleChoiceDialog | this_ConditionalChoiceDialog_1= ruleConditionalChoiceDialog | this_Statement_2= ruleStatement )
            int alt22=3;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1163:5: this_ChoiceDialog_0= ruleChoiceDialog
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHubFragmentAccess().getChoiceDialogParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleChoiceDialog_in_ruleHubFragment2352);
                    this_ChoiceDialog_0=ruleChoiceDialog();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ChoiceDialog_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1173:5: this_ConditionalChoiceDialog_1= ruleConditionalChoiceDialog
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHubFragmentAccess().getConditionalChoiceDialogParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConditionalChoiceDialog_in_ruleHubFragment2379);
                    this_ConditionalChoiceDialog_1=ruleConditionalChoiceDialog();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConditionalChoiceDialog_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1183:5: this_Statement_2= ruleStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHubFragmentAccess().getStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_in_ruleHubFragment2406);
                    this_Statement_2=ruleStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHubFragment"


    // $ANTLR start "entryRuleConditionalChoiceDialog"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1199:1: entryRuleConditionalChoiceDialog returns [EObject current=null] : iv_ruleConditionalChoiceDialog= ruleConditionalChoiceDialog EOF ;
    public final EObject entryRuleConditionalChoiceDialog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalChoiceDialog = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1200:2: (iv_ruleConditionalChoiceDialog= ruleConditionalChoiceDialog EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1201:2: iv_ruleConditionalChoiceDialog= ruleConditionalChoiceDialog EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalChoiceDialogRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalChoiceDialog_in_entryRuleConditionalChoiceDialog2441);
            iv_ruleConditionalChoiceDialog=ruleConditionalChoiceDialog();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalChoiceDialog; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalChoiceDialog2451); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConditionalChoiceDialog"


    // $ANTLR start "ruleConditionalChoiceDialog"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1208:1: ruleConditionalChoiceDialog returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'choices' otherlv_2= 'if' otherlv_3= '(' ( (lv_conditionList_4_0= ruleConditionList ) ) otherlv_5= ')' ( (lv_comment_6_0= RULE_COMMENT ) )? ( (lv_choiceDialogs_7_0= ruleChoiceDialog ) )+ ( (lv_otherwiseChoices_8_0= ruleOtherwiseChoice ) )* otherlv_9= 'end' ) ;
    public final EObject ruleConditionalChoiceDialog() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_comment_6_0=null;
        Token otherlv_9=null;
        Enumerator lv_modifiers_0_0 = null;

        EObject lv_conditionList_4_0 = null;

        EObject lv_choiceDialogs_7_0 = null;

        EObject lv_otherwiseChoices_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1211:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'choices' otherlv_2= 'if' otherlv_3= '(' ( (lv_conditionList_4_0= ruleConditionList ) ) otherlv_5= ')' ( (lv_comment_6_0= RULE_COMMENT ) )? ( (lv_choiceDialogs_7_0= ruleChoiceDialog ) )+ ( (lv_otherwiseChoices_8_0= ruleOtherwiseChoice ) )* otherlv_9= 'end' ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1212:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'choices' otherlv_2= 'if' otherlv_3= '(' ( (lv_conditionList_4_0= ruleConditionList ) ) otherlv_5= ')' ( (lv_comment_6_0= RULE_COMMENT ) )? ( (lv_choiceDialogs_7_0= ruleChoiceDialog ) )+ ( (lv_otherwiseChoices_8_0= ruleOtherwiseChoice ) )* otherlv_9= 'end' )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1212:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'choices' otherlv_2= 'if' otherlv_3= '(' ( (lv_conditionList_4_0= ruleConditionList ) ) otherlv_5= ')' ( (lv_comment_6_0= RULE_COMMENT ) )? ( (lv_choiceDialogs_7_0= ruleChoiceDialog ) )+ ( (lv_otherwiseChoices_8_0= ruleOtherwiseChoice ) )* otherlv_9= 'end' )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1212:2: ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'choices' otherlv_2= 'if' otherlv_3= '(' ( (lv_conditionList_4_0= ruleConditionList ) ) otherlv_5= ')' ( (lv_comment_6_0= RULE_COMMENT ) )? ( (lv_choiceDialogs_7_0= ruleChoiceDialog ) )+ ( (lv_otherwiseChoices_8_0= ruleOtherwiseChoice ) )* otherlv_9= 'end'
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1212:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=42 && LA23_0<=43)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1213:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1213:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1214:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalChoiceDialogAccess().getModifiersModifierEnumRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleConditionalChoiceDialog2497);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalChoiceDialogRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiers",
            	              		lv_modifiers_0_0, 
            	              		"Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleConditionalChoiceDialog2510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConditionalChoiceDialogAccess().getChoicesKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleConditionalChoiceDialog2522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConditionalChoiceDialogAccess().getIfKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleConditionalChoiceDialog2534); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConditionalChoiceDialogAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1242:1: ( (lv_conditionList_4_0= ruleConditionList ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1243:1: (lv_conditionList_4_0= ruleConditionList )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1243:1: (lv_conditionList_4_0= ruleConditionList )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1244:3: lv_conditionList_4_0= ruleConditionList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalChoiceDialogAccess().getConditionListConditionListParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionList_in_ruleConditionalChoiceDialog2555);
            lv_conditionList_4_0=ruleConditionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionalChoiceDialogRule());
              	        }
                     		set(
                     			current, 
                     			"conditionList",
                      		lv_conditionList_4_0, 
                      		"ConditionList");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleConditionalChoiceDialog2567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getConditionalChoiceDialogAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1264:1: ( (lv_comment_6_0= RULE_COMMENT ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_COMMENT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1265:1: (lv_comment_6_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1265:1: (lv_comment_6_0= RULE_COMMENT )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1266:3: lv_comment_6_0= RULE_COMMENT
                    {
                    lv_comment_6_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleConditionalChoiceDialog2584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_comment_6_0, grammarAccess.getConditionalChoiceDialogAccess().getCommentCOMMENTTerminalRuleCall_6_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionalChoiceDialogRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"comment",
                              		lv_comment_6_0, 
                              		"COMMENT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1282:3: ( (lv_choiceDialogs_7_0= ruleChoiceDialog ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1283:1: (lv_choiceDialogs_7_0= ruleChoiceDialog )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1283:1: (lv_choiceDialogs_7_0= ruleChoiceDialog )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1284:3: lv_choiceDialogs_7_0= ruleChoiceDialog
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalChoiceDialogAccess().getChoiceDialogsChoiceDialogParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleChoiceDialog_in_ruleConditionalChoiceDialog2611);
            	    lv_choiceDialogs_7_0=ruleChoiceDialog();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalChoiceDialogRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"choiceDialogs",
            	              		lv_choiceDialogs_7_0, 
            	              		"ChoiceDialog");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1300:3: ( (lv_otherwiseChoices_8_0= ruleOtherwiseChoice ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==30||(LA26_0>=42 && LA26_0<=43)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1301:1: (lv_otherwiseChoices_8_0= ruleOtherwiseChoice )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1301:1: (lv_otherwiseChoices_8_0= ruleOtherwiseChoice )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1302:3: lv_otherwiseChoices_8_0= ruleOtherwiseChoice
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalChoiceDialogAccess().getOtherwiseChoicesOtherwiseChoiceParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherwiseChoice_in_ruleConditionalChoiceDialog2633);
            	    lv_otherwiseChoices_8_0=ruleOtherwiseChoice();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalChoiceDialogRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"otherwiseChoices",
            	              		lv_otherwiseChoices_8_0, 
            	              		"OtherwiseChoice");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleConditionalChoiceDialog2646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getConditionalChoiceDialogAccess().getEndKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConditionalChoiceDialog"


    // $ANTLR start "entryRuleOtherwiseChoice"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1330:1: entryRuleOtherwiseChoice returns [EObject current=null] : iv_ruleOtherwiseChoice= ruleOtherwiseChoice EOF ;
    public final EObject entryRuleOtherwiseChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherwiseChoice = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1331:2: (iv_ruleOtherwiseChoice= ruleOtherwiseChoice EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1332:2: iv_ruleOtherwiseChoice= ruleOtherwiseChoice EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherwiseChoiceRule()); 
            }
            pushFollow(FOLLOW_ruleOtherwiseChoice_in_entryRuleOtherwiseChoice2682);
            iv_ruleOtherwiseChoice=ruleOtherwiseChoice();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherwiseChoice; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherwiseChoice2692); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOtherwiseChoice"


    // $ANTLR start "ruleOtherwiseChoice"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1339:1: ruleOtherwiseChoice returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'choices' otherlv_2= 'else' ( ( ( 'if' )=>otherlv_3= 'if' ) otherlv_4= '(' ( (lv_conditionList_5_0= ruleConditionList ) ) otherlv_6= ')' )? ( (lv_comment_7_0= RULE_COMMENT ) )? ( (lv_choices_8_0= ruleChoiceDialog ) )+ ) ;
    public final EObject ruleOtherwiseChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_comment_7_0=null;
        Enumerator lv_modifiers_0_0 = null;

        EObject lv_conditionList_5_0 = null;

        EObject lv_choices_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1342:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'choices' otherlv_2= 'else' ( ( ( 'if' )=>otherlv_3= 'if' ) otherlv_4= '(' ( (lv_conditionList_5_0= ruleConditionList ) ) otherlv_6= ')' )? ( (lv_comment_7_0= RULE_COMMENT ) )? ( (lv_choices_8_0= ruleChoiceDialog ) )+ ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1343:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'choices' otherlv_2= 'else' ( ( ( 'if' )=>otherlv_3= 'if' ) otherlv_4= '(' ( (lv_conditionList_5_0= ruleConditionList ) ) otherlv_6= ')' )? ( (lv_comment_7_0= RULE_COMMENT ) )? ( (lv_choices_8_0= ruleChoiceDialog ) )+ )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1343:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'choices' otherlv_2= 'else' ( ( ( 'if' )=>otherlv_3= 'if' ) otherlv_4= '(' ( (lv_conditionList_5_0= ruleConditionList ) ) otherlv_6= ')' )? ( (lv_comment_7_0= RULE_COMMENT ) )? ( (lv_choices_8_0= ruleChoiceDialog ) )+ )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1343:2: ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'choices' otherlv_2= 'else' ( ( ( 'if' )=>otherlv_3= 'if' ) otherlv_4= '(' ( (lv_conditionList_5_0= ruleConditionList ) ) otherlv_6= ')' )? ( (lv_comment_7_0= RULE_COMMENT ) )? ( (lv_choices_8_0= ruleChoiceDialog ) )+
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1343:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=42 && LA27_0<=43)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1344:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1344:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1345:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOtherwiseChoiceAccess().getModifiersModifierEnumRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleOtherwiseChoice2738);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOtherwiseChoiceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiers",
            	              		lv_modifiers_0_0, 
            	              		"Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleOtherwiseChoice2751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOtherwiseChoiceAccess().getChoicesKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleOtherwiseChoice2763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOtherwiseChoiceAccess().getElseKeyword_2());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1369:1: ( ( ( 'if' )=>otherlv_3= 'if' ) otherlv_4= '(' ( (lv_conditionList_5_0= ruleConditionList ) ) otherlv_6= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) && (synpred1_InternalDialogScript())) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1369:2: ( ( 'if' )=>otherlv_3= 'if' ) otherlv_4= '(' ( (lv_conditionList_5_0= ruleConditionList ) ) otherlv_6= ')'
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1369:2: ( ( 'if' )=>otherlv_3= 'if' )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1369:3: ( 'if' )=>otherlv_3= 'if'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleOtherwiseChoice2784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOtherwiseChoiceAccess().getIfKeyword_3_0());
                          
                    }

                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleOtherwiseChoice2797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getOtherwiseChoiceAccess().getLeftParenthesisKeyword_3_1());
                          
                    }
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1378:1: ( (lv_conditionList_5_0= ruleConditionList ) )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1379:1: (lv_conditionList_5_0= ruleConditionList )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1379:1: (lv_conditionList_5_0= ruleConditionList )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1380:3: lv_conditionList_5_0= ruleConditionList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOtherwiseChoiceAccess().getConditionListConditionListParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionList_in_ruleOtherwiseChoice2818);
                    lv_conditionList_5_0=ruleConditionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOtherwiseChoiceRule());
                      	        }
                             		set(
                             			current, 
                             			"conditionList",
                              		lv_conditionList_5_0, 
                              		"ConditionList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleOtherwiseChoice2830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getOtherwiseChoiceAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1400:3: ( (lv_comment_7_0= RULE_COMMENT ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_COMMENT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1401:1: (lv_comment_7_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1401:1: (lv_comment_7_0= RULE_COMMENT )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1402:3: lv_comment_7_0= RULE_COMMENT
                    {
                    lv_comment_7_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleOtherwiseChoice2849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_comment_7_0, grammarAccess.getOtherwiseChoiceAccess().getCommentCOMMENTTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOtherwiseChoiceRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"comment",
                              		lv_comment_7_0, 
                              		"COMMENT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1418:3: ( (lv_choices_8_0= ruleChoiceDialog ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1419:1: (lv_choices_8_0= ruleChoiceDialog )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1419:1: (lv_choices_8_0= ruleChoiceDialog )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1420:3: lv_choices_8_0= ruleChoiceDialog
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOtherwiseChoiceAccess().getChoicesChoiceDialogParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleChoiceDialog_in_ruleOtherwiseChoice2876);
            	    lv_choices_8_0=ruleChoiceDialog();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOtherwiseChoiceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"choices",
            	              		lv_choices_8_0, 
            	              		"ChoiceDialog");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOtherwiseChoice"


    // $ANTLR start "entryRuleStringID"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1444:1: entryRuleStringID returns [String current=null] : iv_ruleStringID= ruleStringID EOF ;
    public final String entryRuleStringID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringID = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1445:2: (iv_ruleStringID= ruleStringID EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1446:2: iv_ruleStringID= ruleStringID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringIDRule()); 
            }
            pushFollow(FOLLOW_ruleStringID_in_entryRuleStringID2914);
            iv_ruleStringID=ruleStringID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringID2925); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringID"


    // $ANTLR start "ruleStringID"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1453:1: ruleStringID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1456:28: (this_STRING_0= RULE_STRING )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1457:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringID2964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_0, grammarAccess.getStringIDAccess().getSTRINGTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringID"


    // $ANTLR start "entryRuleChoiceDialog"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1472:1: entryRuleChoiceDialog returns [EObject current=null] : iv_ruleChoiceDialog= ruleChoiceDialog EOF ;
    public final EObject entryRuleChoiceDialog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoiceDialog = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1473:2: (iv_ruleChoiceDialog= ruleChoiceDialog EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1474:2: iv_ruleChoiceDialog= ruleChoiceDialog EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChoiceDialogRule()); 
            }
            pushFollow(FOLLOW_ruleChoiceDialog_in_entryRuleChoiceDialog3008);
            iv_ruleChoiceDialog=ruleChoiceDialog();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChoiceDialog; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleChoiceDialog3018); if (state.failed) return current;

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
    // $ANTLR end "entryRuleChoiceDialog"


    // $ANTLR start "ruleChoiceDialog"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1481:1: ruleChoiceDialog returns [EObject current=null] : ( () ( (lv_modifiers_1_0= ruleModifier ) )* otherlv_2= 'choice' ( (lv_name_3_0= ruleStringID ) ) ( (lv_choiceComment_4_0= RULE_COMMENT ) )? ( (lv_body_5_0= ruleConditionalBody ) ) otherlv_6= 'end' ) ;
    public final EObject ruleChoiceDialog() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_choiceComment_4_0=null;
        Token otherlv_6=null;
        Enumerator lv_modifiers_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1484:28: ( ( () ( (lv_modifiers_1_0= ruleModifier ) )* otherlv_2= 'choice' ( (lv_name_3_0= ruleStringID ) ) ( (lv_choiceComment_4_0= RULE_COMMENT ) )? ( (lv_body_5_0= ruleConditionalBody ) ) otherlv_6= 'end' ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1485:1: ( () ( (lv_modifiers_1_0= ruleModifier ) )* otherlv_2= 'choice' ( (lv_name_3_0= ruleStringID ) ) ( (lv_choiceComment_4_0= RULE_COMMENT ) )? ( (lv_body_5_0= ruleConditionalBody ) ) otherlv_6= 'end' )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1485:1: ( () ( (lv_modifiers_1_0= ruleModifier ) )* otherlv_2= 'choice' ( (lv_name_3_0= ruleStringID ) ) ( (lv_choiceComment_4_0= RULE_COMMENT ) )? ( (lv_body_5_0= ruleConditionalBody ) ) otherlv_6= 'end' )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1485:2: () ( (lv_modifiers_1_0= ruleModifier ) )* otherlv_2= 'choice' ( (lv_name_3_0= ruleStringID ) ) ( (lv_choiceComment_4_0= RULE_COMMENT ) )? ( (lv_body_5_0= ruleConditionalBody ) ) otherlv_6= 'end'
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1485:2: ()
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1486:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getChoiceDialogAccess().getChoiceDialogAction_0(),
                          current);
                  
            }

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1491:2: ( (lv_modifiers_1_0= ruleModifier ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=42 && LA31_0<=43)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1492:1: (lv_modifiers_1_0= ruleModifier )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1492:1: (lv_modifiers_1_0= ruleModifier )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1493:3: lv_modifiers_1_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getChoiceDialogAccess().getModifiersModifierEnumRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleChoiceDialog3073);
            	    lv_modifiers_1_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getChoiceDialogRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiers",
            	              		lv_modifiers_1_0, 
            	              		"Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleChoiceDialog3086); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getChoiceDialogAccess().getChoiceKeyword_2());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1513:1: ( (lv_name_3_0= ruleStringID ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1514:1: (lv_name_3_0= ruleStringID )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1514:1: (lv_name_3_0= ruleStringID )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1515:3: lv_name_3_0= ruleStringID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getChoiceDialogAccess().getNameStringIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStringID_in_ruleChoiceDialog3107);
            lv_name_3_0=ruleStringID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getChoiceDialogRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"StringID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1531:2: ( (lv_choiceComment_4_0= RULE_COMMENT ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_COMMENT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1532:1: (lv_choiceComment_4_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1532:1: (lv_choiceComment_4_0= RULE_COMMENT )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1533:3: lv_choiceComment_4_0= RULE_COMMENT
                    {
                    lv_choiceComment_4_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleChoiceDialog3124); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_choiceComment_4_0, grammarAccess.getChoiceDialogAccess().getChoiceCommentCOMMENTTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getChoiceDialogRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"choiceComment",
                              		lv_choiceComment_4_0, 
                              		"COMMENT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1549:3: ( (lv_body_5_0= ruleConditionalBody ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1550:1: (lv_body_5_0= ruleConditionalBody )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1550:1: (lv_body_5_0= ruleConditionalBody )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1551:3: lv_body_5_0= ruleConditionalBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getChoiceDialogAccess().getBodyConditionalBodyParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalBody_in_ruleChoiceDialog3151);
            lv_body_5_0=ruleConditionalBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getChoiceDialogRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"ConditionalBody");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleChoiceDialog3163); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getChoiceDialogAccess().getEndKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleChoiceDialog"


    // $ANTLR start "entryRuleConditionList"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1579:1: entryRuleConditionList returns [EObject current=null] : iv_ruleConditionList= ruleConditionList EOF ;
    public final EObject entryRuleConditionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionList = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1580:2: (iv_ruleConditionList= ruleConditionList EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1581:2: iv_ruleConditionList= ruleConditionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionListRule()); 
            }
            pushFollow(FOLLOW_ruleConditionList_in_entryRuleConditionList3199);
            iv_ruleConditionList=ruleConditionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionList3209); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConditionList"


    // $ANTLR start "ruleConditionList"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1588:1: ruleConditionList returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'or' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleConditionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1591:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'or' ( (otherlv_2= RULE_ID ) ) )* ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1592:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'or' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1592:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'or' ( (otherlv_2= RULE_ID ) ) )* )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1592:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'or' ( (otherlv_2= RULE_ID ) ) )*
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1592:2: ( (otherlv_0= RULE_ID ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1593:1: (otherlv_0= RULE_ID )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1593:1: (otherlv_0= RULE_ID )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1594:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getConditionListRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConditionList3254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getConditionListAccess().getConditionsConditionDefinitionCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1605:2: (otherlv_1= 'or' ( (otherlv_2= RULE_ID ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==35) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1605:4: otherlv_1= 'or' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleConditionList3267); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getConditionListAccess().getOrKeyword_1_0());
            	          
            	    }
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1609:1: ( (otherlv_2= RULE_ID ) )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1610:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1610:1: (otherlv_2= RULE_ID )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1611:3: otherlv_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getConditionListRule());
            	      	        }
            	              
            	    }
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConditionList3287); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_2, grammarAccess.getConditionListAccess().getConditionsConditionDefinitionCrossReference_1_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConditionList"


    // $ANTLR start "entryRuleJump"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1630:1: entryRuleJump returns [EObject current=null] : iv_ruleJump= ruleJump EOF ;
    public final EObject entryRuleJump() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJump = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1631:2: (iv_ruleJump= ruleJump EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1632:2: iv_ruleJump= ruleJump EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJumpRule()); 
            }
            pushFollow(FOLLOW_ruleJump_in_entryRuleJump3325);
            iv_ruleJump=ruleJump();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJump; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJump3335); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJump"


    // $ANTLR start "ruleJump"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1639:1: ruleJump returns [EObject current=null] : (this_Exit_0= ruleExit | this_InvokeHub_1= ruleInvokeHub | this_InvokeScene_2= ruleInvokeScene ) ;
    public final EObject ruleJump() throws RecognitionException {
        EObject current = null;

        EObject this_Exit_0 = null;

        EObject this_InvokeHub_1 = null;

        EObject this_InvokeScene_2 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1642:28: ( (this_Exit_0= ruleExit | this_InvokeHub_1= ruleInvokeHub | this_InvokeScene_2= ruleInvokeScene ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1643:1: (this_Exit_0= ruleExit | this_InvokeHub_1= ruleInvokeHub | this_InvokeScene_2= ruleInvokeScene )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1643:1: (this_Exit_0= ruleExit | this_InvokeHub_1= ruleInvokeHub | this_InvokeScene_2= ruleInvokeScene )
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            else if ( (LA34_0==36) ) {
                int LA34_2 = input.LA(2);

                if ( (LA34_2==22) ) {
                    alt34=3;
                }
                else if ( (LA34_2==29) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1644:5: this_Exit_0= ruleExit
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJumpAccess().getExitParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExit_in_ruleJump3382);
                    this_Exit_0=ruleExit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Exit_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1654:5: this_InvokeHub_1= ruleInvokeHub
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJumpAccess().getInvokeHubParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInvokeHub_in_ruleJump3409);
                    this_InvokeHub_1=ruleInvokeHub();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InvokeHub_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1664:5: this_InvokeScene_2= ruleInvokeScene
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJumpAccess().getInvokeSceneParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInvokeScene_in_ruleJump3436);
                    this_InvokeScene_2=ruleInvokeScene();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InvokeScene_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJump"


    // $ANTLR start "entryRuleInvokeHub"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1680:1: entryRuleInvokeHub returns [EObject current=null] : iv_ruleInvokeHub= ruleInvokeHub EOF ;
    public final EObject entryRuleInvokeHub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvokeHub = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1681:2: (iv_ruleInvokeHub= ruleInvokeHub EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1682:2: iv_ruleInvokeHub= ruleInvokeHub EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvokeHubRule()); 
            }
            pushFollow(FOLLOW_ruleInvokeHub_in_entryRuleInvokeHub3471);
            iv_ruleInvokeHub=ruleInvokeHub();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvokeHub; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvokeHub3481); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInvokeHub"


    // $ANTLR start "ruleInvokeHub"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1689:1: ruleInvokeHub returns [EObject current=null] : (otherlv_0= 'enter' otherlv_1= 'hub' ( ( ruleStringID ) ) ) ;
    public final EObject ruleInvokeHub() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1692:28: ( (otherlv_0= 'enter' otherlv_1= 'hub' ( ( ruleStringID ) ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1693:1: (otherlv_0= 'enter' otherlv_1= 'hub' ( ( ruleStringID ) ) )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1693:1: (otherlv_0= 'enter' otherlv_1= 'hub' ( ( ruleStringID ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1693:3: otherlv_0= 'enter' otherlv_1= 'hub' ( ( ruleStringID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleInvokeHub3518); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInvokeHubAccess().getEnterKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleInvokeHub3530); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInvokeHubAccess().getHubKeyword_1());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1701:1: ( ( ruleStringID ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1702:1: ( ruleStringID )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1702:1: ( ruleStringID )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1703:3: ruleStringID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInvokeHubRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInvokeHubAccess().getHubHubCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStringID_in_ruleInvokeHub3553);
            ruleStringID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInvokeHub"


    // $ANTLR start "entryRuleInvokeScene"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1724:1: entryRuleInvokeScene returns [EObject current=null] : iv_ruleInvokeScene= ruleInvokeScene EOF ;
    public final EObject entryRuleInvokeScene() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvokeScene = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1725:2: (iv_ruleInvokeScene= ruleInvokeScene EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1726:2: iv_ruleInvokeScene= ruleInvokeScene EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvokeSceneRule()); 
            }
            pushFollow(FOLLOW_ruleInvokeScene_in_entryRuleInvokeScene3589);
            iv_ruleInvokeScene=ruleInvokeScene();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvokeScene; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvokeScene3599); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInvokeScene"


    // $ANTLR start "ruleInvokeScene"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1733:1: ruleInvokeScene returns [EObject current=null] : (otherlv_0= 'enter' otherlv_1= 'scene' ( ( ruleStringID ) ) ) ;
    public final EObject ruleInvokeScene() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1736:28: ( (otherlv_0= 'enter' otherlv_1= 'scene' ( ( ruleStringID ) ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1737:1: (otherlv_0= 'enter' otherlv_1= 'scene' ( ( ruleStringID ) ) )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1737:1: (otherlv_0= 'enter' otherlv_1= 'scene' ( ( ruleStringID ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1737:3: otherlv_0= 'enter' otherlv_1= 'scene' ( ( ruleStringID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleInvokeScene3636); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInvokeSceneAccess().getEnterKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleInvokeScene3648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInvokeSceneAccess().getSceneKeyword_1());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1745:1: ( ( ruleStringID ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1746:1: ( ruleStringID )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1746:1: ( ruleStringID )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1747:3: ruleStringID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInvokeSceneRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInvokeSceneAccess().getSceneSceneCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStringID_in_ruleInvokeScene3671);
            ruleStringID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInvokeScene"


    // $ANTLR start "entryRuleExit"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1768:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1769:2: (iv_ruleExit= ruleExit EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1770:2: iv_ruleExit= ruleExit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitRule()); 
            }
            pushFollow(FOLLOW_ruleExit_in_entryRuleExit3707);
            iv_ruleExit=ruleExit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExit3717); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExit"


    // $ANTLR start "ruleExit"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1777:1: ruleExit returns [EObject current=null] : ( () otherlv_1= 'exit' ( ( (lv_exitHub_2_0= 'hub' ) ) | ( (lv_exitScene_3_0= 'scene' ) ) ) ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_exitHub_2_0=null;
        Token lv_exitScene_3_0=null;

         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1780:28: ( ( () otherlv_1= 'exit' ( ( (lv_exitHub_2_0= 'hub' ) ) | ( (lv_exitScene_3_0= 'scene' ) ) ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1781:1: ( () otherlv_1= 'exit' ( ( (lv_exitHub_2_0= 'hub' ) ) | ( (lv_exitScene_3_0= 'scene' ) ) ) )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1781:1: ( () otherlv_1= 'exit' ( ( (lv_exitHub_2_0= 'hub' ) ) | ( (lv_exitScene_3_0= 'scene' ) ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1781:2: () otherlv_1= 'exit' ( ( (lv_exitHub_2_0= 'hub' ) ) | ( (lv_exitScene_3_0= 'scene' ) ) )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1781:2: ()
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1782:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExitAccess().getExitAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleExit3763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitAccess().getExitKeyword_1());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1791:1: ( ( (lv_exitHub_2_0= 'hub' ) ) | ( (lv_exitScene_3_0= 'scene' ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            else if ( (LA35_0==22) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1791:2: ( (lv_exitHub_2_0= 'hub' ) )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1791:2: ( (lv_exitHub_2_0= 'hub' ) )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1792:1: (lv_exitHub_2_0= 'hub' )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1792:1: (lv_exitHub_2_0= 'hub' )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1793:3: lv_exitHub_2_0= 'hub'
                    {
                    lv_exitHub_2_0=(Token)match(input,29,FOLLOW_29_in_ruleExit3782); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_exitHub_2_0, grammarAccess.getExitAccess().getExitHubHubKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExitRule());
                      	        }
                             		setWithLastConsumed(current, "exitHub", true, "hub");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1807:6: ( (lv_exitScene_3_0= 'scene' ) )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1807:6: ( (lv_exitScene_3_0= 'scene' ) )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1808:1: (lv_exitScene_3_0= 'scene' )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1808:1: (lv_exitScene_3_0= 'scene' )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1809:3: lv_exitScene_3_0= 'scene'
                    {
                    lv_exitScene_3_0=(Token)match(input,22,FOLLOW_22_in_ruleExit3819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_exitScene_3_0, grammarAccess.getExitAccess().getExitSceneSceneKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExitRule());
                      	        }
                             		setWithLastConsumed(current, "exitScene", true, "scene");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExit"


    // $ANTLR start "entryRuleConditional"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1830:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1831:2: (iv_ruleConditional= ruleConditional EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1832:2: iv_ruleConditional= ruleConditional EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalRule()); 
            }
            pushFollow(FOLLOW_ruleConditional_in_entryRuleConditional3869);
            iv_ruleConditional=ruleConditional();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditional; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditional3879); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1839:1: ruleConditional returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'if' otherlv_2= '(' ( (lv_conditionList_3_0= ruleConditionList ) ) otherlv_4= ')' ( (lv_comment_5_0= RULE_COMMENT ) )? ( (lv_body_6_0= ruleConditionalBody ) ) ( (lv_otherwiseList_7_0= ruleOtherwise ) )* otherlv_8= 'end' ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_comment_5_0=null;
        Token otherlv_8=null;
        Enumerator lv_modifiers_0_0 = null;

        EObject lv_conditionList_3_0 = null;

        EObject lv_body_6_0 = null;

        EObject lv_otherwiseList_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1842:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'if' otherlv_2= '(' ( (lv_conditionList_3_0= ruleConditionList ) ) otherlv_4= ')' ( (lv_comment_5_0= RULE_COMMENT ) )? ( (lv_body_6_0= ruleConditionalBody ) ) ( (lv_otherwiseList_7_0= ruleOtherwise ) )* otherlv_8= 'end' ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1843:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'if' otherlv_2= '(' ( (lv_conditionList_3_0= ruleConditionList ) ) otherlv_4= ')' ( (lv_comment_5_0= RULE_COMMENT ) )? ( (lv_body_6_0= ruleConditionalBody ) ) ( (lv_otherwiseList_7_0= ruleOtherwise ) )* otherlv_8= 'end' )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1843:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'if' otherlv_2= '(' ( (lv_conditionList_3_0= ruleConditionList ) ) otherlv_4= ')' ( (lv_comment_5_0= RULE_COMMENT ) )? ( (lv_body_6_0= ruleConditionalBody ) ) ( (lv_otherwiseList_7_0= ruleOtherwise ) )* otherlv_8= 'end' )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1843:2: ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'if' otherlv_2= '(' ( (lv_conditionList_3_0= ruleConditionList ) ) otherlv_4= ')' ( (lv_comment_5_0= RULE_COMMENT ) )? ( (lv_body_6_0= ruleConditionalBody ) ) ( (lv_otherwiseList_7_0= ruleOtherwise ) )* otherlv_8= 'end'
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1843:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=42 && LA36_0<=43)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1844:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1844:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1845:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getModifiersModifierEnumRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleConditional3925);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiers",
            	              		lv_modifiers_0_0, 
            	              		"Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleConditional3938); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConditionalAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleConditional3950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1869:1: ( (lv_conditionList_3_0= ruleConditionList ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1870:1: (lv_conditionList_3_0= ruleConditionList )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1870:1: (lv_conditionList_3_0= ruleConditionList )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1871:3: lv_conditionList_3_0= ruleConditionList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getConditionListConditionListParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionList_in_ruleConditional3971);
            lv_conditionList_3_0=ruleConditionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionalRule());
              	        }
                     		set(
                     			current, 
                     			"conditionList",
                      		lv_conditionList_3_0, 
                      		"ConditionList");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleConditional3983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConditionalAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1891:1: ( (lv_comment_5_0= RULE_COMMENT ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_COMMENT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1892:1: (lv_comment_5_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1892:1: (lv_comment_5_0= RULE_COMMENT )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1893:3: lv_comment_5_0= RULE_COMMENT
                    {
                    lv_comment_5_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleConditional4000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_comment_5_0, grammarAccess.getConditionalAccess().getCommentCOMMENTTerminalRuleCall_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionalRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"comment",
                              		lv_comment_5_0, 
                              		"COMMENT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1909:3: ( (lv_body_6_0= ruleConditionalBody ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1910:1: (lv_body_6_0= ruleConditionalBody )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1910:1: (lv_body_6_0= ruleConditionalBody )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1911:3: lv_body_6_0= ruleConditionalBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getBodyConditionalBodyParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalBody_in_ruleConditional4027);
            lv_body_6_0=ruleConditionalBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionalRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_6_0, 
                      		"ConditionalBody");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1927:2: ( (lv_otherwiseList_7_0= ruleOtherwise ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==26||(LA38_0>=42 && LA38_0<=43)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1928:1: (lv_otherwiseList_7_0= ruleOtherwise )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1928:1: (lv_otherwiseList_7_0= ruleOtherwise )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1929:3: lv_otherwiseList_7_0= ruleOtherwise
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalAccess().getOtherwiseListOtherwiseParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherwise_in_ruleConditional4048);
            	    lv_otherwiseList_7_0=ruleOtherwise();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"otherwiseList",
            	              		lv_otherwiseList_7_0, 
            	              		"Otherwise");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleConditional4061); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getConditionalAccess().getEndKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleSwitchList"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1957:1: entryRuleSwitchList returns [EObject current=null] : iv_ruleSwitchList= ruleSwitchList EOF ;
    public final EObject entryRuleSwitchList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchList = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1958:2: (iv_ruleSwitchList= ruleSwitchList EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1959:2: iv_ruleSwitchList= ruleSwitchList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchListRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchList_in_entryRuleSwitchList4097);
            iv_ruleSwitchList=ruleSwitchList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchList4107); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitchList"


    // $ANTLR start "ruleSwitchList"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1966:1: ruleSwitchList returns [EObject current=null] : ( ( (lv_switches_0_0= ruleSwitch ) ) (otherlv_1= 'and' ( (lv_switches_2_0= ruleSwitch ) ) )* ) ;
    public final EObject ruleSwitchList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_switches_0_0 = null;

        EObject lv_switches_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1969:28: ( ( ( (lv_switches_0_0= ruleSwitch ) ) (otherlv_1= 'and' ( (lv_switches_2_0= ruleSwitch ) ) )* ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1970:1: ( ( (lv_switches_0_0= ruleSwitch ) ) (otherlv_1= 'and' ( (lv_switches_2_0= ruleSwitch ) ) )* )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1970:1: ( ( (lv_switches_0_0= ruleSwitch ) ) (otherlv_1= 'and' ( (lv_switches_2_0= ruleSwitch ) ) )* )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1970:2: ( (lv_switches_0_0= ruleSwitch ) ) (otherlv_1= 'and' ( (lv_switches_2_0= ruleSwitch ) ) )*
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1970:2: ( (lv_switches_0_0= ruleSwitch ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1971:1: (lv_switches_0_0= ruleSwitch )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1971:1: (lv_switches_0_0= ruleSwitch )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1972:3: lv_switches_0_0= ruleSwitch
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchListAccess().getSwitchesSwitchParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSwitch_in_ruleSwitchList4153);
            lv_switches_0_0=ruleSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchListRule());
              	        }
                     		add(
                     			current, 
                     			"switches",
                      		lv_switches_0_0, 
                      		"Switch");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1988:2: (otherlv_1= 'and' ( (lv_switches_2_0= ruleSwitch ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==38) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1988:4: otherlv_1= 'and' ( (lv_switches_2_0= ruleSwitch ) )
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleSwitchList4166); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getSwitchListAccess().getAndKeyword_1_0());
            	          
            	    }
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1992:1: ( (lv_switches_2_0= ruleSwitch ) )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1993:1: (lv_switches_2_0= ruleSwitch )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1993:1: (lv_switches_2_0= ruleSwitch )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1994:3: lv_switches_2_0= ruleSwitch
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchListAccess().getSwitchesSwitchParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSwitch_in_ruleSwitchList4187);
            	    lv_switches_2_0=ruleSwitch();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitchListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"switches",
            	              		lv_switches_2_0, 
            	              		"Switch");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSwitchList"


    // $ANTLR start "entryRuleSwitch"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2018:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2019:2: (iv_ruleSwitch= ruleSwitch EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2020:2: iv_ruleSwitch= ruleSwitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchRule()); 
            }
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch4225);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch4235); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2027:1: ruleSwitch returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleSwitchValue ) ) ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2030:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleSwitchValue ) ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2031:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleSwitchValue ) ) )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2031:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleSwitchValue ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2031:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_value_2_0= ruleSwitchValue ) )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2031:2: ( (otherlv_0= RULE_ID ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2032:1: (otherlv_0= RULE_ID )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2032:1: (otherlv_0= RULE_ID )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2033:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSwitchRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSwitch4280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchSwitchDefinitionCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleSwitch4292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchAccess().getIsKeyword_1());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2048:1: ( (lv_value_2_0= ruleSwitchValue ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2049:1: (lv_value_2_0= ruleSwitchValue )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2049:1: (lv_value_2_0= ruleSwitchValue )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2050:3: lv_value_2_0= ruleSwitchValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchAccess().getValueSwitchValueEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSwitchValue_in_ruleSwitch4313);
            lv_value_2_0=ruleSwitchValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"SwitchValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleConditionalBody"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2074:1: entryRuleConditionalBody returns [EObject current=null] : iv_ruleConditionalBody= ruleConditionalBody EOF ;
    public final EObject entryRuleConditionalBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalBody = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2075:2: (iv_ruleConditionalBody= ruleConditionalBody EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2076:2: iv_ruleConditionalBody= ruleConditionalBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalBodyRule()); 
            }
            pushFollow(FOLLOW_ruleConditionalBody_in_entryRuleConditionalBody4349);
            iv_ruleConditionalBody=ruleConditionalBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionalBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalBody4359); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConditionalBody"


    // $ANTLR start "ruleConditionalBody"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2083:1: ruleConditionalBody returns [EObject current=null] : ( () ( (lv_statements_1_0= ruleStatement ) )* ( (lv_switchOn_2_0= ruleSwitchOn ) )? ( (lv_switchOff_3_0= ruleSwitchOff ) )? ( (lv_jump_4_0= ruleJump ) )? ) ;
    public final EObject ruleConditionalBody() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_1_0 = null;

        EObject lv_switchOn_2_0 = null;

        EObject lv_switchOff_3_0 = null;

        EObject lv_jump_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2086:28: ( ( () ( (lv_statements_1_0= ruleStatement ) )* ( (lv_switchOn_2_0= ruleSwitchOn ) )? ( (lv_switchOff_3_0= ruleSwitchOff ) )? ( (lv_jump_4_0= ruleJump ) )? ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2087:1: ( () ( (lv_statements_1_0= ruleStatement ) )* ( (lv_switchOn_2_0= ruleSwitchOn ) )? ( (lv_switchOff_3_0= ruleSwitchOff ) )? ( (lv_jump_4_0= ruleJump ) )? )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2087:1: ( () ( (lv_statements_1_0= ruleStatement ) )* ( (lv_switchOn_2_0= ruleSwitchOn ) )? ( (lv_switchOff_3_0= ruleSwitchOff ) )? ( (lv_jump_4_0= ruleJump ) )? )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2087:2: () ( (lv_statements_1_0= ruleStatement ) )* ( (lv_switchOn_2_0= ruleSwitchOn ) )? ( (lv_switchOff_3_0= ruleSwitchOff ) )? ( (lv_jump_4_0= ruleJump ) )?
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2087:2: ()
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2088:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConditionalBodyAccess().getConditionalBodyAction_0(),
                          current);
                  
            }

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2093:2: ( (lv_statements_1_0= ruleStatement ) )*
            loop40:
            do {
                int alt40=2;
                alt40 = dfa40.predict(input);
                switch (alt40) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2094:1: (lv_statements_1_0= ruleStatement )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2094:1: (lv_statements_1_0= ruleStatement )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2095:3: lv_statements_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConditionalBodyAccess().getStatementsStatementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleConditionalBody4414);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConditionalBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_1_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2111:3: ( (lv_switchOn_2_0= ruleSwitchOn ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==39) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==41) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2112:1: (lv_switchOn_2_0= ruleSwitchOn )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2112:1: (lv_switchOn_2_0= ruleSwitchOn )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2113:3: lv_switchOn_2_0= ruleSwitchOn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalBodyAccess().getSwitchOnSwitchOnParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSwitchOn_in_ruleConditionalBody4436);
                    lv_switchOn_2_0=ruleSwitchOn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalBodyRule());
                      	        }
                             		set(
                             			current, 
                             			"switchOn",
                              		lv_switchOn_2_0, 
                              		"SwitchOn");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2129:3: ( (lv_switchOff_3_0= ruleSwitchOff ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==39) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2130:1: (lv_switchOff_3_0= ruleSwitchOff )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2130:1: (lv_switchOff_3_0= ruleSwitchOff )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2131:3: lv_switchOff_3_0= ruleSwitchOff
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalBodyAccess().getSwitchOffSwitchOffParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSwitchOff_in_ruleConditionalBody4458);
                    lv_switchOff_3_0=ruleSwitchOff();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalBodyRule());
                      	        }
                             		set(
                             			current, 
                             			"switchOff",
                              		lv_switchOff_3_0, 
                              		"SwitchOff");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2147:3: ( (lv_jump_4_0= ruleJump ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=36 && LA43_0<=37)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2148:1: (lv_jump_4_0= ruleJump )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2148:1: (lv_jump_4_0= ruleJump )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2149:3: lv_jump_4_0= ruleJump
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalBodyAccess().getJumpJumpParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJump_in_ruleConditionalBody4480);
                    lv_jump_4_0=ruleJump();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionalBodyRule());
                      	        }
                             		set(
                             			current, 
                             			"jump",
                              		lv_jump_4_0, 
                              		"Jump");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConditionalBody"


    // $ANTLR start "entryRuleStatement"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2173:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2174:2: (iv_ruleStatement= ruleStatement EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2175:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement4517);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement4527); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2182:1: ruleStatement returns [EObject current=null] : (this_DialogLine_0= ruleDialogLine | this_Conditional_1= ruleConditional ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_DialogLine_0 = null;

        EObject this_Conditional_1 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2185:28: ( (this_DialogLine_0= ruleDialogLine | this_Conditional_1= ruleConditional ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2186:1: (this_DialogLine_0= ruleDialogLine | this_Conditional_1= ruleConditional )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2186:1: (this_DialogLine_0= ruleDialogLine | this_Conditional_1= ruleConditional )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==31||(LA44_0>=42 && LA44_0<=43)) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2187:5: this_DialogLine_0= ruleDialogLine
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getDialogLineParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDialogLine_in_ruleStatement4574);
                    this_DialogLine_0=ruleDialogLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DialogLine_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2197:5: this_Conditional_1= ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getConditionalParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConditional_in_ruleStatement4601);
                    this_Conditional_1=ruleConditional();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Conditional_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleOtherwise"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2213:1: entryRuleOtherwise returns [EObject current=null] : iv_ruleOtherwise= ruleOtherwise EOF ;
    public final EObject entryRuleOtherwise() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherwise = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2214:2: (iv_ruleOtherwise= ruleOtherwise EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2215:2: iv_ruleOtherwise= ruleOtherwise EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherwiseRule()); 
            }
            pushFollow(FOLLOW_ruleOtherwise_in_entryRuleOtherwise4636);
            iv_ruleOtherwise=ruleOtherwise();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherwise; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherwise4646); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOtherwise"


    // $ANTLR start "ruleOtherwise"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2222:1: ruleOtherwise returns [EObject current=null] : ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'else' ( ( ( 'if' )=>otherlv_2= 'if' ) otherlv_3= '(' ( (lv_conditionList_4_0= ruleConditionList ) ) otherlv_5= ')' )? ( (lv_comment_6_0= RULE_COMMENT ) )? ( (lv_body_7_0= ruleConditionalBody ) ) ) ;
    public final EObject ruleOtherwise() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_comment_6_0=null;
        Enumerator lv_modifiers_0_0 = null;

        EObject lv_conditionList_4_0 = null;

        EObject lv_body_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2225:28: ( ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'else' ( ( ( 'if' )=>otherlv_2= 'if' ) otherlv_3= '(' ( (lv_conditionList_4_0= ruleConditionList ) ) otherlv_5= ')' )? ( (lv_comment_6_0= RULE_COMMENT ) )? ( (lv_body_7_0= ruleConditionalBody ) ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2226:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'else' ( ( ( 'if' )=>otherlv_2= 'if' ) otherlv_3= '(' ( (lv_conditionList_4_0= ruleConditionList ) ) otherlv_5= ')' )? ( (lv_comment_6_0= RULE_COMMENT ) )? ( (lv_body_7_0= ruleConditionalBody ) ) )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2226:1: ( ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'else' ( ( ( 'if' )=>otherlv_2= 'if' ) otherlv_3= '(' ( (lv_conditionList_4_0= ruleConditionList ) ) otherlv_5= ')' )? ( (lv_comment_6_0= RULE_COMMENT ) )? ( (lv_body_7_0= ruleConditionalBody ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2226:2: ( (lv_modifiers_0_0= ruleModifier ) )* otherlv_1= 'else' ( ( ( 'if' )=>otherlv_2= 'if' ) otherlv_3= '(' ( (lv_conditionList_4_0= ruleConditionList ) ) otherlv_5= ')' )? ( (lv_comment_6_0= RULE_COMMENT ) )? ( (lv_body_7_0= ruleConditionalBody ) )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2226:2: ( (lv_modifiers_0_0= ruleModifier ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=42 && LA45_0<=43)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2227:1: (lv_modifiers_0_0= ruleModifier )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2227:1: (lv_modifiers_0_0= ruleModifier )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2228:3: lv_modifiers_0_0= ruleModifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOtherwiseAccess().getModifiersModifierEnumRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleModifier_in_ruleOtherwise4692);
            	    lv_modifiers_0_0=ruleModifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOtherwiseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modifiers",
            	              		lv_modifiers_0_0, 
            	              		"Modifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleOtherwise4705); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOtherwiseAccess().getElseKeyword_1());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2248:1: ( ( ( 'if' )=>otherlv_2= 'if' ) otherlv_3= '(' ( (lv_conditionList_4_0= ruleConditionList ) ) otherlv_5= ')' )?
            int alt46=2;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2248:2: ( ( 'if' )=>otherlv_2= 'if' ) otherlv_3= '(' ( (lv_conditionList_4_0= ruleConditionList ) ) otherlv_5= ')'
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2248:2: ( ( 'if' )=>otherlv_2= 'if' )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2248:3: ( 'if' )=>otherlv_2= 'if'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleOtherwise4726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getOtherwiseAccess().getIfKeyword_2_0());
                          
                    }

                    }

                    otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleOtherwise4739); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOtherwiseAccess().getLeftParenthesisKeyword_2_1());
                          
                    }
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2257:1: ( (lv_conditionList_4_0= ruleConditionList ) )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2258:1: (lv_conditionList_4_0= ruleConditionList )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2258:1: (lv_conditionList_4_0= ruleConditionList )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2259:3: lv_conditionList_4_0= ruleConditionList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOtherwiseAccess().getConditionListConditionListParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConditionList_in_ruleOtherwise4760);
                    lv_conditionList_4_0=ruleConditionList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOtherwiseRule());
                      	        }
                             		set(
                             			current, 
                             			"conditionList",
                              		lv_conditionList_4_0, 
                              		"ConditionList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleOtherwise4772); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getOtherwiseAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2279:3: ( (lv_comment_6_0= RULE_COMMENT ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_COMMENT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2280:1: (lv_comment_6_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2280:1: (lv_comment_6_0= RULE_COMMENT )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2281:3: lv_comment_6_0= RULE_COMMENT
                    {
                    lv_comment_6_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleOtherwise4791); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_comment_6_0, grammarAccess.getOtherwiseAccess().getCommentCOMMENTTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOtherwiseRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"comment",
                              		lv_comment_6_0, 
                              		"COMMENT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2297:3: ( (lv_body_7_0= ruleConditionalBody ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2298:1: (lv_body_7_0= ruleConditionalBody )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2298:1: (lv_body_7_0= ruleConditionalBody )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2299:3: lv_body_7_0= ruleConditionalBody
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOtherwiseAccess().getBodyConditionalBodyParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConditionalBody_in_ruleOtherwise4818);
            lv_body_7_0=ruleConditionalBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOtherwiseRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_7_0, 
                      		"ConditionalBody");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOtherwise"


    // $ANTLR start "entryRuleSwitchOff"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2323:1: entryRuleSwitchOff returns [EObject current=null] : iv_ruleSwitchOff= ruleSwitchOff EOF ;
    public final EObject entryRuleSwitchOff() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchOff = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2324:2: (iv_ruleSwitchOff= ruleSwitchOff EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2325:2: iv_ruleSwitchOff= ruleSwitchOff EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchOffRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchOff_in_entryRuleSwitchOff4854);
            iv_ruleSwitchOff=ruleSwitchOff();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchOff; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchOff4864); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitchOff"


    // $ANTLR start "ruleSwitchOff"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2332:1: ruleSwitchOff returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= 'off' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ( (lv_comment_5_0= RULE_COMMENT ) )? ) ;
    public final EObject ruleSwitchOff() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_comment_5_0=null;

         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2335:28: ( (otherlv_0= 'switch' otherlv_1= 'off' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ( (lv_comment_5_0= RULE_COMMENT ) )? ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2336:1: (otherlv_0= 'switch' otherlv_1= 'off' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ( (lv_comment_5_0= RULE_COMMENT ) )? )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2336:1: (otherlv_0= 'switch' otherlv_1= 'off' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ( (lv_comment_5_0= RULE_COMMENT ) )? )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2336:3: otherlv_0= 'switch' otherlv_1= 'off' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ( (lv_comment_5_0= RULE_COMMENT ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleSwitchOff4901); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchOffAccess().getSwitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleSwitchOff4913); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchOffAccess().getOffKeyword_1());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2344:1: ( (otherlv_2= RULE_ID ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2345:1: (otherlv_2= RULE_ID )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2345:1: (otherlv_2= RULE_ID )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2346:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSwitchOffRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSwitchOff4933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getSwitchOffAccess().getSetsSwitchDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2357:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==15) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2357:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSwitchOff4946); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSwitchOffAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2361:1: ( (otherlv_4= RULE_ID ) )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2362:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2362:1: (otherlv_4= RULE_ID )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2363:3: otherlv_4= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getSwitchOffRule());
            	      	        }
            	              
            	    }
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSwitchOff4966); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_4, grammarAccess.getSwitchOffAccess().getSetsSwitchDefinitionCrossReference_3_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2374:4: ( (lv_comment_5_0= RULE_COMMENT ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_COMMENT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2375:1: (lv_comment_5_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2375:1: (lv_comment_5_0= RULE_COMMENT )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2376:3: lv_comment_5_0= RULE_COMMENT
                    {
                    lv_comment_5_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleSwitchOff4985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_comment_5_0, grammarAccess.getSwitchOffAccess().getCommentCOMMENTTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSwitchOffRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"comment",
                              		lv_comment_5_0, 
                              		"COMMENT");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSwitchOff"


    // $ANTLR start "entryRuleSwitchOn"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2400:1: entryRuleSwitchOn returns [EObject current=null] : iv_ruleSwitchOn= ruleSwitchOn EOF ;
    public final EObject entryRuleSwitchOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchOn = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2401:2: (iv_ruleSwitchOn= ruleSwitchOn EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2402:2: iv_ruleSwitchOn= ruleSwitchOn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchOnRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchOn_in_entryRuleSwitchOn5027);
            iv_ruleSwitchOn=ruleSwitchOn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchOn; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchOn5037); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSwitchOn"


    // $ANTLR start "ruleSwitchOn"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2409:1: ruleSwitchOn returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ( (lv_comment_5_0= RULE_COMMENT ) )? ) ;
    public final EObject ruleSwitchOn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_comment_5_0=null;

         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2412:28: ( (otherlv_0= 'switch' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ( (lv_comment_5_0= RULE_COMMENT ) )? ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2413:1: (otherlv_0= 'switch' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ( (lv_comment_5_0= RULE_COMMENT ) )? )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2413:1: (otherlv_0= 'switch' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ( (lv_comment_5_0= RULE_COMMENT ) )? )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2413:3: otherlv_0= 'switch' otherlv_1= 'on' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ( (lv_comment_5_0= RULE_COMMENT ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleSwitchOn5074); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchOnAccess().getSwitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleSwitchOn5086); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchOnAccess().getOnKeyword_1());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2421:1: ( (otherlv_2= RULE_ID ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2422:1: (otherlv_2= RULE_ID )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2422:1: (otherlv_2= RULE_ID )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2423:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSwitchOnRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSwitchOn5106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getSwitchOnAccess().getSetsSwitchDefinitionCrossReference_2_0()); 
              	
            }

            }


            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2434:2: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==15) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2434:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSwitchOn5119); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSwitchOnAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2438:1: ( (otherlv_4= RULE_ID ) )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2439:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2439:1: (otherlv_4= RULE_ID )
            	    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2440:3: otherlv_4= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getSwitchOnRule());
            	      	        }
            	              
            	    }
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSwitchOn5139); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_4, grammarAccess.getSwitchOnAccess().getSetsSwitchDefinitionCrossReference_3_1_0()); 
            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2451:4: ( (lv_comment_5_0= RULE_COMMENT ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_COMMENT) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2452:1: (lv_comment_5_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2452:1: (lv_comment_5_0= RULE_COMMENT )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2453:3: lv_comment_5_0= RULE_COMMENT
                    {
                    lv_comment_5_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleSwitchOn5158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_comment_5_0, grammarAccess.getSwitchOnAccess().getCommentCOMMENTTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSwitchOnRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"comment",
                              		lv_comment_5_0, 
                              		"COMMENT");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSwitchOn"


    // $ANTLR start "entryRuleDialogLine"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2477:1: entryRuleDialogLine returns [EObject current=null] : iv_ruleDialogLine= ruleDialogLine EOF ;
    public final EObject entryRuleDialogLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialogLine = null;


        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2478:2: (iv_ruleDialogLine= ruleDialogLine EOF )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2479:2: iv_ruleDialogLine= ruleDialogLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDialogLineRule()); 
            }
            pushFollow(FOLLOW_ruleDialogLine_in_entryRuleDialogLine5200);
            iv_ruleDialogLine=ruleDialogLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDialogLine; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDialogLine5210); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDialogLine"


    // $ANTLR start "ruleDialogLine"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2486:1: ruleDialogLine returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_lines_2_0= ruleStringID ) ) ( (lv_comment_3_0= RULE_COMMENT ) )? ) ;
    public final EObject ruleDialogLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_comment_3_0=null;
        AntlrDatatypeRuleToken lv_lines_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2489:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_lines_2_0= ruleStringID ) ) ( (lv_comment_3_0= RULE_COMMENT ) )? ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2490:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_lines_2_0= ruleStringID ) ) ( (lv_comment_3_0= RULE_COMMENT ) )? )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2490:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_lines_2_0= ruleStringID ) ) ( (lv_comment_3_0= RULE_COMMENT ) )? )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2490:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_lines_2_0= ruleStringID ) ) ( (lv_comment_3_0= RULE_COMMENT ) )?
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2490:2: ( (otherlv_0= RULE_ID ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2491:1: (otherlv_0= RULE_ID )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2491:1: (otherlv_0= RULE_ID )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2492:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDialogLineRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDialogLine5255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getDialogLineAccess().getCharacterCharacterDefinitionCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDialogLine5267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDialogLineAccess().getColonKeyword_1());
                  
            }
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2507:1: ( (lv_lines_2_0= ruleStringID ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2508:1: (lv_lines_2_0= ruleStringID )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2508:1: (lv_lines_2_0= ruleStringID )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2509:3: lv_lines_2_0= ruleStringID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDialogLineAccess().getLinesStringIDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStringID_in_ruleDialogLine5288);
            lv_lines_2_0=ruleStringID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDialogLineRule());
              	        }
                     		set(
                     			current, 
                     			"lines",
                      		lv_lines_2_0, 
                      		"StringID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2525:2: ( (lv_comment_3_0= RULE_COMMENT ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_COMMENT) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2526:1: (lv_comment_3_0= RULE_COMMENT )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2526:1: (lv_comment_3_0= RULE_COMMENT )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2527:3: lv_comment_3_0= RULE_COMMENT
                    {
                    lv_comment_3_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleDialogLine5305); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_comment_3_0, grammarAccess.getDialogLineAccess().getCommentCOMMENTTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDialogLineRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"comment",
                              		lv_comment_3_0, 
                              		"COMMENT");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDialogLine"


    // $ANTLR start "ruleModifier"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2551:1: ruleModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'single' ) | (enumLiteral_1= 'random' ) ) ;
    public final Enumerator ruleModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2553:28: ( ( (enumLiteral_0= 'single' ) | (enumLiteral_1= 'random' ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2554:1: ( (enumLiteral_0= 'single' ) | (enumLiteral_1= 'random' ) )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2554:1: ( (enumLiteral_0= 'single' ) | (enumLiteral_1= 'random' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==42) ) {
                alt53=1;
            }
            else if ( (LA53_0==43) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2554:2: (enumLiteral_0= 'single' )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2554:2: (enumLiteral_0= 'single' )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2554:4: enumLiteral_0= 'single'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleModifier5361); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getModifierAccess().getSingleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getModifierAccess().getSingleEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2560:6: (enumLiteral_1= 'random' )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2560:6: (enumLiteral_1= 'random' )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2560:8: enumLiteral_1= 'random'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleModifier5378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getModifierAccess().getRandomEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getModifierAccess().getRandomEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModifier"


    // $ANTLR start "ruleSwitchValue"
    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2570:1: ruleSwitchValue returns [Enumerator current=null] : ( (enumLiteral_0= 'on' ) | (enumLiteral_1= 'off' ) ) ;
    public final Enumerator ruleSwitchValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2572:28: ( ( (enumLiteral_0= 'on' ) | (enumLiteral_1= 'off' ) ) )
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2573:1: ( (enumLiteral_0= 'on' ) | (enumLiteral_1= 'off' ) )
            {
            // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2573:1: ( (enumLiteral_0= 'on' ) | (enumLiteral_1= 'off' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==41) ) {
                alt54=1;
            }
            else if ( (LA54_0==40) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2573:2: (enumLiteral_0= 'on' )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2573:2: (enumLiteral_0= 'on' )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2573:4: enumLiteral_0= 'on'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_41_in_ruleSwitchValue5423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSwitchValueAccess().getOnEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getSwitchValueAccess().getOnEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2579:6: (enumLiteral_1= 'off' )
                    {
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2579:6: (enumLiteral_1= 'off' )
                    // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2579:8: enumLiteral_1= 'off'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleSwitchValue5440); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getSwitchValueAccess().getOffEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getSwitchValueAccess().getOffEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSwitchValue"

    // $ANTLR start synpred1_InternalDialogScript
    public final void synpred1_InternalDialogScript_fragment() throws RecognitionException {   
        // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1369:3: ( 'if' )
        // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:1369:5: 'if'
        {
        match(input,31,FOLLOW_31_in_synpred1_InternalDialogScript2776); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalDialogScript

    // $ANTLR start synpred2_InternalDialogScript
    public final void synpred2_InternalDialogScript_fragment() throws RecognitionException {   
        // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2248:3: ( 'if' )
        // ../de.unidue.ecg.dialogScript/src-gen/de/unidue/ecg/dialogScript/parser/antlr/internal/InternalDialogScript.g:2248:5: 'if'
        {
        match(input,31,FOLLOW_31_in_synpred2_InternalDialogScript4718); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalDialogScript

    // Delegated rules

    public final boolean synpred1_InternalDialogScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDialogScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalDialogScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalDialogScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA22_eotS =
        "\6\uffff";
    static final String DFA22_eofS =
        "\6\uffff";
    static final String DFA22_minS =
        "\1\4\2\36\3\uffff";
    static final String DFA22_maxS =
        "\3\53\3\uffff";
    static final String DFA22_acceptS =
        "\3\uffff\1\1\1\2\1\3";
    static final String DFA22_specialS =
        "\6\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\5\31\uffff\1\4\1\5\2\uffff\1\3\7\uffff\1\1\1\2",
            "\1\4\1\5\2\uffff\1\3\7\uffff\1\1\1\2",
            "\1\4\1\5\2\uffff\1\3\7\uffff\1\1\1\2",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1162:1: (this_ChoiceDialog_0= ruleChoiceDialog | this_ConditionalChoiceDialog_1= ruleConditionalChoiceDialog | this_Statement_2= ruleStatement )";
        }
    }
    static final String DFA25_eotS =
        "\5\uffff";
    static final String DFA25_eofS =
        "\5\uffff";
    static final String DFA25_minS =
        "\1\23\2\36\2\uffff";
    static final String DFA25_maxS =
        "\3\53\2\uffff";
    static final String DFA25_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA25_specialS =
        "\5\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\3\12\uffff\1\3\3\uffff\1\4\7\uffff\1\1\1\2",
            "\1\3\3\uffff\1\4\7\uffff\1\1\1\2",
            "\1\3\3\uffff\1\4\7\uffff\1\1\1\2",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1282:3: ( (lv_choiceDialogs_7_0= ruleChoiceDialog ) )+";
        }
    }
    static final String DFA30_eotS =
        "\5\uffff";
    static final String DFA30_eofS =
        "\1\1\4\uffff";
    static final String DFA30_minS =
        "\1\23\1\uffff\2\36\1\uffff";
    static final String DFA30_maxS =
        "\1\53\1\uffff\2\53\1\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\2\2\uffff\1\1";
    static final String DFA30_specialS =
        "\5\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\12\uffff\1\1\3\uffff\1\4\7\uffff\1\2\1\3",
            "",
            "\1\1\3\uffff\1\4\7\uffff\1\2\1\3",
            "\1\1\3\uffff\1\4\7\uffff\1\2\1\3",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "()+ loopback of 1418:3: ( (lv_choices_8_0= ruleChoiceDialog ) )+";
        }
    }
    static final String DFA40_eotS =
        "\5\uffff";
    static final String DFA40_eofS =
        "\1\1\4\uffff";
    static final String DFA40_minS =
        "\1\4\1\uffff\2\32\1\uffff";
    static final String DFA40_maxS =
        "\1\53\1\uffff\2\53\1\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\2\2\uffff\1\1";
    static final String DFA40_specialS =
        "\5\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\4\16\uffff\1\1\6\uffff\1\1\4\uffff\1\4\4\uffff\2\1\1\uffff"+
            "\1\1\2\uffff\1\2\1\3",
            "",
            "\1\1\4\uffff\1\4\12\uffff\1\2\1\3",
            "\1\1\4\uffff\1\4\12\uffff\1\2\1\3",
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "()* loopback of 2093:2: ( (lv_statements_1_0= ruleStatement ) )*";
        }
    }
    static final String DFA46_eotS =
        "\11\uffff";
    static final String DFA46_eofS =
        "\1\2\10\uffff";
    static final String DFA46_minS =
        "\1\4\1\40\1\uffff\1\4\1\41\1\4\1\0\1\41\1\uffff";
    static final String DFA46_maxS =
        "\1\53\1\40\1\uffff\1\4\1\43\1\4\1\0\1\43\1\uffff";
    static final String DFA46_acceptS =
        "\2\uffff\1\2\5\uffff\1\1";
    static final String DFA46_specialS =
        "\6\uffff\1\0\2\uffff}>";
    static final String[] DFA46_transitionS = {
            "\2\2\15\uffff\1\2\6\uffff\1\2\4\uffff\1\1\4\uffff\2\2\1\uffff"+
            "\1\2\2\uffff\2\2",
            "\1\3",
            "",
            "\1\4",
            "\1\6\1\uffff\1\5",
            "\1\7",
            "\1\uffff",
            "\1\6\1\uffff\1\5",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "2248:1: ( ( ( 'if' )=>otherlv_2= 'if' ) otherlv_3= '(' ( (lv_conditionList_4_0= ruleConditionList ) ) otherlv_5= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_6 = input.LA(1);

                         
                        int index46_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalDialogScript()) ) {s = 8;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index46_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCharactersDefinition_in_ruleScript140 = new BitSet(new long[]{0x0000000000450002L});
    public static final BitSet FOLLOW_ruleSwitchesDefinition_in_ruleScript162 = new BitSet(new long[]{0x0000000000440002L});
    public static final BitSet FOLLOW_ruleConditionsDefinition_in_ruleScript184 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleScene_in_ruleScript206 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleCharactersDefinition_in_entryRuleCharactersDefinition243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharactersDefinition253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleCharactersDefinition290 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCharactersDefinition302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCharacterDefinition_in_ruleCharactersDefinition323 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleCharactersDefinition336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCharacterDefinition_in_ruleCharactersDefinition357 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleCharacterDefinition_in_entryRuleCharacterDefinition395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCharacterDefinition405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCharacterDefinition446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchesDefinition_in_entryRuleSwitchesDefinition486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchesDefinition496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSwitchesDefinition533 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSwitchesDefinition545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSwitchDefinition_in_ruleSwitchesDefinition566 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleSwitchesDefinition579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSwitchDefinition_in_ruleSwitchesDefinition600 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleSwitchDefinition_in_entryRuleSwitchDefinition638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchDefinition648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSwitchDefinition690 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleSwitchDefinition708 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_ruleSwitchValue_in_ruleSwitchDefinition729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionsDefinition_in_entryRuleConditionsDefinition767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionsDefinition777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleConditionsDefinition814 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleConditionDefinition_in_ruleConditionsDefinition835 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleConditionDefinition_in_ruleConditionsDefinition856 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleConditionsDefinition869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionDefinition_in_entryRuleConditionDefinition905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionDefinition915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleConditionDefinition952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConditionDefinition969 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConditionDefinition986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSwitchList_in_ruleConditionDefinition1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScene_in_entryRuleScene1043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScene1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleScene1099 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleStringID_in_ruleScene1120 = new BitSet(new long[]{0x00000C00B9880010L});
    public static final BitSet FOLLOW_ruleDialog_in_ruleScene1141 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleScene1153 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleScene1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialog_in_entryRuleDialog1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialog1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaults_in_ruleDialog1266 = new BitSet(new long[]{0x00000C00B9000012L});
    public static final BitSet FOLLOW_ruleFirstTime_in_ruleDialog1288 = new BitSet(new long[]{0x00000C00B8000012L});
    public static final BitSet FOLLOW_ruleRecursive_in_ruleDialog1310 = new BitSet(new long[]{0x00000C00B8000012L});
    public static final BitSet FOLLOW_rulePartingLines_in_ruleDialog1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecursive_in_entryRuleRecursive1369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecursive1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHub_in_ruleRecursive1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleRecursive1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaults_in_entryRuleDefaults1488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaults1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDefaults1544 = new BitSet(new long[]{0x00000CB0B0080030L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleDefaults1561 = new BitSet(new long[]{0x00000CB0B0080010L});
    public static final BitSet FOLLOW_ruleConditionalBody_in_ruleDefaults1588 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDefaults1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFirstTime_in_entryRuleFirstTime1636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFirstTime1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFirstTime1692 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFirstTime1704 = new BitSet(new long[]{0x00000CB0B4080030L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleFirstTime1721 = new BitSet(new long[]{0x00000CB0B4080010L});
    public static final BitSet FOLLOW_ruleConditionalBody_in_ruleFirstTime1748 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_ruleOtherTimes_in_ruleFirstTime1769 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFirstTime1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherTimes_in_entryRuleOtherTimes1818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherTimes1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOtherTimes1874 = new BitSet(new long[]{0x00000CB0B0000030L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleOtherTimes1891 = new BitSet(new long[]{0x00000CB0B0000010L});
    public static final BitSet FOLLOW_ruleConditionalBody_in_ruleOtherTimes1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePartingLines_in_entryRulePartingLines1954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePartingLines1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePartingLines2010 = new BitSet(new long[]{0x00000CB0B0080030L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rulePartingLines2027 = new BitSet(new long[]{0x00000CB0B0080010L});
    public static final BitSet FOLLOW_ruleConditionalBody_in_rulePartingLines2054 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePartingLines2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHub_in_entryRuleHub2102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHub2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleHub2155 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleHub2181 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleStringID_in_ruleHub2202 = new BitSet(new long[]{0x00000C04F0080030L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleHub2219 = new BitSet(new long[]{0x00000C04F0080010L});
    public static final BitSet FOLLOW_ruleHubFragment_in_ruleHub2246 = new BitSet(new long[]{0x00000C04F0080010L});
    public static final BitSet FOLLOW_19_in_ruleHub2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHubFragment_in_entryRuleHubFragment2295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHubFragment2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoiceDialog_in_ruleHubFragment2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalChoiceDialog_in_ruleHubFragment2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleHubFragment2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalChoiceDialog_in_entryRuleConditionalChoiceDialog2441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalChoiceDialog2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleConditionalChoiceDialog2497 = new BitSet(new long[]{0x00000C0040000000L});
    public static final BitSet FOLLOW_30_in_ruleConditionalChoiceDialog2510 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleConditionalChoiceDialog2522 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleConditionalChoiceDialog2534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConditionList_in_ruleConditionalChoiceDialog2555 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleConditionalChoiceDialog2567 = new BitSet(new long[]{0x00000C0400000020L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleConditionalChoiceDialog2584 = new BitSet(new long[]{0x00000C0400000000L});
    public static final BitSet FOLLOW_ruleChoiceDialog_in_ruleConditionalChoiceDialog2611 = new BitSet(new long[]{0x00000C0440080000L});
    public static final BitSet FOLLOW_ruleOtherwiseChoice_in_ruleConditionalChoiceDialog2633 = new BitSet(new long[]{0x00000C0040080000L});
    public static final BitSet FOLLOW_19_in_ruleConditionalChoiceDialog2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherwiseChoice_in_entryRuleOtherwiseChoice2682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherwiseChoice2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleOtherwiseChoice2738 = new BitSet(new long[]{0x00000C0040000000L});
    public static final BitSet FOLLOW_30_in_ruleOtherwiseChoice2751 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOtherwiseChoice2763 = new BitSet(new long[]{0x00000C0480000020L});
    public static final BitSet FOLLOW_31_in_ruleOtherwiseChoice2784 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOtherwiseChoice2797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConditionList_in_ruleOtherwiseChoice2818 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOtherwiseChoice2830 = new BitSet(new long[]{0x00000C0400000020L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleOtherwiseChoice2849 = new BitSet(new long[]{0x00000C0400000000L});
    public static final BitSet FOLLOW_ruleChoiceDialog_in_ruleOtherwiseChoice2876 = new BitSet(new long[]{0x00000C0400000002L});
    public static final BitSet FOLLOW_ruleStringID_in_entryRuleStringID2914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringID2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringID2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChoiceDialog_in_entryRuleChoiceDialog3008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChoiceDialog3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleChoiceDialog3073 = new BitSet(new long[]{0x00000C0400000000L});
    public static final BitSet FOLLOW_34_in_ruleChoiceDialog3086 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleStringID_in_ruleChoiceDialog3107 = new BitSet(new long[]{0x00000CB0B0080030L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleChoiceDialog3124 = new BitSet(new long[]{0x00000CB0B0080010L});
    public static final BitSet FOLLOW_ruleConditionalBody_in_ruleChoiceDialog3151 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleChoiceDialog3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionList_in_entryRuleConditionList3199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionList3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConditionList3254 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleConditionList3267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConditionList3287 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleJump_in_entryRuleJump3325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJump3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_ruleJump3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokeHub_in_ruleJump3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokeScene_in_ruleJump3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokeHub_in_entryRuleInvokeHub3471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvokeHub3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInvokeHub3518 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleInvokeHub3530 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleStringID_in_ruleInvokeHub3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvokeScene_in_entryRuleInvokeScene3589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvokeScene3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInvokeScene3636 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleInvokeScene3648 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleStringID_in_ruleInvokeScene3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_entryRuleExit3707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExit3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleExit3763 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_29_in_ruleExit3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleExit3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional3869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditional3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleConditional3925 = new BitSet(new long[]{0x00000C0080000000L});
    public static final BitSet FOLLOW_31_in_ruleConditional3938 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleConditional3950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConditionList_in_ruleConditional3971 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleConditional3983 = new BitSet(new long[]{0x00000CB0B4080030L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleConditional4000 = new BitSet(new long[]{0x00000CB0B4080010L});
    public static final BitSet FOLLOW_ruleConditionalBody_in_ruleConditional4027 = new BitSet(new long[]{0x00000C0004080000L});
    public static final BitSet FOLLOW_ruleOtherwise_in_ruleConditional4048 = new BitSet(new long[]{0x00000C0004080000L});
    public static final BitSet FOLLOW_19_in_ruleConditional4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchList_in_entryRuleSwitchList4097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchList4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleSwitchList4153 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleSwitchList4166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleSwitchList4187 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch4225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSwitch4280 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSwitch4292 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_ruleSwitchValue_in_ruleSwitch4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalBody_in_entryRuleConditionalBody4349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalBody4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleConditionalBody4414 = new BitSet(new long[]{0x00000CB0B0000012L});
    public static final BitSet FOLLOW_ruleSwitchOn_in_ruleConditionalBody4436 = new BitSet(new long[]{0x000000B000000002L});
    public static final BitSet FOLLOW_ruleSwitchOff_in_ruleConditionalBody4458 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleJump_in_ruleConditionalBody4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement4517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogLine_in_ruleStatement4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_ruleStatement4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherwise_in_entryRuleOtherwise4636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherwise4646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModifier_in_ruleOtherwise4692 = new BitSet(new long[]{0x00000C0004000000L});
    public static final BitSet FOLLOW_26_in_ruleOtherwise4705 = new BitSet(new long[]{0x00000CB0B0000030L});
    public static final BitSet FOLLOW_31_in_ruleOtherwise4726 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOtherwise4739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConditionList_in_ruleOtherwise4760 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleOtherwise4772 = new BitSet(new long[]{0x00000CB0B0000030L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleOtherwise4791 = new BitSet(new long[]{0x00000CB0B0000010L});
    public static final BitSet FOLLOW_ruleConditionalBody_in_ruleOtherwise4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchOff_in_entryRuleSwitchOff4854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchOff4864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleSwitchOff4901 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSwitchOff4913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSwitchOff4933 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_15_in_ruleSwitchOff4946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSwitchOff4966 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleSwitchOff4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchOn_in_entryRuleSwitchOn5027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchOn5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleSwitchOn5074 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSwitchOn5086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSwitchOn5106 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_15_in_ruleSwitchOn5119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSwitchOn5139 = new BitSet(new long[]{0x0000000000008022L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleSwitchOn5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDialogLine_in_entryRuleDialogLine5200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDialogLine5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDialogLine5255 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDialogLine5267 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleStringID_in_ruleDialogLine5288 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleDialogLine5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleModifier5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleModifier5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleSwitchValue5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleSwitchValue5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred1_InternalDialogScript2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred2_InternalDialogScript4718 = new BitSet(new long[]{0x0000000000000002L});

}