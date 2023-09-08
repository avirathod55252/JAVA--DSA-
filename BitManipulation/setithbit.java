public class setithbit {
    public static boolean setibit(int n, int k)
    {
        int bitmask= 1<<k;
        if ((n|bitmask)==1)
        {
            return true;
        }
        else 
        return false;
    }
    
    public static void main (String args[])
    {
        int n = 4;
        int k = 2;
        System.out.print( setibit(n, k));

    }
}
