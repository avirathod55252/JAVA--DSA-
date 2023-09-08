public class lastOccurence {

    public static int lastocc (int arr[] , int key, int i)
    {
        if (i==arr.length-1)
        {
            return -1;
        }
       int isfound=  lastocc(arr, key, i+1);
        if (isfound==-1 && arr[i]==key)
        {
            return i;
        }
        return isfound;

    }
    public static void  main (String args[])
    {
        int arr[]={5,5,5,5};
        System.out.print(lastocc(arr, 5, 0));


    }
}
