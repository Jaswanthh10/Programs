import java.util.Scanner;
public class Booking
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter your name: ");
String name=sc.next();
System.out.print("Enter number of tickets: ");
int no=sc.nextInt();
int price=600;
int total=price*no;
if(total>=3000)
{
total=total-500;
}
System.out.print("Total cost of your tickets is: "+total);
sc.close();
}}