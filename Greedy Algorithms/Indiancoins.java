import java.util.Comparator;
import java.util.*;

class Indiancoins {
    public static void main(String args[]) {
        Integer coins[] = { 200, 100 };
        Arrays.sort(coins, Comparator.reverseOrder());
        int countofcoins = 0;
        int amount = 500;
        ArrayList<Integer> coin = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countofcoins++;
                    coin.add(coins[i]);
                    amount-=coins[i];
                }
            }

        }
        for (int i = 0; i < coin.size(); i++) {
            System.out.print(coin.get(i) + " ");
        }
        System.out.println();
        System.out.println( "Total count of coins:= " + countofcoins);
    }
}