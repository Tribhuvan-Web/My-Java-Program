// A java program to reverse the number

import java.util.Scanner;

class rev {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.println("Enter a number you want to reverse.");
                int num = sc.nextInt();
                int temp = 0;
                while (num > 0) {
                    int rem = num % 10;
                    temp = temp * 10 + rem;
                    num = num / 10;
                }
                System.out.println("Reversed number is :" + temp);

            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Enter a valid input");
            }
        }
    }
}