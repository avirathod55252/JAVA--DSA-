public class Powerx {

  public static int powerxton(int x, int n) {
    if (n == 0) {
      return 1;
    }
    return x * powerxton(x, n - 1);
  }

  public static void main(String args[]) {

    int x = 2;
    int n = 2;
    System.out.print(powerxton(x, n));
  }
}
