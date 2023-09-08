public class Digonalsum 
{
    public static int  digonalsum(int arr[][])
    {
        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i==j)
                {
                    sum+=arr[i][j];
                }
                else if(i+j==arr.length-1)
                {
                    sum+=arr[i][j];
                }
            }
        }
        return sum;

    }
    public static void main (String args[])
    {
        int arr[][]={{1,5} ,
                    { 6,2}};
                   System.out.println(  digonalsum(arr));
    }
}