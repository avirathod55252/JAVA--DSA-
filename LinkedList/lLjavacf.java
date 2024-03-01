import java.util.*;

public class lLjavacf {

    public static void main(String args[]) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(5);

        System.out.println(ll);

        // System.out.println(ll.removeFirst());
        // System.out.println(ll.removeLast());
        ll.removeFirst();
        // remove last
        ll.removeLast();

        System.out.println(ll);

        System.out.println();

        for (int i = 0; i <= 5; i++) {

            for (int j = 5; j >= i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        for (int i = 5; i >= 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        int alph = 65;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alph + i));
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {

                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
