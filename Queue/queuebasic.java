import java.util.*;

public class queuebasic {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isempty
        public boolean isEmpty() {

            return rear == -1;
        }

        // add
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("queue is fulled");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;

        }

        // remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String args[]) {
        // Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while (!q.isEmpty()) {

        // System.out.print(q.peek());
        // q.remove();
        // }
        // Queue q = new Queue(5);
        // q.add(3);
        // q.add(5);
        // q.add(7);

        // while (!q.isEmpty()) {

        // System.out.println(q.peek());
        // q.remove();
        // }

    }
}
