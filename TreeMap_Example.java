import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Example {

	public static void main(String[] args) {
		TreeMap t=new TreeMap();//sorts all values by default
//		t.put(new Character('a'), "Hello");
//		t.put('1', true);
//		t.put('H', 't');
//		t.put('0', 't');
//		t.put('2', null);
//	
		t.put("Hello", true);
		t.put("Hell", false);
		t.put("abc", 1);
		System.out.println("                        "+t.put("abc", 20));
		System.out.println(t);
		System.out.println(t.ceilingEntry("Hel"));//returns nearest value passed as an argument
		System.out.println(t.ceilingKey("He"));
		System.out.println(t.floorEntry("Hello"));
		System.out.println(t.floorKey("Hello"));
		System.out.println(t.floorEntry("Helloo"));
		System.out.println(t.floorEntry("hello"));//case insensitive
		System.out.println(t.floorEntry("Hello"));
		System.out.println("_______________________");
		System.out.println(t.getOrDefault("abc", true));
		System.out.println(t.put("abc", t.getOrDefault("abc", true)));
		System.out.println(t);
//		t.clear();
		System.out.println(t);
		System.out.println(t.descendingMap());
		System.out.println("_____________________");
		for (Object o:t.keySet())//only keys are got using this function
		{
			System.out.print(o+":"+t.get(o)+"\n");
		}
		System.out.println("____________________");
		for (Object o:t.entrySet())//to get key value pair as a whole
		{
			System.out.print(o+"\n");
		}
		
		
//		System.out.println("__________");
//		System.out.println(t.get('1'));
//		t.replace('1',"Hello");		
//		System.out.println(t);
//		System.out.println("____________");
//		System.out.println(t.keySet());
		
	}

}
