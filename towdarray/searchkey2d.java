// import java.util.*;
// public class searchkey2d {

//     public static void search (int matrix [][],int key)
//     {
//         for (int i=0;i<matrix.length;i++)
//         {
//             for (int j=0;j<matrix[0].length;j++)
//             {
//                 if (matrix[i][j]<key)
//                 {
//                     key=matrix[i][j];
                    
//                 }
//             }
//         }
//         // System.out.print("larges= "+key);
//         System.out.print("SMALL = "+key);

       
        
//     }
//     public static void main (String args[])
//     {
//         int matrix[][]= new int [3][3];
//         int n = matrix.length;
//         int m = matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for (int i=0;i<n;i++)
//         {
//             for (int j=0;j<m;j++)
//             {
//                 matrix[i][j]= sc.nextInt();
//             }
//         }
//         for (int i=0;i<n;i++)
//         {
//             for (int j=0;j<m;j++)
//             {
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//         int key =Integer.MAX_VALUE;
//         search(matrix , key);
//     }
// }
import java.util.*;
class searchkey2d 
{

    public static int largest(int nums[][])
    {
        int large=Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++)
        {
            for (int j=0;j<nums.length;j++)
            {
                if(large>nums[i][j])
                {
                    large=nums[i][j];
                }
            }
        }
        return large;
    }
    public static void main (String args[])
    {
        int arr[][]=new int[3][3];
        int n=arr.length;
        int m=arr[0].length;
        Scanner sc = new Scanner (System.in);
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
      System.out.print(largest(arr));
    }
}
