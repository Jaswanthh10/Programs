import java.util.*;
public class Great
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of a: ");
int a=sc.nextInt();
System.out.print("Enter the value of b: ");
int b=sc.nextInt();
System.out.print("Enter the value of c: ");
int c=sc.nextInt();

if (a>b && a>c && b>c)
System.out.print(b);
else if (a>b&&a>c && c>b)
System.out.print(c);
else if (b>c && b>a && a>c)
System.out.print(a);
else if (b>c && b>a && c>a)
System.out.print(c);
else if (c>a && c>b && a>b)
System.out.print(a);
else
System.out.print(b);
sc.close();
}}