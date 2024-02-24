//Number increasing reverse pyramid

import java.util.Scanner;

class p4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number of lines you want to print?");
        int noOfLines = sc.nextInt();
        System.out.println("_____________Your loop is ____________");
        System.out.println("");
        for (int i = noOfLines; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}