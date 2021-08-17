
class MaxProduct {
    public static void main(String args[]) {
        int ar[] = { 6, -3, -10, 0, 2 };
        int ma = ar[0];
        int mi = ar[0];
        int prod = ar[0];

        for (int i = 1; i < 5; i++) {
            if (ar[i] < 0) {
                int t = mi;
                mi = ma;
                ma = t;
            }

            ma = Math.max((int) ar[i], ma * ar[i]);
            mi = Math.min((int) ar[i], mi * ar[i]);

            if (ma > prod)
                prod = ma;
        }
        System.out.print(prod);
        System.out.print(mi);
    }
}