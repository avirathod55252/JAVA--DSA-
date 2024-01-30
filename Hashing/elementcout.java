import java.util.HashMap;

public class elementcout {
  public static void main(String args[]) {
    int arr[] = { 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 8 };
    // count frequency:

    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
    }
    System.out.println(hm);

  }
}
