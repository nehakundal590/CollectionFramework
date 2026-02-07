package com.cursor;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration2 {
	public static void main(String[] args) {
		Vector<Integer>l1=new Vector<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		Enumeration<Integer>e=l1.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

}
