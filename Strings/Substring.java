public class Substring {
  public static String subString(String s, int si, int ei) {
    String substr = "";
    for (int i = si; i <= ei; i++) {
      substr += s.charAt(i);
    }
    return substr;
  }

  public static void main(String args[]) {

    String s = "avinash";
    String ss = s.substring(0, 4);
    System.out.println(subString(ss, 0, 3));

  }
}
