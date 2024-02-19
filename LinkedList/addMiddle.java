class addMiddle {

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
  public static int size;

  public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public void add(int idx, int data) {
    if (idx == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;
    while (i < idx - 1) {
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data);
      temp = temp.next;
    }
    System.out.print("null");
  }

  public int removeFirst() {
    if (size == 0) {
      System.out.println("LL is Empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    int val = head.data;
    head = head.next;
    return val;
  }

  public static void main(String args[]) {
    addMiddle ad = new addMiddle();
    ad.addFirst(1);
    ad.addFirst(2);
    ad.addLast(4);
    ad.add(1, 9);
    ad.print();
    System.out.println();
    ad.removeFirst();
    System.out.print(ad.size);
    ad.print();

  }
}
