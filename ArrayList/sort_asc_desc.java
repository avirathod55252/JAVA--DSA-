import java.util.*;

public class sort_asc_desc {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(1);
        Collections.sort(list);
        System.out.print(list);
         System.out.println();
        Collections.sort(list, Collections.reverseOrder());
        System.out.print(list);

    }
}
