/*
  program to convert temperature from degree faherenheit to degree celsius
*/
import java.util.*;
public class Temperature 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        double fh,cl;
        System.out.print("Enter the temperature in degree fahrenheit :");
        fh=in.nextDouble();
        cl=(fh-32)*(5.0/9.0);
        System.out.println("The temperature in degree celsius is = "+cl);
    }    
}
