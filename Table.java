/*Implement a Java program to accept a number from the user and display its multiplication table from 1 to 10 using a for loop.*/
import java.util.Scanner;
public class Table
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int n=sc.nextInt();
for(int i=1;i<=10;i++){
System.out.println(n+"x"+i+"="+n*i);}

}}