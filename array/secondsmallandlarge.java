

// optimal approach 

import java.io.*;
import java.util.*;

class secondsmallandlarge {
    static private int secondSmallest(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }
        return second_small;
    }

    static private int secondLargest(int[] arr, int n) {
        if (n < 2)
         return -1;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {

            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            }

            else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        return second_large;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 7, 7, 5 };
        int n = arr.length;

        int sS = secondSmallest(arr, n);
        int sL = secondLargest(arr, n);

        System.out.println("Second smallest is " + sS);
        System.out.println("Second largest is " + sL);
    }

}


// brute forece approach 

// class secondsmallandlarge 
// {
//     public static void print(int arr[])
//     {
//         int n= arr.length;
//         int sm=Integer.MAX_VALUE;
//         int sl=Integer.MIN_VALUE;
//         for (int i=0;i<n;i++)
//         {
//              sm=arr[1];
//              sl=arr[n-2];

//         }
//         System.out.println(sm);
//         System.out.println(sl);
//     }
//     public static void main (String args[])
//     {
//         int arr[]= { 1,2,3,4,5,6};
//         print(arr);


//     }
// }