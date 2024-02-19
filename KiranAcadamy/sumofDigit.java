public class sumofDigit {
  public static void main(String args[]) {

    int n = 125;
    int sum = 0;
    while (n > 0) {
      int y = n % 10;
      sum = sum + y;
      n /= 10;
    }
    System.out.print(sum);
  }
}
