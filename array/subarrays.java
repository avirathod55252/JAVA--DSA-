// public class subarrays {
//     public static void printsubarrays(int nums[]) {
//         int currentsum = 0;
//         int maxsum = Integer.MIN_VALUE;

//         for (int i = 0; i < nums.length; i++) {
//             // int start=i;

//             for (int j = i; j < nums.length; j++) {
//                 //  int end = j;
//                 currentsum=0;
//                 for (int k = i; k <= j; k++) {
//                     // System.out.print(nums[k]);
//                     currentsum += nums[k];

//                 }
//                 System.out.print(currentsum);

//                 if (maxsum < currentsum) {
//                     maxsum = currentsum;
//                 }
//                  System.out.println();
//             }
//             // System.out.println();
//         }
//         System.out.print("Maximum sum is "+ maxsum);
//     }

//     public static void main(String args[]) {
//         int arr[] = { 2,4,6,8,10};
//         printsubarrays(arr);

//     }
// }
class subarrays {
    public static void subarr(int arr[]) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                currentsum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    currentsum += arr[k];
                    maxsum = Math.max(maxsum, currentsum);
                }
                System.out.println();
            }

        }
        System.out.println("Maxsum = "+maxsum);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subarr(arr);
    }
}
