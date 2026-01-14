     /*
        You are given a Java Program that defines two classes: Employee and company.
        The company Employee class has attributes for employee Id, name, and salary, It also contains a static mehtod to create new Employee objects and a method to display employee details.
        The company class maintains a list of employees and displays their details.
    */

import java.util.ArrayList;
import java.util.List;

class Employee {

    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public static Employee createEmployee(int empId, String name, double salary) {
        return new Employee(empId, name, salary);
    }

    public void displayEmployee() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }
}

class Company {

    List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }
    public void displayEmployees() {
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}

public class P2 {
    public static void main(String[] args) {

        Company company = new Company();

        Employee e1 = Employee.createEmployee(1, "Avi", 1000);
        Employee e2 = Employee.createEmployee(2, "Yash", 2000);
        Employee e3 = Employee.createEmployee(3, "Ankit", 3000);

        company.addEmployee(e1);
        company.addEmployee(e2);
        company.addEmployee(e3);

        company.displayEmployees();
    }
}
