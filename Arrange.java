import java.io.*;

class Arrange {

    static void reorder(int value[], int index[]) {
        int i, j;
        int len = value.length;
        int temp[] = new int[len];

        for (i = 0; i < value.length; i++) {
            temp[index[i]] = value[i];
        }
        System.out.println("reordered array is:");
        for (j = 0; j < len; j++) {
            System.out.println(temp[j]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input size of value array");
        int n = Integer.parseInt(br.readLine());
        int value[] = new int[n];
        int index[] = new int[n];
        int i;
        System.out.println("Input value for value array");
        for (i = 0; i < n; i++) {
            value[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Input value for index array");
        for (i = 0; i < n; i++) {
            index[i] = Integer.parseInt(br.readLine());
        }

        reorder(value, index);

    }
}