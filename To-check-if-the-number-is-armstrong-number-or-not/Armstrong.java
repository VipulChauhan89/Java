/*
  Program to check if the number is armstrong number or not
*/
import java.util.*;
public class Armstrong 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,temp,sum=0,s;
        System.out.print("Enter the number : ");
        num=in.nextInt();
        if(num>=100 && num<=999)
        {
            temp=num;
            while(temp!=0)
            {
                s=temp%10;
                sum=sum+(s*s*s);
                temp=temp/10;
            }
            if(sum==num)
            {
                System.out.println(num+" is an armstrong number.");
            }
            else
            {
                System.out.println(num+" is not an armstrong number.");
            }
        }
        else
        {
            System.out.println("It is not a three digit number.");
        }
    }    
}
