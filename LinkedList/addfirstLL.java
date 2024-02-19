import java.util.LinkedList;

public class addfirstLL {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void addFirst(int data) {

    // create a new node
    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
      return;
    }
    // step 2 : next =head;
    newNode.next = head;
    // step 3 : head ==newNode
    head = newNode;
  }

  public static void main(String args[]) {
    addfirstLL ll = new addfirstLL();
    ll.addFirst(1);
    ll.addFirst(2);

  }
}
