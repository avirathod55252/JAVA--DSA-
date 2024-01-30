import java.util.*;

public class DequeImplementation {
    public static void main(String args[]) {

        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);// 1
        deque.addFirst(2);// 2 1
        deque.addFirst(8);
        
        System.out.println(deque);
        deque.addLast(3);
        System.out.println(deque); // 213

        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);

        System.out.println("first element is " + deque.getFirst());
        System.out.println("last element is " + deque.getLast());

    }
}
