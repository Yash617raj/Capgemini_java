public class Eight {
    // how to use non static variable inside non static context: Directly, With the help of 'this' variable

    //how to use static variable inside non static context:Directly, With the help of 'this' variable, With the help of className

    // non static block: It is a block which is defined inside class area or global area without static keyword, It is also known as 

    // int a=10;
    // static int a = 30;

    // public void test(){
    //     System.out.println("Test start");
    //     System.out.println("Directly: "+a);
    //     System.out.println("With the help of this: "+this.a);
    //     System.out.println("With the help of ClassName: "+Eight.a); // for static only
    //     System.out.println("Test end");
    // }
    // public static void main(String[] args){
    //     System.out.println("Main start");
    //     Eight ref = new Eight();
    //     ref.test();
    //     System.out.println("Main end");
    // }

    //Q. WAJP to execute instance initializer block and execute non static method before the execution of main method

    // static{
    //     System.out.println("Hello from static block");
    //     Eight ref = new Eight();
    // }

    // {
    //    System.out.println("Hello from instance block");
    //    test();
    // }
    // public void test(){
    //     System.out.println("Hello from test method");
    // }

    // public static void main(String[] args){
    //     System.out.println("Main Start");
    //     System.out.println("Main end");
    // }

    // copy constructor

    // int id;
    // String name;
    // public Eight(int id,String name){
    //     this.id = id;
    //     this.name = name;
    // }
    // public Eight(Eight obj){
    //     this.id = obj.id;
    //     this.name = obj.name;
    // }

    // public static void main(String[] args){
    //     System.out.println("Main start");
    //     Eight ref1 = new Eight(1,"rohit");
    //     System.out.println(ref1.id);
    //     System.out.println(ref1.name);

    //     System.out.println("After copy constructor");
    //     Eight ref2 = new Eight(ref1);
    //     System.out.println(ref2.id);
    //     System.out.println(ref2.name);

    // }

    // Constructor Chaining

    int id;
    String name;
    double sal;

    public Eight(){
        this.id = 101;
        this.name = "Unknown";
        this.sal = 50000.0;
    }

    public Eight(int id){
        this();
        this.id = id;
    }

    public Eight(String name){
        this();
        this.name = name;
    }

    public static void main(String[] args){
        System.out.println("Main start");
        Eight ref1 = new Eight(1);

        System.out.println(ref1.id);
        System.out.println(ref1.name);
        System.out.println(ref1.sal);

        Eight ref2 = new Eight("Joe");

        System.out.println(ref2.id);
        System.out.println(ref2.name);
        System.out.println(ref2.sal);


    }
    
}
