import java.util.*;
public class armstrong
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int n=sc.nextInt();
int d=0;
while(n>0)
n=n/10;
if(n/10>0)
d++;

System.out.print(d);
}}