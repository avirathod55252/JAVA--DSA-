// public class swap {
//     public static void main(String args[]) {
//         // swap without usign third variable

//         int x = 2; // 010
//         int y = 3;// 011
//                   // ^ 001 ans is 1
//         System.out.println(x ^ y);
//         // x = x + y;// 15
//         // y = x - y;// 10-5=5
//         // x = x - y;// 15-5=10
//         // System.out.println(x + " " + y);

//         x = x ^ y;
//         y = x ^ y;
//         x = x ^ y;
//         System.out.println(x + " " + y);

//     }
// }

class swap {
    public static void main(String args[]) {
        int a = 5;
        int b = 10;

        // first method
        int temp = a;
        a = b;
        b = temp;
        System.out.print(a + " ");
        System.out.println(b);

        System.out.println("Second method");
        // second method :
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print(a + " ");
        System.out.print(b);

        System.out.println();
        // third method
        System.out.println("Third method ");

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.print(a + " ");
        System.out.print(b);
    }
}