import java.util.ArrayList;
import java.util.Scanner;

public class basic {
  public static void main(String args[]) {
    int n = 5;
    int k = 2;
    ArrayList<Integer> ls = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    for (int i = 1; i < n; i++) {
      ls.add(i);
      if (i == k) {
        ls.remove(i);
      }

    }
    System.out.print(ls);
  }
}
