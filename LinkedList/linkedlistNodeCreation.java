import java.util.LinkedList;

public class linkedlistNodeCreation {

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

  public void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public void print() {

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");

  }

  public static void main(String args[]) {
    linkedlistNodeCreation ll = new linkedlistNodeCreation();
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(3);
    ll.addFirst(4);
    ll.print();

  }
}
