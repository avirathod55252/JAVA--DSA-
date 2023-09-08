import java.io.*;
import java.util.*;

public class sol {
    public static String fourSum(int[] arr, int target, int n) {
        // Write your code here.
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j <= 4; j++) {
                sum += arr[j];
                if (sum == target) {
                    return "Yes";
                }
            }
        }
        return "No";
    }

    public static void main(String args[]) {
        int arr[] = { 2,2,2,2,2 };
        int target = 8;
        int n = arr.length;
        System.out.println(fourSum(arr, target, n));
    }
}
