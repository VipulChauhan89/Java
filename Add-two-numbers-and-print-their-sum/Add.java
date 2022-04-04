/*
  accept two numbers from the user and add the number and print their sum
*/
import java.util.*;
public class Add
{
	int addition(int a,int b)
  	{
		int sum=0;
		sum=a+b;
		return sum;
  	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a,b;
		System.out.print("Enter the first number : ");
		a=in.nextInt();
		System.out.print("Enter the second number : ");
		b=in.nextInt();
		Add c=new Add();
		System.out.println(a+" + "+b+" = "+c.addition(a,b));
	}
}
