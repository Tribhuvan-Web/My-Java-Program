//Number Triangular

import java.util.Scanner;

class p2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfLines = sc.nextInt();
        for (int i = 0; i < noOfLines; i++) {
            for (int j = 0; j < noOfLines - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}