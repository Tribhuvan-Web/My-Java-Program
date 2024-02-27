import java.util.Scanner;

public class occurence {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit : ");
        int bin = sc.nextInt(), count = 0;
        if (bin == 0) {
            System.out.println("The total number of digit is 1");
        } else if (bin < 0) {
            bin = -bin;
        } else {
            while (bin != 0) {
                bin /= 10;
                count++;
            }
        }
        System.out.println("The occurence of the digits are "+count);
    }
}
