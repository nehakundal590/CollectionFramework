package Inheritance;
class I{
	void m1() {
		System.out.println("m1 method inherit the class A");
	}
}
class X extends I{
	void m1() {
		System.out.println("m1 method inherit the class B");
	}
}

public class Single_inheritance {
	public static void main(String[] args) {
		I a1=new I();
		a1.m1();
	}

}
