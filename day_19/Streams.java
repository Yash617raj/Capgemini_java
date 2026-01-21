import java.util.*;
import java.util.stream.Collectors;
public class Streams {
    public static void main(String[] args) {
        // List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // System.out.println("To print all elements one by one: ");
        // numbers.stream().forEach(System.out::println);

        // System.out.println("To print even elements: ");
        // numbers.stream().filter(n->n%2==0).forEach(System.out::println);

        // System.out.println("To print odd number with extra value 3: ");
        // numbers.stream().filter(n->n%2!=0).map(n->n+3).forEach(System.out::println);

        // System.out.println("find even numbers and stored in another list");
        // List<Integer> even_collector = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        // System.out.println(even_collector);

        // List<String> names = List.of("Yash","Sky","Ankit","Suresh","Avi");
        // System.out.println("\nprint objects end with sh using stream");
        // names.stream().filter(name-> name.endsWith("sh")).forEach(System.out::println);
        
         List<Students> student = List.of(
                new Students(3, "Murali", 75.5),
                new Students(4, "Aditya", 85.5),
                new Students(1, "Vishnu", 80.5),
                new Students(2, "Pramod", 90.5),
                new Students(5, "Suraj", 55.5)
        );


        // 1. Write a Java Stream one-liner to sort Students objects by id in ascending order and print them.
        System.out.println("\nSorted by ID (Ascending)");
        student.stream().sorted(Comparator.comparingInt(s -> s.id)).forEach(System.out::println);
        // 2. Write a Java Stream one-liner to sort Students objects by id in descending order and print them.
        System.out.println("\nSorted by ID (Descending)");
        student.stream().sorted(Comparator.comparingInt((Students s) -> s.id).reversed()).forEach(System.out::println);
        // 3. Write a Java Stream one-liner to sort Students objects based on name and display the result.
         System.out.println("\nSorted by Name");
        student.stream().sorted(Comparator.comparing(s -> s.name)).forEach(System.out::println);
        // 4. Write a Java Stream one-liner to sort Students objects by marks and print them.
        System.out.println("\nSorted by Marks");
        student.stream().sorted(Comparator.comparingDouble(s -> s.marks)).forEach(System.out::println);
        // 5. ⁠Write a Java Stream one-liner to add 5 grace marks to each student and print the updated marks.
        System.out.println("\nAfter Adding 5 Grace Marks");
        student.stream().peek(s -> s.marks+=5).forEach(System.out::println);
    }
}
