import java.util.Scanner;

class leapyear {
    public static void main(String[] args) {
        System.out.println("Enter the year you want to find whether the year is leap or not");
        try (Scanner sc = new Scanner(System.in)) {
            try {
                int year = sc.nextInt();
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            System.out.println(year + " is a leap year .");
                        } else {
                            System.out.println(year + " is not a leap year .");
                        }
                    } else {
                        System.out.println(year + " is a leap year");
                    }
                } else {
                    System.out.println(year + " is not a leap year. ");
                }
            }

            catch (Exception e) {
                // TODO: handle exception
                System.out.println("Enter a valid input");
            }
        }
    }
}
