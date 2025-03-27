package Inheritance3;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Employee & Department Example
        System.out.print("Enter Department Name: ");
        Department department = new Department(3);
        department.deptName = scanner.next();

        for (int i = 0; i < 3; i++) {
            Employee emp = new Employee();
            System.out.print("Enter Employee Name: ");
            emp.name = scanner.next();
            System.out.print("Enter Employee ID: ");
            emp.salary = scanner.nextDouble();
            System.out.print("Enter Salary: ");
            emp.salary = scanner.nextDouble();
            department.addEmployee(emp);
        }

        department.displayEmployees();
        scanner.close();
        scanner.close();
    }
}