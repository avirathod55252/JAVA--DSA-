
public class workbreakpb {
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

  public static boolean search(String k) {
    Node curr = root;
    for (int l = 0; l < k.length(); l++) {
      int idx = k.charAt(l) - 'a';
      if (curr.children[idx] == null) {
        return false;
      }
      curr = curr.children[idx];
    }
    return curr.eow = true;
  }

  public static boolean wordbreak(String key) {
    if (key.length() == 0) {
      return true;
    }
    for (int i = 1; i <= key.length(); i++) {
      if (search(key.substring(0, i)) && wordbreak(key.substring(i))) {
        return true;
      }
    }
    return false;
  }

  public static void main(String args[]) {
    String Words[] = { "i", "like", "sam", "samsung", "mobile" };
    for (int i = 0; i < Words.length; i++) {
      insert(Words[i]);
    }
    // // insert(Words);
    // for (int i = 0; i < Words.length; i++) {
    // System.out.println(Words[i]);
    // }
    // // search trie:

    // System.out.println(search("thee"));
    // System.out.println(search("then"));

    String ke = "ilikesamsug";
    System.out.println(wordbreak(ke));

  }
}
