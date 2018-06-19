package dartagnan.parsers;

import dartagnan.LitmusPPCLexer;
import dartagnan.LitmusPPCParser;
import dartagnan.parsers.visitors.VisitorLitmusPPC;
import dartagnan.program.Program;
import dartagnan.utils.ParserErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ParserLitmusPPC implements ParserInterface{

    public Program parse(String inputFilePath) throws IOException {
        File file = new File(inputFilePath);
        FileInputStream stream = new FileInputStream(file);
        CharStream charStream = CharStreams.fromStream(stream);

        LitmusPPCLexer lexer = new LitmusPPCLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ParserErrorListener listener = new ParserErrorListener();

        LitmusPPCParser parser = new LitmusPPCParser(tokenStream);
        parser.addErrorListener(listener);
        ParserRuleContext parserEntryPoint = parser.main();
        VisitorLitmusPPC visitor = new VisitorLitmusPPC();

        Program program = (Program) parserEntryPoint.accept(visitor);
        program.setName(inputFilePath);
        return program;
    }
}
