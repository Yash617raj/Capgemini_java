import java.util.Scanner;

class First{
	public static void main(String[] args){

		// double n = 3.6;
		// double ans = n*n;
		// System.out.println(ans);

        // bitwise "|" and logical "||"

        // int a=5;
        // System.out.println(++a<=10 | ++a>=20);
        // System.out.println(a);

        // int b=5;
        // System.out.println(++b<=10 || ++b>=20);
        // System.out.println(b);
		// }

        //Ternary Operator --> Condition ? operand2 : operand 3

        // int a = 11;
        // String ans = a%2==0 ? "Even Number" : "Odd Number";
        // System.out.println(ans);

        // Q. Write a Java program to check whether the given number is even or odd by using on ‘if’ DMS

        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter the input: ");
        // int a = sc.nextInt();
        // if(a%2==0) System.out.println("Even Number");
        // if(a%2!=0) System.out.println("Odd Number");

        // sc.close();

        /*
        Q1. Write a Java program to check whether the given number is divisible by 7 or not
        Q2. Write a Java program to check whether the given number is divisible by both 3 and 5 or not.
        Q3 .Write a Java program to check whether the given character is vowel or consonant
        Q4. Write a Java program(WAJP) to check whether the given character is digit or not
        */

        //A1
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter the input: ");
        // int a = sc.nextInt();

        // if(a%7==0) System.out.println("The Number is divisible by 7");
        // else  System.out.println("The Number is not divisible by 7");

        //A2
        // if(a%3==0 && a%5==0) System.out.println("The Number is divisible by both 3 and 5");
        // else  System.out.println("The Number is Not divisible by both 3 and 5");


        // System.out.print("Enter the Character: ");
        // char ch = sc.next().charAt(0);

        //A3
        // if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') System.out.println("The Given Character is a Vowel");
        // else System.out.println("The Given Character is not a Vowel");
        
        //A4
        // if(ch>='0' && ch<='9') System.out.println("The given Character is a Digit");
        // else  System.out.println("The given Character is not a Digit");

        // sc.close();
        
        // Q. WAJP to check whether the given character is upper case,lowecase,digit or special character
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Character: ");
        // char ch = sc.next().charAt(0);

        // if(Character.isUpperCase(ch)) System.out.println("The Character is in Upper Case");
        // else if(Character.isLowerCase(ch)) System.out.println("The Character is in Lower Case");
        // else if(ch>='0' && ch<='9') System.out.println("The Character is a digit");
        // else System.out.println("It is a special Character");
        // sc.close();

        // MARKS 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Marks: ");

        // int n = sc.nextInt();

        // if(n>=90) System.out.println("Grade A");
        // else if(n>=75 && n<=90) System.out.println("Grade B ");
        // else if(n>=60 && n<=75) System.out.println("Grade C");
        // else if(n>=45 && n<=60) System.out.println("Grade D");
        // else if(n>=0 && n<=40)  System.out.println("Fail");
        // else System.out.println("Marks are invalid");
        // sc.close();

        // Q. WAJP to check whether the character is uppercase vowel,uppercase consoant, lowercase vowel,lowercase consonant
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Character: ");
        
        // char ch = sc.next().charAt(0);
        
        // if(ch>='A' && ch<='Z'){
        //     if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') System.out.println("Uppercase Vowel");
        //     else System.out.println("UpperCase consonant");
        // }
        
        // if(ch>='a' && ch<='z'){
        //     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') System.out.println("Lowercase Vowel");
        //     else System.out.println("Lowercase consonant");
        // }

        /*
        Q1 WAJP to check if the number is negative,positive or zero
        Q2 WAJP to find Max number from three number
        Q3 WAJP to find Min number form three number
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");

        int n = sc.nextInt();

        // Q1
        if(n<0) System.out.println("Negative number");
        else if(n==0) System.out.println("Zerooooo");
        else System.out.println("Positive number");

        //Q2 Q3
        System.out.print("Enter Three Number: ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        int maxi = Math.max(a, Math.max(b,c));
        int mini = Math.min(a,Math.min(b, c));
        System.out.println(maxi);
        System.out.println(mini);

        sc.close();
    }
}
