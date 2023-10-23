import java.util.Stack;

class reversestringusingstack {

    public static String reverse (String str)
    {
        Stack <Character> s = new Stack<>();
        int index =0;
        while (index<str.length())
        {
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder result = new StringBuilder(" ");
        while (!s.isEmpty())
        {
            char top = s.pop();
            result.append(top);
        }
        return result.toString();
    }
    public static void main(String args[]) {
        String str = "avi";
        System.out.print(reverse(str));
    }
}