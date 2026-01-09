/*
    1. Create a base class Person with method:
	showRole() → prints "I am a person"

    2. Create two child classes:
        Student extends Person
        Teacher extends Person

    3. Create two interfaces:
        Sports → method play()
        Cultural → method perform()

    4. Create a class CollegeStudent that:
        Extends Student
        Implements both Sports and Cultural

    5. In main():
        Create object of CollegeStudent
        Call all methods
*/

class Person {
    public void showRole() {
        System.out.println("I am a person");
    }
}

class Student extends Person {
    public void showRole() {
        System.out.println("I am a Student");
    }
}

class Teacher extends Person {
    public void showRole() {
        System.out.println("I am a Teacher");
    }
}

interface Sports {
    void play();
}

interface Cultural {
    void perform();
}

class CollegeStudent extends Student implements Sports, Cultural {

    @Override
    public void play() {
        System.out.println("I play sports");
    }

    @Override
    public void perform() {
        System.out.println("I perform cultural activities");
    }
}

public class P3 {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();

        cs.showRole();   // from Student
        cs.play();       // from Sports
        cs.perform();    // from Cultural
    }
}

