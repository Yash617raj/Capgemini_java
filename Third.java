import java.util.Scanner;

public class Third {
    public static void main(String[] args){
        //Q1  WAJP to print number from the range -123 to -129, 79 to 84, -110 to -100,0 to -9,A to M, x to m by using while loop

        // int a = -123;
        // System.out.println("First question");
        // while(a>=-129){
        //     System.out.println(a);
        //     a--;
        // }

        // int b = 79;
        // System.out.println("Second question");
        // while(b<=84){
        //     System.out.println(b);
        //     b++;
        // }

        // int c = -110;
        // System.out.println("Third question");
        // while(c<=-100){
        //     System.out.println(c);
        //     c++;
        // }

        // int d =0;
        // System.out.println("Fourth question");
        // while(d>=-9){
        //     System.out.println(d);
        //     d--;
        // }

        // char ch1 = 'A';
        // System.out.println("Fifth question");
        // while(ch1<='M'){
        //     System.out.println(ch1);
        //     ch1++;
        // }

        // char ch2 = 'x';
        // System.out.println("Sixth question");
        // while(ch2>='m'){
        //     System.out.println(ch2);
        //     ch2--;
        // }

        //Q2 WAPJ to print these from the range -111 to -101, 123 to 113, 5 to -5, -10 to 0, s to l,T to Z using do while loop

        // int a = -111;
        // System.out.println("First");
        // do{
        //     System.out.println(a);
        //     a++;
        // }while(a<=-101);

        // int b = 123;
        // System.out.println("Second");
        // do{
        //     System.out.println(b);
        //     b--;
        // }while(b>=113);

        // int c = 5;
        // System.out.println("Third");
        // do{
        //     System.out.println(c);
        //     c--;
        // }while(c>=-5);

        // int d = -10;
        // System.out.println("Fourth");
        // do{
        //     System.out.println(d);
        //     d++;
        // }while(d<=0);

        // char ch1 = 's';
        // System.out.println("Fifth");
        // do{
        //     System.out.println(ch1);
        //     ch1--;
        // }while(ch1>='l');

        // char ch2 = 'T';
        // System.out.println("Sixth");
        // do{
        //     System.out.println(ch2);
        //     ch2++;
        // }while(ch2<='Z');

        //Q. WAJP to print these form the range -1111 to 1121, 1234 to 1223, -1111 to -1121, -1234 to -1223,d to j, m to e, z to t, r to x

        // System.out.println("First");
        // for(int a=1111;a<=1121;a++) System.out.println(a);

        // System.out.println("Second");
        // for(int b=1234;b>=1223;b--) System.out.println(b);

        // System.out.println("Third");
        // for(int c=-1111;c>=-1121;c--) System.out.println(c);

        // System.out.println("Forth");
        // for(int d=-1234;d<=-1223;d++) System.out.println(d);

        // System.out.println("Fifth");
        // for(char ch='d';ch<='j';ch++) System.out.println(ch);

        // System.out.println("Sixth");
        // for(char ch='m';ch>='e';ch--) System.out.println(ch);

        // System.out.println("Seventh");
        // for(char ch='z';ch>='t';ch--) System.out.println(ch);

        // System.out.println("Eight");
        // for(char ch='r';ch<='x';ch++) System.out.println(ch);

        // Q. WAP to check the given character is uppercase vowel,uppercase consonant,lowercase vowel,lowercase consonant - if the given char is uppercase vowel, print number from 10 to 20 using while loop, if the give char is lowercase vowel, print from -10 to -20 using while loop, if the given char is uppercase consonant print from 25 to 15 using for loop, if the given char is lowercase consonant print from -25 to -15

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Write the character: ");
        // char ch = sc.next().charAt(0);

        // if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        //     int a = 10;
        //     do{
        //         System.out.println(a);
        //         a++;
        //     }while(a<=20);
        // }

        // else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        //     int a = -10;
        //     while(a>=-20){
        //         System.out.println(a);
        //         a--;
        //     }
        // }

        // else if(ch>='A' && ch<='Z'){
        //     for(int i=25;i>=15;i--)System.out.println(i);
        // }

        // else {
        //     for(int i=-25;i<=-15;i++) System.out.println(i);
        // }

        //Q. WAJP to print even numbers from the range 1 to 20

        // for(int i=1;i<=20;i++){
        //     if(i%2==0) System.out.println(i);
        // }

        // Q. WAJP to print number s which are divisible by 7 form the range 100 to 50

        // for(int i=100;i>=50;i--){
        //     if(i%7==0) System.out.println(i);
        // }

        //Q. WAJP to print Sum of all numbers from the range 1 to 10
        // int sum=0;
        // for(int i=1;i<=10;i++)sum+=i;
        // System.out.println(sum);

        //Q. WAJP to print product of all numbers from the range 1 to 10

        // int pro = 1;
        // for(int i=1;i<=10;i++) pro*=i;
        // System.out.println(pro);

        /*Q. Given a number n, for erach interger 1 in the range fro m1 to n inclusive, print out one value per 
        if i is multiple of both 3 and 5, print FizzBuzz
        if i is multiple of both 3 but not 5, print Fizz
        if i is multiple of both 5but not 3, print Buzz
        if i is not a multiple of both 3 and 5, print the value of i
        */

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Give the number: ");

        // int n = sc.nextInt();

        // for(int i=1;i<=n;i++){
        //     if(i%3==0 && i%5==0) System.out.println("FizzBuzz");
        //     else if(i%3==0 && i%5!=0) System.out.println("Fizz");
        //     else if(i%3!=0 && i%5==0) System.out.println("Buzz");
        //     else System.out.println(i);
        // }
        // sc.close();

        // WAJP to print factors of a given number

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Give the number: ");

        // int n = sc.nextInt();

        // for(int i=1;i<=n;i++){
        //     if(n%i==0) System.out.println(i);
        // }

        //Q. WAJP to check whether the given number is prime number or not

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Give the number: ");

        // int n = sc.nextInt();
        // boolean flag=true;
        // for(int i=2;i<n;i++){
        //     if(n%i==0) {
        //         flag = false;
        //         break;
        //     }
        // }
        // if(flag) System.out.println("Is Prime");
        // else System.out.println("not Prime"); 

        //Q. WAJP to print prime numbes from the range 20 to 1

    //    for(int i = 20; i >= 1; i--) {
    //         if(i < 2) continue;

    //         boolean flag = true;
    //         for(int j = 2; j < i; j++) {
    //             if(i % j == 0) {
    //                 flag = false;
    //                 break;
    //             }
    //         }
    //         if(flag) System.out.println(i + " Is prime");
    //         else System.out.println(i+" Is not Prime");
    //    }

        // Q. Given a integer n, return the number of prime numbers that are strictly leass than n,

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");

        // int n = sc.nextInt();
    //     int count=0;
    //     for(int i = n; i >= 1; i--) {
    //         if(i < 2) continue;

    //         boolean flag = true;
    //         for(int j = 2; j < i; j++) {
    //             if(i % j == 0) {
    //                 flag = false;
    //                 break;
    //             }
    //         }
    //         if(flag) count++;
    //    }
    //    System.out.println(count);

        //Q. Find the perfect number where the perfect number is the sum of the factor of number equal to the number

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");

        // int n = sc.nextInt();
        // int sum=0;
        // for(int i=1;i<n;i++){
        //     if(n%i==0)sum+=i;
        // }
        // if(sum==n) System.out.println("Is a perfect Number");
        // else System.out.println("Not a perfect Number");

        // Q. WAJP to print all the perfect number from 1 to 100

        // for(int i = 1; i <= 100; i++) {
        //     int sum = 0;
        //     for(int j = 1; j < i; j++) {
        //         if(i % j == 0) sum += j;
                
        //     }
        //     if(sum == i) {
        //         System.out.println(i + " is a perfect number");
        //     }
        // }

        //Q. WAJP to print the factorial of given number

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");

        // int n = sc.nextInt();
        // int pro=1;
        // for(int i=1;i<=n;i++) pro*=i;
        
        // System.out.println(pro);

        

        // Q. WAJP to print the factorial of all numbers from the range 1 to 10,

        // for (int i = 1; i <= 10; i++) {
        //     int fact = 1;
        //     for (int j = 1; j <= i; j++)fact *= j;
            
        //     System.out.println("Factorial of " + i + " = " + fact);
        // }

        //  Q. WAJP to print the factorial of all odd numbers from the range 1 to 10
        // for (int i = 1; i <= 10; i++) {
        //     int fact = 1;
        //     if(i%2!=0){
        //         for (int j = 1; j <= i; j++)fact *= j;
        //         System.out.println("Factorial of " + i + " = " + fact);
        //     }
            
        // }

        // WAJP to print the factorial of all prime numbers from the range 14 to 5
        // for (int i = 14; i >= 5; i--) {
        //     boolean flag = true;
        //     for (int j = 2; j < i; j++) {
        //         if (i % j == 0){
        //             flag=false;
        //             break;
        //         }
        //     }

        //     if (flag) { 
        //         int fact = 1;
        //         for (int k = 1; k <= i; k++) fact *= k;
        //         System.out.println("Factorial of prime number " + i + " = " + fact);
        //     }
        // }

        // Q. WAJP to print the addition of all prime numbers from the range 32 to 50

        // int sum =0;
        // for(int i=32;i<=50;i++){
        //     boolean flag = true;
        //     for(int j=2;j<i;j++){
        //         if(i%j==0){
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if(flag) sum+=i;
        // }

        // System.out.println("Addition of all prime number from 32 to 50 = "+sum);

        // boolean a = true;
        // boolean b = false;
        // boolean c = a || b && !(a);
        // System.out.println(c);     // true

        //Q. WAJP to swap two number with using third var

        // int a = 10,b=20;
        // int c = a;
        // a=b;
        // b=c;
        // System.out.println("value of First: "+a+" value of Second: "+b);

        //Q. WAJP to swap two number without third var

        // int a =20,b=10;
        // a = a+b;
        // b=a-b;
        // a = a-b; 
        // System.out.println("First number is: "+a+" Second number is: "+b);

        /* 
        Q. Write a Java method clockProblem(int input1, int input2) that simulates a 12-hour analog clock.
            Problem Requirements
            input1 represents the current hour position on a clock (1–12).
            input2 represents the number of jumps/multiplication factor.
            Multiply input1 and input2 to calculate the movement.
            The clock should always stay within 1 to 12.
            If the calculated value exceeds 12, it should wrap around using clock logic.
            If the final calculated position becomes 0, it must be treated as 12.
        */ 

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Hour position: ");
            // int h = sc.nextInt();

            // System.out.println("Jumps factor: ");
            // int j = sc.nextInt();

            // int ans = (h*j)%12;
            // if(ans==0)ans=12;
            // System.out.println("Time is: "+ans);

            //53. Write a program to print the first n numbers in the Fibonacci sequence. 0, 1, 1, 2, 3, 5, 8, 13, ...

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");

            int n = sc.nextInt();
            int a=0,b=1;
            System.out.print(a+" "+b);
            for(int i=2;i<n;i++){
                int c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
            }

    }
}
