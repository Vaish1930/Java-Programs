class RowWiseSorting {

    static int sortRowWise(int m[][]) {
        int i, j, k;
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                for (k = 0; k < m[i].length - j - 1; k++) {
                    int t = m[i][k];
                    m[i][k] = m[i][k + 1];
                    m[i][k + 1] = t;
                }
            }
        }

        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }

        return 0;
    }

    public static void main(String args[]) {
        int m[][] = { { 9, 8, 7, 1 }, { 7, 3, 0, 2 }, { 9, 5, 3, 2 }, { 6, 3, 1, 2 } };
        sortRowWise(m);
    }
}
