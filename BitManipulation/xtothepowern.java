public class xtothepowern {
    public static int xpown(int x, int n)

    {
        if (n == 0) {
            return 1;
        }
        int xnm1 = xpown(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

    public static void main(String args[]) {
        int x = 2;
        int n = 2;
        System.out.print(xpown(x, n));
        // System.out.print(Math.pow(2, 3));
    }
}
