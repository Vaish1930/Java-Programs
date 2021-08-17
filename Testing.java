class Testing {
    public static void main(String args[]) {
        String[] ar = { "Apple", "Pineapple", "Orange", "Kiwi" };
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length - i - 1; j++) {
                if ((ar[j].compareTo(ar[j + 1])) > 0) {
                    String temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
