package JFKLab1;

import org.antlr.v4.runtime.tree.ParseTree;

public class ExpressionInterpreter implements ExpressionInterpreting
{
    ParseTree cursor = null;
    ExpressionInterpreter childExpression[];
    Integer value = null;
    Memory memory;
    public ExpressionInterpreter(ParseTree expr, Memory memory)
    {
        cursor = expr;
        this.memory = memory;
        childExpression = new ExpressionInterpreter[cursor.getChildCount()];
        for(int i=0; i<cursor.getChildCount(); i++)
        {
                childExpression[i]= new ExpressionInterpreter(cursor.getChild(i), memory);

        }
        //CHILDS DOESNT HAVE CHILDS!
        setValue();

    }


    public void setValue()
    {
        if(childExpression.length==0)
        {
            value=convertToNumber(cursor.getText());
        }
        else if(childExpression.length == 1)
        {
            value = childExpression[0].getValue();
        }
        else if(childExpression.length ==3)
        {
            if(childExpression[0].getTextFromTree().equals("(") && childExpression[2].getTextFromTree().equals(")"))
            {
                value = childExpression[1].getValue();
            }
            else
            {
                Integer a = childExpression[0].getValue();
                Integer b = childExpression[2].getValue();
                String operator = childExpression[1].getTextFromTree();

                if(a ==null || b == null)
                    value = null;

                else if(operator.equals("+")) value = a+b;
                else if(operator.equals("-")) value = a-b;
                else if(operator.equals("*")) value = a*b;
                else if(operator.equals("/"))
                {
                    if(b == 0) throw new ErrorException(3);
                    value = a/b;

                }

            }
        }
        else throw new ErrorException(2);
    }
    private Integer convertToNumber(String childsSvalue)
    {
        if(childsSvalue == null)
            return null;
        try
        {
            return Integer.parseInt(childsSvalue);
        }
        catch (NumberFormatException exc)
        {
            if(childsSvalue.equals("%eax")) return memory.getEax();
            else if(childsSvalue.equals("%ebx")) return memory.getEbx();
            else if(childsSvalue.equals("%ecx")) return memory.getEcx();
            else if(childsSvalue.equals("%edx")) return memory.getEdx();
            else  return null;

        }
    }

    public Integer getValue()
    {
        return value;
    }
    public String getTextFromTree()
    {
        return cursor.getText();
    }
}
