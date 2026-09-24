import java.util.*;
public class fb
{
public static void main(String []args)
{
int term1=0;
int term2=1;
int term3;
for(int i=1;i<=8;i++)
{
term3=term1+term2;
System.out.println(term3);
term2=term3;
term1=term2;
}
}
}
