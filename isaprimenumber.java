
// A java program to find the given number is prime or not
import java.util.*;

class prime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                int flag = 0;
                System.out.println("Enter a number :");
                int num = sc.nextInt();
                if (num == 0 || num == 1) {
                    System.out.println(num + " is not a prime number. ");
                } else {
                    for (int i = 2; i < num / 2; i++) {
                        if (num % 2 == 0) {
                            System.out.println(num + " is not a prime number. ");
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.println(num + " is a prime number. ");
                    }
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Enter a valid input");
            }
        }

    }
}