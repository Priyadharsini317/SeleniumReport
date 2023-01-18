package week3.day2;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String text = "we learn java basics as part of java sessions in java week1";
		int count = 0;
		String text1 = "";
		String[] split = text.split(" ");
		for(int i = 0; i<split.length; i++) {
			for(int j = i+1; j<split.length; j++) {
				if(split[i].contains(split[j])) {
					text1=split[i];
					count++;
				}
			}
		}
		if(count>1) {
			System.out.println(text.replace(text1, ""));
		}
	}

}
