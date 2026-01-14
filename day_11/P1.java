interface Father{
    // showing interface use 
    // abstract public void test();
    // abstract public int add(int a,int b);

    static int a =10; // final static int a
    int b =20; // final static int b
    public static void test(){
        System.out.println("static method");
    }
    // public void demo(){}  we cannot create non- static method
    // {} we can't create initiliazer in the interface neither static, or non-static
    // Father(){} We can't create constructor in the interface

    void abs();

}

class Son implements Father{
    // showing interface use 
    // @Override
    // public void test(){
    //     System.out.println("Abstract Method override");
    // }

    // @Override
    // public int add(int a,int b){
    //     return a+b;
    // }

    @Override
    public void abs(){
        System.out.println("abstract method");
    }
}

public class P1{
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        System.out.println("Main start");
        // Father ref = new Father(); CTE cannot instantiate the type Father

        Father ref = new Son();
        ref.abs();
        System.out.println(ref.a);
        System.out.println(ref.b);
        // ref.a = 100; CTE, as the variable is final and cannot be re-initialize 
        // ref.test() CTE, This static method of interface Father can only be accessed as Father.test
        Father.test();
        System.out.println("Main end");
    }
}