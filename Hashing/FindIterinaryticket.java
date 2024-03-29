import java.util.*;

public class FindIterinaryticket {

  public static String getStart(HashMap<String, String> tickets) {
    HashMap<String, String> revmap = new HashMap<>();
    for (String key : tickets.keySet()) {
      revmap.put(tickets.get(key), key);
    }
    for (String key : tickets.keySet()) {
      if (!revmap.containsKey(key)) {
        return key;
      }
    }
    return null;
  }

  public static void main(String args[]) {
    HashMap<String, String> tickets = new HashMap();
    tickets.put("chennai", "Bengaluru");
    tickets.put("mumbai", "Delhi");
    tickets.put("Goa", "chennai");
    tickets.put("Delhi", "Goa");

    String start = getStart(tickets);
    System.out.print(start);
    for (String key : tickets.keySet()) {
      System.out.print(" ->  " + tickets.get(key));
      start = tickets.get(start);
    }
  }

}
