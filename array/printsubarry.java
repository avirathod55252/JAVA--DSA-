import java.util.*;
public class printsubarry {

    public static void printsubarrays(int nums[])
    {
        int maxnumber = 0;
        for (int i=1;i<nums.length;i++)
        {
            for (int j=i;j<nums.length;j++)
            {
                for (int k=i;k<=j;k++)
                {
                    System.out.print(nums[k]+" ");
                   maxnumber = Math.max(nums[k],maxnumber);

                }
                
                System.out.println();
            }
        }
        System.out.println(maxnumber);
    }
    public static void main (String args[])
    {
        int arr[]= {4,5,6};
        printsubarrays(arr);

    }
}
