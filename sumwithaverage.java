// A java program for the adding and finding average of the given count number
import java.util.*;

class sumWithAverage {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter how much number you want to add");
            try {

                int count = sc.nextInt(), sum = 0, Average = 0;
                // For taking the count of the aaray from the user
                int[] num = new int[count];
                // For taking input for the given array
                System.out.println("Enter your number");
                for (int i = 0; i < count; i++) {
                    num[i] = sc.nextInt();
                }
                // For adding the array
                for (int index = 0; index < count; index++) {
                    sum = sum + num[index];
                }
                System.out.println("Sum of given array is " + sum);
                Average = sum / count;
                System.out.println("Average of given array is " + Average);
            } catch (Exception e) {
                System.out.println("Enter a valid input ");
            }
        }
    }
}