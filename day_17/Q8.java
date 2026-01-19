import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q8 {
    public static void main(String[] args) {
        // Remove all even numbers from a Set while iterating.

         Set<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        st.add(6);
        st.add(7);

        Iterator<Integer> it = st.iterator();
        while(it.hasNext()){
            int a = it.next();
            if(a%2==0) it.remove();
        }
        System.out.println(st);
    }
}
