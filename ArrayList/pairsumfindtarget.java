
import java.util.*;
public class pairsumfindtarget {
    // public static boolean target(ArrayList<Integer>list, int t)
    // {
    //      for (int i=0;i<list.size();i++)
    //      {
    //         for (int j=0;j<list.size();j++)
    //         {
    //             if (list.get(i+1)+list.get(j)==t)
    //             {
    //                 return true;
    //             }
    //         }
    //      }
    //      return false;
    // }

    public static boolean target (ArrayList<Integer>list, int t )
    {
        int lp =0;
        int rp = list.size()-1;
        while (lp !=rp)
        {
            if(list.get(lp)+ list.get(rp)==t)
            {
                return true;
            }
             // 12345 t = 4 
            else if(list.get(lp)+list.get(rp)<t)
            {
                lp++;
            }
            else 
            {
                rp--;
            }
        }
        return false;
    }

    public static void main (String args[])
    {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(5);
        list.add(2);
        int tar = 3;
        System.out.println( target( list, tar));

    }
}
