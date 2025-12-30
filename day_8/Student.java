public class Student {
    /*
        WAJP to create student class consist of four data sauch as id,name,percentage,college name
        create parameterized constructor to intialze only id.
        create parameterized constructor to intialze only name.
        create parameterized constructor to intialze only percentage.
        create parameterized constructor to intialze id and name.
        create parameterized constructor to intialze id and percentage.
        create parameterized constructor to intialze name and percentage.
        create parameterized constructor to intialze id, name and percentage.
        create default / no argument constructor to aassign default values.
        create one static method called printDetail to print all the details of student
        in main method create objects using all constructors.
    */

    int id;
    double percentage;
    String name;
    static String collegeName;

    Student(int id){
        this.id = id;
    }
    Student(String name){
        this.name = name;
    }

    Student(double percentage){
        this.percentage = percentage;
    }

    Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    Student(int id,double percentage){
        this.id = id;
        this.percentage = percentage;
    }

    Student(String name, double percentage){
        this.name=name;
        this.percentage = percentage;
    }

    Student(int id,String name, double percentage){
        this.id = id;
        this.name=name;
        this.percentage = percentage;
    }

    Student(){
        id = 1;
        name = "Joe";
        percentage=80;
        collegeName="ABC";
    }

    public static void printDetail(Student obj){
        System.out.println("Student id: "+obj.id);
        System.out.println("Student name: "+obj.name);
        System.out.println("Student percentage: "+obj.percentage);
        System.out.println("Student collegeName: "+collegeName);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        printDetail(s1);

        Student s2 = new Student(10);
        printDetail(s2);

        Student s3 = new Student("Alex");
        printDetail(s3);

        Student s4 = new Student(85.5);
        printDetail(s4);

        Student s5 = new Student(20, "John");
        printDetail(s5);

        Student s6 = new Student(30, 90.2);
        printDetail(s6);

        Student s7 = new Student("Emma", 88.5);
        printDetail(s7);

        Student s8 = new Student(40, "Mike", 92.3);
        printDetail(s8);
    }

}
