import java.util.*;
public class Exceptions {
    public static void main(){
        // System.out.println("main start");
        // Scanner sc = new Scanner(System.in);

        // try{
        //     System.out.println("enter the value of a: ");
        //     int a = sc.nextInt();
        //     System.out.println("enter the value of b: ");
        //     int b = sc.nextInt();

        //     int ans = a/b;
        //     System.out.println("Ans: "+ans);
        // }
        // catch(Exception e){
        //     e.printStackTrace();
        //     System.out.println("Exception handled");
        // }
        // finally{
        //     System.out.println("Finally block executed");
        //     sc.close();
        // }
        // System.out.println("Main ended");


        // WAJP to handle null pointer exception
        
        // try {
        //     String st = null;
        //     st.concat("raj");
            
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        // WAJP to handle classCastException

        try {
            Object obj = "Hello";     
            Integer i = (Integer) obj; 
        }
        catch (ClassCastException e) {
            e.printStackTrace();
        }



    }
}

