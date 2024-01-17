import java.util.*;

class revanumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first Number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            b = a + b;// 10+10=20
            a = b - a;// 20-10 = 10
            b = b - a;// 20-10=10
            System.out.println("");
            System.out.println("After reversing :");
            System.out.println("");
            System.out.println("First number :" + a);
            System.out.println("Second number :" + b);
        }
    }
}