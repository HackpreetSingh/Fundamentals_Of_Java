import java.util.Iterator;
import java.util.LinkedList;

@SuppressWarnings("unused")
public class linkedList_Example {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> l = new LinkedList<>();
		l.add("hello");
		l.add(null);
		l.add(new Integer(1));
		System.out.println(l);
		l.add(2,"sun");
		System.out.println(l);
		
		l.remove();//removes first element of linked list
		System.out.println("___________");
		System.out.println(l);
		
		l.remove(new Integer(1));//removes element 1(at index 2)
		System.out.println(l);
		{
			l.remove(1);// removes element at index 1
		}
		System.out.println(l);
		l.add("Hello");
		l.add(1);
		System.out.println(l);
		Iterator<Object> it=l.iterator();
		System.out.print("[");
		while(it.hasNext())
			System.out.print(it.next()+", ");
		System.out.println("]");
	}

}
