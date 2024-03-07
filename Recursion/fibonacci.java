import java.util.*;

public class fibonacci {
    public static int printfibonacci(int n)/// 4
    {
        if (n == 0 || n == 1) {
            return n;
        }
        int fbnm1 = printfibonacci(n - 1);// 3,2,1,
        int fbnm2 = printfibonacci(n - 2);//
        return fbnm1 + fbnm2;
    }

    public static void main(String args[]) {
        int n = 10;
        System.out.println(printfibonacci(n));
        printfibonacci(n);
        for (int i = 0; i < n; i++) {
            System.out.print(printfibonacci(i) + " ");
        }
    }
}
