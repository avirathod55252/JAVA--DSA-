// class evenodd {
//     public static void oddoreven(int n) {
//         int bitmask = 1; // 4 3 6 5
//         if ((n & bitmask) == 0) { // 100 011 110 101
//                                   // & 001 001 001 001
//                                   // 000 001 000 001
//             System.out.println("Even  Number ");
//         } else {
//             System.out.println("Odd number");
//         }
//     }

//     public static void main(String args[]) {
//         oddoreven(3);
//         oddoreven(4);

//     }
// }
class evenodd {
    public static void main(String args[]) {
        int bitmask = 1;
        int n = 5;
        if ((n & bitmask) == 0) {
            System.out.print("Even number");
        } else {
            System.out.print("Odd number");
        }
    }
}