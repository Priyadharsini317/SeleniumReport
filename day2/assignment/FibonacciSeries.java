package week1.day2.assignment;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int n = 8, firstnumber = 0, secondnumber = 1, num;
		System.out.println(firstnumber+" "+secondnumber);
		
		for(int i =2; i < n; i++) {
			num = firstnumber+secondnumber;
			System.out.println(num);
			firstnumber = secondnumber;
			secondnumber = num;
		}
	}

}
