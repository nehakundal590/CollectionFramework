package com.queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue<Integer>p1=new PriorityQueue<>();
		p1.add(10);
		p1.add(20);
		p1.add(5);
		System.out.println(p1);
		
		System.out.println(p1.peek()); // smallest elements
		System.out.println(p1);
	}

}
