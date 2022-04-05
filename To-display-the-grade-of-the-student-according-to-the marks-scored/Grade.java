/*
  Program to display the grade of the student according to the marks scored by the student.
  
  percentage>=80 then Grade A
  percentage>=60 and percentage<80 then Grade B
  percentage>=50 and percentage<60 then Grade C
  percentage>=40 and percentage<50 then Grade D
  percentage>=35 and percentage<40 then Grade E
  percentage<35 then Grade F
*/
import java.util.*;
public class Grade 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the number of subject of which you want to enter marks : ");
        n=in.nextInt();
        float sum=0,percentage;
        float marks[]=new float[n];
        System.out.print("Enter the marks in "+n+" subjects : ");
        for(int i=0;i<n;i++)
        {
            marks[i]=in.nextFloat();
            sum+=marks[i];
        }
        percentage=sum/n;
        if(percentage>=80)
        {
            System.out.println("Grade A.");
        }
        else if(percentage>=60 && percentage<80)
        {
            System.out.println("Grade B.");
        }
        else if(percentage>=50 && percentage<60)
        {
            System.out.println("Grade C.");
        }
        else if(percentage>=40 && percentage<50)
        {
            System.out.println("Grade D.");
        }
        else if(percentage>=35 && percentage<40)
        {
            System.out.println("Grade E.");
        }
        else if(percentage<35)
        {
            System.out.println("Grade F.");
        }
        else
        {
            System.out.println("Not a valid percentage.");
        }
    }
}
