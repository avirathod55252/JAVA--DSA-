public class checkispoweroftwo {
    public static boolean checkpoweroftwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String args[]) {
        int n = 8;
        System.out.print(checkpoweroftwo(n));
    }
}
