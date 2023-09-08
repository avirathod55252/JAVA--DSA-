import java.util.Scanner;

public class twodarr {

    public static boolean search (int matrix[][], int key)
    {
        for (int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[0].length;j++)
            {
                if (matrix[i][j]==key)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner( System.in);
        int arr[][] = new int [3][3];
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[0].length;j++)
            {
                arr[i][j]= sc.nextInt();
            }
            
        }
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[0].length;j++)
            {
               System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
            
        }
        System.out.print(search(arr, 66));
        
    }
}
