// public class countsetbits {

//     //  goolgle , amazon pyq 

//     public static int countbits(int n) {
//         int count = 0;
//         while (n > 0) {
//             if ((n & 1) != 0) {
//                 count++;
//             }
//             n =n >> 1;

//         }
//         return count;
//     }

//     public static void main(String args[]) {

//         System.out.println(countbits(10));
//     }
// }

class countsetbits {
    public static int countsetbit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String args[]) {

        int n = 10;
        System.out.print(countsetbit(n));

    }
}
