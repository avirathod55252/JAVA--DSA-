
// selectin sort 

public class SelectionSort {

  public static void selection(int nums[]) {
    for (int i = 0; i < nums.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] < nums[min]) {
          min = j;
        }
      }
      int temp = nums[min];
      nums[min] = nums[i];
      nums[i] = temp;
    }
  }

  public static void main(String args[]) {
    int nums[] = { 5, 4, 44, 3, 2, 1 };
    selection(nums);
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]);
    }
  }
}
