public class numberPattern {
  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
      if (i == 1 || i == 2) {
        System.out.println();
      }
      for (int j = 1; j <= 3; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
