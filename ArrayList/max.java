import java.util.ArrayList;

// public class max {

//     public static int maxnumber(ArrayList<Integer> list) {
//         int maxx = Integer.MIN_VALUE;
//         for (int i = 0; i < list.size(); i++) {
//             if (list.get(i) > maxx) {
//               //  maxx = list.get(i);
//                 maxx = Math.max (maxx, list.get(i));
//             }
//         }
//         return maxx;
//     }
//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println(maxnumber(list));

//     }
// }
class max {
    public static void main(String args[]) {
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.print(max);
    }
}