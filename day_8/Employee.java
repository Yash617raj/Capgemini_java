public class Employee {
    /*
        A company stores employee details along with address information.
        Question
        Create classes:
            1. Address → city
            2. Employee → id, Address address
        Add:
            parameterized constructor
            copy constructor that performs shallow copy
        Steps:
            1	Create employee emp1
            2	Create emp2 using copy constructor
            3	Change city via emp2
            4	Print city of both employees
    */

    int id;
    Address address;

    public Employee(int id,String city){
        this.id = id;
        this.address = new Address();
        this.address.city = city;
    }

    public Employee(Employee emp){
        this.id = emp.id;
        this.address = emp.address; 
    }

    public static void main(String[] args){
        Employee emp1 = new Employee(1,"Delhi");
        Employee emp2 = new Employee(emp1);
        emp2.address.city = "Goa";

        System.out.println("Original Employee: ");
        System.out.println("Origial city: "+emp1.address.city);

        System.out.println("Copied Employee");
        System.out.println("Copy city: "+emp2.address.city);
    }

}

class Address{
    String city;
}