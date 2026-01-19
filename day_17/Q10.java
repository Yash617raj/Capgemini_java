import java.util.LinkedHashSet;
import java.util.Set;

public class Q10 {
    public static void main(String[] args) {
        // 10. First Non-Repeating Element Find the first non-repeating character in a string using LinkedHashSet.

        String s = "aaaaabcdab";
        Set<Character> st = new LinkedHashSet<>();
        Set<Character> repeat = new LinkedHashSet<>();

        for(char ch:s.toCharArray()){
            if(!st.add(ch)) repeat.add(ch);
        }

        for(char ch:st){
            if(!repeat.contains(ch)){
                System.out.println("First non-repeating character is: "+ch);
                break;
            }
        }
        
    }
}
