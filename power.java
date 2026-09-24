import java.util.Scanner;
public class power
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the base value x: ");
int x=sc.nextInt();

System.out.print("Enter the power value y: ");
int y=sc.nextInt();
int k=1;
int i=1;           //k=1
while(i<=y)        //k=k*x
{k=k*x;
i++;}
System.out.print(k);
}}
