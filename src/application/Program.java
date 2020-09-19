package application;

import java.util.Scanner;

import entities.Instructor;
import entities.User;

public class Program {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<instructor.getCoursesNumber() ; i++) {
			
			System.out.print("How many studants for course " + instructor.getCourses().get(i) + "?");
			int usersQuantity = sc.nextInt();
			for(int j = 0 ; j < usersQuantity ; j++) {
				int userCode = sc.nextInt();
				instructor.addStudant(new User(userCode));
			}
			
		}
		
		System.out.println("Total students: " + instructor.getStudants().size());
	
		sc.close();
		
	}
	
}
