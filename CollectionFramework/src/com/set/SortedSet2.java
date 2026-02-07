package com.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet2 {
public static void main(String[] args) {
	SortedSet<Integer>l1=new TreeSet<>();
	l1.add(10);
	l1.add(70);
	l1.add(110);
	l1.add(30);
	System.out.println(l1);
	System.out.println(l1.headSet(30));
	System.out.println(l1.tailSet(25));
	System.out.println(l1.first());
	System.out.println(l1.last());
	System.out.println(l1);
	
}
}
