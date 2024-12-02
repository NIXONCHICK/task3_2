package task3_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> source = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Number> destination = new ArrayList<>();

        CollectionUtils.addAll(source, destination);
        System.out.println("Destination after addAll: " + destination);

        List<Integer> limited = CollectionUtils.limit(source, 3);
        System.out.println("Limited list: " + limited);

        boolean containsAll = CollectionUtils.containsAll(destination, Arrays.asList(1, 2));
        System.out.println("Contains all: " + containsAll);

        boolean containsAny = CollectionUtils.containsAny(destination, Arrays.asList(10, 2));
        System.out.println("Contains any: " + containsAny);

        List<Integer> rangeList = CollectionUtils.range(source, 3, 5);
        System.out.println("Range (3 to 5): " + rangeList);

        List<Integer> rangeWithComparator = CollectionUtils.range(
                source, 3, 5, Comparator.naturalOrder());
        System.out.println("Range with comparator (3 to 5): " + rangeWithComparator);
    }
}

