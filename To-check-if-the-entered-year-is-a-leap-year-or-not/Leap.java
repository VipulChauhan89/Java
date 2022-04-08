/*
  program to check if the entered year is a leap year or not
*/
import java.util.*;
public class Leap 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int year;
        System.out.print("Enter a year : ");
        year=in.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println(year+" is a leap year");
                }
                else
                {
                    System.out.println(year+" is not a leap year");
                }
            }
            else
            {
                System.out.println(year+" is a leap year");
            }
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
    }
}
