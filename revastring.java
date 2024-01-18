import java.util.Scanner;

class string {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.println("Enter a string you want to reverse.");
                String s = sc.nextLine();
                String revString = "";
                char ch;
                for (int i = 0; i < s.length(); i++) {
                    ch = s.charAt(i);
                    revString = ch + revString;
                }
                System.out.println("Reversed string is :" + revString);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Enter a valid input");
            }
        }
    }
}