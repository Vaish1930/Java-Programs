import java.io.*;

class MissingElemnt {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, i;
        n = Integer.parseInt(br.readLine());
        int ar[] = new int[n];
        int a[] = new int[n];
        System.out.println("Input elemnts in array");
        for (i = 0; i < n - 1; i++) {
            ar[i] = Integer.parseInt(br.readLine());
        }
        for (i = 1; i < n; i++) {
            a[i] = 0;
        }
        for (i = 1; i < n - 1; i++) {
            int x = ar[i];
            a[x] = 1;
        }
        for (i = 1; i < n; i++) {
            if (a[i] == 0) {
                System.out.print("Mising-Number" + i);
            }
        }
    }
}