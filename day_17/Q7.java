import java.util.HashSet;
import java.util.Set;

public class Q7 {
    public static void main(String[] args) {
        // 7. Difference of Sets Find elements present in Set A but not in Set B.

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

        Set<Integer> difference = new HashSet<>(st1);
        difference.removeAll(st2);
        System.out.println("Difference of two set(A-B) is: "+difference);
    }
}
