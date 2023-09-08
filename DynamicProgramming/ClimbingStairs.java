import java.util.Arrays;

public class ClimbingStairs {

    public static int countways(int n, int ways[]) {

        // memoization method 
        if (n == 0) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        if (ways[n] != -1) {
            return ways[n];
        }   
        ways[n] = countways(n - 1, ways) + countways(n - 2, ways) + countways(n - 3, ways);
        return ways[n];
    }

    public static void main(String args[]) {
        int n = 4;
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(countways(n, ways));

    }
}
