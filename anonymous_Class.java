interface motu {
	void meth1();

	void meth2();
}

public class anonymous_Class {
	/*
	 * method 1 for calling methods of interface
	 * public static void main(String[] args) {  anonymous_Class a = new anonymous_Class(); a.meth1(); a.meth2();
	 * 
	 * 
	 * }
	 * 
	 * @Override public void meth1() { System.out.println("This is method 1"); }
	 * 
	 * @Override public void meth2() { System.out.println("This is method 2"); }
	 */
	
	/*method 2 is by anonymous class
	 * Anonymous class is based on use and throw concept(When we want to use any class/methods for only once) or if we want to make a         
	   single line expression (like a #define in C++)
	 
	 * We make an object of any interface and all together declare a local type of class along with that object 
	 * We then override the methods of interface and terminate the body of this anonymous class with a semicolon
	*/
	public static void main(String[] args) {
		motu a = new motu() {//method 2
			public void meth1() {
				System.out.println("This is meth1");
			}

			public void meth2() {
				System.out.println("This is meth2");
			}

		};
		a.meth1();
		a.meth2();
	}

}
