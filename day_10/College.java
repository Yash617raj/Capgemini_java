/*
    college wants to manage different branches of engineers using Java inheritance.

    You are given a superclass Engineer and a subclass CSEEngineer.

    Class Structure
    Engineer
        Method: work()
    CSEEngineer (extends Engineer)
        Method: coding()

    Task :
        Create a superclass Engineer with method work().
        Create a subclass CSEEngineer with an additional method coding().
        In the main method:
            Create a CSEEngineer object.
            Perform upcasting and call the work() method.
            Perform downcasting and call the coding() method.
        Add proper comments to explain each step.
*/

class Engineer{
    void work(){
        System.out.println("Enginner method");
    }
}

class CSEEngineer extends Engineer{
    void coding(){
        System.out.println("CSE Engineer method");
    }
}

public class College {
    public static void main(String[] args) {
        Engineer ref1 = new CSEEngineer();
        ref1.work();
        CSEEngineer ref2 = (CSEEngineer) ref1;
        ref2.coding();
    }
        
}
