import java.util.HashMap;

class hashmap {
  public static void main(String args[]) {
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("karkhel", 200);
    hm.put("karkhel", 444);

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

  }
}