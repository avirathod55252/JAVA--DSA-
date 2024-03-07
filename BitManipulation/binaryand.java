
public class binaryand {
    public static void main(String args[]) {
        // Binary And Operator (&) :

        int a = 5; // 101
        int b = 6; // 110
                   // 100
        // System.out.print(a & b);
        int m = 6;// 110 /* and table 0 0 = 0 */
        int n = 1; // 001 // 1 0 = 0
                   // 0 0 0 // 0 1 = 0
                   // 1 1 = 1
        // System.out.print(a & b);

        int sum = 0;
        int left = 1;
        int right = 1;
        for (int i = left; i <= right; i++) {
            // int c = left & i;
            // sum = c & right;
            sum = (left & i) & right;

        }
        // System.out.print(5 & 6 & 7);
        System.out.print(sum);
    }
}
