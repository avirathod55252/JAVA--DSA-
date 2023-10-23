public class swap {
    public static void main(String args[]) {
        // swap without usign third variable

        int x = 5;
        int y = 10;
        System.out.println(x + " " + y);   
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x + " " + y);

    }
}
