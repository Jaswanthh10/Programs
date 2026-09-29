import java.util.Scanner;
public class Array
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int size=5;
int arry[] = new int[size];
for(int i=0;i<size;i++){
System.out.println("Enter the values: ");
arry[i]=sc.nextInt();
}
System.out.print("the values are: ");
for(int i=0;i<size;i++){
System.out.println(arry[i]);}
}}
