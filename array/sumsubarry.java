import java.util.*;
import java.io.*;
public class sumsubarry {

    public static void sum (int arr[])
    {
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                currentsum=0;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    currentsum+=arr[k];
                    maxsum=Math.max(currentsum,maxsum);
                }
                System.out.println();
            }
        }
        System.out.println(maxsum);
    }
    public static void main (String args[])
    {
        int arr[]= {2,4,6,8,10};
        sum(arr);
    }
}
