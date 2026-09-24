import java.util.Scanner;
public class Scan {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your desired number: ");
    double num = sc.nextDouble();
    int b;
    b = (int)num;
    System.out.println("The number you entered is: " + b);
    
    }
}