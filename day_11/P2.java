// WAJP to achieve multiple inheritance

interface Father{
    void test1();
}

interface Mother{
    void test2();
}

class Child implements Father,Mother{
    @Override
    public void test1(){
        System.out.println("This is the Father");
    }

    @Override
    public void test2(){
        System.out.println("This is the mother");
    }
}

public class P2 {
    public static void main(String[] args) {
        Father ref1 = new Child();
        ref1.test1();
        
        Mother ref2 = new Child();
        ref2.test2();
    }
}

