// 11b. Write a program to demonstrate method overloading.

import java.io.*;

class q11b {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1-Volume of cube");
            System.out.println("2-Volume of cylinder");
            System.out.println("3-Volume of rectangle");
            System.out.println("_______________________________");
            System.out.println("Enter the choice");

            int ch = Integer.parseInt(br.readLine());
            shape s = new shape();
            switch (ch) {
                case 1:
                    s.volume(10);
                    break;
                case 2:
                    s.volume(5, 10);
                    break;
                case 3:
                    s.volume(2, 5, 10);
                    break;
                default:
                    System.out.println("Wrong choice::");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class shape {
    void volume(int a) {
        System.out.println("Volume of cube is=" + (a * a * a));
    }

    void volume(int r, int h) {
        System.out.println("Volume of cylinder is=" + 3.14 * (r * r * h));
    }

    void volume(int l, int w, int d) {
        System.out.println("Volume of rectangle is=" + (l * w * d));
    }
}
