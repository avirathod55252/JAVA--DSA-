import java.util.*;

public class countdistintele {
  public static void main(String args[]) {
    int nums[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1, 1, 1, 11, 1, 1, 1, 1 };
    HashSet<Integer> set = new HashSet();

    for (int i = 0; i < nums.length; i++) {
      set.add(nums[i]);
    }

    TreeSet<Integer> ts = new TreeSet<>();
    for (int i = 0; i < nums.length; i++) {
      ts.add(nums[i]);

    }

    System.out.println("ans =" + set);
    System.out.println("count is =" + set.size());

    System.out.println("ans =" + ts);
    System.out.println("ans =" + ts.size());

  }
}
