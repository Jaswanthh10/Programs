/*Implement a Java program to accept the marks of n students into a one-dimensional array and calculate and display the highest mark, lowest mark, and average mark.*/

import java.util.Scanner;
public class Marks
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter total number of students: ");
int size=sc.nextInt();
int arry[]=new int [size];
System.out.println("Enter the "+size+" values:");
for(int i=0;i<size;i++)
{
arry[i]=sc.nextInt();
}
int max=arry[0];
for(int i=0;i<size;i++)
{
if(max<arry[i])
max=arry[i];
}
int min=arry[0];
for(int i=0;i<size;i++)
{
if(min>arry[i])
min=arry[i];
}
int rev=0;
for(int i=0;i<size;i++)
{
rev=arry[i]+rev;
}
int avg=rev/size;
System.out.println("The greatest marks is:"+max);
System.out.println("The smallest marks is:"+min);
System.out.println("Average marks of total student is:"+avg);
}}