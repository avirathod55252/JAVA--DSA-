import java.util.*;
class longestConsecutivesequnce{

public static int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }

        Arrays.sort(nums);
        int ans = 1;
        int prev = nums[0];
        int cur = 1;

        for(int i = 1;i < nums.length;i++){
            if(nums[i] == prev+1){
                cur++;  
            }
            else if(nums[i] != prev){
                cur = 1;
            }
            prev = nums[i];
            ans = Math.max(ans, cur);
        }
        return ans;
    }
    public static void main(String args[])
    {
        int arr[]={100,200,1,2,3,4};
        int lon=longestConsecutive(arr);
        System.out.println("The longest consecutive sequence is "+lon);

    }
}
// import java.util.*;

// class longestConsecutivesequnce {
//     public static int longest(int nums[])
//     {
        
//         if (nums.length==0)
//         return 0;
//         int max =1;
//         int count=1;
//         Arrays.sort(nums);
//         for (int i=0;i<nums.length-1;i++)
//         {
//             if (nums[i]+1==nums[i+1])
//             {
//                 count++;
//                 max= Math.max(count,max);
//             }
//             else if (nums[i]==nums[i+1])
//             {
//                 continue;
//             }
//               else 
//               {
//                 count=1;
//               }
//         }
//         return max;


//     }

//     public static void main(String args[]) {
//         int arr[] = { 100, 200, 1, 2, 3, 4 };
        
//         System.out.print(longest(arr));
//     }
// }