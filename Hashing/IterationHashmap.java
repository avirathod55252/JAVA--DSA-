import java.util.*;

public class IterationHashmap {
  public static void main(String args[]) {

    HashMap<String, Integer> hm = new HashMap<>();
    // insrt O(1):

    hm.put("india", 100);
    hm.put("Us", 55);
    hm.put("China", 140);
    // System.out.println(hm);
    // Iterate
    Set<String> keys = hm.keySet();
    // System.out.println(keys);

    for (String k : keys) {
      System.out.println(k + hm.get(k));
    }
  }
}