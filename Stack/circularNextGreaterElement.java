import java.util.*;

class circularNextGreaterElement {

    public static void main(String args[]) {

        int arr[] = { 1, 2, 1 };
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        // Modify the loop to traverse the circular array twice
        for (int i = 2 * arr.length - 1; i >= 0; i--) {
            int ci = i % arr.length;

            // While loop remains the same
            while (!s.isEmpty() && arr[s.peek()] <= arr[ci]) {
                s.pop();
            }

            // If-else block also remains the same
            if (s.isEmpty()) {
                nxtGreater[ci] = -1;
            } else {
                nxtGreater[ci] = arr[s.peek()];
            }

            s.push(ci);
        }

        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}
