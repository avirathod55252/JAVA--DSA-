public class Suminmatrix {
    
        public  static int matrixSum(int[][] nums) {
            
            int startrow = 0;
            int startcol=0;
            int endrow=nums.length-1;
            int endcol=nums[0].length-1;
            int largest=0;
            int sum=0;
            
            
                for (int i = startrow;i<=endrow;i++)
                {
                    if (nums[i][startcol]>largest)
                    {
                        largest=nums[i][startcol];
                       
                    }
                }
                startcol++;
 
            
            sum+=largest;
             
            return sum;
            
        }
        public static void main (String args[])
        {
            int arr[][]= { {7,2,1},{6,4,2},{6,5,3},{3,2,1}};
            matrixSum(arr);
            for (int i=0;i<arr.length-1;i++)
            {
               for (int j=0;j<arr.length-1;j++)
               {
                System.out.print(arr[i][j]);
               }
            }
        }
    
}
