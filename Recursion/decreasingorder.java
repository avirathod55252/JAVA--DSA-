// class decreasingorder 
// {
//     public static void dec (int n)
//     {
//         if (n==1)// base case
//         {
//             System.out.print(n + " ");
//             return ;
//         }
//         System.out.print(n + " ");
//         dec(n-1);

//     }
//     public static void main (String args[])
//     {
//         int n = 10;
//          dec(n);
//     }
// }
class decreasingorder {
    public static void   desc (int n ) 
    {
        if (n==1)
        {
           System.out.println(n);
           return;
        }
        System.out.println(n);
        desc(n-1);
    }
    public static void main(String args[]) {

        int n = 5;
        desc(n);
    }
}