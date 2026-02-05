package com.set;

import java.util.LinkedHashSet;

public class LinkedHashSet2 {
	public static void main(String[] args) {
		LinkedHashSet<String>hs=new LinkedHashSet<>();
		hs.add("neha");
		hs.add("sneha");
		hs.add("swati");
		hs.add("muskan");
		hs.add("muskan"); // duplicate are not allowed
		hs.add(null);
		hs.add(null); // only one null element is allowed
		System.out.println(hs);

}
}
