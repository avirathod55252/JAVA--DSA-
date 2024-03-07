class BinarytoDecimal {
  public static void main(String args[]) {
    int a = 111;
    int d = 0;
    int i = 0;
    while (a > 0) {
      int r = a % 10;
      a = a / 10;
      d = d + r * (int) Math.pow(2, i++);
    }
    System.out.print(d);
  }
}