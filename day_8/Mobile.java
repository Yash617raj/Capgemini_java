public class Mobile {
    /*
        A mobile phone can be initialized with default settings or custom settings.
        Create class Mobile with:
            •	String brand
            •	int storage
            •	boolean is5G

        Requirements:
            1.	Default constructor sets:
            •	brand = “Unknown”
            •	storage = 64
            •	is5G = false
            2.	Parameterized constructor sets all values.
            3.	Use this() to chain constructors.
    */

    String brand;
    int storage;
    boolean is5G;

    public Mobile(){
        brand = "Unknown";
        storage = 64;
        is5G=false;
    }

    public Mobile(String brand){
        this();
        this.brand = brand;
        
    }

    public static void main(String[] args){
        Mobile ref = new Mobile("Samsung");
        System.out.println(ref.brand);
        System.out.println(ref.storage);
        System.out.println(ref.is5G);
    }
}
