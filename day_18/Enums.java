import java.util.Scanner;

enum Student_Name{
    Yash,Avi,Ankit,Sky,Sumit,Hitart;
}

public class Enums {
    public static void main(String[] args) {
        System.out.println("Main start");
        // Student_Name[] student = Student_Name.values();
        // for(Student_Name it:student) System.out.println(it);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        String find = sc.next();
        Student_Name f = Student_Name.valueOf(find);
        Student_Name[] names = Student_Name.values();
        for(Student_Name it:names){
            if(f==it){
                System.out.println(f+" is present in the enum at "+it.ordinal());
            }
        }

        System.out.println("Main end");
    }
}
