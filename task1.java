import java.util.*;

class Add {
	String city;
	int zip;
	public Add(String city, int zip) {
		super();
		this.city = city;
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Add [city=" + city + ", zip=" + zip + "]";
	}
	
	
}

class us_er {
	int id;
	String name;
	public us_er(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "us_er [id=" + id + ", name=" + name + "]\n";
	}
	@Override
	public boolean equals(Object obj1) {
		if(!(obj1 instanceof us_er))
			return false;
		us_er obj= (us_er) obj1;
		if(this.id == obj.id && this.name.equals(obj.name))
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		String res= this.id+""+this.name;
		return res.hashCode();
	}
}

class com {

	us_er u;
	List<Add> a = new ArrayList<Add>();

	public com(us_er u, List<Add> a) {
		super();
		this.u = u;
		this.a=a;
	}

	

	public List<Add> getA() {
		return a;
	}



	public void setA(List<Add> a) {
		this.a = a;
	}



	@Override
	public String toString() {
		return "com [u=" + u + ", a=" + a + "]\n";
	}



}

public class task1 {

	public static void main(String[] args) {
		Add a=new Add("Bareilly",123456);
		Add b=new Add("New Delhi",23456);
		Add c=new Add("Bangalore",923456);
		
		List<Add> a1 = new ArrayList<Add>();
		List<Add> a2 = new ArrayList<Add>();
		List<Add> a3 = new ArrayList<Add>();
		a1.add(a);
		a1.add(b);
		a1.add(c);
		
		a2.add(a);
		a2.add(b);
		
		a3.add(c);
		Map<us_er,List <Add>> m=new HashMap<>();
		
		m.put(new us_er(1,"User1"), a1);
		m.put(new us_er(2,"User2"), a2);
		m.put(new us_er(3,"User1"), a3);
		List<us_er> l=Arrays.asList(new us_er(1,"User1"),new us_er(2,"User2"),new us_er(3,"User1"));
		List<us_er> u=new ArrayList<>();
		   
		Map<Add,List <us_er>> res=new HashMap<>();
		l.stream().forEach(i->{
		   m.get(i).stream().forEach(j->{
			   if(res.get(j)==null)
			   {
				   u.add(new us_er(i.id,i.name));
				   res.put(j, u);
			   }
			   else res.get(j).add(new us_er(i.id,i.name));
				   
		   });
		});
		System.out.println(res);
		
	}

}