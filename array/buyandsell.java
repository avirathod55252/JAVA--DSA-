// public class buyandsell {
//     public static int buyansellprint(int nums[])
//     {
//         int buyprice =Integer.MAX_VALUE;
//         int maxprofit=0;
        
//         for (int i=0;i<nums.length;i++)
//         {
//             if (buyprice<nums[i])
//             {
//                 int profit= nums[i]-buyprice;
//                 maxprofit= Math.max(maxprofit,profit);

//             }
//             else{
//                 buyprice = nums[i];
//             }
//         }
//         return maxprofit;
//     }
//     public static void main (String args[])
//     {
//             int arr[]={ 7,1,5,3,6,4};
//         System.out.println(buyansellprint(arr));
//     }
// }
class buyandshell 
{
    public static int   printbuyandsell(int nums[])
    {
        int n = nums.length;
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i=0;i<n;i++)
        {
            if (buyprice<nums[i])
            {
                int profit = nums[i]-buyprice;
                maxprofit = Math.max(profit,maxprofit);

            }
            else{
                buyprice = nums[i];
            }
        }
        return maxprofit;
    }
    public static void main (String args[])
    {
        int arr [] = {7,1,5,3,6,4};
        System.out.print(printbuyandsell(arr));
    }
}
