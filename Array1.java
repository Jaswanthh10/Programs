import java.util.Scanner;
public class Array1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array: ");
int size=sc.nextInt();

int arry[] = new int[size];
for(int i=0;i<size;i++){
System.out.println("Enter the values: ");
arry[i]=sc.nextInt();
}
System.out.println("the values are: ");
for(int i=0;i<size;i++){
System.out.println(arry[i]);}
}}
