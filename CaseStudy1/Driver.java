package CaseStudy1;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		University[] uniArr = null;
		University u = null;
		Person p = null;
		while (true) {
			System.out.println();
			System.out.println("---------------------------------------");
			System.out.println("1-> create new university");
			System.out.println("2-> create a new student");
			System.out.println("3-> create a new professor");
			System.out.println("4-> show members of specific university");
			System.out.println("5-> Exit");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
				case 1:
					System.out.println("Enter an University name:");
					String Uname = sc.nextLine();
					u = new University(Uname);
					if(uniArr == null) {
						uniArr = new University[1];
						uniArr[0]=u;
						System.out.println("University created successfully!");
					}
					else {
						int Usize = uniArr.length;
						University[] tempUniArr = Arrays.copyOf(uniArr, Usize+1);
						tempUniArr[Usize] = u;
						uniArr = tempUniArr;
						System.out.println("University created successfully!");
					}
					break;
				case 2:
					if(uniArr == null) {
						System.out.println("First create an university!");
					}
					else {
						System.out.println("In which university, do you want to add:");
						for(int i=0;i<uniArr.length;i++) {
							System.out.print("\t");
							System.out.println(i+1+"-> "+uniArr[i].getUniversityName());
						}
						System.out.println("Enter your choice:");
						choice = sc.nextInt();
						sc.nextLine();
						if(choice>uniArr.length || choice<=0) {
							System.out.println("Invalid input!");
						}
						else {
							System.out.println("Enter Student name:");
							String Sname = sc.nextLine();
							System.out.println("Enter Student age:");
							int Sage = sc.nextInt();
							System.out.println("Enter Student Id:");
							int StudentId = sc.nextInt();
							p = new Student(Sname, Sage, StudentId);
							uniArr[choice-1].addPerson(p);
							System.out.println("Student added successfully!");
						}
					}
					break;
				case 3:
					if(uniArr == null) {
						System.out.println("First create an university!");
					}
					else {
						System.out.println("In which university, do you want to add:");
						for(int i=0;i<uniArr.length;i++) {
							System.out.print("\t");
							System.out.println(i+1+"-> "+uniArr[i].getUniversityName());
						}
						System.out.println("Enter your choice:");
						choice = sc.nextInt();
						sc.nextLine();
						if(choice>uniArr.length || choice<=0) {
							System.out.println("Invalid input!");
						}
						else {
							System.out.println("Enter Professor name:");
							String Pname = sc.nextLine();
							System.out.println("Enter Professor age:");
							int Page = sc.nextInt();
							sc.nextLine();
							System.out.println("Enter Professor specialization:");
							String specialization = sc.nextLine();
							p = new Professor(Pname, Page, specialization);
							uniArr[choice-1].addPerson(p);
							System.out.println("Professor added successfully!");
						}
					}
					break;
				case 4:
					if(uniArr == null) {
						System.out.println("First create an university!");
					}else {
						System.out.println("Which university, do you want to see:");
						for(int i=0;i<uniArr.length;i++) {
							System.out.print("\t");
							System.out.println(i+1+"-> "+uniArr[i].getUniversityName());
						}
						System.out.println("Enter your choice:");
						choice = sc.nextInt();
						if(choice>uniArr.length || choice<=0) {
							System.out.println("Invalid input!");
						}
						else {
							uniArr[choice-1].showPeople();
						}
					}
					break;
				case 5:
					System.out.println("Thank You!");
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Input!");
			}
			
		}
		
	}

}
