package Inheritance;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Employee Inheritance Example
        FullTimeEmployee ft = new FullTimeEmployee();
        System.out.print("Enter Full-Time Employee Name: ");
        ft.name = scanner.next();
        System.out.print("Enter Salary: ");
        ft.salary = scanner.nextDouble();
        System.out.print("Enter Bonus: ");
        ft.bonus = scanner.nextInt();
        ft.fullTimeEmployeeInfo();

        PartTimeEmployee pt = new PartTimeEmployee();
        System.out.print("Enter Part-Time Employee Name: ");
        pt.name = scanner.next();
        System.out.print("Enter Salary: ");
        pt.salary = scanner.nextDouble();
        System.out.print("Enter Working Hours: ");
        pt.workingHours = scanner.nextInt();
        pt.partTimeEmployeeInfo();
        scanner.close();
    }
}