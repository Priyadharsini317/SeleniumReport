package javachallenge;

public class JavaChallenge2 {
	
	public static void main(String[] args) {
		
		int x1 = 4;
		for(int i = 0; i <= x1/2; i++) {
			if(i*i == x1) {
				System.out.println(i+ " is the square root of 4");
			}
		}
		
		int x2 = 8;
		for(int j = 0; j<= x2/2; j++) {
			if(j*j == x2/2) {
				System.out.println(j+ " is the square root of 8");
			}
		}
	}

}
