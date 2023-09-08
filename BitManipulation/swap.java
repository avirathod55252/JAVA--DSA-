public class swap {
    public static void main(String args[]) {
        // swap without usign third variable

        int x = 4;
        int y = 10;
        System.out.println("Before swap " + x + " " + y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        
        System.out.println( "after swaping "+x + " " + y);
    }
}
