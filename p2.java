public class p2 {
    public static void main(String[] args) {
        int n = 999, temp = 0; 
        while (n > 0) {
            int rem = n % 10;
            temp = temp * 10 + rem;
            n = n / 10;
        }
            if (temp == 999) {
                System.out.println("P");
            } else {
                System.out.println("N");
            }
    }
}
