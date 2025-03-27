package Inheritance2;

class Professor extends Person {
    String specialization;

    void displayProfessorInfo() {
        displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}
