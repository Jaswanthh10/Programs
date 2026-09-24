/* Temp < 0 then Freezing weather 
• Temp 0-10 then Very Cold weather 
• Temp 10-20 then Cold weather 
• Temp 20-30 then Normal in Temp 
• Temp 30-40 then Its Hot 
• Temp >=40 then Its Very Hot*/

import java.util.Scanner;
public class newtemp {
    public static void main(String[] args)
    {
        System.out.print("Enter the temperature in Celsius: ");
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
if(celsius < 0)
    System.out.println("Freezing weather");
else if(celsius <= 10)
    System.out.println("Very Cold weather");
else if(celsius <= 20)
    System.out.println("Cold weather");
else if(celsius <= 30)
    System.out.println("Normal in Temp");
else if(celsius <= 40)
    System.out.println("Its Hot");
else
    System.out.println("Its Very Hot");
sc.close();
}
}
