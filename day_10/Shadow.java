class Father{
    // variable shadowing
    // int a =10;
    // static int b = 100;

    public static void test(){
        System.out.println("Father class test method");
    }
    public static void demo(int a){
        System.out.println("Father class demo method");
    }
}

class Son extends Father{
    // variable shadowing
    // int a =20;
    // static int b = 200;

    public static void test(){
        System.out.println("Son class test method");
    }
    public static void demo(int a){
        System.out.println("Son class demo method");
    }
}

public class Shadow {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        System.out.println("Main starts");
        System.out.println("---Father object stored in Father ref variable---");
        Father ref1 = new Father();
        // System.out.println(ref1.a);
        // System.out.println(ref1.b);
        ref1.test();
        ref1.demo(0);

        System.out.println("---Son object stored in Son ref variable---");
        Son ref2 = new Son();
        // System.out.println(ref2.a);
        // System.out.println(ref2.b);

        ref2.test();
        ref2.demo(0);

        System.out.println("---Upcasting---");
        Father ref3 = new Son();
        // System.out.println(ref3.a);
        // System.out.println(ref3.b);
        ref3.test();
        ref3.demo(0);

        System.out.println("---Downcasting---");
        Son ref4 = (Son)ref3;
        // System.out.println(ref4.a);
        // System.out.println(ref4.b);

        ref4.test();
        ref4.demo(0);

        System.out.println("Main end");

    }
}
