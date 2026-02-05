package com.set;

import java.util.LinkedHashSet;
public class LinkedHashSet3 {
	public static void main(String[] args) {
		LinkedHashSet<Integer>ls=new LinkedHashSet<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(50);
		System.out.println(ls);
		System.out.println(ls.contains(20));
		System.out.println(ls.remove(50));
		System.out.println(ls.size());
		System.out.println(ls.isEmpty());
		for(Integer i:ls) {
			System.out.println(i);
		}
		
	}

}
