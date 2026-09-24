/* Write a Java program to calculate the distance traveled by a vehicle.
Read the speed of the vehicle (in kilometers per hour) from the user.
Read the time taken (in hours) from the user.
Calculate the distance traveled (Distance=Speed×Time).
Display the speed, time, and distance traveled.*/
import java.util.Scanner;
public class dist
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the speed of vehicle: ");
double speed= sc.nextDouble();
System.out.print("Enter the time taken: ");
double time = sc.nextDouble();
double dist=speed*time;
float kill=(float)dist;
System.out.println("Speed of vehicle is: "+speed+"km/h");
System.out.println("Time taken is: "+time+" hours");
System.out.print("Distance travelled is: "+kill+"km");
sc.close();
}
}