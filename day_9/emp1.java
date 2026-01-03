class Employees {
    /*
        Q2. Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary. Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string.
    */

        private int employee_id;
        private String employee_name;
        private double employee_salary=50000.0;

        public int getId(){
            return employee_id;
        }
        public void setId(int employee_id){
            this.employee_id=employee_id;
        }

        public String getName(){
            return employee_name;
        }
        public void setName(String employee_name){
            this.employee_name=employee_name;
        }

        public String getSal(){
            return String.valueOf(employee_salary);
        }
}

public class emp1{
    public static void main(String[] args) {
        Employees emp = new Employees();

        emp.setId(1);
        emp.setName("Yash");
        
        System.out.println("Id: "+emp.getId());
        System.out.println("Name: "+emp.getName());
        System.out.println("Salary: "+emp.getSal());
    }
}


