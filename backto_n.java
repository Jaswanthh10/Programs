import java.util.Scanner;
public class backto_n {
    public static void main(String[]args) 
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    System.out.println("the natural numbers upto "+n+" are:");
    for(int i=n;i>=1;i--)
    {
        System.out.println(i);
    }
    System.out.println("the even numbers upto "+n+" are:");
    for(int i=n;i>=1;i--)
    {
        if(i%2==0)
        {
            System.out.println(i);
        }
    }
    System.out.println("the odd numbers upto "+n+" are:");
    for(int i=n;i>=1;i--)
    {
        if(i%2!=0)
        {
            System.out.println(i);
        }
    }
}}