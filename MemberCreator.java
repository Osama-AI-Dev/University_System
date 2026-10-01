package net.seniorsteps.java.Faculty.UniversitySystem;

import java.util.Scanner;

public class MemberCreator {
    Scanner input = new Scanner(System.in);

    public MemberCreator() {
    }

    public int showMenu(){
        int choice = -1;
        try {
            System.out.println("Add Student .1");
            System.out.println("Add Doctor .2");
            System.out.println("View All Members .3");
            System.out.println("Exit .4");
            choice = input.nextInt();
            input.nextLine();
        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
            input.nextLine();
        }
        return choice;
    }

    public Student createStudent(){
        try {
            System.out.println("--- Adding New Student ---");

            System.out.println("Enter your name:");
            String name = input.nextLine();

            System.out.println("Enter your ID:");
            int id = input.nextInt();
            input.nextLine();
            if (id <= 0){
                System.out.println("Error: ID must be a positive number.");
                System.out.println("-------------------");
                return null;
            }

            System.out.println("Enter your Age: ");
            int age = input.nextInt();
            input.nextLine();
            if (age < 17 || age >23){
                System.out.println("Error: Age must be between 17 and 23.");
                System.out.println("-------------------");
                return null;
            }

            System.out.println("Enter your Level (1 - 4 ): ");
            int level = input.nextInt();
            input.nextLine();
            if (level < 1 || level > 4 ){
                System.out.println("Error: Level must be between 1 and 4.");
                System.out.println("-------------------");
                return null;
            }

            System.out.println("Enter your Gpa (0.0 - 4.0): ");
            double gpa = input.nextDouble();
            input.nextLine();
            if (gpa < 0 || gpa > 4){
                System.out.println("Error: GPA must be between 0.0 and 4.0.");
                System.out.println("-------------------");
                return null;
            }

            return new Student(name, id, age, level, gpa);
        } catch (Exception e) {
            System.out.println("Invalid input! Student was not added.");
            input.nextLine();
            System.out.println("-------------------");
            return null;
        }
    }

    public Doctor createDoctor(){
        try {
            System.out.println("--- Adding New Doctor ---");

            System.out.println("Enter your name:");
            String name = input.nextLine();

            System.out.println("Enter your ID:");
            int id = input.nextInt();
            input.nextLine();
            if (id <= 0){
                System.out.println("Error: ID must be a positive number.");
                System.out.println("-------------------");
                return null;
            }

            System.out.println("Enter your Age: ");
            int age = input.nextInt();
            input.nextLine();
            if (age < 25 || age >60){
                System.out.println("Error: Age must be between 25 and 60.");
                System.out.println("-------------------");
                return null;
            }

            System.out.println("Enter your Department:");
            String department = input.nextLine();

            System.out.println("Enter your Salary:");
            double salary = input.nextDouble();
            input.nextLine();
            if (salary <= 0){
                System.out.println("Error: Salary must be a positive number.");
                System.out.println("-------------------");
                return null;
            }

            return new Doctor(name, id, age, department, salary);
        } catch (Exception e) {
            System.out.println("Invalid input! Doctor was not added.");
            input.nextLine();
            System.out.println("-------------------");
            return null;
        }
    }

}
