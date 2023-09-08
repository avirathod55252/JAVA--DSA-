public class FirstOccurence {

    // first and last occurence

    public static int firstoccu(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }
        return firstoccu(arr, key, i + 1);
    }

    public static int lastoccurence(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        int isfound = lastoccurence(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;

    }

    

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 6, 7, 9 };
        System.out.print(firstoccu(arr, 4, 0));
        System.out.print(lastoccurence(arr, 4, 0));

    }
}
