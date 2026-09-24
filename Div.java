import java.util.Scanner;
public class Div
{
public static void main(String sup[])
{
Scanner sk = new Scanner(System.in);
System.out.print("Enter the number: ");
int num = sk.nextInt();
if(num % 3==0)
  if(num % 5==0)
  System.out.print(num+" is divisible by both 3 and 5");
  else
  System.out.print(num+" is only divisible by 3");
else if(num % 5==0)
  System.out.print(num+" is divisible 5");
 else
  System.out.print(num+" is not divisible by 3 and 5 ");
sk.close();
}
}