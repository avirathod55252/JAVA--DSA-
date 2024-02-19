import java.util.Arrays;

class countPrefixandSuffix {

  public static int countps(String[] words) {
    int count = 0;
    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {
        if (preandsuffix(words[i], words[j])) {
          count += 1;
        }
      }
    }
    return count;
  }

  private static boolean preandsuffix(String str1, String str2) {
    if (str1.length() >= str2.length()) {
      return false;
    }
    if (str1.length() == str2.length()) {
      return true;
    }

    return str2.startsWith(str1) && str2.endsWith(str1);
  }

  public static void main(String args[]) {
    String words[] = { "a", "aba", "ababa", "aa" };
    String wordss[] = { "bb", "bb" };

    System.out.print(countps(wordss));
  }
}