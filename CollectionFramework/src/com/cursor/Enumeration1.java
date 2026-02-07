package com.cursor;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 {
	public static void main(String[] args) {
		Vector<String>vector=new Vector<>();
		vector.add("java");
		vector.add("python");
		vector.add("SQL");
		Enumeration<String>e=vector.elements();
		System.out.println("print vector");
		while(e.hasMoreElements()) {
			String sql=e.nextElement();
			System.out.println(sql);
		}
	}

}
