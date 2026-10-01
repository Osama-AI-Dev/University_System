package net.seniorsteps.java.Faculty.UniversitySystem;

public class Doctor extends Person{
    private String department;
    private double salary;

    public Doctor() {
    }

    public Doctor(String name, int id, int age, String department, double salary) {
        super(name, id, age);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return (super.toString() + "\n Department: " + department + "\n Salary: " + salary);
    }
}
