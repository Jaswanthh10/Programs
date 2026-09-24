/* import java.util.*;
public class greatest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the value of a");
int a=sc.nextInt();
System.out.print("Enter the value of b");
int b=sc.nextInt();
System.out.print("Enter the value of c");
int c=sc.nextInt();
if(a>b && a>c)
System.out.println(a);
else if(b>c && b>a)
System.out.println(b);
else 
System.out.println(c);
}
}
*/


public class TernaryOperator
{
public static void main(String args[]){
int a =20;
int b=40;
int c=30;
int result=((a>b)?(a>c)?a:c:(b>c)?b:c);
System.out.println("max of three numbers = "+ result);
}
}


