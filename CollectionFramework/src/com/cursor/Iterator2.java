/*package com.cursor;


import java.util.ArrayList;

import java.util.ListIterator;

public class Iterator2 {
	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<>();
        a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		ListIterator<Integer>listr=a1.listIterator();
		System.out.println(" ");
		
		while(listr.hasNext()) {
			Object o=new listr.next();
			System.out.println(o);
		}
	}

}*/
package com.cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator2 {
    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);

        ListIterator<Integer> listr = a1.listIterator();

        while (listr.hasNext()) {
            Integer o = listr.next();   // ✔ correct
            System.out.println(o);
        }
    }
}

