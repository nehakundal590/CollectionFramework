package com.map;

import java.util.Hashtable;

public class P2 {
	public static void main(String[] args) {
		Hashtable h1=new Hashtable();
		h1.put(1, "java");
		h1.put(2, "HTML");
		h1.put(3, "CSS");
		h1.put(null, "SQL"); // key cannot be null run time exception
		h1.put(5, "null"); // value can also not be null given null pointer exception
		System.out.println(h1);
	}

}
