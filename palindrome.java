import java.util.*;
public class palindrome
{
public static void main(String args[])
{
System.out.print("Enter your number: ");
Scanner sc= new Scanner(System.in);
int a=sc.nextInt();
int b=a;
int x=0;
int rev=0;
while(b>0)
{
x=b%10;
rev=(rev*10)+x;
b=b/10;
}
if(a==rev)
System.out.print("it is palindrome");
else
System.out.print("it is not palindrome");
}}