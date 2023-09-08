// // // public class reversearray {
// // //     public static void  reversearry(int nums[])
// // //     {
// // //         int first =0;
// // //         int last =nums.length-1;
// // //         while (first<last)
// // //         {
// // //             int temp = nums[first];
// // //             nums[first]=nums[last];
// // //             nums[last]=temp;
// // //             first++;
// // //             last--;
// // //         }
       
// // //     }
    
// // //     public static void main (String args[])
// // //     {
// // //         int arr[]={1,2,3,4};
// // //        reversearry(arr); 
// // //        for (int i=0;i<arr.length;i++)
// // //        {
// // //         System.out.print(arr[i]);
// // //        }
// // //     }
// // // }

// // class reversearray 
// // {
// //     public static void reverse(int arr[])
// //     {
// //         int first =0;
// //         int last = arr.length-1;
// //         while (first<last)
// //         {
// //             int temp = arr[first];
// //             arr[first]=arr[last];
// //             arr[last]=temp;
// //             first++;
// //             last--;
// //         }
// //     }
// //     public static void main (String args[])
// //     {
// //         int arr[] ={ 1,2,3,4};
// //         reverse(arr);
// //         for (int i=0;i<arr.length;i++)
// //         {
// //             System.out.print(arr[i]);
// //         }

// //     }
// // }

// class reversearray 
// {
//     public static  void reverse(int arr[])
//     {
//         int first=0;
//         int last=arr.length-1;
//         while (first<last)
//         {
//             int temp=arr[first];
//             arr[first]=arr[last];
//             arr[last]=temp;
//             first++;
//             last--;
//         }
//     }
//     public static void main (String args[])
//     {
//         int arr[] ={2,3,4};
//         reverse(arr);
//         for (int i=0;i<arr.length;i++)
//         {
//             System.out.print(arr[i]);
//         }


//     }
// }


public class reversearray 
{
    public static void  reverse (int nums[])
    {
        int first=0;
        int last= nums.length-1;
        while (first<last)
        {
            int temp=nums[first];
            nums[first]=nums[last];
            nums[last]=temp;
            first++;
            last--;
        }

    }
    public static void main (String args[])
    {
        int arr[]= {2,3,4};
        reverse(arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }



    }
}

