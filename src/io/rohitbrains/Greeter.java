package io.rohitbrains;

public class Greeter {
	
	public void greet(GreetingInterface greeet) {
		//System.out.println("Hello World!!");
			greeet.greeting();
		
	}
	
	
	
	public static void main(String... args) {
		
		Greeter g = new Greeter();
		GreetingImpl gr = new GreetingImpl();
		g.greet(gr);
		
		GreetingImpl gImpl = new GreetingImpl(){
			public void perform(){
				System.out.println("Hello World Inner Class!!");
			}
		};
		
		g.greet(gImpl);
		
		GreetingInterface myLambdaFunction = () -> System.out.println("Hello World Lamda!!");
		//MyAdd addFunction = (int a,int b) -> a+b;
		g.greet(myLambdaFunction);
	}

}

interface MyLambda {
	void foo();
}

//interface MyAdd {
//	int add(int x, int y);
//}
