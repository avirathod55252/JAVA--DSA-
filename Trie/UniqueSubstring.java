public class UniqueSubstring {

  static class Node {
    Node children[] = new Node[26];
    boolean eow = false;

    Node() {
      for (int i = 0; i < 26; i++) {
        children[i] = null;
      }
    }
  }

  public static Node root = new Node();

  public static void insert(String word) {

    Node curr = root;
    for (int i = 0; i < word.length(); i++) {

      int idx = word.charAt(i) - 'a';
      if (curr.children[idx] == null) {

        curr.children[idx] = new Node();
      }
      curr = curr.children[idx];
    }
    curr.eow = true;
  }

  // public static int countOfNodes(Node root) {

  // if (root == null) {
  // return 0;
  // }
  // int count = 0;
  // for (int i = 0; i < 26; i++) {
  // if (root.children[i] != null) {
  // count += countOfNodes(root.children[i]);
  // }
  // }
  // return count + 1;

  // }
  public static int countOfNodes(Node root) {
    Node curr = root;
    if (curr == null) {
      return 0;
    }
    int count = 0;
    for (int i = 0; i < 26; i++) {

      if (curr.children[i] != null) {
        count += countOfNodes(curr.children[i]);
      }
    }
    return count + 1;

  }

  public static void main(String args[]) {

    String str = "ababa";
    String str2 = "apple";

    //
    for (int i = 0; i < str.length(); i++) {
      String suffix = str.substring(i);
      insert(suffix);
    }
    System.out.println(countOfNodes(root));

  }
}
