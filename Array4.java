import java.util.Scanner;
public class Array4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int size=5;
int arry[]= new int[size];
System.out.print("Enter the 5 values: ");
for(int i=0;i<size;i++){
arry[i]=sc.nextInt();
}
int min=arry[0];
for(int i=0;i<size;i++)
{
if(min>arry[i])
min=arry[i];
}
System.out.print("the Smallest value is: "+min);
}}