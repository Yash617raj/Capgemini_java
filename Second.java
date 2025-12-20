import java.util.Scanner;

class Second {
    public static void main(String[] args){
        // WAJP to check leap year
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the year: ");

        int n = sc.nextInt();

        if(n%400==0 || (n%4==0 && n%100!=0)){
            System.out.println("It is a leap year");
        }
        else System.out.println("Not a leap year");
        sc.close();
    }
}
