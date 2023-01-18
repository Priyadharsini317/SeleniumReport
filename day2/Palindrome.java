package week3.day2;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String name = "madam";
		String rev = "";
		char[] charArray = name.toCharArray();
		for(int i = charArray.length-1; i >= 0; i--) {
			rev = rev+charArray[i];
		}
		System.out.println(rev);
		
		if(rev.equals(name)) {
			System.out.println(name+" is a palindrome");
		}
		else {
			System.out.println(name+" is not a palindrome");
		}
	}

}
