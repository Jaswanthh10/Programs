public class Array2
{
public static void main(String args[])
{
int arry[]={10,20,30,40,50};
int sum=0;
for(int i=0;i<arry.length;i++){
sum=sum+arry[i];
}
System.out.println("the sum of all values is: "+sum);
int newsum=sum/5;
System.out.println("the average of all values is: "+newsum);
}}