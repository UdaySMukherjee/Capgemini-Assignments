package EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("............Welcome............");
			System.out.println(
					" 1. ADD Employee\n 2. Print All Employee\n 3. Search Employee\n 4. Search Employee by ID\n 5. Delete Employee\n 6. Delete Employee By ID\n 7. Update Employee By ID\n 8. Sort Employee on ID");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				Employee emp = createEmployeeObject(sc);
				Employees.addEmployee(emp);
				break;
			}
			case 2: {
				Employees.display();
				break;
			}
			case 3: {
				searchEmployee(sc);
				break;
			}
			case 4:{
				searchEmployeeByID(sc);
				break;
			}
			case 5:{
				deleteEmployee(sc);
				break;
			}
			case 6:{
				deleteEmployeeById(sc);
				break;
			}
			case 7:{
				updateEmployeeByID(sc);
				break;
			}
			case 8:{
				Employees.sortEmpOnID();
				break;
			}
			default:{
				System.out.println("You are WelCome!!");
				sc.close();
				System.exit(0);
			}
			
			}
		}
	}

	private static void updateEmployeeByID(Scanner sc) {
		System.out.println("Enter ID:");
		int id = sc.nextInt();
		sc.nextLine();
		Employees.updateByID(id, sc);
	}

	private static void deleteEmployeeById(Scanner sc) {
		System.out.println("Enter ID:");
		int id = sc.nextInt();
		sc.nextLine();
		Employees.deleteEmployeeByID(id);
	}

	private static void deleteEmployee(Scanner sc) {
		sc.nextLine();
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		Employees.deleteEmployeeByname(name);
	}

	private static void searchEmployeeByID(Scanner sc) {
		System.out.println("Enter ID:");
		int id = sc.nextInt();
		sc.nextLine();
		Employees.searchEmployeeByID(id);
		
	}

	private static void searchEmployee(Scanner sc) {
		sc.nextLine();
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		Employees.searchEmployeeByname(name);
	}

	private static Employee createEmployeeObject(Scanner sc) {
		System.out.println("Enter ID, Name and Salary:");
		Employee emp = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
		sc.nextLine();
		return emp;
	}

}
