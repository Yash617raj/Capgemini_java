import java.util.Scanner;

class calculator {

     /* Q. WAJP to create calculator class consist of 4 methods
            1. to add 3 var, 
            2. to multiply 3 var,
            3. to sub 4 var,
            4. to add 2 var
        */

    public static void main(){
        Addition();
        multiplication();
        subtraction();
        Addition2();
    }

    public static void Addition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println("Addition of three number: "+(a+b+c));
        sc.close();
    }
    public static void multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println("Multiplication of three number: "+(a*b*c));
        sc.close();
    }
    public static void subtraction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four number");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
        System.out.println("Subtraction of three number: "+(a-b-c-d));
        sc.close();
    }
    public static void Addition2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println("Addition of three number: "+(a+b));
        sc.close();
    }

    


}
