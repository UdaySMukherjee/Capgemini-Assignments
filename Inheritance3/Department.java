package Inheritance3;

class Department {
    String deptName;
    Employee[] employees;
    int employeeCount = 0;

    Department(int size) {
        employees = new Employee[size];
    }

    void addEmployee(Employee emp) {
        if (employeeCount < employees.length) {
            employees[employeeCount++] = emp;
        } else {
            System.out.println("Department is full!");
        }
    }

    void displayEmployees() {
        System.out.println("Department: " + deptName);
        for (int i = 0; i < employeeCount; i++) {
            employees[i].employeeInfo();
        }
    }
}