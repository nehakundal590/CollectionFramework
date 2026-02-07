package com.set;

import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		TreeSet<Integer> t1=new TreeSet<>();
		t1.add(10);
		t1.add(50);
		t1.add(30);
		t1.add(80);
		t1.add(90);
		System.out.println(t1);
		t1.pollFirst();
		System.out.println(t1);
		t1.pollLast();
		System.out.println(t1);
		t1.add(20);
		t1.add(100);
		System.out.println(t1);
		System.out.println(t1.toString());
		System.out.println(t1.removeFirst());
		System.out.println(t1.add(40));
		System.out.println(t1.hashCode());
	}

}
