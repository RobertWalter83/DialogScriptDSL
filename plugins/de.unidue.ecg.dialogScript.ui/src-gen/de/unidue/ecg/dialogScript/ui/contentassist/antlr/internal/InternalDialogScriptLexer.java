package de.unidue.ecg.dialogScript.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDialogScriptLexer extends Lexer {
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int RULE_ID=5;
    public static final int T__41=41;
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
    public static final int RULE_COMMENT=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_WILDCARD=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_WS=11;

    // delegates
    // delegators

    public InternalDialogScriptLexer() {;} 
    public InternalDialogScriptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDialogScriptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:11:7: ( 'single' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:11:9: 'single'
            {
            match("single"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:12:7: ( 'random' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:12:9: 'random'
            {
            match("random"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:13:7: ( 'on' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:13:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:14:7: ( 'off' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:14:9: 'off'
            {
            match("off"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:15:7: ( 'characters' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:15:9: 'characters'
            {
            match("characters"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:16:7: ( ':' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:17:7: ( ',' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:18:7: ( 'switches' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:18:9: 'switches'
            {
            match("switches"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:19:7: ( 'is' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:19:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:20:7: ( 'conditions' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:20:9: 'conditions'
            {
            match("conditions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:21:7: ( 'end' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:21:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:22:7: ( 'set' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:22:9: 'set'
            {
            match("set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:23:7: ( 'when' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:23:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:24:7: ( 'scene' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:24:9: 'scene'
            {
            match("scene"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:25:7: ( 'defaults' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:25:9: 'defaults'
            {
            match("defaults"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:26:7: ( 'first' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:26:9: 'first'
            {
            match("first"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:27:7: ( 'time' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:27:9: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:28:7: ( 'else' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:28:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:29:7: ( 'parting' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:29:9: 'parting'
            {
            match("parting"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:30:7: ( 'hub' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:30:9: 'hub'
            {
            match("hub"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:31:7: ( 'choices' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:31:9: 'choices'
            {
            match("choices"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:32:7: ( 'if' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:32:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:33:7: ( '(' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:33:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:34:7: ( ')' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:34:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:35:7: ( 'choice' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:35:9: 'choice'
            {
            match("choice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:36:7: ( 'or' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:36:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:37:7: ( 'enter' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:37:9: 'enter'
            {
            match("enter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:38:7: ( 'exit' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:38:9: 'exit'
            {
            match("exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:39:7: ( 'and' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:39:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:40:7: ( 'switch' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:40:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:41:7: ( 'hidden' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:41:9: 'hidden'
            {
            match("hidden"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7394:14: ( '[' ( options {greedy=false; } : . )* ']' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7394:16: '[' ( options {greedy=false; } : . )* ']'
            {
            match('['); 
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7394:20: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==']') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='\\')||(LA1_0>='^' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7394:48: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7396:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' | '{' ) | RULE_WILDCARD | ~ ( ( '\\\\' | '\"' | '{' ) ) )* '\"' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7396:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' | '{' ) | RULE_WILDCARD | ~ ( ( '\\\\' | '\"' | '{' ) ) )* '\"'
            {
            match('\"'); 
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7396:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' | '{' ) | RULE_WILDCARD | ~ ( ( '\\\\' | '\"' | '{' ) ) )*
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( (LA2_0=='{') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='z')||(LA2_0>='|' && LA2_0<='\uFFFF')) ) {
                    alt2=3;
                }


                switch (alt2) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7396:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' | '{' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u')||input.LA(1)=='{' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7396:69: RULE_WILDCARD
            	    {
            	    mRULE_WILDCARD(); 

            	    }
            	    break;
            	case 3 :
            	    // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7396:83: ~ ( ( '\\\\' | '\"' | '{' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='z')||(input.LA(1)>='|' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_WILDCARD"
    public final void mRULE_WILDCARD() throws RecognitionException {
        try {
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7398:24: ( '{' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '}' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7398:26: '{' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* '}'
            {
            match('{'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7398:54: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('}'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_WILDCARD"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7400:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7400:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7400:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7400:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7400:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7402:10: ( ( '0' .. '9' )+ )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7402:12: ( '0' .. '9' )+
            {
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7402:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7402:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7404:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7404:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7404:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7404:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7406:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7406:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7406:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7406:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7406:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7406:41: ( '\\r' )? '\\n'
                    {
                    // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7406:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7406:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7408:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7408:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7408:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7410:16: ( . )
            // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:7410:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_COMMENT | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=39;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:196: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 33 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:209: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:221: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:229: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:238: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:254: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:270: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // ../de.unidue.ecg.dialogScript.ui/src-gen/de/unidue/ecg/dialogScript/ui/contentassist/antlr/internal/InternalDialogScript.g:1:278: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\4\36\2\uffff\10\36\2\uffff\1\36\3\31\2\uffff\1\31\2\uffff"+
        "\4\36\1\uffff\1\36\1\101\1\36\1\103\2\36\2\uffff\1\107\1\110\12"+
        "\36\2\uffff\1\36\6\uffff\2\36\1\127\2\36\1\uffff\1\132\1\uffff\3"+
        "\36\2\uffff\1\136\10\36\1\147\1\36\1\151\2\36\1\uffff\2\36\1\uffff"+
        "\3\36\1\uffff\1\36\1\162\1\163\1\164\2\36\1\167\1\36\1\uffff\1\36"+
        "\1\uffff\2\36\1\174\4\36\1\u0081\3\uffff\1\36\1\u0083\1\uffff\2"+
        "\36\1\u0086\1\u0088\1\uffff\1\u0089\1\36\1\u008c\1\36\1\uffff\1"+
        "\36\1\uffff\1\36\1\u0090\1\uffff\1\36\2\uffff\1\36\1\u0093\1\uffff"+
        "\2\36\1\u0096\1\uffff\1\u0097\1\36\1\uffff\1\36\1\u009a\2\uffff"+
        "\2\36\1\uffff\1\u009d\1\u009e\2\uffff";
    static final String DFA12_eofS =
        "\u009f\uffff";
    static final String DFA12_minS =
        "\1\0\1\143\1\141\1\146\1\150\2\uffff\1\146\1\154\1\150\1\145\2"+
        "\151\1\141\1\151\2\uffff\1\156\2\0\1\101\2\uffff\1\52\2\uffff\1"+
        "\156\1\151\1\164\1\145\1\uffff\1\156\1\60\1\146\1\60\1\141\1\156"+
        "\2\uffff\2\60\1\144\1\163\1\151\1\145\1\146\1\162\1\155\1\162\1"+
        "\142\1\144\2\uffff\1\144\6\uffff\1\147\1\164\1\60\1\156\1\144\1"+
        "\uffff\1\60\1\uffff\1\162\1\151\1\144\2\uffff\1\60\2\145\1\164\1"+
        "\156\1\141\1\163\1\145\1\164\1\60\1\144\1\60\1\154\1\143\1\uffff"+
        "\1\145\1\157\1\uffff\1\141\1\143\1\151\1\uffff\1\162\3\60\1\165"+
        "\1\164\1\60\1\151\1\uffff\1\145\1\uffff\1\145\1\150\1\60\1\155\1"+
        "\143\1\145\1\164\1\60\3\uffff\1\154\1\60\1\uffff\2\156\2\60\1\uffff"+
        "\1\60\1\164\1\60\1\151\1\uffff\1\164\1\uffff\1\147\1\60\1\uffff"+
        "\1\163\2\uffff\1\145\1\60\1\uffff\1\157\1\163\1\60\1\uffff\1\60"+
        "\1\162\1\uffff\1\156\1\60\2\uffff\2\163\1\uffff\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\167\1\141\1\162\1\157\2\uffff\1\163\1\170\1\150\1\145"+
        "\2\151\1\141\1\165\2\uffff\1\156\2\uffff\1\172\2\uffff\1\57\2\uffff"+
        "\1\156\1\151\1\164\1\145\1\uffff\1\156\1\172\1\146\1\172\1\157\1"+
        "\156\2\uffff\2\172\1\164\1\163\1\151\1\145\1\146\1\162\1\155\1\162"+
        "\1\142\1\144\2\uffff\1\144\6\uffff\1\147\1\164\1\172\1\156\1\144"+
        "\1\uffff\1\172\1\uffff\1\162\1\151\1\144\2\uffff\1\172\2\145\1\164"+
        "\1\156\1\141\1\163\1\145\1\164\1\172\1\144\1\172\1\154\1\143\1\uffff"+
        "\1\145\1\157\1\uffff\1\141\1\143\1\151\1\uffff\1\162\3\172\1\165"+
        "\1\164\1\172\1\151\1\uffff\1\145\1\uffff\1\145\1\150\1\172\1\155"+
        "\1\143\1\145\1\164\1\172\3\uffff\1\154\1\172\1\uffff\2\156\2\172"+
        "\1\uffff\1\172\1\164\1\172\1\151\1\uffff\1\164\1\uffff\1\147\1\172"+
        "\1\uffff\1\163\2\uffff\1\145\1\172\1\uffff\1\157\1\163\1\172\1\uffff"+
        "\1\172\1\162\1\uffff\1\156\1\172\2\uffff\2\163\1\uffff\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\5\uffff\1\6\1\7\10\uffff\1\27\1\30\4\uffff\1\42\1\43\1\uffff\1"+
        "\46\1\47\4\uffff\1\42\6\uffff\1\6\1\7\14\uffff\1\27\1\30\1\uffff"+
        "\1\40\1\41\1\43\1\44\1\45\1\46\5\uffff\1\3\1\uffff\1\32\3\uffff"+
        "\1\11\1\26\16\uffff\1\14\2\uffff\1\4\3\uffff\1\13\10\uffff\1\24"+
        "\1\uffff\1\35\10\uffff\1\22\1\34\1\15\2\uffff\1\21\4\uffff\1\16"+
        "\4\uffff\1\33\1\uffff\1\20\2\uffff\1\1\1\uffff\1\36\1\2\2\uffff"+
        "\1\31\3\uffff\1\37\2\uffff\1\25\2\uffff\1\23\1\10\2\uffff\1\17\2"+
        "\uffff\1\5\1\12";
    static final String DFA12_specialS =
        "\1\1\21\uffff\1\2\1\0\u008b\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\23\5\31\1\17\1\20\2"+
            "\31\1\6\2\31\1\27\12\26\1\5\6\31\32\25\1\22\2\31\1\24\1\25\1"+
            "\31\1\21\1\25\1\4\1\12\1\10\1\13\1\25\1\16\1\7\5\25\1\3\1\15"+
            "\1\25\1\2\1\1\1\14\2\25\1\11\3\25\uff85\31",
            "\1\35\1\uffff\1\34\3\uffff\1\32\15\uffff\1\33",
            "\1\37",
            "\1\41\7\uffff\1\40\3\uffff\1\42",
            "\1\43\6\uffff\1\44",
            "",
            "",
            "\1\50\14\uffff\1\47",
            "\1\52\1\uffff\1\51\11\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\62\13\uffff\1\61",
            "",
            "",
            "\1\65",
            "\0\66",
            "\0\67",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\1\71\4\uffff\1\72",
            "",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "",
            "\1\100",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\102",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\104\15\uffff\1\105",
            "\1\106",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\111\17\uffff\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "",
            "\1\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\125",
            "\1\126",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\130",
            "\1\131",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\150",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\152",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\165",
            "\1\166",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\170",
            "",
            "\1\171",
            "",
            "\1\172",
            "\1\173",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "",
            "\1\u0082",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u0084",
            "\1\u0085",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\u0087\25"+
            "\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u008a",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\u008b\7"+
            "\36",
            "\1\u008d",
            "",
            "\1\u008e",
            "",
            "\1\u008f",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u0091",
            "",
            "",
            "\1\u0092",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u0094",
            "\1\u0095",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0098",
            "",
            "\1\u0099",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_COMMENT | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFF')) ) {s = 55;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='s') ) {s = 1;}

                        else if ( (LA12_0=='r') ) {s = 2;}

                        else if ( (LA12_0=='o') ) {s = 3;}

                        else if ( (LA12_0=='c') ) {s = 4;}

                        else if ( (LA12_0==':') ) {s = 5;}

                        else if ( (LA12_0==',') ) {s = 6;}

                        else if ( (LA12_0=='i') ) {s = 7;}

                        else if ( (LA12_0=='e') ) {s = 8;}

                        else if ( (LA12_0=='w') ) {s = 9;}

                        else if ( (LA12_0=='d') ) {s = 10;}

                        else if ( (LA12_0=='f') ) {s = 11;}

                        else if ( (LA12_0=='t') ) {s = 12;}

                        else if ( (LA12_0=='p') ) {s = 13;}

                        else if ( (LA12_0=='h') ) {s = 14;}

                        else if ( (LA12_0=='(') ) {s = 15;}

                        else if ( (LA12_0==')') ) {s = 16;}

                        else if ( (LA12_0=='a') ) {s = 17;}

                        else if ( (LA12_0=='[') ) {s = 18;}

                        else if ( (LA12_0=='\"') ) {s = 19;}

                        else if ( (LA12_0=='^') ) {s = 20;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='g'||(LA12_0>='j' && LA12_0<='n')||LA12_0=='q'||(LA12_0>='u' && LA12_0<='v')||(LA12_0>='x' && LA12_0<='z')) ) {s = 21;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 22;}

                        else if ( (LA12_0=='/') ) {s = 23;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 24;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='\'')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='\\' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFF')) ) {s = 54;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}