package Inheritance2;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of people in university: ");
        int size = scanner.nextInt();
        University university = new University(size);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter 1 for Student, 2 for Professor: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                Student student = new Student();
                System.out.print("Enter Student Name: ");
                student.name = scanner.next();
                System.out.print("Enter Age: ");
                student.age = scanner.nextInt();
                System.out.print("Enter Student ID: ");
                student.studentId = scanner.nextInt();
                university.addPerson(student);
            } else if (choice == 2) {
                Professor professor = new Professor();
                System.out.print("Enter Professor Name: ");
                professor.name = scanner.next();
                System.out.print("Enter Age: ");
                professor.age = scanner.nextInt();
                System.out.print("Enter Specialization: ");
                professor.specialization = scanner.next();
                university.addPerson(professor);
            }
        }
        university.showPeople();
        scanner.close();
    }
}