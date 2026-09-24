/* Write a Java program that takes marks for 5 subjects and calculates:

Total marks
Percentage
Grade

Use these rules:

Percentage	Grade
90–100	         A
80–89	         B
70–79	         C
60–69	         D
40–59	         E
Below 40	 F

Also, if any subject has marks below 35, the student should be declared Fail, regardless of the percentage. */

import java.util.*;
public class grade
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your marks for 5 subjects: ");
int mat=sc.nextInt();
int java=sc.nextInt();
int soc=sc.nextInt();
int eng=sc.nextInt();
int sci=sc.nextInt();
int tot=sci+eng+mat+java+soc;
double per=(tot/500.0)*100;
char pop;
if(per<40)
pop='F';
else if(per<60)
pop='E';
else if (per<70)
pop='D';
else if(per<80)
pop='C';
else if(per<90)
pop='B';
else
pop='A';

System.out.println("Total marks: "+tot);
System.out.println("Percentage: "+per);
System.out.println("Grade: "+pop);

if(mat<35|| sci<35||soc<35||eng<35||java<35)
System.out.println("Result: Fail");
else
System.out.println("Result: Pass");

sc.close();
}
}

