class X{
private String s;
private int id;
public String getS() {
	return s;
}
public void setS(String s) {
	this.s = s;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
public class getter_setter extends X {

	public static void main(String[] args) {
		getter_setter g=new getter_setter();
		g.setS("ABC");
		g.getS();
		g.setId(1234);
		g.getId();
		
//		g.setter("XYZ", 123456789);
//		g.getter();
	}

}
