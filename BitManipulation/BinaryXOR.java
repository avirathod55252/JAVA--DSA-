
public class BinaryXOR {
    public static void main (String args[])
    {

        int a = 8; // 101
        int b = 20;//  110
        // a^b  = 011  ans = 3
        int arr[]= new int [b];
        int sumxor=0;
        int max = 0;
        for(int i=8;i<=20;i++)
        {
            sumxor^=arr[i];
            max = Math.max(sumxor,max);
        }
        System.out.println(max);
        
    }
}
