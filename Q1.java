import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Imp implements Comparator<Object> {
    int x;
	Imp(int i) {
		x=i;	
	}
	
	public int compare(Object u, Object v) {

		if (u instanceof Integer)

			if (v instanceof Integer)
				return (int) u - (int) v;
			
			else if(v instanceof User&& x==1) return -1;
			
			else 
				{ 	if(x==1)	return -1;
					else if(x==2) return 1;
					else return 1;
				}
		
		
		else if (u instanceof users1)
			
			if (v instanceof users1) return (new id_users_sort().compare((users1) u, (users1) v)); 
			else if(v instanceof Integer&& x==1) return 1;
			
			else 	
				{
				if(x==1)	return -1;
	     	    else if(x==2) return -1;
	     	    else {
	     	    	if(v instanceof String)
	     	    	return 1;
	     	    	else return -1;
	     	    }
				}
		
		else if (u instanceof String)

			if (v instanceof String)
				return (u.toString().compareTo(v.toString()));
			
			else 	{
				if(x==1)	return 1;
			 	else if(x==2) return -1;
			 	else {
			 		if(v instanceof Integer)
			 		return 1;
			 		else return -1;
			 	}
					}


		return 0;}}
class id_users_sort implements Comparator<users1> {
	public int compare(users1 o1, users1 o2) {
		return o1.getId() - o2.getId();}}
class users1 {
	private int id;
	private String name;
	users1() {}
	users1(int id, String name) {
		super();
		this.id = id;
		this.name = name;}
	public int getId() {
		return id;}
	public void setId(int id) {
		this.id = id;}
	public String getName() {
		return name;}
	public void setName(String name) {
		this.name = name;}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name;
	}
}

public class Q1 {
	public static void main(String[] args) {
		Set<Object> s = new TreeSet<Object>(new Imp(2));
		s.add(new Integer(1));
		s.add(new Integer(2));
		s.add(new users1(3, "Hello"));
		s.add(new users1(0, "World"));
		s.add(new String("Wiley"));
		s.add(new String("mthree"));

		s.stream().forEach(System.out::println);
		//		for(Object i:s)
//			if(i instanceof Integer)
//   		       	System.out.println((Integer)i);
//			else if(i instanceof String)
//				System.out.println((String)i);
//			else if(i instanceof users1)
//				System.out.println(((users1)i).getId()+"__"+((users1)i).getName());}}
}}