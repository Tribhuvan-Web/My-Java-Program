import java.util.stream.IntStream;

public interface printwithoutLoop {
    public static void main(String[] args) {
        // printNum(1);
        // printNumber(1, 100);
        IntStream.range(1, 101).forEach(e -> System.out.println(e));
    }

    public static void printNum(int num) {
        if (num <= 100) {
            System.out.print(num + " ");
            num++;
            printNum(num);
        }
    }

    public static void printNumber(int startingNum, int lastNum) {
        if (startingNum <= lastNum) {
            System.out.println(startingNum);
            startingNum++;
        }
        printNumber(startingNum, lastNum);
    }
}
