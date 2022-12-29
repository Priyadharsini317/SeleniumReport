package week1.day2.assignment;

public class NegativeToPositive {
	
	public static void main(String[] args) {
		
		int a =-40;
		if(a<0) {
			System.out.println(a+" is a negative number");
			int b = a*-1;
			System.out.println("The number "+a+" is converted to "+b);
		}
		
		else {
			System.out.println(a+" is a positive number");
		}
		
	}

}
