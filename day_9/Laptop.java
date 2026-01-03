public class Laptop {
    /*
        Write a Java program to create a Laptop class that demonstrates constructor chaining using this().
        Requirements:
        The Laptop class should have three instance variables:
        brand (String)
        ramSize (int)
        price (double)

        Implement the following constructors using constructor chaining (this()):
        Default constructor that sets default values ("Unknown", 8GB, 50000.0).
        Constructor with only brand (calls the default constructor).
        Constructor with brand and ramSize (calls the constructor with brand).
        Constructor with all three fields (brand, ramSize, price) --(the final constructor)--.
        Create a printDetails() method to display laptop details.
        In main(), create different Laptop objects using all constructors and print their details.
    */

        String brand;
        int ramSize;
        double price;

        public Laptop(){
            brand="Unknown";
            ramSize=8;
            price = 50000.0;
        }

        public Laptop(String brand){
            this();
            this.brand = brand;
        }

        public Laptop(String brand,int ramSize){
            this(brand);
            this.brand=brand;
            this.ramSize=ramSize;
        }

        public Laptop(String brand,int ramSize,double price){
            this.brand=brand;
            this.ramSize=ramSize;
            this.price=price;
        }

        public void printDetails(){
            System.out.println("The name of brand is: "+brand);
            System.out.println("The size of ram is: "+ramSize+"gb");
            System.out.println("The price of Laptop is: "+price);
            System.out.println("-----------------------------");
        }

        public static void main(String[] args){
            Laptop ref1 = new Laptop();
            ref1.printDetails();
            Laptop ref2= new Laptop("Asus");
            ref2.printDetails();
            Laptop ref3 = new Laptop("Dell", 16);
            ref3.printDetails();
            Laptop ref4 = new Laptop("Samsung", 32, 95786);
            ref4.printDetails();
        }

}
