import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface  F1{
    int add(int a, int b);    
}

public class MethodReferences {
    public static void main(String[] args) {
        F1 obj1 = (a,b) -> a+b;
        System.out.println("Using lambda function: "+obj1.add(10,30));

        F2 obj2 = Integer::sum;
        System.out.println("Using method reference: "+obj2.add(10, 20));

        List<String> names = Arrays.asList("Yash","Avi","Ankit","Sky");
        System.out.println("Names: "+names);
        names.forEach(name->System.out.println(name));

        // using method reference
        System.out.println("Using method reference: ");
        names.forEach(System.out::println);
    }
}
