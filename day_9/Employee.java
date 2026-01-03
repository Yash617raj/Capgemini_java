public class Employee {
    /*
        2. Write a Java program that performs the following tasks:
        Create a class Employee with three attributes: id, name, and sal (salary).
        Implement a parameterized constructor to initialize these attributes.
        Create a non-static method printDetails() to display employee details.
        In the main() method:
        Create an 4 Employee object
    */

        int id;
        String name;
        double sal;

        Employee(int id, String name,double sal){
            this.id = id;
            this.name=name;
            this.sal=sal;
        }
        public void printDetails(){
            System.out.println("Id: "+id);
            System.out.println("Name: "+name);
            System.out.println("Salary: "+sal);
        }

        public static void main(String[] args){
            Employee emp1 = new Employee(1, "Yash", 100000);
            Employee emp2 = new Employee(2, "Avi", 8456123);
            Employee emp3 = new Employee(3, "Ankit", 232165);
            Employee emp4 = new Employee(4, "Shivam", 9784641);

            emp1.printDetails();
            emp2.printDetails();
            emp3.printDetails();
            emp4.printDetails();
        }
}
