import java.util.*;

class LinkedHashMaps {
  public static void main(String args[]) {
    LinkedHashMap<String, Integer> lhm = new LinkedHashMap();
    lhm.put("avi", 99);
    lhm.put("avinash", 99);
    lhm.put("prashant", 88);
    lhm.put("dd", 99);
    System.out.print(lhm);
    System.out.println();
    TreeMap<String, Integer> tm = new TreeMap<>();
    tm.put("popat", 99);
    tm.put("avi", 22);
    tm.put("prashant", 999);
    tm.put("dd", 98);
    System.out.println(tm);
  }
}