import java.util.Arrays;

public class InBuiltSort {
  public static void main(String args[]) {
    int arr[] = { 2, 3, 5, 1, 2, 9, 4 };

    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
    System.out.println();

    int arr2[] = { 2, 1, 3, 5, 1, 2, 9, 4 };

    Arrays.sort(arr2, 0, 4);
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i]);
    }

  }
}
