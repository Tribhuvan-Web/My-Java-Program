// java program for fibonacci series

import java.util.Scanner;

class fseries {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.println("Enter the length of the Fibonacci series.");
                int n = sc.nextInt(), firstNum = 0, secNum = 1, nextNum;
                System.out.println("The series are :");
                for (int i = 0; i <= n; i++) {
                    System.out.print(firstNum + ",");
                    nextNum = firstNum + secNum;
                    firstNum = secNum;
                    secNum = nextNum;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}