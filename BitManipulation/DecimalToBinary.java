public class DecimalToBinary {
  public static void main(String argss[]) {

    int n = 10;
    int t = n;
    String s = "";

    while (t > 0) {
      int r = t % 2;
      t = t / 2;
      s = r + s;
    }
    System.out.print(s);
  }
}
