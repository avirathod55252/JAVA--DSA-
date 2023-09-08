// public class stringpalindrome {
//     public static boolean check (String s )
//     {
//         int n = s.length();
//         for (int i=0;i<s.length()/2;i++)
//         {
//            if (s.charAt(i)!=s.charAt(n-1-i))
//            {
//                return false;
//            }
//         }
//         return true;
//     }
//     public static void main (String args[])
//     {
//          String s  = "noon";
//          System.out.print(check(s));
//     }
// }

public class stringpalindrome {
    public static boolean check(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String s = "noon";
        System.out.println(check(s));
    }
}