import java.util.*;

public class multidimsearch {

    public static int search(ArrayList<ArrayList<Integer>> list, int s) {

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {

            ArrayList<Integer> currlist = list.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                // if(currlist.get(i)+currlist.get(j)==s)
                // {
                // return true;
                // }
                sum = currlist.get(i) + currlist.get(j);
            }
        }
        // return false;
        return sum;
    }

    public static void main(String args[]) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(6);

        list3.add(3);
        list3.add(5);
        list3.add(55);
        list3.add(3);
        list.add(list3);
        list.add(list2);
        System.out.print(list);
        System.out.println(search(list, 6));

        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> currlist = list.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }

    }
}
