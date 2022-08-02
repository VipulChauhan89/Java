//Program to concatenate two strings
import java.util.*;
public class concatenate
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        String s1,s2,s3;
        System.out.print("Enter the first string : ");
        s1=in.nextLine();
        System.out.print("Enter the second string : ");
        s2=in.nextLine();
        s3=s1+s2;
        System.out.println("After concatenation: "+s3);
    }
}
