package Inheritance2;

class Student extends Person {
    int studentId;

    void displayStudentInfo() {
        displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}