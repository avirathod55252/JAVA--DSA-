import java.util.*;

public class multidim {

    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
            list2.add(i * 2);
            list3.add(i * 3);
        }

        MainList.add(list1);
        MainList.add(list2);
        MainList.add(list3);

        for (int i=0;i<MainList.size();i++)
        {
            ArrayList<Integer> currlist = MainList.get(i);
            for (int j=0;j<currlist.size();j++)
            {
                System.out.print(currlist.get(j)+ " ");
            }
            System.out.println();
        }
    }
}
