public class maxproduct {
    public static int  masproductsubarray(int arr[])
    {
        int maxprod=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                int product=1;
                for (int k=i;k<=j;k++)
                {
                    product*=arr[k];
                    maxprod=Math.max(product,maxprod);
                }
            }
        }
        return maxprod;
    }
    public static void main (String args[])
    {
        int arr[]={1,2,-3,0,-4,-5};
        masproductsubarray(arr);
        System.out.println(masproductsubarray(arr));

    }
}


