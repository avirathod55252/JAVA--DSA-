import java.util.HashMap;
import java.util.TreeMap;

class hashmap {
  public static void main(String args[]) {
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("karkhel the sky is blue", 200);
    hm.put("karkhel", 444);
    System.out.print(hm);

    System.out.println(hm.get("karkhel"));
    System.out.println(hm.containsKey("karkhel"));
    if (hm.containsKey("karkhel")) {
      hm.remove("karkhel");
    }
    System.out.println(hm.size());
    hm.put("avi", 00);
    System.out.println(hm.isEmpty());
    hm.clear();
    System.out.println(hm.isEmpty());
    TreeMap<String, String> tm = new TreeMap<>();
    tm.put("the sky is blue", "the sky is blue");
    System.out.print(tm);

  }
}