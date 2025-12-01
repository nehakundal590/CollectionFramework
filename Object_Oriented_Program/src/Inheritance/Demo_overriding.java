package Inheritance;
class G{
	int a=10;
	int b=20;
	void m1() {
		System.out.println("m1 method inside the class A");
	}
}                   
class H extends G{
	int a=30;
	int b=40;
	void m1() {
		System.out.println("m1 method inside the class B");
	}
} 

public class Demo_overriding {
	public static void main(String[] args) {
		G aa=new H();
		System.out.println(aa.a);
		System.out.println(aa.b);
	}

}
