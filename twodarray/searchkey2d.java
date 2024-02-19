// import java.util.*;
// public class searchkey2d {

//     public static void search (int matrix [][],int key)
//     {
//         for (int i=0;i<matrix.length;i++)
//         {
//             for (int j=0;j<matrix[0].length;j++)
//             {
//                 if (matrix[i][j]<key)
//                 {
//                     key=matrix[i][j];

//                 }
//             }
//         }
//         // System.out.print("larges= "+key);
//         System.out.print("SMALL = "+key);

//     }
//     public static void main (String args[])
//     {
//         int matrix[][]= new int [3][3];
//         int n = matrix.length;
//         int m = matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for (int i=0;i<n;i++)
//         {
//             for (int j=0;j<m;j++)
//             {
//                 matrix[i][j]= sc.nextInt();
//             }
//         }
//         for (int i=0;i<n;i++)
//         {
//             for (int j=0;j<m;j++)
//             {
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//         int key =Integer.MAX_VALUE;
//         search(matrix , key);
//     }
// }
import java.util.*;

class searchkey2d {

    public static int largest(int nums[][]) {
        int matrix[][] = new int[nums.length][nums.length];
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j][i] == -1) {
                    if (large < nums[j][i]) {
                        large = nums[j][i];
                    }
                }
            }
        }
        return large;
    }

    public static void main(String args[]) {
        // int arr[][] = new int[3][3];
        int arr[][] = { { 1, 2, -1 }, { 4, -1, 6 }, { 7, 8, 9 } };

        // int n = arr.length;
        // int m = arr[0].length;
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }
        System.out.print(largest(arr));
        // int largest = largest(arr);
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // if (arr[j][i] == -1) {
        // arr[j][i] = largest;
        // }
        // }
        // }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
//
