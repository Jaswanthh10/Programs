/* Write a Java program that takes the number of electricity units consumed as input and calculates the total bill using these slabs:

Units	                         Rate
First 100 units	                ₹2 per unit
Next 100 units (101–200)	₹3 per unit
Next 200 units (201–400)	₹5 per unit
Above 400 units	                ₹7 per unit

Also add a ₹50 fixed charge to every bill. */



import java.util.*;
public class bill
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Elecriticity units consumed: ");
int a=sc.nextInt();
if(a<=100)
a=a*2;
else if(a<=200)
a=(100*2)+((a-100)*3);
else if (a<=400)
a=(100*2)+(100*3)+((a-200)*5);
else
a=(100*2)+(100*3)+(200*5)+((a-400)*7);
a=a+50;

System.out.print(a +" is your bill");
sc.close();
}}