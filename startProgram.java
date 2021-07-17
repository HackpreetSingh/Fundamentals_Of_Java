/**
 * 
 */

/**
 * @author User
 *
 */
import java.util.*;
public class startProgram {

	/**
	 * @param args
	 */
	startProgram(){// constructor
	System.out.println();	
	}

	//instance block
	{
		System.out.println("I am instance block"); // runs when object created otherwise does not run(but does not give error)
	}
	
	//static block
	static {
		System.out.println("I am static block pehla wala");// automatically runs when conmpiler enters this class
	}
	static {
		System.out.println("I am static block dusra wala");// automatically runs when conmpiler enters this class
	}
	// there can be multiple static blocks
	// order of static blocks matters in terms of execution
	//before login atm window display is run by these blocks
	
	static int a=5;
	{
		a=10;
		System.out.println(a);
	}
	
	// blocks are executed before constructor
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		startProgram s=new startProgram();
		System.out.println(s.a+" "+a);
	}

}
