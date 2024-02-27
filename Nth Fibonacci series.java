import java.util.Scanner;

class fseries {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0, b = 1, c = 0;
        if (num < 0) {
            System.out.println("num can not be negative");
        } else if (num == 0) {
            System.out.println(a);
        } else if (num == 1) {
            System.out.println(b);
        } else {
            for (int i = 2; i <= num; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(c);
        }
    }
}
