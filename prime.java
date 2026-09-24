/*
Logic:
A prime number is a natural number greater than 1 that is divisible only by 1 and itself. Examples of prime numbers are 2, 3, 5, 7, and 11

logic: Read a number n.
Set count = 0.
Run a loop from 1 to n.
If n % i == 0, increase count.
If count == 2, the number is Prime.
Otherwise, it is Not Prime. */

import java.util.*;
public class prime
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int n=sc.nextInt();
int count=0;
if(n<=1)
System.out.print("invalid input");
else
for(int i=1;i<=n;i++)
{
if(n%i==0)
count++;
}
if(count==2)
System.out.print("is a prime");
if(n%i==0)

i++;
else
count++;
}
}