import java.util.HashSet;
import java.util.Set;
public class Q9 {
    public static void main(String[] args) {
        // 9. First Repeating Element Find the first repeating element in an array using HashSet.
        int[] arr= {1,2,3,4,5,6,1,4};
        Set<Integer> st = new HashSet<>();
        
        for(int it:arr){
            if(!st.add(it)){
                System.out.println("First repeating element is: "+it);
                break;
            }
        }
        
    }
}
