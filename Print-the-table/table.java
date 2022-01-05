//Program to print the table of the entered number
import java.util.*;
public class Main
{
    public static void main(String[] args)  
    {
        int i;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to print its table : ");
        int N=in.nextInt();
        for(i=1;i<=10;i++)
        {
            System.out.println(N+" x "+i+" = "+(i*N));
        }
    }
}
