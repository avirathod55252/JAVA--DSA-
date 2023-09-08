public class reversepair {

    public static void printparisarray(int nums[]) {

        int n = nums.length;
        for (int i = n; i >=0; i--) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print( nums[i] + "," + nums[j] );
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1,3,2,3,1};
        printparisarray(arr);
    }
}
