// Reverse left pyramid star pattern
class p16 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("");
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}