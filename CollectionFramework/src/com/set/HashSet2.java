package com.set;
import java.util.HashSet;

public class HashSet2 {
	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<>();
		hs.add("neha");
		hs.add("muskan");
		hs.add("riya");
		hs.add("mukal");
		hs.add("mukal");// duplicate
		
		System.out.println(hs);
	}

}
