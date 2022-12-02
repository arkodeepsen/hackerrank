import java.util.*;
public class result
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[][]=new int[n][n];
        int sum1=0;int sum2=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j)
                sum1=sum1+ar[i][j];
                if(n-1-i==j)
                sum2=sum2+ar[i][j];
            }
        }
        System.out.println(Math.abs(sum1-sum2));
    }
}
