import java.util.*;

public class reversearr {
    public static void rev(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }

    }

    public static void main(String args[]) {
        int arr[] = { 3, 3, 2, 1, 6};
        rev(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
