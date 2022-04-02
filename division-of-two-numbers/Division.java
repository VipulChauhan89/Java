/*
  program to take two numbers from the user and perform the division by taking numerator as integer and denominator as float
*/
import java.util.*;
public class Division
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num;
        float den,quotient=0;
        System.out.print("Enter the numerator in integer : ");
        num=in.nextInt();
        System.out.print("Enter the denominator in integer plus decimal : ");
        den=in.nextFloat();
        quotient=num/den;
        System.out.println("The quotient of the division is = "+quotient);
    }
}
