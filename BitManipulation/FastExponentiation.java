public class FastExponentiation {
    public static int exponention(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;

    }

    public static void main(String args[]) {

        System.out.println(exponention(2, 4));

        // convert the uppercase to lowercase using bits 
        for (char ch ='A';ch<='Z';ch++)
        {
            System.out.print((char) (ch |' '));
        }
    }
}
