// Reverse Half pyramid pattern
class p13 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}