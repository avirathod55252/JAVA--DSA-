public class reverseUsingxor {

  public static void revers(int nums[]) {
    int first = 0;
    int last = nums.length - 1;
    while (first < last) {

      first = first + last;
      last = first - last;
      first = first - last;
      first++;
      last--;
    }
  }

  public int missingNumber(int[] nums) {
    int n = nums.length;
    int ans = 0;
    for (int i = 1; i <= n; i++) {
      ans = ans ^ i;
    }
    for (int i = 0; i < nums.length; i++) {
      ans = ans ^ nums[i];
    }
    return ans;
  }

  public static void main(String args[]) {

    int arr[] = { 0, 1 };
    // revers(arr);
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i]);
    // }
    int n = arr.length;
    int ans = 0;
    for (int i = 1; i <= n; i++) {
      ans = ans ^ i;
    }
    System.out.print(ans);

    for (int i = 0; i < arr.length; i++) {
      ans = ans ^ arr[i];
    }
    System.out.print(ans);
    System.out.print(2 ^ 1);

  }
}
