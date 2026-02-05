package com.set;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet1 {
	public static void main(String[] args) {
		NavigableSet<Integer>ls=new TreeSet<>();
		ls.add(10);
		ls.add(60);
		ls.add(30);
		ls.add(50);
		// ls.add(40);-------duplicate are not allowed
		//ls.add(null);---------null are not allowed
		System.out.println(ls);
		}
}
/*Maintains sorted (ascending) order.
→ Duplicate elements are NOT allowed.
→ Null elements are NOT allowed.*/
