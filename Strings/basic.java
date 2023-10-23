class basic {
    public static void main(String args[]) {
        String s1 = "avi";
        String s2 = "avi";

        String s = new String("avi");
        if (s1 == s) {
            System.out.println("match");
        } else {
            System.out.println("don't match");
        }
    }
}