import java.util.Scanner;
public class Student {
public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name  = sc.nextLine();
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    System.out.print("Enter your roll number: ");
    int roll = sc.nextInt();
    System.out.print("Enter your Maths marks: ");
    int Maths = sc.nextInt();
    System.out.print("Enter your Physics marks: ");
    int Physics = sc.nextInt();
    System.out.print("Enter your Chemistry marks: ");
    int Chemistry = sc.nextInt();
    System.out.println(name);
    System.out.println(age);
    System.out.println(roll);
    double result = Maths + Physics + Chemistry;
    double percentage = result/300*100;
    System.out.println("Your percentage is: " + percentage + "%");
    sc.close();
} 
}
