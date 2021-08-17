import java.io.*;

class RotateArray {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, i, j = 0, k;
        System.out.println("Input value for n and k");
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        int ar[] = new int[n];

        System.out.println("Input elemnts in array");
        for (i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(br.readLine());
        }
        while (j < k) {

            int temp = ar[0];
            for (i = 1; i < n; i++) {
                ar[i - 1] = ar[i];
            }
            ar[n - 1] = temp;
            for (i = 0; i < n; i++) {

                System.out.print(ar[i] + " ");

            }
            j++;
            System.out.println();
        }
    }
}