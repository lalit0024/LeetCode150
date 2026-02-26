import java.util.*;
import java.util.stream.Collectors;

public class StreamsApi {

    public static void main(String[] args) {
        System.out.println("=== Streams API Learning Methods ===\n");

        demonstrateFilter();
        demonstrateMap();
        demonstrateReduce();
        demonstrateCollect();
        demonstrateForEach();
        demonstrateSorted();
        demonstrateDistinct();
        demonstrateLimit();
        demonstrateAnyMatchAllMatch();
        demonstrateGrouping();
        demonstrateFlatMap();
    }

    // 1. FILTER - Keep only elements that match a condition
    public static void demonstrateFilter() {
        System.out.println("1. FILTER - Filter elements based on condition:");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // Filter strings by length
        List<String> words = Arrays.asList("stream", "api", "java", "code");
        List<String> longWords = words.stream()
                .filter(word -> word.length() > 3)
                .collect(Collectors.toList());
        System.out.println("Words longer than 3 chars: " + longWords + "\n");
    }

    // 2. MAP - Transform each element to another value
    public static void demonstrateMap() {
        System.out.println("2. MAP - Transform elements:");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Square each number
        List<Integer> squared = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squared numbers: " + squared);

        // Convert strings to uppercase
        List<String> words = Arrays.asList("stream", "api", "java");
        List<String> uppercase = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase words: " + uppercase + "\n");
    }

    // 3. REDUCE - Combine all elements into a single value
    public static void demonstrateReduce() {
        System.out.println("3. REDUCE - Combine elements into single value:");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum all numbers
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of numbers: " + sum);

        // Multiply all numbers
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product of numbers: " + product);

        // Find max
        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("Maximum number: " + max + "\n");
    }

    // 4. COLLECT - Gather elements into collections (List, Set, Map, etc.)
    public static void demonstrateCollect() {
        System.out.println("4. COLLECT - Gather results into collections:");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Collect to List
        List<Integer> list = numbers.stream()
                .filter(n -> n > 2)
                .collect(Collectors.toList());
        System.out.println("Collected to List: " + list);

        // Collect to Set (removes duplicates)
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4);
        Set<Integer> set = numbersWithDuplicates.stream()
                .collect(Collectors.toSet());
        System.out.println("Collected to Set (duplicates removed): " + set);

        // Collect to String (joining)
        String joined = Arrays.asList("a", "b", "c").stream()
                .collect(Collectors.joining(", "));
        System.out.println("Joined string: " + joined + "\n");
    }

    // 5. FOREACH - Perform action on each element
    public static void demonstrateForEach() {
        System.out.println("5. FOREACH - Perform action on each element:");
        List<String> words = Arrays.asList("java", "stream", "api");
        System.out.print("Words: ");
        words.stream()
                .forEach(word -> System.out.print(word + " "));
       
                System.out.println("\n");
    }

    // 6. SORTED - Sort elements
    public static void demonstrateSorted() {
        System.out.println("6. SORTED - Sort elements:");
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);

        // Sort in ascending order
        List<Integer> sorted = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted ascending: " + sorted);

        // Sort in descending order
        List<Integer> descending = numbers.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Sorted descending: " + descending + "\n");
    }

    // 7. DISTINCT - Remove duplicates
    public static void demonstrateDistinct() {
        System.out.println("7. DISTINCT - Remove duplicates:");
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);

        List<Integer> distinct = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct numbers: " + distinct + "\n");
    }

    // 8. LIMIT - Take only first n elements
    public static void demonstrateLimit() {
        System.out.println("8. LIMIT - Take first n elements:");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> limited = numbers.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("First 5 numbers: " + limited + "\n");
    }

    // 9. ANYMATCH / ALLMATCH - Check if conditions match
    public static void demonstrateAnyMatchAllMatch() {
        System.out.println("9. ANYMATCH / ALLMATCH - Condition checking:");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Check if ANY number is greater than 4
        boolean anyGreaterThan4 = numbers.stream()
                .anyMatch(n -> n > 4);
        System.out.println("Any number > 4? " + anyGreaterThan4);

        // Check if ALL numbers are positive
        boolean allPositive = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println("All numbers positive? " + allPositive + "\n");
    }

    // 10. GROUPING BY - Group elements by a property
    public static void demonstrateGrouping() {
        System.out.println("10. GROUPING BY - Group elements:");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Group by even/odd
        Map<String, List<Integer>> grouped = numbers.stream()
                .collect(Collectors.groupingBy(n -> (n % 2 == 0) ? "EVEN" : "ODD"));
        System.out.println("Grouped by even/odd: " + grouped + "\n");
    }

    // 11. FLATMAP - Flatten nested collections
    public static void demonstrateFlatMap() {
        System.out.println("11. FLATMAP - Flatten nested collections:");
        List<List<Integer>> nestedNumbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> flattened = nestedNumbers.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Flattened list: " + flattened + "\n");
    }
}