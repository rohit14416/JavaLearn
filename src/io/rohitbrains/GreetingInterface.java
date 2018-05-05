package io.rohitbrains;

@FunctionalInterface
public interface GreetingInterface {	
	public abstract void greeting();
	public static void another() {
		System.out.println("");	
	}

}


/** -----> In Java 8 we can write interfaces with implementation methods, before Java 8 interfaces were only supposed to be having abstract 
*		method.
*
* ------> The @FunctionalInterface tell the compiler that this method can have only one abstract method. So that we can define a Lambda.
*
* ------> It can have as many methods(static method) as it wants, but it should have only one abstract Method.
*
*
**/
