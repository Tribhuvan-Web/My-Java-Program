package FoodManagementSystem;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        buy b = new buy();
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to buy?");
        System.out.println("1.Briyani");
        System.out.println("2. Tikka");
        System.out.println("3. Momo");
        System.out.println("4. Paneer");
        System.out.println("Select what you want to buy?");
        int sel = sc.nextInt();
        switch (sel) {
            case 1:
                System.out.println(" Briyani");
                b.Briyani();
                break;
            case 2:
                System.out.println("Tikka");
                b.Tikka();
                break;
            case 3:
                System.out.println("Momo");
                b.Momo();
                break;
            case 4:
                System.out.println("Paneer");
                break;
            default:
                System.exit(0);
                break;
        }
    }
}
