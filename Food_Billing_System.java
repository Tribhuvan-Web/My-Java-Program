import java.util.*;

class FoodItem {
    String name;
    double price;

    FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class BillingSystem {
    List<FoodItem> menu;
    List<FoodItem> order;

    BillingSystem() {
        menu = new ArrayList<>();
        order = new ArrayList<>();
        // Add some items to the menu
        menu.add(new FoodItem("Pizza", 10.99));
        menu.add(new FoodItem("Burger", 7.99));
        menu.add(new FoodItem("Pasta", 8.99));
    }

    void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i+1) + ". " + menu.get(i).name + " - $" + menu.get(i).price);
        }
    }

    void takeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the item you want to order. Enter 0 to finish.");
        while (true) {
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            order.add(menu.get(choice-1));
        }
    }

    void generateBill() {
        double total = 0;
        System.out.println("Your order:");
        for (FoodItem item : order) {
            System.out.println(item.name + " - $" + item.price);
            total += item.price;
        }
        System.out.println("Total: $" + total);
    }
}

class Main {
    public static void main(String[] args) {
        BillingSystem bs = new BillingSystem();
        bs.displayMenu();
        bs.takeOrder();
        bs.generateBill();
    }
}
