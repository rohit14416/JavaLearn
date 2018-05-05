package io.rohitbrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//import java.util.concurrent.locks.Condition;
import java.util.function.Predicate;

public class Unit1ExerciseJava8 {

	public static void main(String[] args) {
		
	List<Person> people = Arrays.asList
			(new Person("Rohit","Varma",31),
			 new Person("Canasa","kunaparaju",26),
			 new Person("Manasa","Kunaparaju",26),
			 new Person("Sanasa","Chllunaparaju",26),
			 new Person("Padmini","Varma",35),
			 new Person("Zadmini","Zarma",35));
		
	// Step 1: Sort List By Last Name
	Collections.sort(people,(p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
	
	//Step2 : Create a method that prints all elements in the list
	System.out.println("********Printing all persons!!*********");
	
	printConditionally(people, p -> true);
	//Step3 : Create a method that prints all people that have a last name beginning with C
	System.out.println("*******Printing all persons Last name beginning with c!!*********");
	
	printConditionally(people, p -> p.getLastName().startsWith("C"));

	System.out.println("********Printing all persons First name beginning with c Java 8!!*********");	
	printConditionally(people, p -> p.getFirstName().startsWith("C"));
	
	}

	
	private static void printConditionally(List<Person> people,Predicate<Person> predicate) {
		for(Person p : people) {
			if(predicate.test(p)){
				System.out.println(p);
			}
		}
	}
}