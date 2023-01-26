package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		
		int num1[] = {3,2,11,4,6,7};
		int num2[] = {1,2,8,4,9,7};
		
		List<Integer>lst1=new ArrayList<Integer>();
		for (int i = 0; i < num1.length; i++) {
			lst1.add(num1[i]);
		}
		
		List<Integer>lst2=new ArrayList<Integer>();
		for (int i = 0; i < num2.length; i++) {
			lst2.add(num2[i]);
		}
		System.out.println(lst1);
		System.out.println(lst2);
		for (int i = 0; i < lst1.size(); i++) {
			for (int j = 0; j < lst2.size(); j++) {
				if(lst1.get(i)==lst2.get(j)) {
					System.out.println(lst1.get(i));
				}
			}
			
		}
		
	}

}
