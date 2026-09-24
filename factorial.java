import java.util.Scanner;
public class factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
int n=sc.nextInt();
int c=1;
for(int i=1;i<=n;i++)
{
c=c*i;
}
System.out.print(c);
}}
