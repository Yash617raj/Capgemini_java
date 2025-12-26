import java.util.Scanner;

public class isFibo {

    //  WAJP to create a method to check the given number is a part of Fibonnaci series or not, if yes return true else false
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(isFib(n));
        sc.close();
    }

    public static boolean isFib(int n) {
        int a = 0, b = 1;

        while (a <= n) {
            if (a == n) return true;
            int c = a + b;
            a = b;
            b = c;
        }
        return false;
    }

}
