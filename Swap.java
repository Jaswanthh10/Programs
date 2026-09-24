import java.util.Scanner;
public class Swap
{
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter value of a: ");
int a= sc.nextInt();
System.out.print("Enter value of b: ");
int b = sc.nextInt();
int c = a+b;
a =c-a;
b =c-b;
System.out.println("value of a after swapping " + a);
System.out.println("value of b after swapping " + b);
sc.close();
}}



