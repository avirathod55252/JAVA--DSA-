import java.util.*;
public class Reverseword {
    public static  String reverse (String s)
    {
        String str[] = s.trim().split("\\s+");
        String out="";
        for (int i=str.length-1;i>0;i--)
        {
            out+=str[i]+" ";
        }
        return out+str[0];

    }
    public static void main (String args[])
    {
        String str = "avinash is good boy";
        System.out.print(reverse(str));

    }
}
