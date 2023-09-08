import java.util.*;
public class fibonacci {
    public static int printfibonacci(int n)///4
    {
        if (n==0 || n==1)
        {
            return n ;
        }
        int fbnm1= printfibonacci(n-1);// 3,2,1,
        int fbnm2= printfibonacci(n-2);//
        return fbnm1+fbnm2;
    }

    public static void main (String args[])
    {
        int n = 4; 
        System.out.print(printfibonacci(n));
       
    
    }
}
