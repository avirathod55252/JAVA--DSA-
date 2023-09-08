public class palindromestring {
    public static boolean palindrome (String arr)
    {
         for (int i=0;i<arr.length();i++)
         {
            if (arr.charAt(i)==arr.charAt(arr.length()-1-i))
            {
                return true;
            }
         }
         return false;
    }
    public static void main (String args[])
    {
        String name = "noon";
        System.out.print(palindrome(name));

    }
}
