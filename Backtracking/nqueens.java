
// public class nqueens {
//     public static void nqueens(char board[][], int row) {

//         // base case
//         if (row == board.length) {
//             printboard(board);
//             return;
//         }

//         for (int j = 0; j < board.length; j++) {
//             board[row][j] = 'Q';
//             nqueens(board, row + 1);
//             board[row][j] = '.';

//         }

//     }
//     public static  void printboard (char board[][])
//     {
//         System.out.println("-------chesss board------------");
//         for (int i=0;i<board.length;i++)
//         {
//             for (int j=0;j<board.length;j++)
//             {
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         int n = 2;
//         char board[][] = new char[n][n];
//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board.length; j++) {
//                 board[i][j] = '.';
//             }
//         }
//         nqueens(board, 0);

//     }
// }

public class nqueens {

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nqueen(char[][] board, int row) {
        if (row == board.length) {
            count++;
            printboard(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nqueen(board, row + 1);
                board[row][j] = '.';
            }

        }

    }

    public static void printboard(char board[][]) {
        System.out.println("---------chess board----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");

            }
            System.out.println();
        }
    }

    static int  count = 0;
    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        nqueen(board, 0);
        System.out.println(" Total possible nqueens is : "+count);
    }
}