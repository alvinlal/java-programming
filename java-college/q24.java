// 24. Write a program to find the sum and average of n numbers using array.

import java.io.*;

public class q24 {
    public static void main(String args[]) {
        int n, i, sum = 0;
        float avg;
        System.out.println("Enter the number of elements");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            n = Integer.parseInt(br.readLine());
            int a[] = new int[n];
            System.out.println("Enter the elements");
            for (i = 0; i < n; i++) {
                a[i] = Integer.parseInt(br.readLine());
                sum = sum + a[i];
            }
            avg = sum / n;
            System.out.println("The sum is " + sum);
            System.out.println("The average is " + avg);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
