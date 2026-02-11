package com.map;


import java.util.HashMap;
class Demo{
	String name;
	Integer id;
	

public  Demo(String name,Integer id) {
	this.name=name;
	this.id=id;
} //---------------------------------------toString method override
public Integer getid() {
	return id;
}
public void setid(Integer id) {
	this.id=id;
}
public String getname() {
	return name;
	
}

public void setName(String name) {
	this.name=name;
}
	
}
public class P1 {
	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put(1,"java");
		h1.put(2,"python");
		h1.put(3,"Css");
		h1.put(4,"HTML");
		System.out.println(h1);
		
		Demo d1=new Demo("Java",1) ;
		HashMap h2=new HashMap() ;
		h2.put(9, h2);
		h2.put(7, " Sql");
		h2.put(0, "neha");
		h2.put(1, null);  //---------------------------------------- value can also be null
		h2.put(null,"mukal"); //---------------------------------- key can also be null
		h2.put(0, "muskan"); //------------------------------- Key must be unique value not need must be unique
		System.out.println(h2);
		
		
		HashMap<Integer,String>h4=new HashMap<Integer,String>();
		h4.put(1, "neha"); // Entry [inner interface],Hash interface
		h4.put(2, "muskan");
		h4.put(4, "HTML");
		System.out.println(h4);
		
		
			
		
	}

}

/* key must be unique value are not mandotary must be unique;
 *  In HashMap insertion order are not preserved;
 *  Data always stored in key and value pairs;
 */
 
