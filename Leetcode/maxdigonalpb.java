import java.util.*;

class maxdigonalpb {

  public static int maxdigonal(int dim[][]) {
    double maxDiagonalLength = 0;
    int maxArea = 0;

    for (int[] dimension : dim) {
      int length = dimension[0];
      int width = dimension[1];
      double diagonalLength = Math.sqrt(length * length + width * width);

      if (diagonalLength > maxDiagonalLength || (diagonalLength == maxDiagonalLength && length * width > maxArea)) {
        maxDiagonalLength = diagonalLength;
        maxArea = length * width;
      }
    }

    return maxArea;

  }

  public static void main(String args[]) {
    int dime[][] = { { 9, 3 }, { 8, 6 } };

    System.out.println(maxdigonal(dime));
    // maxdigonal(dime);

  }
}
