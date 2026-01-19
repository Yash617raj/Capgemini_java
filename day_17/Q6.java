import java.util.HashSet;
import java.util.Set;

public class Q6 {
    public static void main(String[] args) {
        // 6. Intersection of Two Sets Find the intersection of two sets using retainAll().

        Set<Integer> st1 = new HashSet<>();
        st1.add(1);
        st1.add(2);
        st1.add(3);
        st1.add(4);
        st1.add(5);
        Set<Integer> st2 = new HashSet<>();
        st2.add(3);
        st2.add(4);
        st2.add(5);
        st2.add(6);
        st2.add(7);

        Set<Integer> intersection = new HashSet<>(st1);
        intersection.retainAll(st2);
        System.out.println("intersection of two set is: "+intersection);
    }
}
