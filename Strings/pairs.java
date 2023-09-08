public class pairs {
    public static void printPairsArray(String[] nums) {

        int tp = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + nums[i] + "," + nums[j] + ")");
                // Assuming you want to concatenate the string values
                sum = Integer.parseInt(nums[i]) + Integer.parseInt(nums[j]);
            }

            tp++;
            System.out.println();
        }

        System.out.println("Total Pairs: " + tp);
        System.out.println("Sum: " + sum);
    }

    public static void main(String args[]) {
        String[] arr = {"abcdfg"};
        printPairsArray(arr);
    }
}
