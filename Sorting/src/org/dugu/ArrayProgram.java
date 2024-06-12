package org.dugu;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayProgram {
	public static void main(String[] args) {
		String[] a = {"Hari","James","Rahul","Hari"};
		String[] b = {"Forooq","Shyam","James"};
		LinkedHashSet<String> s = new LinkedHashSet<String>();
		s.addAll(Arrays.asList(a));
		s.addAll(Arrays.asList(b));
		
		String[] c = s.toArray(new String[0]);
		for(String s1:c) {
			System.out.print(s1+" ");
		}
		 
	}

}
