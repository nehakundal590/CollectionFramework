package com.set;
//sorted is an interface not a class

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet1 {
	public static void main(String[] args) {
		SortedSet<Integer>t1=new TreeSet<Integer>();
		t1.add(90);
		t1.add(50);
		t1.add(40);
		t1.add(1000);
		System.out.println(t1);
		
	}

}
