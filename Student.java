package net.seniorsteps.java.Faculty.UniversitySystem;

public class Student extends Person {
    private double gpa;
    private int level;

    public Student() {
    }

    public Student(String name, int id, int age, int level ,  double gpa) {
        super(name, id, age);
        this.level = level;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString(){
        return (super.toString() + "\n Level: " + level + "\n Gpa: " + gpa);
    }
}
