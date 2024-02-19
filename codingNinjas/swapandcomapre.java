public class swapandcomapre {
  static int makeStringSmaller(int n, String s, String t) {
    // Write your code here.

    char ss[] = s.toCharArray();
    char tt[] = t.toCharArray();

    // for (int i = 1; i < n; i++) {

    // if (i == 1) {
    // char temp = ss[i];
    // ss[i] = ss[0];
    // ss[0] = temp;
    // }
    // }

    // for (int i = 1; i < n; i++) {
    // if (i == 1) {
    // char temp = tt[i];
    // tt[i] = tt[0];
    // tt[0] = temp;
    // }

    // }

    int idx1 = ss[0] - 'a';
    int idx2 = tt[0] - 'a';
    if (idx1 <= idx2) {
      return 1;
    }

    return 0;
  }

  public static void main(String args[]) {
    String s = "cab";
    String t = "abc";
    char c[] = s.toCharArray();
    char d[] = t.toCharArray();
    char temp = c[0];
    c[0] = c[1];
    c[1] = temp;
    char temps = d[0];
    d[0] = d[1];
    d[1] = temps;

    // String result = new String(c);
    // System.out.println(result);
    // String result2 = new String(d);
    // System.out.println(result2);

    int idx = c[0] - 'a';
    int idx2 = d[0] - 'a';
    if (idx < idx2) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }

  }
}