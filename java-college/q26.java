//26. Write a program to find the sum of all elements in an array from the terminal 

import java.io.*;

class q26 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements in the array");
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        System.out.println("The sum of all elements in the array is " + sum);
    }
}