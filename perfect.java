import java.util.*;
public class perfect
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int n=sc.nextInt();
int rev=0;
int d=n;
int x=0;
for(int i=1;i<n;i++)
{
d=i;
x=n%i;
if(x==0)
rev=rev+d;

}
if(rev==n)
System.out.print("It is a perfect number");
else
System.out.print("It is not a perfect number");
}}
