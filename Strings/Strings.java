import java.util.*;
public class Strings {
    public static void printletters(String nums)
    {
        for (int i=0;i<nums.length();i++)
        {
            // System.out.print(nums.charAt(i));
            // if (nums.charAt(i)=="avinash")
            // {
            //     System.out.print("a");
            // }
        }
        System.out.println();
    }
    public static void main (String args[])
    {
        // String name = "avinash";
        // System.out.print(name);
        // System.out.print(name.length());
        // Scanner  sc = new Scanner (System.in);
        //  String name2;
        //  name2= sc.nextLine();
        //  System.out.print(name2);

        // String name = new String ("avinash");
        //  if (name.equals("avinash"))
        //  {
        //     System.out.print("yes");
        //  }
        //  System.out.print(name.charAt(0));
        // printletters(name);

        // String name ="avinash";
        // System.out.println(name);
        // System.out.println(name.length());
        // Scanner sc = new Scanner (System.in);
        // String name2;
        // name2=sc.nextLine();
        // System.out.println(name2);

        // String name3="avinash";
        // for (int i=0;i<name.length();i++)
        // {   
        //     System.out.println(name.charAt(i));
        // }
        // String n ="avinash";

        String nae[]= {"avina"};
        for(int i=0;i<nae.length;i++)
        {
            System.out.print(nae[i]);

        }
        String name ="avinash";
        for(int i=0;i<name.length();i++)
        {
            System.out.print(name.charAt(i));
        }
        System.out.print(name.contains("avinash"));

    }
}
