import java.util.*;

class Minabsdiff {
    public static void main(String args[]) {
        
        int a[] = { 1, 2, 3 };
        int b[] = { 2, 1, 3 };
        Arrays.sort(a);
        Arrays.sort(b);

        int x = 0;
        for (int i = 0; i < a.length; i++) {
            x += Math.abs(a[i] - b[i]);
        }
        System.out.println(x);
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        System.out.println(number);
        
        System.out.println();


    }
}