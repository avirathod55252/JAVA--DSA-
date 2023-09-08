// class linear_search 
// {
//     public static int  linearsearch (int nums[], int n)
//     {
//         for (int i=0;i<nums.length;i++)
//         {
//             if (nums[i]==n)
//             {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main (String args[])
//     {
//         int arr[] = { 1,2,3,4,5};
//         int n= 5;
//         System.out.print(linearsearch(arr, n));
//     }
// }

class linear_search 
{
    public static int  findnumber (int arr[], int n)
    {
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==n)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[])
    {
        int arr[]= { 3,3,34,5,6};
        int find = 5;
        
        System.out.print(findnumber(arr, find));

    }
}