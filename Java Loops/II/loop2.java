import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int num = a;
            for (int j = 0; j < c; j++)
            {
                num += (int)(Math.pow(2, j) * b);
                System.out.print(Integer.toString(num)  + ' ');
            }
            System.out.print('\n');
        }
        in.close();
    }
}
