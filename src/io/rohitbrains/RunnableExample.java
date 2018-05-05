package io.rohitbrains;

public class RunnableExample {

	public static void main(String[] args) {
		
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside runnable");
			}
						
		});
		myThread.run();
		
		Thread myLambdarun = new Thread(() -> System.out.println("Print inside lamda"));
		
		myLambdarun.run();
	}

}
