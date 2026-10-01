package net.seniorsteps.java.Faculty.UniversitySystem;

public class Person {
    private String name;
    private int id;
    private int age;
    private static int totalPeople ;
    public static final String college = "Faculty of Computers and Artificial intelligence";

    public Person() {
    }

    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        totalPeople++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getTotalPeople() {
        return totalPeople;
    }

    public String toString(){
        return (" Name: " + name + "\n Id: " + id + "\n Age: " + age);
    }
}
