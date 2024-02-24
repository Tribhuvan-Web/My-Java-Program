package FoodManagementSystem;

import java.util.Scanner;

class buy {
    public void paneer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the item you want to buy.");
        System.out.println("1. Shahi Paneer Rs.109");
        System.out.println("2. Kadahi Paneer Rs. 149");
        System.out.println("3. Paneer Masala Rs.99");
        System.out.println("4. Butter Paneer Rs.169");
        int sel = sc.nextInt();
        switch (sel) {
            case 1:
                System.out.println("You have selected Shahi Paneer. How many number of plate you want?");
                int shahi_Paneer = sc.nextInt();
                System.out.println("You have to pay " + (shahi_Paneer * 109));
                break;
            case 2:
                System.out.println("You have selected kadahi Paneer. How many number of plate you want?");
                int kadahi_Paneer = sc.nextInt();
                System.out.println("You have to pay " + (kadahi_Paneer * 149));

                break;
            case 3:
                System.out.println("You have selected Paneer Masala. How many number of plate you want?");
                int Paneer_Masala = sc.nextInt();
                System.out.println("You have to pay " + (Paneer_Masala * 99));
                break;
            case 4:
                System.out.println("You have selected Butter Paneer. How many number of plate you want?");
                int Butter_Paneer = sc.nextInt();
                System.out.println("You have to pay " + (Butter_Paneer * 169));
                break;
            default:
                System.exit(0);
                break;
        }
    }

    public void Briyani() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the item you want to buy");
        System.out.println("1. Veg Briyani Rs.99");
        System.out.println("2. Non-veg Briyani Rs.129");
        System.out.println("3. Hydrebadi Briyani Rs.109");
        System.out.println("4. Anda Briyani Rs.109");
        System.out.println("Please select Anyone");
        int sel = sc.nextInt();
        switch (sel) {
            case 1:
                System.out.println("You have selected Veg Briyani. How many number of plate you want to buy?");
                int veg_briyani = sc.nextInt();
                System.out.println("You have to pay " + (veg_briyani * 99));
                break;
            case 2:
                System.out.println("You have selected Non.veg Briyani.How many number of plate you want?");
                int non_veg_briyani = sc.nextInt();
                System.out.println("you have to pay " + (non_veg_briyani * 129));
                break;
            case 3:
                System.out.println("You have selected Hydrebadi Briyani.How many number of plate you want?");
                int Hydrebadi_briyani = sc.nextInt();
                System.out.println("you have to pay " + (Hydrebadi_briyani * 109));
                break;
            case 4:
                System.out.println("You have selected Anda Briyani.How many number of plate you want?");
                int anda_briyani = sc.nextInt();
                System.out.println("you have to pay " + (anda_briyani * 109));
                break;
            default:
                System.exit(0);
                break;
        }
    }

    public void Momo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the item you want to buy.");
        System.out.println("1. Desi momo Rs.19");
        System.out.println("2. Paneer momo Rs. 39");
        System.out.println("3. Chicken momo Rs.49");
        System.out.println("4. Paneer momo with veg momo Rs.69");
        int sel = sc.nextInt();
        switch (sel) {
            case 1:
                System.out.println("You have selected Desi momo. How many number of plate you want?");
                int Desi_momo = sc.nextInt();
                System.out.println("You have to pay " + (Desi_momo * 19));
                break;
            case 2:
                System.out.println("You have selected Paneer momo. How many number of plate you want?");
                int Paneer_momo = sc.nextInt();
                System.out.println("You have to pay " + (Paneer_momo * 39));

                break;
            case 3:
                System.out.println("You have selected Chicken momo. How many number of plate you want?");
                int Chicken_momo = sc.nextInt();
                System.out.println("You have to pay " + (Chicken_momo * 49));
                break;
            case 4:
                System.out.println("You have selected Paneer momo with veg momo. How many number of plate you want?");
                int momo_with_veg = sc.nextInt();
                System.out.println("You have to pay " + (momo_with_veg * 69));
                break;
            default:
                System.exit(0);
                break;
        }
    }

    public void Tikka() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the item you want to buy.");
        System.out.println("1. Shahi Tikka Rs.109");
        System.out.println("2. Paneer Tikka Rs. 149");
        System.out.println("3. Veg Tikka Rs.99");
        System.out.println("4. Panner with Tikka Rs.169");
        int sel = sc.nextInt();
        switch (sel) {
            case 1:
                System.out.println("You have selected Shahi Tikka. How many number of plate you want?");
                int shahi_Tikka = sc.nextInt();
                System.out.println("You have to pay " + (shahi_Tikka * 109));
                break;
            case 2:
                System.out.println("You have selected Paneer Tikka. How many number of plate you want?");
                int Paneer_Tikka = sc.nextInt();
                System.out.println("You have to pay " + (Paneer_Tikka * 149));

                break;
            case 3:
                System.out.println("You have selected Veg Tikka. How many number of plate you want?");
                int Veg_tikka = sc.nextInt();
                System.out.println("You have to pay " + (Veg_tikka * 99));
                break;
            case 4:
                System.out.println("You have selected Paneer With Tikka. How many number of plate you want?");
                int Paneer_With_tikka = sc.nextInt();
                System.out.println("You have to pay " + (Paneer_With_tikka * 169));
                break;
            default:
                System.exit(0);
                break;
        }
    }
}