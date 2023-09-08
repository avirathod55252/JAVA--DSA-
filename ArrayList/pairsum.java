import java.util.*;

public class pairsum {
    // public static boolean pairsumproblem (ArrayList<Integer>list, int target)
    // {
    //      for (int i=0;i<list.size();i++)
    //      {
    //         for (int j=i+1;j<list.size();j++)
    //         {
    //             if(list.get(i)+list.get(j)== target)
    //             {
    //                 return true;
    //             }
    //         }
    //      }
    //      return false;
    // }
    // two pointer approach 
    public static boolean twopointersum (ArrayList<Integer> list, int target)
    {
        int lp =0;
        int rp = list.size()-1;
        while (lp!=rp)
        {
            //case 1:
            if (list.get(lp)+list.get(rp)==target)
            {
                return true;
            }
            // list [1,2,3,4,5] , target = 4 
            else if (list.get(lp)+list.get(rp)<target)
            {
                lp++;
            }
            else {
                rp--;
            }

        }
        return false;
    }
    public static void main (String args [])
    {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int target = 5;
        // System.out.print( pairsumproblem(list, target));
        System.out.print(twopointersum(list, target));

    }
}
