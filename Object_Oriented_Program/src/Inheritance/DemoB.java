package Inheritance;

//------------------>Method hiding

class M{
	static void m1() {
		System.out.println("m1 method inside class A");
	}

	
}
class P extends M{
	static void m2() {
		System.out.println("m2 method inside class C");
	}
}

public class DemoB {
	public static void main(String[] args) {
		M a1=new M();
		P c1=new P();
		a1.m1();
		c1.m2();
		
	}

}
