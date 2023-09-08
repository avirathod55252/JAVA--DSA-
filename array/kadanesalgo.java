public class kadanesalgo {
    public static void kadanes(int arr[])
    {
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            currentsum+=arr[i];
            maxsum=Math.max(currentsum,maxsum);
            if(currentsum<0)
            {
                currentsum=0;
            }
        }
        System.out.println(maxsum);
    }
    public static void main (String args[])
    {
        int arr[]={2,4,6,8,10};
        kadanes(arr);
    }
}
