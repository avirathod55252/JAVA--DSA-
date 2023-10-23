import java.util.ArrayList;
import java.util.*;

public class stacklist {
    // static class Stack {
    // static ArrayList<Integer> list = new ArrayList<>();

    // public static boolean isEmpty() {
    // return list.size() == 0;
    // }

    // // add
    // public static void push(int data) {
    // list.add(data);
    // }

    // // pop
    // public static int pop() {
    // int top = list.get(list.size() - 1);
    // list.remove(list.size() - 1);
    // return top;
    // }

    // // peek
    // public static int peek() {
    // return list.get(list.size() - 1);
    // }
    // }

    // Push at bottom :

    // public static void pushatbottom(Stack<Integer> s, int data) {
    // if (s.isEmpty()) {
    // s.push(data);
    // return;
    // }
    // int top = s.pop();
    // pushatbottom(s, data);
    // s.push(top);
    // }

    public static String reverse(String str) {

        Stack<Character> s = new Stack<>();
        int index = 0;
        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();

    }

    public static void main(String args[]) {

        // Stack s = new Stack();
        // s.push(3);
        // s.push(4);
        // s.push(5);
        // while (!s.isEmpty()) {
        // System.out.println(s.peek());
        // s.pop();
        // }

        // Stack using java c f

        // Stack<Integer> s = new Stack();

        // s.push(2);
        // s.push(3);
        // s.push(4);
        // pushatbottom(s, 8);
        // while (!s.isEmpty()) {
        // System.out.println(s.peek());
        // s.pop();
        // }

        
        String str = "avinash";
        String result = reverse(str);
        System.out.println(result);

    }
}
