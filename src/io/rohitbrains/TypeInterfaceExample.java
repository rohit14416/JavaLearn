package io.rohitbrains;

public class TypeInterfaceExample {

	public static void main(String[] args) {
	
		stringLength MyStringLenTest = (String n) -> {return n.length();};
		System.out.println("Length of the String::"+MyStringLenTest.length("What s the String Length"));
		
		addTwoNums Myaddition = (int a, int b) -> a+b;
		System.out.println("The sum of two numbers is::" +Myaddition.add(3, 10));
		
		
	}

}

interface stringLength {
	int length(String s);
}

interface addTwoNums {
	int add(int a, int b);
}

