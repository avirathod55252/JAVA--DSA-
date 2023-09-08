class evenodd {
    public static void oddoreven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("Even  Number ");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String args[]) {
        oddoreven(3);
        oddoreven(4);

    }
}