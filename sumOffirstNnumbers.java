// Java program to find the sum of first N number

import java.util.*;

class sum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.println("Enter a value :");
                int n = sc.nextInt();
                int sum = (n * (n + 1) / 2);
                System.out.println("The sum of first " + n + " number is " + sum);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Enter a valid input ");
            }
        }
    }
}
