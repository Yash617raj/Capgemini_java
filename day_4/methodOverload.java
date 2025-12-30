import java.util.Scanner;

public class methodOverload {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of square: ");
        int n = sc.nextInt();
        System.out.println(calculateArea(n));

        System.out.println("Enter the radius: ");
        double r = sc.nextDouble();
        System.out.println(calculateArea(r));

        System.out.println("Enter the length and breath of rectangle: ");
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println(calculateArea(a, b));
        sc.close();
        
    }

    public static int calculateArea(int side){
        return side*side;
    }
    public static double calculateArea(double radius){
        return 3.14*radius*radius;
    }
    public static int calculateArea(int length,int breadth){
        return length*breadth;
    }
   
}
