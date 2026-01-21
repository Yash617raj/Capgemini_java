@FunctionalInterface
interface F1{
    void greet();
}

interface F2{
    int add(int a,int b);
}

public class P1 {
    public static void main(String[] args) {
        F1 ref1 = new F1() {
            @Override
            public void greet() {
                System.out.println("Hello world using Anonymus class");
            }
            
        };
        ref1.greet();

        F1 ref2 = () -> System.out.println("Hello world using lamda");
        ref2.greet();
        System.out.println("----------------------------");
        F2 obj1 = new F2() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println("Using anonymous class : "+obj1.add(10, 20));

        F2 obj2 = (a,b) -> a+b;
        System.out.println("Using lamda exp: "+obj2.add(20, 30));
    }
}
