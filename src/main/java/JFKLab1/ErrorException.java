package JFKLab1;

public class ErrorException extends RuntimeException
{
    int id;
    public ErrorException(int x)
    {
        id =x;
    }
    public String toString()
    {
        return "Error "+ id;
    }

}
