// Java program to find the palindrome 

import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.println("Enter a number you want to find is is palindrome : ");
                int number = sc.nextInt();
                int revNum = 0, temp = number;
                while (temp > 0) {
                    int rem = temp % 10;
                    revNum = revNum * 10 + rem;
                    temp = temp / 10;
                }
                if (number == revNum) {
                    System.out.println(number + " is a palindrome number. ");
                } else {
                    System.out.println(number + " is not a palindrome number. ");
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Enter a valid input.");
            }
        }
    }
}