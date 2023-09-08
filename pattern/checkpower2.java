public class checkpower2 {
    public static Boolean ispoweroftwo(int n )
    {
        return (n&(n-1))==0;
    }
    public static void main (String args [])
    {
    System.out.println(ispoweroftwo(32));
    }
}
