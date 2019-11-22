package JFKLab1;


import antlr.AIGrammaryLexer;
import antlr.AIGrammaryParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.antlr.v4.runtime.CharStreams.fromString;

public class Main
{
    public static void main( String [] args) {
        AssemblerInterpreter interpreter = new AssemblerInterpreter();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String typedCommand = null;
        //Scanner js = new Scanner(System.in);
        while(true) {

            try {
                typedCommand = reader.readLine();
                if (typedCommand == null) break;

                else if (typedCommand.equals(""))
                    continue;
                else typedCommand += '\n';
                //System.out.println(typedCommand);
            } catch (IOException e) {

            }

            try {

                CharStream cs = fromString(typedCommand);
                AIGrammaryLexer lexer = new AIGrammaryLexer(cs);
                lexer.removeErrorListeners();
                ErrorListener errListener = new ErrorListener();
                lexer.addErrorListener(errListener);
                CommonTokenStream token = new CommonTokenStream(lexer);
                AIGrammaryParser parser = new AIGrammaryParser(token);
                parser.removeErrorListeners();
                parser.addErrorListener(errListener);
                ParseTree tree = parser.commendline_rule();
                interpreter.run(tree);


            } catch (ErrorException e) {
                System.out.println("Error");
            }
        }
    }
}
