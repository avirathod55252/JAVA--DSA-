public class buyandsell {

    public static int sell(int arr[]) {
        int bp = Integer.MAX_VALUE;
        int mp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (bp <= arr[i]) {
                int profit = arr[i] - bp;
                mp = Math.max(profit, mp);
            } else {
                bp = arr[i];
            }
        }
        return mp;
    }

    public static void main(String args[]) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(sell(arr));

    }
}
