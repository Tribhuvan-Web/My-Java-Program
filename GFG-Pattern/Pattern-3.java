//Increasing number pyramid

import java.util.Scanner;

class p3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lines you want to print ?");
        int noOfLines = sc.nextInt();
        for (int i = 1; i < noOfLines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}