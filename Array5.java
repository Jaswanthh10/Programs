import java.util.Scanner;
public class Array5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arry[]={1,2,3,4,5};
System.out.println("Enter the value: ");
int n=sc.nextInt();
int count=0;
for(int i=0;i<arry.length;i++){
if(n==arry[i]){
System.out.print("the position of "+arry[i]+" is "+i);
count++;}
}
if(count==0){
System.out.print("not found");}
}}