package com.set;
import java.util.HashSet;
public class HashSet1 {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
	     hs.add(20);// duplicate
	     hs.add(null);
		System.out.println(hs);
	}

}
/* HashSet doesn't maintain insertion order
 * Duplicate element are not allowed in HashSet
 * HashSet provide fast performance for add,remove and search
 * Only one null element is allowed
 */
