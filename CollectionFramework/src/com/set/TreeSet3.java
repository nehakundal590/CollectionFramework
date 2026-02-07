package com.set;

import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String[] args) {
		TreeSet<Integer>t1=new TreeSet<>();
		t1.add(10);
		t1.add(30);
		t1.add(10);
		t1.add(90);
		t1.add(60);
		System.out.println(t1);
		System.out.println("fiest element"+t1.first());
		System.out.println("last elements"+t1.last());
		System.out.println(t1);
		System.out.println(t1.lower(25));
		System.out.println(t1.higher(25));
		System.out.println(t1.tailSet(30));
		System.out.println(t1.headSet(30));
		System.out.println(t1.subSet(30, 90));
		
	}

}
/*
package com.set;

import java.util.TreeSet;

public class TreeSet3 {

	    public static void main(String[] args) {

	        TreeSet<Integer> ts = new TreeSet<>();

	        ts.add(10);
	        ts.add(20);
	        ts.add(30);
	        ts.add(40);

	        System.out.println("First: " + ts.first());
	        System.out.println("Last: " + ts.last());
	        System.out.println("Lower than 25: " + ts.lower(25));
	        System.out.println("Higher than 25: " + ts.higher(25));
	        
	         System.out.println(ts.headSet(30));
	         System.out.println(ts.tailSet(30));
	       System.out.println(ts.subSet(20, 50));
	    }
	}
*/