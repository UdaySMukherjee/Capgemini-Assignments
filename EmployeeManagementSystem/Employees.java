package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Employees{
	static List<Employee> list_of_emp = new ArrayList<Employee>();
	
	static class MyComparator implements Comparator<Employee>{
		@Override
		public int compare(Employee e1, Employee e2) {
			if(e1.getId()<e2.getId()) {
				return -1;
			}
			else if(e1.getId()>e2.getId()) {
				return 1;
			}
			else {
				return 0;
			}
		}
	}
	
	static class MyComparatorByName implements Comparator<Employee>{
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	}
	
	static class MyComparatorBySalary implements Comparator<Employee>{
		@Override
		public int compare(Employee e1, Employee e2) {
			return Double.compare(e1.getSalary(), e2.getSalary());
		}
	}
	
	
	
	public static void sortEmpOnID() {
		List<Employee> temp = new ArrayList<Employee>();
		temp.addAll(list_of_emp);
//		Collections.sort(temp, new MyComparator());
		Collections.sort(temp);
		for(Employee emp:temp) {
			System.out.println(emp);
		}
	}

	public static void addEmployee(Employee emp) {
		list_of_emp.add(emp);
		System.out.println("Employee added successfully!");
	}

	public static void display() {
		// System.out.println(Arrays.toString(list_of_emp.toArray()));

		// using iterator
		Iterator<Employee> itr = list_of_emp.iterator();
		if(!itr.hasNext()) {
			System.out.println("There is no employee!!");
			return;
		}
		while (itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp);
		}
		
		// using listIterator
		/*
		ListIterator<Employee> itr1 = list_of_emp.listIterator(list_of_emp.size());
		while(itr1.hasPrevious()) {
			Employee emp = itr1.previous();
			System.out.println(emp);
		}
		*/
	}

	public static void searchEmployeeByname(String name) {
		boolean printed = false;
		for (Employee i : list_of_emp) {
			if (i.getName().equals(name)) {
				System.out.println(i);
				printed = true;
			}
		}
		if (!printed) {
			System.out.println("Employee not found!");
		}
	}

	public static void searchEmployeeByID(int id) {
		boolean printed = false;
		for (Employee i : list_of_emp) {
			if (i.getId() == id) {
				System.out.println(i);
				printed = true;
			}
		}
		if (!printed) {
			System.out.println("Employee not found!");
		}
	}

	public static void deleteEmployeeByname(String name) {
		boolean deleted = false;
		Employee e = null;
		for (Employee i : list_of_emp) {
			if (i.getName().equals(name)) {
				e=i;
				deleted = true;
			}
		}
		if (!deleted) {
			System.out.println("Employee not found!");
		}
		else {
			list_of_emp.remove(e);
			System.out.println("Employee deleted!");
		}
	}

	public static void deleteEmployeeByID(int id) {
		boolean deleted = false;
		Employee e = null;
		for (Employee i : list_of_emp) {
			if (i.getId() == id) {
				e=i;
				deleted = true;
			}
		}
		if (!deleted) {
			System.out.println("Employee not found!");
		}
		else {
			list_of_emp.remove(e);
			System.out.println("Employee deleted!");
		}
	}

	public static void updateByID(int id, Scanner sc) {
		boolean found = false;
		Employee emp = null;
		for (Employee i : list_of_emp) {
			if (i.getId() == id) {
				emp = i;
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Employee not found!");
			return;
		}
		boolean loop = true;
		while (loop) {
			System.err.println(" 1. Update name\n 2. update salary\n 3. Update both\n 4. Done Update\n");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1: {
				System.out.println("Enter name:");
				String name = sc.nextLine();
				emp.setName(name);
				System.out.println("Name is updated!");
				break;
			}
			case 2: {
				System.out.println("Enter salary:");
				int salary = sc.nextInt();
				sc.nextLine();
				emp.setSalary(salary);
				System.out.println("Salary is updated!");
				break;
			}
			case 3: {
				System.out.println("Enter name:");
				String name = sc.nextLine();
				System.out.println("Enter salary:");
				int salary = sc.nextInt();
				sc.nextLine();
				emp.setName(name);
				emp.setSalary(salary);
				System.out.println("Both name and Salary are updated!");
				break;
			}
			default: {
				System.out.println("Update done!");
				loop = false;
			}
			}
		}
	}


}
