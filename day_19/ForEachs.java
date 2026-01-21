import java.util.Arrays;
import java.util.List;

public class ForEachs {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ankit","Avi","Yash","Sky");
        // System.out.println("Names: "+names);
        // names.forEach(name->System.out.println(name));

        List<Integer> numbers = Arrays.asList(10,21,34,53,64,2);
        // System.out.println("\nNumbers: "+numbers);
        // numbers.forEach(num -> System.out.println(num));

        // WAJP to print objects that ends with "sh" form names list

        names.forEach(name-> {
            if(name.endsWith("sh")){
                System.out.println("Names: "+name);
            }
        });

        // WAJP to print only even objects from numbers list

        // numbers.forEach(num->{
        //     if(num%2==0) System.out.println("Even numbers are: "+num);
        // });
    }
}
