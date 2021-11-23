// 3. Write a program to find the square of a number by getting input from the user.

import java.io.*;

public class q3 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number:");
            int n = Integer.parseInt(br.readLine());
            System.out.println("Square is:" + n * n);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
