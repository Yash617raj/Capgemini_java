public class Seventh {
    // Whenever we have static variable and local variable with same name, if we use directly inside static context the high priority is give to local variable, to use static variable we have consider classname. ClassName.member
    
    /*
        towards class static area.

        stack area: it is used for execution
        heap area: 

        Note: for execution JVM first calls main method
    */

    // WJAP to overload main method
    
    // static int a=10;
    
    // public static void main(String[] args){
    //     // System.out.println("main start");
    //     // System.out.println(a);
    //     // test();
    //     // System.out.println("main end");

    //     System.out.println("Main started");
    //     main(19,20);
    //     System.out.println("Main Ended");


    // }

    // public static void main(int a,int b){
    //     System.out.println("First Number is: "+a);
    //     System.out.println("Second Number is: "+b);

    //     System.out.println("Main overloaded");
    // }

    // public static void test(){
    //     System.out.println("test start");
    //     System.out.println(a);
    //     int a = 25;
    //     System.out.println(a);
    //     System.out.println(Seventh.a);
    //     System.out.println("test end");
    // }

    // how to use static memebers inside static context: directly, with the help of className,with teh help of object reference vairable
    
    // static int a =10;
    // public static void main(String[] args){
    //     System.out.println("main start");
    //     System.out.println("Directly: "+a);
    //     System.out.println("With the help of ClassName: "+Seventh.a);

    //     Seventh ref = new Seventh();
    //     System.out.println("With the help of object ref: "+ref.a);
    //     System.out.println("main end");
    // }

    /*
        Whenvever we have non static variable and local variable with same, if we use directly inside non static context the high priority is given for local variable. to use non static variable we have to use 'this'

        this is keywords, it is a non static reference variable,it is used to store address of current object, it can be used only inside non static context.
    */ 


        

    
}
