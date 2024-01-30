public class StringBuilder {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }

}
