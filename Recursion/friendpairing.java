class friendpairing {
    public static int pair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int fnm1 = pair(n - 1);
        int fnm2 = pair(n - 2);

        int pairways = (n - 1) * fnm2;
        int totways = pairways + fnm1;
        
        return totways;
    }

    public static void main(String args[]) {
        int n = 3;
        System.out.print(pair(n));

    }
}