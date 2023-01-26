package javachallenge;

import java.util.Arrays;

public class JavaChallenge4 {
	
	public static void main(String[] args) {
		
		int[] num= {2,2,1};
		int[] num1 = {4,1,2,1,2};
		int[] num2 = {1};
		Arrays.sort(num);
		for (int i = 0; i < num.length-1; i++) {
			if(num[i]!=num[i+1]) {
				System.out.println(num[i]);
				break;
			}
		}
		for (int j = 0; j < num1.length-1; j++) {
			if(num1[j]!=num1[j+1]) {
				System.out.println(num1[j]);
				break;
			}
		}
		for (int k = 0; k < num2.length-1; k++) {
			if(num2[k]!=num2[k+1]) {
				System.out.println(num2[k]);
				break;
			}
		}
	}

}
