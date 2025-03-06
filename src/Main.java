import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;


import java.io.IOException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Listner extends BaseErrorListener
{
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String formattedString = String.format("Error type A at Line %d: %s", line, msg);
        System.err.println(formattedString);
    }

    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
    }

    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
    }

    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
    }

}

public class Main
{
    public static void main(String[] args) throws IOException {
//        if (args.length < 1) {
//            System.err.println("input path is required");
//        }
        //String source = args[0];
        String source = new String("tests/test1.sysy");
        CharStream input = CharStreams.fromFileName(source);
        SysYLexerLexer sysYLexer = new SysYLexerLexer(input);
        sysYLexer.removeErrorListeners();
        Listner myErrorListener = new Listner();
        sysYLexer.addErrorListener(myErrorListener);
        List<? extends Token> myTokens = sysYLexer.getAllTokens();
        Map<String, Integer> mp = sysYLexer.getTokenTypeMap();
        Map<Integer, String> mp2 = new HashMap<Integer, String>();
        for (String key : mp.keySet()) {
            Integer value = mp.get(key);
            mp2.put(value, key);
        }

        for (Token token : myTokens)
        {
            Integer line = token.getCharPositionInLine();
            Integer type = token.getType();
            String typeString = mp2.get(type);
            String formattedString = String.format("%s %s at Line %d.", typeString, token.getText(), line);
            System.out.println(formattedString);
        }
    }
}


