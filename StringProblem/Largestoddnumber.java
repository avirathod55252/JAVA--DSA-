public class Largestoddnumber {

    public static String largestodd(String str) {
        for (int i = str.length() - 1; i > 0; i--) {
            if ((str.charAt(i) - '0') % 2 == 1) {

                return str.substring(0, i + 1);
            }
        }
        return "";
    }
    public static void main(String args[]) {
        
        String str = "75";
        System.out.print(largestodd(str));

    }
}
