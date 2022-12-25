package week1.day1.assignment1;

public class Calculator {
	public int addtwoNumber(int a,int b) {
		return a+b;

	}
	
	public int addthreeNumber(int a,int b,int c) {
		return a+b+c;

	}
	
	public int multiply(int a,int b) {
		return a*b;

	}
	
	public double multiply2(int a, double b) {
		return a*b;

	}
	
	public int sub(int a, int b) {
		return a-b;

	}
	
	public double subtract(double a,double b) {
		return a-b;

	}
	
	public int div(int a, int b) {
		return a/b;

	}
	
	public double divide(double a,int b) {
		return a/b;

	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		int result1 = cal.addtwoNumber(12, 15);
		System.out.println(result1);
		int result2 = cal.addthreeNumber(23, 42, 14);
		System.out.println(result2);
		int result3 = cal.multiply(21, 12);
		System.out.println(result3);
		double result4 = cal.multiply2(32, 3.2223d);
		System.out.println(result4);
		int result5 = cal.sub(42, 31);
		System.out.println(result5);
		double result6 = cal.subtract(65.3312d, 32.423d);
		System.out.println(result6);
		int result7 = cal.div(64, 8);
		System.out.println(result7);
		double result8 = cal.divide(75.0785d, 5);
		System.out.println(result8);
	}

}
