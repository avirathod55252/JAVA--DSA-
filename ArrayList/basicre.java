import java.util.*;
public class basicre {
    public static void main (String args[])
    {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(3);
        List.add(5);
        List.add(5);

        System.out.print(List);
        List.get(2);
        List.remove(0);


        System.out.println(List.get(0));
        for(int i=0;i<List.size();i++)
        {
            System.out.println(List.get(i));
        }


    }
}
