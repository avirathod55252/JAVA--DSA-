import java.util.*;

class javaasign {

    public static int large(int arr[]) {
        int large = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < large) {
                large = arr[i];
            }
        }
        return large;
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.print(large(arr));

    }

}
