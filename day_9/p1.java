class Person {
    /*
        Q1. Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify each of these variables.
    */

    private String name;
    private int age;
    private String country;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country=country;
    }
}

public class p1{
    public static void main(String[] args){
        Person p = new Person();

        p.setName("AVI");
        p.setAge(23);
        p.setCountry("India");

        System.out.println("Name: "+p.getName());
        System.out.println("Age: "+p.getAge());
        System.out.println("Country: "+p.getCountry());
    }
}
