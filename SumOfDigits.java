import java.util.Scanner;
public class SumOfDigits
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
int n=sc.nextInt();
int rev=0;
int b=n;
int x=0;

while(b>0){
if(b%10!=0){
x=b%10;
rev=(rev)+x;
b=b/10;}
}
System.out.print(rev);
}}