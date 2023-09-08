public class problem1 {
    public static void decorder (int n)
    {
        if (n==1)
        {
            System.out.print(n);
            return ;

        }
        System.out.print(n);
        decorder(n-1);
       
    }
    public static void main (String args[])
    {
        // Decreasing Order 
        int n = 5 ;
       decorder(n);
    }
}
