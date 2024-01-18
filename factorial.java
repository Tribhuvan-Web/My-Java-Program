// Java program to find the factorial

import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.println("Enter the number : ");
                int num = sc.nextInt();
                int factorial = factorial1(num);
                System.out.println("factorial of " + num + " is " + factorial);

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Enter a valid input ");
            }
        }
    }

    static int factorial1(int n) {
        if (n == 1) {
            return 1;

        }
        return n * factorial1(n - 1);
    }
}