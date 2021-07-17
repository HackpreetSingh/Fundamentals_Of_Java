import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class array_List_Example {

	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add(new Integer(1));
		a.add(true);
		a.add(new Character('a'));
		a.add("New Day");
		a.add(null);
		a.add(null);
		
		System.out.println(a);
		
		System.out.println("__________");
		a.remove(0);
		a.remove(null);
		System.out.println(a);
		a.set(2, false);
		a.add(3,"Another Day");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
			
		}
		Iterator i = a.iterator();
//		a.add(i);              it adds iterator inside arraylist so infinte loops get to work
		System.out.println("ArrayList initially points to : "+a.indexOf(i));
		while(i.hasNext())
			System.out.println(i.next());
		

		System.out.println("ArrayList initially points to : "+a.indexOf(i));
		
		ListIterator it=a.listIterator(a.size()-1);

		System.out.println("Arralist at last points at : "+a.indexOf(it));
		System.out.println("ListIterator points to : "+it);
	
		while(it.hasPrevious()) 
			System.out.println(it.previous());
		
		System.out.println(a.indexOf(it));
		System.out.println(a.indexOf(new Character('b')));
	}
}