import java.util.Scanner;
public class traffic
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the character: ");
char signal=sc.next().charAt(0);
if(signal=='G')
System.out.print("THE LIGHT IS GREEN.PROCEED");
else if(signal=='Y')
System.out.print("THE LIGHT IS YELLOW.PREPARE TO STOP");
else if(signal=='R')
System.out.print("THE LIGHT IS RED.STOP");
else
System.out.print("Invalid input");
sc.close();
}
}