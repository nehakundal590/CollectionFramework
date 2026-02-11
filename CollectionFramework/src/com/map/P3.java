package com.map;

import java.util.LinkedHashMap;

public class P3 {
	public static void main(String[] args) {
		// key can be unique and value must be null
		// key can be null
		//value can also be null
		LinkedHashMap l1=new LinkedHashMap();
		l1.put("Hello", "h1");
		l1.put(1, "java");
		l1.put("Html", l1);
		l1.put(null, "java");
		l1.put(args, null);
		System.out.println(l1);
	}

}
