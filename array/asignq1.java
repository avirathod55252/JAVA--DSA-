import java.util.*;

public class asignq1 {
    public static boolean array(int nums[]) {
      
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        // Given an integer array nums, return true if any value appears at least twice
        // in the array, and return false if every element is distinct
        int arr[] = { 1, 2, 3, 1 };
        System.out.println(array(arr));

    }
}
