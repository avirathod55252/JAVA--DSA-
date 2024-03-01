class updateIthBit {
  // operations
  // get ith bit
  // set ith bit
  // clear ith bit
  public static int getIthBit(int n, int i) {

    int bitmask = 1 << i;
    if ((n & bitmask) == 0) {
      return 0;
    } else {
      return 1;
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

  public static int updateIthBit(int n, int i, int newbit) {
    if (newbit == 0) {
      return clearIthBit(n, i);
    } else {
      return setIthBit(n, i);
    }
  }

  public static int clearLastIBits(int n, int i) {
    int bitmask = (~0) << i;
    return n & bitmask;
  }

  public static void main(String args[]) {

    int n = 5;
    int i = 1;
    System.out.print(getIthBit(n, i));
    System.out.print(setIthBit(n, i));
    System.out.print(clearIthBit(n, i));

    System.out.println(updateIthBit(n, i, 1));
    System.out.print(clearLastIBits(15, 2));

  }
}