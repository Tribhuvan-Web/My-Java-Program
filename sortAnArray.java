public class sortAnArray {
    public static void main(String[] args) {
        int[] num = { 12, 34, 21, 21, 76, 655, 42, 421 };
        int temp = 0;
        System.out.println("Elements before sorting");
        for (int i : num) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Element after sorting");
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i]<num[j]) {
                    temp = num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
            System.out.print(num[i]+" ");
        }
    }
}
