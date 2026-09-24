import java.util.Scanner;
public class Newbooking
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter your name: ");
String name=sc.next();
System.out.print("Enter your room type: ");
int type =sc.nextInt();
System.out.print("Enter number of rooms: ");
int room=sc.nextInt();
System.out.print("Enter your stay duration: ");
int days=sc.nextInt();

String charge;
int add;
if(type==1)
{
charge="Standard";
add=1500;
}
else if(type==2)
{
charge="Deluxe";
add=2000;
}
else 
{
charge="Suite";
add=2500;
}


int total=room*add*days;
/*for(int i=1;i<=days;i++)
total=total*/


String mem;
if(total<5000)
{
mem="Basic";
}
else if(total<10000)
{
mem="Silver";
}
else if(total<15000)
{
mem="Gold";
}
else 
{
mem="Platinum";
}

System.out.println(charge);
System.out.println("Membership: "+mem);
System.out.println("Total amount: "+total);
sc.close();
}}

