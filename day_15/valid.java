import java.util.Scanner;
import java.util.Stack;

public class valid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        String s = sc.nextLine();

        Stack<Character> st = new Stack<Character>();
        boolean flag = true;

        for (char it : s.toCharArray()) {
            if (it == '(' || it == '{' || it == '[') {
                st.push(it);
            }
            else if (it == ')' || it == '}' || it == ']') {

                if (st.isEmpty()) {
                    flag = false;
                    break;
                }

                char top = st.pop();

                if ((top == '(' && it != ')') ||
                    (top == '{' && it != '}') ||
                    (top == '[' && it != ']')) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag && st.isEmpty())
            System.out.println("It is a valid parenthesis");
        else
            System.out.println("It is invalid parenthesis");
    }
}
