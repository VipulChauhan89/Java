/*
  Program to rightshift and leftshift of an integer number
*/
import java.util.*;
public class Shift 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num,ls=0,rs=0,s;
        System.out.print("Enter the number : ");
        num=in.nextInt();
        System.out.print("Enter how many bits you want to shift : ");
        s=in.nextInt();
        rs=num>>s;
        ls=num<<s;
        System.out.println("Number = "+num+" \nRightshift = "+rs+" \nLeftshift = "+ls);
    }    
}
