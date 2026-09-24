/*Write a Java program to calculate the Net Salary (Net Salary=Basic Salary+HRA+DA) of an employee.Read the employee's Basic Salary from the user, HRA is 20% of Basic Salary, DA is 10% of Basic Salary.
Display the Basic Salary, HRA, DA, and Net Salary.*/

import java.util.Scanner;
public class Salary
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter your base salary: ");
int base=sc.nextInt();
double hra=base*0.2;
double da=base*0.1;
double net=base+hra+da;
System.out.println("Your HRA is: "+hra);
System.out.println("Your DA is: "+da);
System.out.println("Your net salary is: "+net);
sc.close();
}
}
