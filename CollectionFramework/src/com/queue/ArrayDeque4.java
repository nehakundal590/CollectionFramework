package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque4 {
	public static void main(String[] args) {
		Deque<Integer>a1=new ArrayDeque<Integer>();
		a1.addLast(10);
		a1.addFirst(20);
		a1.add(5);
		a1.addLast(500);
		System.out.println(a1);
		System.out.println(a1.size());    // Returns number of elements.
		System.out.println(a1.isEmpty());  // Checks if deque is empty.  (True or false) 
		System.out.println(a1.getClass());
		System.out.println(a1.getClass().getName());
		System.out.println(a1.toString());
		System.out.println(a1.getFirst());
		System.out.println(a1.getLast());
		System.out.println(a1.getFirst());
		System.out.println(a1.removeLast());
		System.out.println(a1.contains(1000));
	}

}
