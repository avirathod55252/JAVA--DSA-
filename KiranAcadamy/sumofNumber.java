public class sumofNumber {
  public static void main(String args[]) {
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    int sum = 0;
    for (int i : arr) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
