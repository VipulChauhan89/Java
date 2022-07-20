//Program to find the transporse of the matrix
import java.util.*;
public class transporse
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,m;
        System.out.print("Enter the number of rows and number of columns of the matrix : ");
        n=in.nextInt();
        m=in.nextInt();
        System.out.println("Enter the "+n*m+" elements :");
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=in.nextInt();
            }
        }
        System.out.println("Entered matrix :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose of the above matrix :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
