package com.set;

import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<Integer> t1=new TreeSet<>();
		t1.add(10);
		t1.add(50);
		t1.add(30);
		t1.add(60);
		t1.add(90);
		t1.add(90); // duplicate elements are not allowed
		// t1.add(null);------null element are not allowed
		System.out.println(t1);
		
		System.out.println(t1.pollFirst()); // remove first elements
		
		System.out.println(t1.pollLast()); // remove last elements
		System.out.println(t1);
	}

}
