import java.util.*;

public class major {

  public static void majority(int arr[]) {
    HashMap<Integer, Integer> mp = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      // if (mp.containsKey(arr[i])) {
      // mp.put(arr[i], mp.get(arr[i] + 1));
      // } else {
      // mp.put(arr[i], 1);
      // }
      mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
    }
    System.out.println(mp);

    // Set<Integer> s = mp.keySet();

    for (Integer key : mp.keySet()) {
      if (mp.get(key) > arr.length / 3) {
        System.out.println(key);
        System.out.println("count is = " + mp.get(key));
      }
    }
  }

  public static void main(String args[]) {
    int arr[] = { 1, 3, 5, 1, 2, 2, 2, 2, 22, 2, 2, 1, 5, 1, 3 };
    majority(arr);
  }
}
