package javachallenge;

public class JavaChallenge3 {
	
	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		String rev = "";
		String s1 = s.replaceAll("[^a-zA-Z0-9]","");
	    int len = s1.length();
		char[] charArray = s1.toCharArray();
		for(int i = charArray.length- 1; i >=0; i--) {
			rev = rev + charArray[i] ;
		}
		if(rev.equalsIgnoreCase(s1)) {
			System.out.println(s1+" is a palindrome");
		}
		else {
			System.out.println(s1+" is not a palindrome");
		}
		
		String s2 = "race a car";
		String rev1 = "";
	    int len1 = s2.length();
		char[] charArray2 = s2.toCharArray();
		for(int j = charArray2.length; j <= 0; j++) {
			rev1 = rev1 + charArray2[j];
		}
		if(rev1.equalsIgnoreCase(s2)) {
			System.out.println(s2+" is a palindrome");
		}
		else {
			System.out.println(s2+" is not a palindrome");
		}
		
	}
	
}
