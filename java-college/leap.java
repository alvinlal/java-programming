
// 10. Write a program to check leap year or not.
import java.io.*;

public class leap {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Input the year: ");
            int year = Integer.parseInt(br.readLine());

            if (((year % 4) == 0) && (((year % 100) != 0) || (year % 400 == 0))) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        } catch (Exception e) {
        }
    }
}
