public class setmatrixzeros {

    public static void setZeroes(int[][] matrix) {

        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {

                    row[i] = -1;
                    col[j] = -1;
                }

            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i] == -1 || col[j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        // System.out.print( setZeroes(matrix));
        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
