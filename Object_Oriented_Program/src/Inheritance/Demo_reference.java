package Inheritance;
class N{

	int a=10;
	int b=20;
	
	 void m1() {
		 System.out.println("m1 inside the class A");
	 }
	 void m2() {
		 System.out.println("m2 method inside the class N");
		 
	 }
}
class R extends N{
	int c=20;
	int d=40;
	void m1() {
		System.out.println("m1 inside the class B");
	}
}

public class Demo_reference {
	public static void main(String[] args) {
		N a1=new N();
		R b1=new R();
		System.out.println(a1.a);
		System.out.println(a1.b);
		
		N aa=new R();
		aa.m1();
		aa.m2();
	
	}

}
