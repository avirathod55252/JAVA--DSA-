public class IterativeSearch {

  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
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
      System.out.print(temp.data);
      temp = temp.next;

    }

    System.out.print("null");
  }

  public int IterativeSearch(int key) {
    Node temp = head;

    int i = 0;
    while (temp != null) {
      if (temp.data == key) {
        return i;
      }
      temp = temp.next;
      i++;
    }
    return -1;
  }

  public static void main(String args[]) {
    IterativeSearch i = new IterativeSearch();
    i.addFirst(1);
    i.addFirst(2);

    i.addLast(5);
    i.addLast(8);

    i.print();
    System.out.println();
    System.out.print(i.IterativeSearch(8));

  }
}
