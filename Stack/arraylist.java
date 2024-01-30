import java.util.Stack;

class arraylist {

    public static void pushatbotttom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbotttom(s, data);
        s.push(top);
    }

    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();

        int index = 0;
        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder sb = new StringBuilder(" ");
        while (!s.isEmpty()) {
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }

    public static void stockspan(int stock[], int span[]) {

        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stock.length; i++) {
            int currprice = stock[i];
            while (!s.isEmpty() && currprice >= stock[s.peek()]) {

                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;

            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;

            }
            s.push(i);
        }
    }
    public static boolean validparenthesis(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            // openning
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                if (s.peek() == '(' && ch == ')' ||
                        s.peek() == '{' && ch == '}' ||
                        s.peek() == '[' && ch == ']') {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]) {

        // String avi = "avinash";
        // System.out.println(reverse(avi));

        // int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        // int span[] = new int[stocks.length];
        // stockspan(stocks, span);
        // for (int i = 0; i < span.length; i++) {
        // System.out.println(span[i] + " ");
        // }

        // int arr[] = { 6, 8, 0, 1, 3 };
        // int next[] = new int[arr.length];
        // Stack<Integer> s = new Stack<>();
        // for (int i = arr.length - 1; i >= 0; i--) {
        // while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        // s.pop();
        // }
        // if (s.isEmpty()) {
        // next[i] = -1;
        // } else {
        // next[i] = arr[s.peek()];
        // }
        // s.push(i);
        // }
        // for (int i = 0; i < next.length; i++) {
        // System.out.println(next[i]);
        // }

        String str = "{}[])";
        System.out.println(validparenthesis(str));

    }
}