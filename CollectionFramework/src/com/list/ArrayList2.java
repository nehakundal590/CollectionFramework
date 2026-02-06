package com.list;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add("python");
		a1.add("java");
		a1.add("HTML");
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.get(2));
		System.out.println(a1.remove("java"));
		a1.set(1, "react");
		System.out.println(a1);
	}

}
