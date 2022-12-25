package week1.day1.assignment1;


public class Car {
	public void applyBreak() {
		System.out.println("Applied Break");

	}
	
	public void soundHorn() {
		System.out.println("Sound Horn");

	}
	
	public static void main(String[] args) {
		Car cb = new Car();
		cb.applyBreak();
		cb.soundHorn();
	}

}
