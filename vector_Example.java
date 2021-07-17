import java.util.*;
public class vector_Example {
	Vector v=new Vector();
	
	void vector_Example() {
		v.add("Hempreet");
		//v.add(5,"Printing by index"); //error in adding to some later index
		v.add(true);
		v.add('A');
		v.add(null);
		v.add(1,"Printing by index");
		v.add(new Integer(1));
		System.out.println(v);
		System.out.println("Index of Hempreet is :"+v.indexOf("Hempreet"));
		v.set(0, 1);
		System.out.println(v);
		System.out.println("Index of Hempreet starting from 1 index is :"+v.indexOf("Hempreet",1));
		v.remove(0);
		System.out.println(v+" has size : "+v.size());
		System.out.println(v.contains(true));
		System.out.println(v.get(1));
		System.out.println(v.lastElement());
		System.out.println(v.lastIndexOf(1));
		System.out.println("____________End of Vector_____________");
		/*if all values stored in Vector/ArrayList/LinkedList are of similar datatype then
		Collections.sort(v);  will work
		Collections.reverse(v);
		*/
	}	
	void Iterator_Example() {
		Iterator itr=v.iterator();
//		System.out.println(itr); doubt
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	//listIterator can access data in any direction (from first to last) or vice-versa
	void listIterator_Example() {
		ListIterator itr=v.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		itr=v.listIterator(v.size());//printing in reverse order
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		//printing randomly
//		itr=v.set(0);
		
	}
	public static void main(String[] args) {
		vector_Example g=new vector_Example();
		g.vector_Example();	
	g.Iterator_Example();
	g.listIterator_Example();
	
	}
}
