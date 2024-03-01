public class UppercasetoLowercase {
  public static void main(String args[]) {
    int a = 97;
    for (char ch = 'A'; ch <= 'Z'; ch++) {
      // System.out.println((char) (ch | ' '));

      char lowercaseChar = Character.toLowerCase(ch);
      System.out.print(lowercaseChar);

    }

    // a to z = 97 to 122
    // A TO Z = 65 to 90
    // " " space is 32
    // Binary representation of 'A' (65): 01000001
    // Binary representation of space (' ') (32): 00100000
    // Bitwise OR operation: 01000001
    // | 00100000
    // =01100001
    // 6432168421
    // 97 - a

  }
}
