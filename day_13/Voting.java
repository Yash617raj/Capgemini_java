import java.util.Scanner;

class NotEligibleException extends Exception{
    public NotEligibleException(String msg){
        System.out.println("dasfa");
    }
}

public class Voting {
    public static void main(String[] args){
        System.out.println("Main start");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        try {
            eligibleForVoting(age);
        } catch (NotEligibleException e) {
            e.printStackTrace();
        }
    }

    public static void eligibleForVoting(int age) throws NotEligibleException{
        if(age>=18) System.out.println("Eligible for voting");
        else System.out.println("Your age is less than 18");
    }
}
