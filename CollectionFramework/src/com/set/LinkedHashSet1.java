package com.set;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet<Integer>hs=new LinkedHashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(40); // duplicate are not allowed
		hs.add(null);
		hs.add(null); // only one null element is allowed
		System.out.println(hs);
	}

}
