import java.util.HashSet;
import java.util.Set;
public class Q3 {
    public static void main(String[] args) {
        //3. Common Elements Find common elements between two integer arrays using HashSet.

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {4,5,6,7,8,9};

        Set<Integer> st = new HashSet<>();
        for(int it:arr1) st.add(it);
        for(int it:arr2){
            if(st.contains(it)) System.out.println(it+" is the common element between the two array");;
        }
        
    }
}
