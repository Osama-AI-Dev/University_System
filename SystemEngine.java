package net.seniorsteps.java.Faculty.UniversitySystem;

import java.util.ArrayList;


public class SystemEngine {
    ArrayList<Person> list = new ArrayList<>();
    MemberCreator creator = new MemberCreator();

    public SystemEngine() {
    }

    public void startApp(){

        boolean isWorking = true;
        while (isWorking){
            int choice = creator.showMenu();

            if (choice == 4 ){
                isWorking =  false;
            }else {
                processChoice(choice);
            }
        }
    }

    private void processChoice(int choice){
        switch (choice){
            case 1:
                addStudentToSystem();
                break;
            case 2:
                addDoctorToSystem();
                break;
            case 3:
                viewMembers();
                break;
            case -1:
                break;
            default:
                System.out.println("Wrong choice, please try again.");
        }
    }

    private void addStudentToSystem(){
        Student s = creator.createStudent();
        if (s != null){
            list.add(s);
            System.out.println("Student added successfully!");
            System.out.println("-------------------");
        }
    }

    private void addDoctorToSystem(){
        Doctor d = creator.createDoctor();
        if (d != null){
            list.add(d);
            System.out.println("Doctor added successfully!");
            System.out.println("-------------------");
        }
    }

    public void viewMembers(){
        System.out.println("-------------------");
        for (int i = 0 ; i < list.size(); i++){
            if ( list.get(i) instanceof Student ){
                System.out.println("Student Data: ");
                System.out.println(list.get(i).toString());
            } else if (list.get(i) instanceof Doctor) {
                System.out.println("Doctor Data: ");
                System.out.println(list.get(i).toString());
            }
        }
        System.out.println("Total people in System:  " + Person.getTotalPeople());
        System.out.println("-------------------");
    }

}
