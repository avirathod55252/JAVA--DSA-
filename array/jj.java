public class jj {

  static int rect(int l, int w) {
    return l + w;
  }

  void add(int a, int b) {
    int c = a + b;
    System.out.println("add" + c);
  }

  void sub(int a, int b) {
    int c = a - b;
    System.out.println(c);
  }

  void mul(int a, int b) {
    int c = a * b;
    System.out.println(c);
  }

  void divide(int a, int b) {
    int c = a / b;
    System.out.println(c);
  }

  void mod(int a, int b) {
    int c = a * b;
    System.out.println(c);
  }

  void and(int a, int b) {
    int c = a & b;
    System.out.println(c);
  }

  void or(int a, int b) {
    int c = a | b;
    System.out.println(c);
  }

  void xor(int a, int b) {
    int c = a ^ b;
    System.out.println(c);
  }

  void circle(int r, float pi) {
    float c = pi * r * r;
    System.out.println(c);
  }

  public static void main(String args[]) {

    System.out.println(rect(3, 3));
    basic j = new basic();
    j.add(3, 3);
    // add(3, 3);
    j.sub(3, 4);
    j.mul(0, 0);
    j.divide(3, 8);
    j.circle(1, 9);
    j.or(3, 2);
    j.and(4, 9);

  }
}
