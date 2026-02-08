package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque2 {
	public static void main(String[] args) {
		Deque<Integer>a1=new ArrayDeque<>();
		//Queue------FIFO
		System.out.println("Queue operation...");
		a1.add(10);
		a1.add(50);
		a1.add(60);
		a1.add(20);
		System.out.println(a1);
		
		//removed elements from front
		System.out.println(a1.removeFirst());
		System.out.println(a1);
		
		System.out.println("Peek front"+a1.peekFirst());
		System.out.println(a1);
		
		//Stack --------LIFO
		System.out.println("Stack operation");
		a1.push(10);
		a1.push(20);
		a1.push(60);
		System.out.println(a1);
		System.out.println(a1.pop());
		System.out.println(a1);
		
		
	}

}
