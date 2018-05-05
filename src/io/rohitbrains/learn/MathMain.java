package io.rohitbrains.learn;

public class MathMain {
	
	public void chooseMathSum(MathImplSum math) {
		math.sum(1, 2);
		//math.diff(5, 4);
		//math.mult(4, 5);
	}

	public static void main(String[] args) {
		
		MathMain main = new MathMain();
	//	MathImpl mImpl = new MathImpl();
		
		main.chooseMathSum(new MathImplSum());

	}

}
