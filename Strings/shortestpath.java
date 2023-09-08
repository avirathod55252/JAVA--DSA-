
// public class shortestpath {
    
//     public static float checkshortespath(String s)
//     {
//         int x =0,y=0;
//         for (int i=0;i<s.length();i++)
//         {
//             // int direction = s.charAt(i);
//             if (s.charAt(i)=='s')
//             {
//                 y--;
//             }else if(s.charAt(i)=='n')
//             {
//                 y++;
//             }else if(s.charAt(i)=='w')
//             {
//                 x--;
//             }
//             else 
//             {
//                 x++;
//             }
//         }
//         int x2=x*x;
//         int y2=y*y;
//         return (float)Math.sqrt(x2+y2);
//     }
//     public static void main (String args[])
//     {
//         String s = "wneenesennn";
//          String name = "avinashrathod";
//          System.out.print(name.substring(0, 7));
//         // System.out.print(checkshortespath(s));

//     }
// }

class shortestpath 
{
    public static float findshortestpath(String s)
    {
        int n = s.length();
        int x=0;
        int y=0;
        for (int i=0;i<n;i++)
        {
            if (s.charAt(i)=='s')
            {
                 y--;
            }
            else if (s.charAt(i)=='n')
            {
                y++;
            }
            else if (s.charAt(i)=='w')
            {
                x--;
            }
            else 
            {
                x++;
            }
        }
        int x2 = x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main (String args[])
    {
        String s = "wneenesennn";
        System.out.print(findshortestpath(s));

    }
}