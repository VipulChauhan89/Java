/*
  Program to convert inches into centimeters.
*/
import java.util.*;
public class Centimeters
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        double inch,cm;
        System.out.print("Enter the Inches to convert it into Centimeter : ");
        inch=in.nextDouble();
        cm=2.54*inch;
        System.out.prinln("Centimeters = "+cm);
    }
}
