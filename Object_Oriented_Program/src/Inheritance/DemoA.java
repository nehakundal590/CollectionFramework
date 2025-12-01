package Inheritance;
//------>method same but parameter different method overloading 
class C{
	void m1( int a,int b) {
		System.out.println("SUM of numeber"+(a+b));
	}
	}
class B{
	void m1(int a,int b,int c) {
		System.out.println("multiplication of number"+(a*b*c));
	}
}

 public class DemoA {
	 public static void main(String[] args) {
		C a1=new C();
		B b1=new B();
		a1.m1(10,20 );
		b1.m1(10, 20, 30);
		
	}
	

}
