public class StringBuilder {
    public StringBuilder(String string) {
    }

    public static void main (String args[])
    {
        StringBuffer sb = new StringBuffer();
        for (char  ch ='a';ch<='z';ch++)
        {
            sb.append(ch);
        }
        System.out.println(sb);
    }

    public void append(char curr) {
    }

    
}

