import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        int a[][]=new int[6][6];
        int sum=0;
        int large=-9999999;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            a[i][j]=sc.nextInt();
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                sum=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                if(sum>large)
                large=sum;
            }
        }
        System.out.println(large);
        sc.close();
    }
}
