class PrimeorNot {
  public static boolean check(int n) {

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]) {
    int n = 20;
    boolean ans = (check(n));
    if (n != 1 && ans == true) {
      System.out.println("Prime Number");

    } else {
      System.out.println("Not a prime number");
    }
  }
}