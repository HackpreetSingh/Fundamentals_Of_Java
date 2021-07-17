
public class variables {

	int a;
	void m1() {
		a=44;//local variable to function
		System.out.println("Hello"+a);
	}
	variables(){
		int b=30;//local variable to consturctor
		System.out.println("constructor"+b);
	}
	{
		int c=33;//local variable to block(instance)
		System.out.println("instance"+c);
	}
	public static void main(String[] args) {
		
	}

}
