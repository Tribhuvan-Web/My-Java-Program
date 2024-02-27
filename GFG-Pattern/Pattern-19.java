// Mirror Image Traingle pattern
class p19 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            // for mirror Image
        }
        for (int i = n - 2; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}