package codingpack;

import java.util.*;

public class PracticeClass {
	
	public static int getCountofStringArray(List<String> stringarray, String findinarray) {
		
		int count = 0;
		
		for(int i = 0 ; i < stringarray.size(); i++) {
			if(findinarray.equals(stringarray.get(i))) {
				count = count + 1;
			}
		}
		return count;
	}

	public static void main(String ar[]) {
		
		List<String> str = new ArrayList<String>();
		
		str.add("aaa");
		str.add("aaa");
		str.add("aaaa");
		str.add("aaa");
		
		int a = getCountofStringArray(str, "aaa");
		System.out.println(a);
	
	}
}
