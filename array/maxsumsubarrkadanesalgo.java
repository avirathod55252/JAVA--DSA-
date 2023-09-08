class maxsumsubarrkadanesalgo 
{
    public static int  printmaxsum(int nums[])
    {
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        for (int i=1;i<nums.length;i++)
        {
             currentsum+=nums[i];
             maxsum= Math.max(currentsum,maxsum);
             if (currentsum<0)
             {
                currentsum=1;
             }
        }
        return maxsum;

    }
    public static void main (String args[])
    {
        int arr[]={2,2,2,2,2};
        System.out.print(printmaxsum(arr));
    }
}