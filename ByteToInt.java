
public class ByteToInt
{
public static void main(String args[])
{
    byte b = 127;
    int c = 117;
    c = b; //this doesnt mean the value of b is copied to c, it means the value of b is converted to int and then assigned to c
System.out.println(b);
}
}