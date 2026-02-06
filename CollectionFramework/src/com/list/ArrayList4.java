package com.list;

import java.util.ArrayList;

public class ArrayList4 {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("python");
		a1.add("java");
		a1.add("SQL");
		for(String s:a1) {
			System.out.println(a1);
		}
	}

}
