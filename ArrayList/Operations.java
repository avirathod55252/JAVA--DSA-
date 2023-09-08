import java.util.*;
class Operations{
    public static void main (String args[])
    {
       ArrayList<Integer>list = new ArrayList();
        // add oprations 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        // System.out.println(list);
        // // System.out.print(list);
        // // get element 
        // int element = list.get(1);
        // System.out.println(element);
        //  // remove /delete operations
        //  list.remove(3);
        //  System.out.println(list);
        //  // set element at indesx
        // list.set(3,3);
        // System.out.println(list);
        System.out.println(  list.contains(4));
        System.out.println(list);
       list.add(0,0);
       System.out.println(list);
       System.out.println(list.size());
       // print the arraylist 
       for (int i=0;i<list.size();i++)
       {
        System.out.print(list.get(i) +" ");
       }
       System.out.println();
       
       for (int i = list.size()-1;i>=0;i--)
       {
        System.out.print(list.get(i)+ " ");
       }

    }
}