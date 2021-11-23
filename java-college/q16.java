
// 16. find the reverse of a number
import java.io.*;

class q16 {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a no:");
            int n = Integer.parseInt(br.readLine());
            int reverse = 0, r;
            while (n != 0) {
                r = n % 10;
                reverse = reverse * 10 + r;
                n = n / 10;
            }
            System.out.println("Reverse of a no=" + reverse);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
