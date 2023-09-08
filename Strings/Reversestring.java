public class Reversestring {
    public static void reversename(String arr) {
        int n = arr.length();
        // for (int i = n-1; i > 0; i--) {
        //     System.out.print(arr.charAt(i));
        // }
        for(int i=0;i<=n-1;i++)
        {
            System.out.print(arr.charAt(i));
        }
        System.out.println();
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr.charAt(i));
        }
        System.out.println();
    }

    public static void main(String args[]) {
        String name = "avinash";
        reversename(name);

    }
}
