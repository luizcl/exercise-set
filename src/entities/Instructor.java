package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Instructor {
	
	private Set<User> studants = null;
	private List<Character> courses = null;
	private Integer coursesNumber = null;

	public Instructor() {
		this.studants = new HashSet<>();
		inicializeCourses();
		
	}

	public Instructor(Set<User> studants) {
		this.studants = studants;
		inicializeCourses();
	}

	public Set<User> getStudants() {
		return studants;
	}

	public boolean addStudant(User studant) {
		return this.studants.add(studant);
	}
	
	public boolean removeStudant(User studant) {
		return this.studants.remove(studant);
	}

	public List<Character> getCourses() {
		return courses;
	}

	public int getCoursesNumber() {
		return coursesNumber;
	}
	
	private void inicializeCourses() {
		
		this.courses = new ArrayList<>();
		if(coursesNumber == null)
			this.coursesNumber = Integer.valueOf(3);
		
		final char first = 'A';
		
		for(int i = 0 ; i < this.coursesNumber ; i++) {
			
			int aux = (int) first;
			aux = aux + i;
			char auxChar = (char) aux;
			courses.add(auxChar);
			
		}
		
	}

}
