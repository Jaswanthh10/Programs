import java.util.Scanner;
public class Table1
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int size=sc.nextInt();
int arry[]=new int[size];
for(int i=0;i<size;i++){
System.out.println("Enter the value for position "+i+": ");
 arry[i]=sc.nextInt();

}
for(int i=0;i<size;i++){
System.out.println("element "+i+ ": "+arry[i]);
}
int karry[]=new int [size];
System.out.println("The elements in the 2nd array are: ");
for(int i=0;i<size;i++){
 karry[i]=arry[i];
System.out.println(karry[i]);
}
}}


