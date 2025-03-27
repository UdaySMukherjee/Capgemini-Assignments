package Inheritance;

class FullTimeEmployee extends Employee {
    int bonus;

    void fullTimeEmployeeInfo() {
        employeeInfo();
        System.out.println("Bonus: " + bonus);
    }
}
