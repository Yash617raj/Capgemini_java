public class Students {
    /*
        Create a Java class named Student with the following requirements:
        1. Instance variables:
            int id,String name int[] marks(size 3)
        2 Create:
            A parameterized constructor to intiliaze all variable.
            A copy construcor that creates a deep copy of a Student object.
        3. In the main method: 
            Create on Student object using the parameterized constructor.
            Create another Student object using the copy constructor.
            Modify the marks of the copied object,
            Print details of both objects
        4. Ensure that changes made to the copied object do not affect the original object.
    */
    int id;
    String name;
    int[] marks = new int[3];

    public Students(int id,String name,int[] marks){
        this.id = id;
        this.name = name;
        this.marks = new int[marks.length];

        for(int i=0;i<marks.length;i++){
            this.marks[i] = marks[i];
        }
    }

    public Students(Students s){
        this.id = s.id;
        this.name = s.name;
        this.marks = new int[marks.length];
        for(int i=0;i<marks.length;i++){
            this.marks[i] = marks[i];
        }
    }

    public static void main(String[] args){
        Students s1 = new Students(1,"Joe",new int[]{90,80,70});
        Students s2 = new Students(s1);
        s2.marks[0] = 40;
        s2.marks[1] = 48;
        s2.marks[2] = 51;

        System.out.println("Original Student details:");
        System.out.println("ID: "+s1.id);
        System.out.println("Name: "+s1.name);
        System.out.println("Marks: "+s1.marks[0]+", "+s1.marks[1]+", "+s1.marks[2]);
        System.out.println("Copied Student details:");

        System.out.println("ID: "+s2.id);
        System.out.println("Name: "+s2.name);
        System.out.println("Marks: "+s2.marks[0]+", "+s2.marks[1]+", "+s2.marks[2]);

    }



}
