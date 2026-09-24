//Q1. Write a Java program to read temperature in Fahrenheit from the user and convert it into Celsius (Celsius = (Fahrenheit − 32) × 5 / 9)


import java.util.Scanner;
public class temp{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the temperature in Fahrenheit: ");
double f = sc.nextDouble();
double c = (f-32)*5/9;
System.out.println("the temperature in Fahrenheit is: "+ f);
System.out.println("the temperature in Celsius is: "+ c);
sc.close();
}
}