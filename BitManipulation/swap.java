public class swap {
    public static void main(String args[]) {
        // swap without usign third variable

        int x = 2; // 010
        int y = 3;// 011
                  // ^ 001 ans is 1
        System.out.println(x ^ y);
        // x = x + y;// 15
        // y = x - y;// 10-5=5
        // x = x - y;// 15-5=10
        // System.out.println(x + " " + y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x + " " + y);

    }
}
