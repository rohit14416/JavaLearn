package io.rohitbrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//import java.util.concurrent.locks.Condition;

public class Unit1ExerciseJava7 {

	public static void main(String[] args) {
		
	List<Person> people = Arrays.asList
			(new Person("Rohit","Varma",31),
			 new Person("Canasa","kunaparaju",26),
			 new Person("Manasa","Kunaparaju",26),
			 new Person("Sanasa","Chllunaparaju",26),
			 new Person("Padmini","Varma",35),
			 new Person("Zadmini","Zarma",35));
	
	//Step1 : Sort List by Last Name
	Collections.sort(people, new Comparator<Person>() {
		@Override
		public int compare(Person o1, Person o2) {
			return o1.getLastName().compareTo(o2.getLastName());
		}			
	});
	
	
	
	//Step2 : Create a method that prints all elements in the list
	System.out.println("********Printing all persons!!*********");
	printAll(people);
	
	//Step3 : Create a method that prints all people that have a last name beginning with C
	System.out.println("*******Printing all persons Last name beginning with c!!*********");
	printConditionally(people,new Condition() {

		public boolean test(Person p) {
			return p.getLastName().startsWith("C");
		//	return false;
		}
	});
	
	
	
	
	System.out.println("********Printing all persons First name beginning with c!!*********");
	printConditionally(people, new Condition() {
		@Override
		public boolean test(Person p) {
			
			return p.getFirstName().startsWith("C");
		}
	});
	
	}
	
	private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p);
		}
	}
	
	private static void printConditionally(List<Person> people,Condition condition) {
		for(Person p : people) {
			if(condition.test(p)){
				System.out.println("Last Name Strts with C::"+p);
			}
		}
	}
}

interface Condition {
	boolean test(Person p);
}
