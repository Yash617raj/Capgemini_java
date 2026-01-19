import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<String>();
        ts.add("Kabir");
        ts.add("Nitish");
        ts.add("Aditya");
        ts.add("Animesh");
        ts.add("Pawan");
        ts.add("Devansh");
        ts.add("Balaji");

        System.out.println("ASC: "+ts);
        TreeSet<String> dts = (TreeSet) ts;
        System.out.println("DESC: "+dts.descendingSet());

    }
}
