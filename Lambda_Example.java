import java.util.*;

//Lambda Expressions are used to make one line functions for functional interfaces
//Functional interfaces are interfaces that have only one method
interface motuji{
	void meth1();
}
interface motuji1{
	void meth1(int a);
}
/* method 1
public class Lambda_Example implements motuji {
 		public static void main(String[] args) {
			motuji m=new Lambda_Example();
			m.meth1();
		}

		@Override
		public void meth1() {
			System.out.println("This is method 1");
		}
	
		public static void main(String[] args) {
			motuji m=()->{
				System.out.println("This is method 1");
			};
			m.meth1();
		}
	}
*/
//2nd method : by lambda expression
public class Lambda_Example {

	public static void main(String[] args) {
		motuji m=()->{
			System.out.println("This is method 1");//lambda expressions make code concise
		};
		m.meth1();
		motuji1 m1=(a)->{
			System.out.println("This is method 1 with value : "+a);//lambda expressions make code concise
		};
		m1.meth1(6);
		List<Integer> l=Arrays.asList(1,2,3,4);
		l.stream().sorted((i,j)-> j.compareTo(i));
		System.out.println(l);
		
	}
}
