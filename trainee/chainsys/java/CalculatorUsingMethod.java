package trainee.chainsys.java;

public class CalculatorUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addition();
		subraction();
		multiplication();
		
		
		
	}

	
	public static void addition() {
		int a=10, b=10;
		int add = a+b;
		System.out.println("Sum :" + add);
	}
	
	
	public static void subraction() {
		int a=40, b=15;
		int sub = a-b;
		System.out.println("Sub :" + sub);
	}
	
	
	public static void multiplication() {
		int a=10, b=10;
		int mul = a*b;
		System.out.println("Mul :" + mul);
	}
}
