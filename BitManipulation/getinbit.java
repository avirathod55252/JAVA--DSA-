
public class getinbit {
    public static int getinbit(int n, int i)
    {
        int bitmask= 1<<i;
        if ((n&bitmask)==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }

    }
    public static void main (String args[])
    {
        int n = 12;
        int i=0;    
         System.out.print(getinbit(n,i));
    }
}
