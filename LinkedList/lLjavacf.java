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

    }
}
