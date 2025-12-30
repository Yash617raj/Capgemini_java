public class Processor {
/*
    Write a Java program that satisfies all the following conditions:

    Requirements
        1.	Create a class named Processor.
        2.	Declare two non-static variables x and y.
        4.	Initialize the instance variables only inside a non-static method using the this keyword.
        5.	Create three non-static methods:
            •	initialize() – assigns values to x and y using this.
            •	update() – modifies the values of x and y and demonstrates variable shadowing by declaring a local  variable with the same name as one instance variable.
            •	display() – prints the final values of the instance variables.
        6.	One non-static method must call another non-static method using the this keyword.
*/


    int x;
    int y;

    void initialize() {
        this.x = 10;
        this.y = 20;

    }

    void update() {
        int x = 5;              
        this.x = this.x + x;    
        this.y = this.y + 10;
    }

    void display() {
        System.out.println("Final value of x: " + this.x);
        System.out.println("Final value of y: " + this.y);
    }

    public static void main(String[] args) {
        Processor p = new Processor();
        p.initialize();
        p.update();
        p.display();
    }
}
