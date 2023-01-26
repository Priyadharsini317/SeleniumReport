package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
	
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer>lst=new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			lst.add(arr[i]);
		}
		System.out.println("List is "+lst);

		for (int i = 0; i < lst.size(); i++) {
			for (int j = i+1; j < lst.size(); j++) {
				if(lst.get(i)==lst.get(j)) {
					System.out.println(lst.get(i));
				}
			}
			
		}
		
		
	}

}
