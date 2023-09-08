
// public class palindrome {
    
//     public static boolean checkstring(String s)
//     {
//         for (int i=0;i<s.length()/2;i++)
//         {
//             int n = s.length();
//             if (s.charAt(i)!= s.charAt(n-1-i))
//             {
//                 return    false;
//             }
//         }
//         return true;
//     }
//     public static void main (String args[])
//     {
//         String s = "noon";
//         System.out.print( checkstring(s));

//     }
// }

class palindrome 
{
    public static boolean checkpalindrome(String s)
    {
        int n = s.length();
        for (int i=0;i<n/2;i++)
        {
             if (s.charAt(i)!=s.charAt(n-1-i))
             {
                return false;
             }
        }
        return true;
    }


    public static void main (String args[])
    {
        String s = "noon";
        System.out.print(checkpalindrome(s));

        
    }
}