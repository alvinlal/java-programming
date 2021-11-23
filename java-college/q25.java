// 25. Write a program to binary sort a set of n numbers using BufferedReader
// (don't use built-in binary sort).

import java.io.*;

class q25 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (temp[j] > temp[j + 1]) {
                    int temp1 = temp[j];
                    temp[j] = temp[j + 1];
                    temp[j + 1] = temp1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(temp[i]);
        }
    }
}
