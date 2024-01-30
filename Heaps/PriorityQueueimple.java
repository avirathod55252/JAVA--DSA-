// import java.util.Comparator;
// import java.util.PriorityQueue;

// public class PriorityQueueimple {

//   public static void main(String args[]) {

//     PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//     pq.add(3);
//     pq.add(4);
//     pq.add(1);
//     pq.add(7); // O(logn )

//     while (!pq.isEmpty()) {
//       System.out.println(pq.peek()); // O(1)
//       pq.remove();// O(logn ) output: 1, 3, 4l 7 default ascending order :
//       // want to desc order then use Comaparator .reverserOrder()
//     }

//   }

// }

import java.util.Comparator;
import java.util.PriorityQueue;

class PriorityQueueimple {
  public static void main(String args[]) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    pq.add(2);
    pq.add(1);
    pq.add(1);
    pq.add(5);
    pq.add(3);
    while (!pq.isEmpty()) {
      System.out.println(pq.peek());
      pq.remove();
    }
  }
}