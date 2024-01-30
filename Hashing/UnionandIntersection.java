import java.util.HashSet;

public class UnionandIntersection {
  public static void main(String args[]) {
    int arr1[] = { 7, 3, 9 };
    int arr2[] = { 6, 3, 9, 2, 9, 4 };

    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr1.length; i++) {
      set.add(arr1[i]);
    }
    for (int i = 0; i < arr2.length; i++) {
      set.add(arr2[i]);
    }
    System.out.println("Union is = " + set);
    System.out.println("Union count is = " + set.size());

    set.clear();
    // intersection :

    for (int i = 0; i < arr1.length; i++) {
      set.add(arr1[i]);
    }
    int count = 0;
    HashSet<Integer> s = new HashSet<>();
    for (int i = 0; i < arr2.length; i++)

    {
      if (set.contains(arr2[i])) {
        count++;
        s.add(arr2[i]);
        set.remove(arr2[i]);
      }
    }
    System.out.println("Intersection count is : " + s);
    System.out.println("Intersection count is : " + count);
  }
}
