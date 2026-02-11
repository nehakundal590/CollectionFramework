package com.map;

import java.util.TreeMap;

public class P4 {
	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put(1,"java");
		tm.put(3,"HTML");
		tm.put(8,"NULL");
		//tm.put(null,"java");-- key value cannot be null
		tm.put(4,"python");
		System.out.println(tm); //------sorted order follow
	}

}
