import java.util.Scanner;

class bank {
    public static void main(String[] args) {
        try {
            atm obj = new atm();
            obj.checkPin();

        } catch (Exception e) {
            System.out.println("Entered invalid characters");
        }
    }
}

class atm {
    float balance;
    int pin = 8745;

    public void checkPin() {
        System.out.println("Enter you pin ");
        try (Scanner sc = new Scanner(System.in)) {
            int enterPin = sc.nextInt();
            if (enterPin == pin) {
                menu();
            } else {
                System.out.println("Enter a valid pin");
                System.out.println("");
                menu();
            }
        }
    }

    public void menu() {
        System.out.println("Enter your choice");
        System.out.println("1. Check  your balance");
        System.out.println("2. Withdraw balance");
        System.out.println("3. Deposit money");
        System.out.println("4. exit");
        try (Scanner sc = new Scanner(System.in)) {
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    WithdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
    }

    public void checkBalance() {
        System.out.println("Balance " + balance);
        menu();
    }

    public void WithdrawMoney() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter amount to withdraw");
            float amount = sc.nextFloat();
            if (amount > balance) {
                System.out.println("insufficient balance");
            } else {
                balance -= amount;
                System.out.println("Money withdrawn successfully");
            }
        }
        menu();
    }

    public void depositMoney() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter amount to Deposit");
            float amount = sc.nextFloat();
            balance = balance + amount;
        }
        System.out.println("Money deposited successfully.");
        menu();
    }
}