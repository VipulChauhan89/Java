/*
  Program to print the average of top three out of four test
*/
import java.util.*;
public class Average
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        float m1,m2,m3,m4,sum=0,average,min;
        System.out.print("Enter the marks in four test : ");
        m1=in.nextFloat();
        m2=in.nextFloat();
        m3=in.nextFloat();
        m4=in.nextFloat();
        min=m1;
        if(m2<min)
        {
            min=m2;
        }
        if(m3<min)
        {
            min=m3;
        }
        if(m4<min)
        {
            min=m4;
        }
        sum=m1+m2+m3+m4-min;
        average=sum/3;
        System.out.println("The average of top three subjects is = "+average);
    }
}
