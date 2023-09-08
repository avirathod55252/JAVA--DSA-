import java.util.*;

public class Remove_Outermost_Parenthesis {

    public static String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' && count++ > 0) {
                sb.append(c);
            }
            if (c == ')' && count-- > 1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));

    }

}
