package com.cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class Cursor2{
	public static void main(String[] args) {
		ArrayList<Integer>n=new ArrayList<>();
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(40);
		
		Iterator<Integer>cursor=n.iterator();
		System.out.println("Traverse element using cursor:");
		while(cursor.hasNext()) {
			Integer num=cursor.next();
			System.out.println(num);
			
			if(num==20) {
				cursor.remove();
			}
		}
		
	}

}
