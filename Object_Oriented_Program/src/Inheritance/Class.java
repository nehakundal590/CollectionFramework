package Inheritance;
class S{
	static void m1() {
		System.out.println("m1 method inside S");
	}
	void m2(int a) {
		System.out.println("m2 method inside S");
	}
}
class F extends S{
	void m3() {
		System.out.println("m3 method inside F");
	}
	}

public class Class {
	public static void main(String[] args) {
		F bb=new F();
		S aa=new F();
		bb.m3();
		aa.m2(10);
		
		
	}

}
