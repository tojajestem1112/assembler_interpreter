package JFKLab1;

import java.util.LinkedList;

public class Memory implements Memorizing
{
    private Integer eax = null;
    private Integer ebx = null;
    private Integer ecx = null;
    private Integer edx = null;
    private LinkedList<Integer> stack = new LinkedList<Integer>();

    public void pushElementOnStack(Integer element)
    {
        stack.add(element);
    }
    public Integer popElementFromStack()
    {
        if (stack.size()==0)
            //return null; -> ??? for empty stack
            throw new ErrorException(5);
        Integer returning = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return returning;
    }
    public Integer getEax(){return eax;}
    public Integer getEbx(){return ebx;}
    public Integer getEcx(){return ecx;}
    public Integer getEdx(){return edx;}
    public void setEax(Integer value){eax=value;}
    public void setEbx(Integer value){ebx=value;}
    public void setEcx(Integer value){ecx=value;}
    public void setEdx(Integer value){edx=value;}

}
