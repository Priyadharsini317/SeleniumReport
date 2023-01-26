package javachallenge;

import java.util.Arrays;

public class JavaChallenge6 {
	
	public static void main(String[] args) {
		
		int[] num = {3,2,3};
		int[] num1 = {2,2,1,1,1,2,2};
		Arrays.sort(num);
		for (int i = 0; i < (num.length/2)+1 ; i++) {
			if(num[i]>=num[i+1]) {
				System.out.println("Majority element is "+num[i]);
				break;
			}
		}
		Arrays.sort(num1);
		for (int i = 0; i < (num1.length/2)+1 ; i++) {
			if(num1[i]>=num1[i+1]) {
				System.out.println("Majority element is "+num1);
				break;
			}
		}
	}

}
