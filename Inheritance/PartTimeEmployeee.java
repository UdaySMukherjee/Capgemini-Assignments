package Inheritance;

class PartTimeEmployee extends Employee {
    int workingHours;

    void partTimeEmployeeInfo() {
        employeeInfo();
        System.out.println("Working Hours: " + workingHours);
    }
}