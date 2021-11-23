// 9. Write a program to print fibanacci series

import java.io.*;

class Fibanacci {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("enter limit: ");
            int count = Integer.parseInt(br.readLine());
            int n1 = 0, n2 = 1, n3, i;

            System.out.print(n1 + " " + n2);// printing 0 and 1

            for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
            {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }

        } catch (Exception e) {
        }
    }
}
