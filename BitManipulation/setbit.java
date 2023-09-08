public class setbit {
    public static int setintbit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static void main(String args[]) {
        System.out.println(setintbit(10, 3));
    }
}
