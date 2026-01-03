public class OverloadingExample {
    /*
        3. Write a Java program to demonstrate method overloading by defining both static and non-static methods with the same name but different parameter lists. Your program should include the following:
        A class named OverloadingExample containing:

        A static method named display() that takes an int parameter and prints a message.
        A static method named display() that takes a String parameter and prints a message.
        A non-static method named display() that takes two parameters: an int and a double, and prints a message.
        A non-static method named display() that takes no parameters and prints a default message. 
    */

        public static void display(int a){
            System.out.println("Int Parameter: "+a);
        }
        public static void display(String s){
            System.out.println("String Parameter: "+s);
        }
        public void display(int a, double d){
            System.out.println("Int Parameter: "+a);
            System.out.println("Double Parameter: "+d);
        }
        public void display(){
            System.out.println("This is an default non-static method");
        }

        public static void main(String[] args) {
            display(45);
            display("Yash");
            OverloadingExample ref1 = new OverloadingExample();
            ref1.display(54,45.25);
            ref1.display();
        }

}
