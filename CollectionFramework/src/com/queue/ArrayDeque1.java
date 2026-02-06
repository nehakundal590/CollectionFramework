package com.queue;

import java.util.ArrayDeque;

public class ArrayDeque1 {
	public static void main(String[] args) {
	ArrayDeque list=new ArrayDeque();
	list.add(10);
	list.add("neha");
	list.add(13.5);
	list.add(10); //-------------------duplicate are allowed in arrayDequeu
	//list.add( );--------------------- null element are not allowed in arrayDeque
	System.out.println(list);
	}

}
 /* index based insertion are not allowed in ArrayDeque
  * It is a class in java.util.package.
  */
