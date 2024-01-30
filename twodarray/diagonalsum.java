public class diagonalsum {
    public static int sum(int arr[][]) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            sum2 += arr[i][arr.length - 1 - i];
        }
        return sum - sum2;  
    }

    public static void main(String args[]) {
        // int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
        // 15, 16 } };
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.print(sum(arr));
    }
}
