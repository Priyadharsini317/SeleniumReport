package week1.day2.assignment;

public class Palindrome {
	
	public static void main(String[] args) {
		int num =34343, temp = 0,r;
		int n = num;
		for(;num != 0; num = num/10) {
			r = num%10;
			temp = (temp*10)+r;
		}
		if(n==temp) {
			System.out.println(n+" is a palindrome number");
		}
		else {
			System.out.println(n+" is not a palindrome number");
		}
		
	}

}
