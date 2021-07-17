class A{
	void disp1() {
		System.out.println("class A");
	}
}
class B extends A{
	void disp2() {
		System.out.println("class B");
	}
}
public class inheritance extends A{

	public static void main(String[] args) {
		inheritance i=new inheritance();
		B b=new B();
		i.disp1();
		b.disp2();
	}
}