// import java.util.*;

// public class sprialmatrix {

//     public static void reverse(int matrix[][]) {
//         int startrow = 0;
//         int endrow = matrix.length - 1;
//         int startcol = 0;
//         int endcol = matrix[0].length - 1;

//         while (startrow <= endrow && startcol <= endcol) {
//             // top
//             for (int j = startcol; j <= endcol; j++) {
//                 System.out.print(matrix[startrow][j]);
//             }
//             // right
//             for (int i = startrow + 1; i <= endrow; i++) {
//                 System.out.print(matrix[i][endcol]);
//             }
//             // bottom
//             for (int j = endcol - 1; j >= startcol; j--) {
//                 if(startrow==endrow)
//                 {
//                     break;
//                 }
//                 System.out.print(matrix[endrow][j]);
//             }
//             // left
//             for (int i = endrow-1; i >= startrow+1; i--) {
//                 if (startcol==endcol)
//                 {
//                     break;
//                 }
//                 System.out.print(matrix[i][startcol]);

//             }
//             startrow++;
//             startcol--;
//             endrow--;
//             endcol--;

//         }

//     }

//     public static void main(String args[]) {
//         int matrix[][] = { { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 } };

//         reverse(matrix);

//     }
// }

class sprialmatrix {
    public static void sprial(int arr[][]) {
        int sr = 0;
        int sc = 0;
        int er = arr.length - 1;
        int ec = arr[0].length - 1;

        while (sr <= er && sc <= ec) {
            // top
            for (int j = sc; j <= ec; j++) {
                System.out.print(arr[sr][j] + " ");
            }
            // right
            for (int i = sr+1; i <= er; i++) {
                System.out.print(arr[i][ec] + " ");
            }
            // bottom
            for (int j = ec - 1; j >= sc; j--) {
                System.out.print(arr[er][j] + " ");
            }
            // left
            for (int i = er - 1; i >= sr + 1; i--) {
                System.out.print(arr[i][sc] + " ");
            }
            sr++;
            sc++;
            er--;
            ec--;
        }

    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        sprial(arr);
    }
}