package com.cursor;

import java.util.Enumeration;
import java.util.Vector;

public class CursorEnumeration1 {
	public static void main(String[] args) {
		Vector<String>v=new Vector<>();
		v.add("java");
		v.add("python");
		v.add("HTML");
		v.add("javascript");
		System.out.println(v);
		Enumeration<String>e= v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
