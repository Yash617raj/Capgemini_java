@FunctionalInterface
interface Factorial{
    int findFactorial(int n);
}
public class FactorialQ {
    public static void main(String[] args) {
        Factorial f1 = new Factorial() {
            @Override
            public int findFactorial(int n) {
                int fact = 1;
                for(int i=n;i>=1;i--){
                    fact*=i;
                }
                return fact;
            }
        };
        System.out.println("Factorial using anonymus function: "+f1.findFactorial(5));

        Factorial f2 = (n) -> {
            int fact =1;
            for(int i=n;i>=1;i--) fact*=i;
            return fact;
        };
        System.out.println("Factorial using lamda function: "+f2.findFactorial(6));
    }
}
