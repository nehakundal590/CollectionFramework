package Inheritance;
class O{
	 static void m1() {
		System.out.println("m1 method inside A");
	}
	void m2() {
		System.out.println("m2 method inside A");
	}
}
class W extends O{
	static void m3() {
		System.out.println("m3 method inside W");
	}
	
	}

public class overhiding {
	public static void main(String[] args) {
		O aa= new W();
		W b1=new W();
	
		O.m1();
		b1.m3();
	
		aa.m2();
	}

}
