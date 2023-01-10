package javachallenge;

public class JavaChallenge1 {
	
	public static void main(String[] args) {
		
		String input = "Hello World";
		String[] split = input.split(" ");
		for(int i = 0; i < split.length; i++) {
			if(i==split.length-1) {
				System.out.println("The last word is 'Word' with length "+split[i].length());
			}
		}
		
		String input1 = "fly me to the moon";
		String[] split1 = input1.split(" ");
		for(int j = 0; j < split1.length; j++) {
			if(j==split1.length-1) {
				System.out.println("The last word is 'moon' with length "+split1[j].length());
			}
		}
		
		String input2 = "luffy is still joyboy";
		String[] split2 = input2.split(" ");
		for(int k = 0; k < split2.length; k++) {
			if(k==split2.length-1) {
				System.out.println("The last word is 'joyboy' with length "+split2[k].length());
			}
		}
	}

}
		
