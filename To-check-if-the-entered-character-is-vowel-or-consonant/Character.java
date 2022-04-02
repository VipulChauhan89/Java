/*
  program to check if the entered character is vowel or consonant
*/
import java.util.*;
public class Character 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        char ch;
        System.out.print("Enter the character : ");
        ch=in.next().charAt(0);
        if((ch>=97 && ch<=122)||(ch>=65 && ch<=90))
        {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                System.out.println("The entered character is vowel.");
            }
            else
            {
            System.out.println("The entered character is consonant.");
            }
        }
        else
        {
            System.out.println("The entered character is not an alphabet.");
        }
    }  
}
