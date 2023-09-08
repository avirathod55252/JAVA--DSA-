// public class pairsinarray {
//     public static void printparisarray(int nums[])
//     {

//         int tp =0;
//         int sum=0;
//         for (int i=0;i<nums.length;i++)
//         {

//             for(int j=i+1;j<nums.length;j++)
//             {
//                 //System.out.print("("+nums[i]+","+nums[j]+")");
//                 System.out.print("("+nums[i]+","+nums[j]+")");
//                 sum= nums[i]+nums[j];

//             }
//             tp++;
//             System.out.println();
//         }

//         System.out.println("total Pairs: "+tp);
//         System.out.println("sum: "+sum);
//     }
//     public static void main (String args[])
//     {
//         int arr[]={3,2,4,1,6,5};
//         printparisarray(arr);

//     }
// }
class pairsinarray {
    public static void paris(int nums[]) {
        int tp = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + nums[i] + "," + nums[j] +")");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 5 };
        paris(arr);

    }
}
