import java.util.Scanner;

public class Maths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        findMax(a, b, c);
        findMin(a, b, c);

        System.out.println("Enter a number to check prime:");
        int num = sc.nextInt();
        isPrime(num);

        System.out.println("Enter n for Fibonacci:");
        int n = sc.nextInt();
        System.out.println("Fibonacci number is: " + fibonacci(n));

        sc.close();
    }

    public static void findMax(int a, int b, int c) {
        int maxi = Math.max(a, Math.max(b, c));
        System.out.println("Maximum number is: " + maxi);
    }

    public static void findMin(int a, int b, int c) {
        int mini = Math.min(a, Math.min(b, c));
        System.out.println("Minimum number is: " + mini);
    }

    public static void isPrime(int num) {
        if (num <= 1) {
            System.out.println(num + " is not a prime number");
            return;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number");
                return;
            }
        }
        System.out.println(num + " is a prime number");
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
