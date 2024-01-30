public class beautifulinterger {
    public static int numberOfBeautifulIntegers(int low, int high, int k) {

        int i = 0, count = 0;
        while (low < high) {
            if (low % k == 0) {
                int x = low / 10;
                int y = low / 10;
                if (x % 2 == 0 && y % 2 == 1) {
                    count++;
                }
            }

        }
        return count;

    }

    public static void main(String args[]) {
        int low = 10, high = 20, k = 3;
        System.out.print(numberOfBeautifulIntegers(low, high, k));
    }
}
