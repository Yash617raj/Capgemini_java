import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Q4 {
    public static void main(String[] args) {
        // 4. Check Element Presence Check whether a given element exists in a Set.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of set: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of set: ");
        Set<Integer> st = new HashSet<>();

        for(int i=0;i<n;i++) st.add(sc.nextInt());
        
        System.out.println("Enter the element you want to check: ");
        int exist = sc.nextInt();

        System.out.println(
            st.contains(exist) ? exist+" Element is present in the set" : exist+ " Element is not present in the set"
        );

    }
}
