import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

class mapper {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(98, 89, 343, 23, 323, 4, 665, 75, 98);
        Map<Boolean, List<Integer>> oddNumbersMap = l.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Set<Entry<Boolean, List<Integer>>> entrySet = oddNumbersMap.entrySet();
        for (Entry<Boolean, List<Integer>> entry : entrySet) {
            System.out.println("__________________");
            if (entry.getKey()) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
            System.out.println("_________________");
            List<Integer> list = entry.getValue();
            for (int i : list) {
                System.out.println(i);
            }
        }

    }
}