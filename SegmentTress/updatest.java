class updatest {
  static int tree[];

  public static void init(int n) {
    tree = new int[4 * n];
  }

  public static int buildSt(int arr[], int i, int si, int sj) {

    if (si == sj) {
      tree[i] = arr[si];
      return tree[si];
    }
    int mid = (si + sj) / 2;
    buildSt(arr, 2 * i + 1, si, mid);
    buildSt(arr, 2 * i + 2, mid + 1, sj);
    tree[i] = tree[2 * i + 1] + tree[2 * i + 2];
    return tree[i];

  }

  public static int getsumUtil(int arr[], int i, int si, int sj, int qi, int qj) {

    if (qj <= si || qi >= sj) {
      return 0;
    } else if (si >= qi && sj <= qj) {
      return tree[i];
    } else {
      int mid = (si + sj) / 2;
      int left = getsumUtil(arr, 2 * i + 1, si, mid, qi, qj);
      int right = getsumUtil(arr, 2 * i + 2, mid + 1, sj, qi, qj);
      return left + right;
    }
  }

  public static int getSum(int arr[], int qi, int qj) {
    int n = arr.length;
    return getsumUtil(arr, 0, 0, n - 1, qi, qj);
  }

  public static void updateUtil(int i, int si, int sj, int idx, int diff) {

    if (idx > sj || idx < si) {
      return;
    }
    tree[i] += diff;
    if (si != sj) { // non-leaf
      int mid = (si + sj) / 2;
      updateUtil(2 * i + 1, si, mid, idx, diff);
      updateUtil(2 * i + 2, mid + 1, sj, idx, diff);

    }
  }

  public static void update(int arr[], int idx, int newval) {
    int n = arr.length;
    int diff = newval - arr[idx];
    arr[idx] = newval;
    updateUtil(0, 0, n - 1, idx, diff);

  }

  public static void main(String args[]) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int n = arr.length;
    init(n);
    buildSt(arr, 0, 0, n - 1);
    // for (int i = 0; i < tree.length; i++) {
    // System.out.print(tree[i] + " ");
    // }
    System.out.println(getSum(arr, 2, 5));
    update(arr, 2, 2);
    System.out.println(getSum(arr, 2, 5));
  }
}