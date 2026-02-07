package com.cursor;

import java.util.Enumeration;
import java.util.Hashtable;

public class Enumeration3 {
	public static void main(String[] args) {
		Hashtable<Integer,String>h1=new Hashtable<>();
		h1.put(1, "java");
		h1.put(2, "Python");
		h1.put(3, "React");
		
		Enumeration<Integer>e1=h1.keys();
		System.out.println("keys and values");
		while(e1.hasMoreElements()) {
			Integer key=e1.nextElement();
			System.out.println(key+"="+h1.get(key));
		}
		Hashtable<Integer,String>h2=new Hashtable<>();
		h2.put(101, "Spring");
		h2.put(102, "Hibernate");
		
		Enumeration<String>e2=h2.elements();
		System.out.println("\nOnly values:");
		while(e2.hasMoreElements()) {
			System.out.println(e2.nextElement());
		}
	}

}
