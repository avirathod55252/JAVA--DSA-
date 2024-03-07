public class CountNumber {
  public static void main(String args[]) {
    int n = 1234;
    int count = 0;
    int rev = 0;

    while (n != 0) {
      int r = n % 10;
      rev = rev * 10 + r;
      n /= 10;
      count++;
    }
    System.out.println(count);
    System.out.print(rev);

  }
}
