import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Users implements Comparable {
	public int sal;
	public String city;

	public Users(String city, int sal) {
		this.sal = sal;
		this.city = city;
	}

	@Override
	public int compareTo(Object o) {
		Users u = (Users) o;
		if (this.sal > u.sal)
			return 1;
		else if (this.sal < u.sal)
			return -1;
		else
			return 0;

	}

}

class comparator_eg implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Users u1, u2;
		u1 = (Users) o1;
		u2 = (Users) o2;
		int diff = u1.compareTo(u2);
		if (diff != 0)
			return diff;
		return (u1.city).compareTo(u2.city);
	}

}

public class Comparable_Example {

	public static void main(String[] args) {
		List l = Arrays.asList(new Users("Bareilly", 25000), new Users("New Delhi", 26000),
				new Users("Bareilly", 26000), new Users("New Delhi", 25000));
		for (Object a : l) {
			Users u = (Users) a;
			System.out.println(u.city + "--" + u.sal);
		}
		System.out.println("___________________________");
		Collections.sort(l);
		for (Object it : l) {
			Users u = (Users) it;
			System.out.println(u.city + "--" + u.sal);

		}
		System.out.println("\nUsing comparator\n _________________________");
		Collections.sort(l,new comparator_eg());
		for (Object it : l) {
			Users u = (Users) it;
			System.out.println(u.city + "--" + u.sal);

		}
		
	}

}
