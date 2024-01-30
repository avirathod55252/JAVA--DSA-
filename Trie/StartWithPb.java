public class StartWithPb {

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

  public static void startWithProblem(String s) {

  }

  public static void main(String args[]) {

    String word[] = { "apple", "app", "mango", "man", "woman" };

    String prefix1 = "app";
    String prefix2 = "moon";

  }
}
