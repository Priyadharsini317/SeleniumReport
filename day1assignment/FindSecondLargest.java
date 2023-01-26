package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		
		int num[] = {3,2,11,4,6,7,15};
		List<Integer>lst=new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			lst.add(num[i]);
		}
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println("After Sort "+lst);
		int size = lst.size();
		System.out.println("Second largest num is "+lst.get(size-2));
		
	}

}
