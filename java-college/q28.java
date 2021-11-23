//28. write a program to check whether the matrix is symmetric or not.

import java.io.*;

class q28 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows and columns");
        int r = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int a[][] = new int[r][c];
        System.out.println("Enter the elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("The matrix is");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int flag = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] != a[j][i]) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0)
            System.out.println("The matrix is symmetric");
        else
            System.out.println("The matrix is not symmetric");
    }
}