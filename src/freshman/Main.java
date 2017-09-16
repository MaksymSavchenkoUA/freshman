/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freshman;

import freshman.models.Group;
import freshman.models.Professor;
import freshman.models.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", "Ivanov", 17, 4.1, false, true);
        Student st2 = new Student("Nick", "Nickolaev", 18, 4.3, false, true);
        Student st3 = new Student("Petya", "Petrov", 17, 3.1, false, false);
        Student st4 = new Student("Serg", "Sergeev", 16, 4.7, false, false);

        Group gr1 = new Group("Group 1");

        Professor pr1 = new Professor("Fedor", "Michailovich", 56, "Nuclear physics");

        List<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);

        gr1.setStudents(students);

        Scanner scanner1 = new Scanner(System.in);
        int i = 0;
        System.out.println("Freshman program");
        do {
            System.out.printf("Main Menu\nPlease enter command\n1 - Add new Student\n2 - See All Students\n3 - Choose New Claas Monitor for Max Average Rating\n4 - Rollcoll\n5 - Exit\n");
            String input1 = scanner1.nextLine();
            i = Integer.parseInt(input1);
            switch (i) {
                case 1:
                    Student stn = new Student();
                    System.out.println("Enter Student Name - ");
                    String inputName = scanner1.nextLine();
                    stn.setName(inputName);
                    System.out.println("Enter Student Surname - ");
                    String inputSurname = scanner1.nextLine();
                    stn.setSurName(inputSurname);
                    System.out.println("Enter Student Age (number) - ");
                    boolean nextInt = true;
                    do {
                        String inputAge = scanner1.nextLine();
                        try {
                            int inputAgeInt = Integer.parseInt(inputAge);
                            stn.setAge(inputAgeInt);
                            nextInt = true;
                        } catch (Exception e) {
                            System.out.println("Error data format");
                            System.out.println("Enter Student Age (number) - ");
                            nextInt = false;
                        }

                    } while (!nextInt);
                    System.out.println("Enter Student Average Rating (double) - ");
                    boolean nextDoub = true;
                    do {
                        String inputRat = scanner1.nextLine();
                        try {
                            double inputRatDoub = Double.parseDouble(inputRat);
                            stn.setAveRat(inputRatDoub);
                            nextDoub = true;
                        } catch (Exception e) {
                            System.out.println("Error data format");
                            System.out.println("Enter Student Average Rating (double) - ");
                            nextDoub = false;
                        }

                    } while (!nextDoub);
                    System.out.println("Stundent in class? (yes or no) ");

                    boolean inClassBool = true;
                    do {
                        String inputInClass = scanner1.nextLine();
                        if (inputInClass.equals("yes")) {
                            stn.setInClass(true);
                            break;
                        }
                        if (inputInClass.equals("no")) {
                            stn.setInClass(false);
                            break;
                        }

                        System.out.println("Answer error");
                        System.out.println("Stundent in class? (yes or no) ");
                        inClassBool = false;

                    } while (!inClassBool);
                    System.out.println("Successfully added a new student");
                    System.out.println(stn);
                    students.add(stn);
                    
                    gr1.setStudents(students);

                    break;
                case 2:
                    for (Student student : gr1.getStudents()) {
                        System.out.println(student);
                    }
                    break;
                case 3:
                    double maxAveRat = 0.0;

                    for (Student student : gr1.getStudents()) {
                        if (maxAveRat < student.getAveRat()) {
                            maxAveRat = student.getAveRat();
                        }
                    }

                    for (Student student : gr1.getStudents()) {
                        if (maxAveRat == student.getAveRat()) {
                            student.setClassMonitor(true);
                            System.out.println("New Class Monitor of " + gr1.getName());
                            System.out.println(student);
                        }
                    }
                    break;
                case 4:
                    System.out.print(pr1 + "\nMakes Rollcoll\n");
                    int inClass = 0;
                    System.out.println("In Class - ");
                    for (Student student : gr1.getStudents()) {
                        if (student.isInClass()) {
                            inClass++;
                            System.out.println(student);
                        }
                    }
                    double percentages = 100 * inClass / gr1.getStudents().size();

                    System.out.printf("Now in class we have " + inClass + " Students, or " + percentages + " percentages of students\n");
                    break;
            }

        } while (i != 5);
        System.out.println("Bye)");
    }

}
