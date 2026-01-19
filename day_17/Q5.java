import java.util.HashSet;
import java.util.Set;

public class Q5 {
    public static void main(String[] args) {
        // 5. Union of Two Set Find the union of two sets using Set methods.
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

        Set<Integer> union = new HashSet<>(st1);
        union.addAll(st2);
        System.out.println("Union of two set is: "+union);
    }
}
