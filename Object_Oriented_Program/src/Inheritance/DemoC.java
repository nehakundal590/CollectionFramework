package Inheritance;
class K{
	void m4() {
		System.out.println("m4 method inside the class K");
	}
	
}
class Z extends K{
	void m4() {
		System.out.println("m3 method inside the class M");
	}
	void m5() {
		System.out.println("m5 method inside the class K");
		
	}
}

public class DemoC {
	public static void main(String[] args) {
		K b1=new Z();
		Z m1=new Z();
		b1.m4();
		m1.m5();
		
	}
	

}
