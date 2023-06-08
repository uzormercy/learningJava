package CollectionAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {

        // intermediate Operations
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squaredNumbers);

        // Terminal Operations
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        // Short circuiting Operations
        boolean anyMatch = numbers.stream().anyMatch(n -> n > 3);
        System.out.println(anyMatch);
        
        }
}
