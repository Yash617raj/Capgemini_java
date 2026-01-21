import java.util.*;

class Students implements Comparable<Students> {
    int id;
    String name;
    double marks;

    public Students(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }

    @Override
    public int compareTo(Students s) {
        return this.id - s.id; 
    }
}

public class P2 {
    public static void main(String[] args) {

        List<Students> arr = new ArrayList<>();
        arr.add(new Students(1, "Yash", 90.6));
        arr.add(new Students(4, "Avi", 85.4));
        arr.add(new Students(3, "Ankit", 50.6));
        arr.add(new Students(2, "Sky", 92.9));

        Collections.sort(arr);
        System.out.println("Sorted by ID:");
        arr.forEach(System.out::println);

        Collections.sort(arr, (a, b) -> a.name.compareTo(b.name));
        System.out.println("\nSorted by Name:");
        arr.forEach(System.out::println);

        Collections.sort(arr, (a, b) -> Double.compare(a.marks, b.marks));
        System.out.println("\nSorted by Marks:");
        arr.forEach(System.out::println);
    }
}
