// 15. To find the sum of digits in a number

import java.io.*;

public class SumOfDigits {
    public static void main(String args[]) {
        try {
            int digit, sum = 0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number: ");
            int n = Integer.parseInt(br.readLine());
            while (n > 0) {
                // finds the last digit of the given number
                digit = n % 10;
                // adds last digit to the variable sum
                sum = sum + digit;
                // removes the last digit from the number
                n = n / 10;
            }
            // prints the result
            System.out.println("Sum of Digits: " + sum);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
