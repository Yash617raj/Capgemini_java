import java.util.Scanner;

public class Para {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        numberReport(n);
        sc.close();
    }

    public static int reverseNumber(int num){
        int rev = 0;
        while(num > 0){
            int dig = num % 10;
            rev = rev * 10 + dig;
            num /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num, int rev){
        return num == rev;
    }

    public static boolean isStrongNumber(int num){
        int sum = 0, temp = num;
        while(temp > 0){
            int dig = temp % 10;
            int fact = 1;
            for(int i = 1; i <= dig; i++)
                fact *= i;
            sum += fact;
            temp /= 10;
        }
        return sum == num;
    }

    public static int countPrimeDigits(int num){
        int count = 0;
        while(num > 0){
            int dig = num % 10;
            if(dig == 2 || dig == 3 || dig == 5 || dig == 7)count++;
            num /= 10;  
        }
        return count;
    }

    public static void numberReport(int num){
        int rev = reverseNumber(num);

        System.out.println("Palindrome: " + isPalindrome(num, rev));
        System.out.println("Strong Number: " + isStrongNumber(num));
        System.out.println("Prime Digits Count: " + countPrimeDigits(num));
    }
}
