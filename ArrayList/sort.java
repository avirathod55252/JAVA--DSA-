import java.util.*;

public class sort {
    
    public static void main (String args[])
    {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(50);
        list.add(44);
        list.add(33);
        list.add(4);
        // sorting ascending order 
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        // descending order 
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
