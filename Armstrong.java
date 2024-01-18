// Java program for finding the number is armstrong 

import java.util.Scanner;

class armstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.println("Enter the number to find :");
                int num = sc.nextInt();
                System.out.println("Is armStrong number : " + isArmStrong(num));
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Enter a valid input.");
            }
        }
    }

    static boolean isArmStrong(int n) {
        int digits = 0, temp = n, sum = 0;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum = (int) (sum + Math.pow(lastDigit, digits));
            temp = temp / 10;
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}