// 2. Write a program to find factorial of a number using for loop

public class q2 {
    public static void main(String args[]) {
        int fact = 1;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of 10 is " + fact);
    }
}
