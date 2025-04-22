package LamdaFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDriver {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
		
//		empList.forEach(s -> System.out.println(s));
		
		/*
		
		Map<String, List<Employee>> map = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		for(String city:map.keySet()) {
			System.out.println(city+"\n"+map.get(city));
		}
		
		System.out.println("Departments: "+empList.stream().map(s -> s.getDeptName()).distinct().toList());
		System.out.println("Employees whom age greater than 28:\n"+empList.stream().filter(s -> s.getAge()>28).toList());
		System.out.println("Maximum age: "+empList.stream().map(s->s.getAge()).max(Integer::compare).get());
		
		System.out.println("Youngest female employee: "+empList.stream().filter(s -> s.getGender()=="F").min((e1,e2)->e1.getAge()-e2.getAge()).get());
		*/
		
		/*
		 H/W
		 employees age >25 and <30
		 employees dept of "HR"
		 employees live in bangalore and sort by name and print only name of the employees
		 total number of employees
		 sort employees by age
	     highest experienced employee
	     highest salary
		 
		 
		 */
	
	}

}
