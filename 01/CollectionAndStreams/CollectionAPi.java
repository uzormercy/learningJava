package CollectionAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionAPi {
    /*
        Methods in the collection API
     * forEach
     * removeIf
     * stream
     * parallelStream
     */

     public static void main(String[] args) {
        
        List<String> names = Arrays.asList("David", "John", "Samuel", "Deborah", "Timothy");

        // forEach
        names.forEach(name -> System.out.println("Hello " + name));
        System.out.println("\n");
        // removeIf
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println(numbers);
        System.out.println("\n");
        // Stream
        List<String> fruits = Arrays.asList("Mango", "Red Berry", "Pears", "Orange", "Appel");

        fruits.stream()
            .filter(fruit -> fruit.startsWith("A"))
            .forEach(System.out::println);

            System.out.println("\n");
            
        // ParallelStream
        fruits.parallelStream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
     }
}
