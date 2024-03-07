import java.util.HashMap;

public class countFreq {
  public static void count(int nums[]) {
    HashMap<Integer, Integer> hm = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
    }
    for (Integer k : hm.keySet()) {
      System.out.println(k + "=" + hm.get(k));
      // System.out.print(hm.get(k));
    }
  }

  public static void main(String args[]) {

    int nums[] = { 2, 3, 4, 5, 6, 7, };
    count(nums);
  }
}
