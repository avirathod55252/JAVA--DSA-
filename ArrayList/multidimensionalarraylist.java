import java.util.*;
public class multidimensionalarraylist {
    public static void main (String args[])
    {
        ArrayList<ArrayList <Integer>> Mainlist = new ArrayList<>();
        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        Mainlist.add(list1);
        //  ArrayList <Integer> list2= new ArrayList<>();
        //  ArrayList<Integer>list3 = new ArrayList<>();
        // list2.add(1);
        // list2.add(2);
        // list2.add(4);
        // Mainlist.add(list2);
        // for(int i=1;i<5;i++)
        // {
        //     list1.add(i*1);
        //     list2.add(i*2);
        //     list3.add(i*3);

        // }
        Mainlist.add(list1);
        // Mainlist.add(list2);
        // Mainlist.add(list3);
        // printing 
        for (int i=0;i<Mainlist.size();i++)
        {
            ArrayList <Integer> currlist= Mainlist.get(i);
            for (int j=0;j<currlist.size();j++)
            {
                System.out.print( currlist.get(j));
            }
            System.out.println();
        }
        
    }
}
