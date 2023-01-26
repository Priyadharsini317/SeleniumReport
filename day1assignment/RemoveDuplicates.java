package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String textnew[] = text.split("");
		
		List<String>lst=new ArrayList<String>();
		for (int i = 0; i < textnew.length; i++) {
			lst.add(textnew[i]);
		}
		System.out.println(lst);
		
		Collections.sort(lst);
		for(int i = 0; i < lst.size()-1; i++) {
			if(lst.get(i).equals(lst.get(i+1))) {
				System.out.println(lst.get(i));
			}
		}
	}

}
