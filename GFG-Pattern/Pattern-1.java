
//Square Hallow Pattern 
import java.util.Scanner;

class p1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers of line you want to print ?");
        int noOfLines = sc.nextInt();
        System.out.println("How many column you want to print ?");
        int noOfColumns = sc.nextInt();
        for (int i = 0; i <= noOfLines; i++) {
            for (int j = 0; j <= noOfColumns; j++) {
                if (i == 0 || j == 0 || i == noOfLines || j == noOfColumns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}