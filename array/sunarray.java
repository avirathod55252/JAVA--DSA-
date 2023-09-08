import java.util.*;
public class sunarray {
    public static void subarra(int arr[])
    {
        int  tsb=0;
        int currentsum=0;
        int maxsum= Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                currentsum=0;
                for (int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    currentsum+=arr[k];
                    maxsum=Math.max(currentsum,maxsum);
                }
                tsb++;
                System.out.println();
            }
        }
        System.out.print( " Total subarray "+ tsb);
        System.out.print( " Total maxsum "+ maxsum);


    }
    public static void main (String args[])
    {
        // int subarr[]= {2,4,6,8,10};
        // subarra(subarr);
        System.out.println(Math.random());


    }
}
