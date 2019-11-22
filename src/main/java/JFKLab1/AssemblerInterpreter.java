package JFKLab1;

import org.antlr.v4.runtime.tree.ParseTree;

public class AssemblerInterpreter implements AssemblerInterpreting{
    private Memory memory = new Memory();


    public void run(ParseTree tree) {
        tree = tree.getChild(0); // getting x_commend
        String commend = tree.getChild(0).getText();
        //System.out.println("Naszą komendą jest " + commend);

        if (commend.contains("int")) {
            Integer element = memory.popElementFromStack();
            if (element == null)
                System.out.println("???");
            else System.out.println(element);
        } else if (commend.contains("xor"))
        {
            Integer secondArgument = getRegisterValue(tree.getChild(3).getText());
            Integer exprResult = new ExpressionInterpreter(tree.getChild(1), memory).getValue();
            if(secondArgument == exprResult && tree.getChild(1).getText().equals(tree.getChild(3).getText()))
                sendValueToDestination(tree.getChild(3).getText(), 0);
            else if(secondArgument ==null || exprResult == null)
                sendValueToDestination(tree.getChild(3).getText(), null);
            else sendValueToDestination(tree.getChild(3).getText(), exprResult^secondArgument);

        } else if (commend.contains("mov")) {
            Integer exprResult = new ExpressionInterpreter(tree.getChild(1), memory).getValue();
            sendValueToDestination(tree.getChild(3).getText(), exprResult);
        } else if (commend.contains("push")) {
            Integer exprResult = new ExpressionInterpreter(tree.getChild(1), memory).getValue();


            memory.pushElementOnStack(exprResult);
        }
        //TreeConverter treeConverter = new TreeConverter(tree);
    }


    private void sendValueToDestination(String destination, Integer value) {
        if (destination.equals("%eax")) memory.setEax(value);
        else if (destination.equals("%ebx")) memory.setEbx(value);
        else if (destination.equals("%ecx")) memory.setEcx(value);
        else if (destination.equals("%edx")) memory.setEdx(value);
    }
    private Integer getRegisterValue(String register)
    {
        if (register.equals("%eax")) return memory.getEax();
        else if (register.equals("%ebx")) return memory.getEbx();
        else if (register.equals("%ecx")) return memory.getEcx();
        else if (register.equals("%edx")) return memory.getEdx();
        else return 0;
    }
}