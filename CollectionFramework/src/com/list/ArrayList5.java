package com.list;

import java.util.ArrayList;

public class ArrayList5 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("names");
		a1.add(10.9);
		a1.add(10);
		a1.add(true);
		a1.add("neha");
		a1.add("neha"); // duplicate allowed
		System.out.println(a1);
		
		ArrayList<Integer>a2=new ArrayList<>();
		a2.add(10);
		a2.add(30);
		a2.add(60);
		a2.add(1,100);
		a2.addAll(a1);
		a2.addAll(1,a1);
		
		System.out.println(a2.size());
		System.out.println(a2);
		
	}

}
