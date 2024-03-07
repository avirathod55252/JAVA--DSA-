public class OperationsBit {
  public static int getIthBit(int n, int i) {

    int bitmask = 1 << i;
    if ((n & bitmask) == 0) {
      return 0;
    } else {
      return 0;
    }
  }

  public static int setIthBit(int n, int i) {

    int bitmask = 1 << i;
    return n | bitmask;
  }

  public static int clearIthBit(int n, int i) {
    int bitmask = ~(1 << i);
    return n & bitmask;
  }

  public static void main(String args[]) {

    int n = 2;
    int i = 0;
    System.out.println(getIthBit(n, i));
    System.out.println(setIthBit(n, i));
    System.out.print(clearIthBit(n, i));

  }
}
