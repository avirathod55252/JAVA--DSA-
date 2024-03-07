public class allOccurrences {
  public static void occur(int arr[], int key, int i) {

    if (i == arr.length) {
      return;
    }
    if (arr[i] == key) {
      System.out.print(i);
    }
    occur(arr, key, i + 1);
  }

  public static void main(String args[]) {

    int arr[] = { 1, 2, 3, 4, 3 };
    occur(arr, 3, 0);
  }
}
