import java.util.Arrays;
import java.util.StringJoiner;

public class arraytoString {
  public static void s(String arr[]) {

    // String arry = Arrays.toString(arr);
    // for (int i = 0; i < arry.length(); i++) {
    // System.out.println(arry.charAt(i));
    // }
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i]);
    }
    String s = sb.toString();
    System.out.println(s);
  }

  public static void main(String args[]) {

    String arr[] = { "avinash", "avi" };
    String s = Arrays.toString(arr);
    System.out.println(s);
    // String str = "avinash";
    s(arr);
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i]);
    }
    String s2 = sb.toString();
    System.out.println(s2);

    int count = 0;
    String words[] = { "a", "aba", "ababa", "aa" };
    String ss = Arrays.toString(words);
    System.out.print(ss);
    for (int i = 0; i < ss.length(); i++) {
    for (int j = i + 1; j < ss.length(); j++) {
    if (ss.charAt(i) == ss.charAt(j)) {
    count++;
    }
    }


     System.out.print(count);
  }
}
