import java.util.Scanner;

@SuppressWarnings("unused")
public class Fourth {
    public static void main(String[] args){
        // 54 WJAP to print digit of a given number.
            
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the number: ");

            // int n = sc.nextInt();
            // while(n>0){
            //     int dig = n%10;
            //     System.out.println(dig);
            //     n/=10;
            // }
            // sc.close();

        // 55 WJAP to print even digit of a given number

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the number: ");

            // int n = sc.nextInt();
            // while(n>0){
            //     int dig = n%10;
            //     if(dig%2==0) System.out.println(dig);
            //     n/=10;
            // }
            // sc.close();

        // 56 WJAP to print prime digit of given number

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the number: ");

            // int n = sc.nextInt();
            // while(n>0){
            //     int dig = n%10;
            //     boolean flag = true;
            //     for(int i=2;i<dig;i++){
            //         if(dig%i==0){
            //             flag = false;
            //             break;
            //         }
            //     }
            //     if(flag) System.out.println(dig);
            //     n/=10;
            // }
            // sc.close();

        // 57 WAJP to calculate sum of all digits.

        // Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter the number: ");

        //     int n = sc.nextInt();
        //     int sum =0;
        //     while(n>0){
        //         int dig = n%10;
        //         sum+=dig;
        //         n/=10;
        //     }
        //     System.out.println("sum of digit: "+sum);
        //     sc.close();

        // 58. find the odd digit sum and even digit sum then multiply them

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the number: ");

            // int n = sc.nextInt();
            // int oSum=0,eSum=0;
            // while(n>0){
            //     int dig = n%10;
            //     if(dig%2==0) oSum+=dig;
            //     else eSum+=dig;
            //     n/=10;
            // }
            // System.out.println("Answer is: "+(oSum*eSum));
            // sc.close();

        // 59. WJAP to find smallest digit

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the number: ");

            // int n = sc.nextInt();
            // int mini =Integer.MAX_VALUE;
            // while(n>0){
            //     int dig = n%10;
            //     if(dig<mini) mini = dig;
            //     n/=10;
            // }
            // System.out.println("smallest digit: "+mini);
            // sc.close();

        //60.. WJAP to find largest digit

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the number: ");

            // int n = sc.nextInt();
            // int maxi = 0;
            // while(n>0){
            //     int dig = n%10;
            //     if(dig>maxi) maxi = dig;
            //     n/=10;
            // }
            // System.out.println("Largest digit: "+maxi);
            // sc.close();

        //Q. WAJP to find Second smallest digit

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the number: ");

            // int n = sc.nextInt();
            // int mini =Integer.MAX_VALUE,mini2=Integer.MAX_VALUE;
            // while(n>0){
            //     int dig = n%10;
            //     if(dig<mini){
            //         mini2 = mini;
            //         mini = dig;
            //     }
            //     else if(dig>mini && dig<mini2) mini2 = dig;
            //     n/=10;
            // }
            // System.out.println("Second smallest digit: "+mini2);
            // sc.close();

        //Q. WAJP to find second largest

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the number: ");

            // int n = sc.nextInt();
            // int maxi = -1, maxi2 = -1;
            // while (n > 0) {
            //     int dig = n % 10;
            //     if (dig > maxi) {
            //         maxi2 = maxi;
            //         maxi = dig;
            //     } 
            //     else if (dig < maxi && dig > maxi2) {
            //         maxi2 = dig;
            //     }
            //     n /= 10;
            // }
            // System.out.println("Second largest digit: " + maxi2);
            // sc.close();

        //Q. WAJP to check whether the given number is special(sum of digit + product of digit == number) number or not

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the number: ");

            // int n = sc.nextInt();
            // int sum=0,pro=1,temp=n;
            // while(n>0){
            //     int dig = n%10;
            //     sum+=dig;
            //     pro*=dig;
            //     n/=10;
            // }
            // if(sum+pro == temp) System.out.println(temp+" is a special number");
            // else System.out.println("Not special");
            // sc.close();

        //Q. WJAP to print special numbers from the range 1 to 100;

        
            // for(int i=1;i<=100;i++){
            //     int sum=0,pro=1,temp=i;
            //     while(temp>0){
            //         int dig = temp%10;
            //         sum+=dig;
            //         pro*=dig;
            //         temp/=10;
            //     }
            //     if(sum+pro == i) System.out.println(i+" is a special number");
            // }

        //Q. WAJP to check if it is a niven number (number %sum of digit==0)

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the number: ");

            // int n = sc.nextInt();
            // int sum=0,temp=n;
            // while(n>0){
            //     int dig = n%10;
            //     sum+=dig;
            //     n/=10;
            // }
            // if(temp%sum==0) System.out.println(temp+" is a Niven number");
            // else System.out.println("Not Niven");
            // sc.close();

        // Q. WAJP to print the factorial of all digit

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the number: ");

            // int n = sc.nextInt();
            
            // while(n>0){
            //     int fact =1;
            //     int dig = n%10;
            //     for(int i=1;i<=dig;i++){
            //         fact*=i;
            //     }
            //     System.out.println(dig+" factorial is: "+fact);
            //     n/=10;
            // }
            
            // sc.close();

        //Q. WAJP to check whether the  given number is strong(sum of factorial==number) number or not

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the number: ");

            // int n = sc.nextInt();
            // int sum =0,temp=n;
            // while(n>0){
            //     int fact =1;
            //     int dig = n%10;
            //     for(int i=1;i<=dig;i++) fact*=i;
            //     sum+=fact;
            //     n/=10;
            // }
            // if(sum==temp) System.out.println(temp+" is a strong number");
            // else System.out.println("Not a strong number");
            
            // sc.close();

        //Q. WAJP to check if the given number is palindrome or not

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the number: ");

            // int n = sc.nextInt();
            // int rev=0,temp=n;
            // while(n>0){
            //     int dig = n%10;
            //     rev = rev*10+dig;
            //     n/=10;
            // }
            // if(rev==temp) System.out.println(temp+" Is a Palindrome");
            // else System.out.println("Not a palindrome");
            
            // sc.close();

        // Q. WAJP to print all palindrome numbers from the range 100 to 200;
            
            // for(int i=100;i<=200;i++){
            //     int rev=0,temp=i;
            //     while(temp>0){
            //         int dig = temp%10;
            //         rev = rev*10+dig;
            //         temp/=10;
            //     }
            //     if(rev==i) System.out.println(i+" is a palindrome");
            // }

        // Q. WAJP to print all strong numbers from the range 1 to 1000

            // for(int i=1;i<=1000;i++){
            //     int temp=i,sum=0;
            //     while(temp>0){
            //         int fact =1;
            //         int dig = temp%10;
            //         for(int j=1;j<=dig;j++) fact*=j;
            //         sum+=fact;
            //         temp/=10;
            //     }
            //     if(sum==i) System.out.println(i+" is a strong number");
            // }

            // Q. WAJP to check if the number is abundant(sum of factor>number) or not

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the number: ");

            // int n = sc.nextInt();
            // int sum=0;
            // for(int i=1;i<n;i++){
            //     if(n%i==0) sum+=i;
            // }
            // if(sum>n) System.out.println(n+" is a abundant number");
            // else System.out.println("Not abundant");
                
            // sc.close();

        // Q.WAJP check if the number is Xylem or Phloem or not

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the number: ");

            // int n = sc.nextInt();
            // int temp =n;
            // int out =n%10;
            // n/=10;
            // int sum=0;
            // while(n>10){
            //     int dig = n%10;
            //     sum+=dig;
            //     n/=10;
            // }
            // int in = n%10;
            // if(out+in != sum) System.out.println(temp+" is a phloem number");
            // else System.out.println(temp+" is a xylem number");
        
            // sc.close();

        // Q. WAJP to check if the number is Disarium(sum of digit to the power of position == number) or not

        // Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter the number: ");

        //     int n = sc.nextInt();
        //     String s = Integer.toString(n);
        //     int i=s.length(),sum=0,temp=n;

        //     // while(n>0){
        //     //     i++;
        //     //     n/=10;
        //     // }
        //     // n=temp;

        //     while(n>0){
        //         int dig = n%10;
        //         sum+= (int)Math.pow(dig, i);
        //         n/=10;
        //         i--;
        //     }
        //     if(sum==temp) System.out.println(temp+" is a disarium number");
        //     else System.out.println(temp+" is not a disarium number");
        //     sc.close();

    }

    /* Q. WAJP to create calculator class consist of 4 methods
            1. to add 3 var, 
            2.to multiply 3 var,
            3. to sub 4 var,
            4. to add 2 var
        */
}
