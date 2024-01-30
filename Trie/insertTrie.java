
public class insertTrie {
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

  public static void insert(String words) {
    Node curr = root;
    for (int l = 0; l < words.length(); l++) {
      int idx = words.charAt(l) - 'a';
      if (curr.children[idx] == null) {
        curr.children[idx] = new Node();
      }
      curr = curr.children[idx];
    }
    curr.eow = true;
  }

  public static void main(String args[]) {
    String Words[] = { "thee", "the", "there", "any", "thier" };
    for (int i = 0; i < Words.length; i++) {
      insert(Words[i]);
    }
    // insert(Words);
    for (int i = 0; i < Words.length; i++) {
      System.out.println(Words[i]);
    }
  }
}
