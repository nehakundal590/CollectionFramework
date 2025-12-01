package Inheritance;
class Y{
	void m1() {
		System.out.println("m1 method inherit S");
	}
}
class o extends Y{
	void m1() {
		System.out.println("m1 method inherit X");
	}
}
class V extends o{
	void m1() {
		System.out.println("m3 method inherit V");
	}
}

public class Multilevel {
	public static void main(String[] args) {
		Y a2=new o();
		o c1=new V();
		a2.m1();
		c1.m1();
	}

}
