import java.util.*;
public class swap {
    public static void swap (ArrayList <Integer> list , int index1, int index2)
    {
         int temp = list.get(index1);
        //  list.get(index1)=list.get(index2);
        // list.get(index2)=temp;
        list.set(index1 , list.get(index2));
         list.set(index2,temp);

    }
    public static void main (String args[])
    {
        ArrayList <Integer> list = new ArrayList <>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int index1 = 2;
        int index2 = 4;
      swap (list,index1,index2);
      for (int i=0;i<list.size();i++)
      {
        System.out.print(list.get(i)+ " ");
      }
      
    }
}
