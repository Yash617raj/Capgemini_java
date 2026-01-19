import java.util.HashSet;
import java.util.Set;
public class Q2 {
    public static void main(String[] args) {
        // 2. Count Unique ElementsWrite a program to count the number of unique characters in a given string using Set.

        String s = "abcyloayc";
        char[] arr = s.toCharArray();

        Set<Character> st = new HashSet<>();
        for(char it:arr) st.add(it);
        
        System.out.println("Count of unique character is: "+st.size());
    }
}
