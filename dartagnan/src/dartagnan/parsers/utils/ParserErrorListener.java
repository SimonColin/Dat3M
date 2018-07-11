package dartagnan.parsers.utils;

import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ParserErrorListener extends ConsoleErrorListener {

    public void syntaxError(
            Recognizer<?, ?> recognizer,
            Object offendingSymbol,
            int line,
            int charPositionInLine,
            String msg,
            RecognitionException e
    ) throws RuntimeException {

        throw new RuntimeException("line " + line + ":" + charPositionInLine + " " + msg);
    }
}