package Inheritance;

class A{
	void m1() {
		System.out.println("m1 inside the class A");
	}
	
	class C{
		void m3() {
			System.out.println("m3 inside the class C");
			
		}
		
	}
	class B extends A{
		void m1() {
			System.out.println("m1 inside the class A");
		}
	}
}

public class Demo {
	public static void main(String[] args) {
		A a1=new A();
		
		a1.m1();
		}
	}
