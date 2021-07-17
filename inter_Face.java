class XYZ{
	void disp1() {
		System.out.println("This is class");
	}
}
interface PQR{
	void disp2();
}
public class inter_Face extends XYZ implements PQR {

	public static void main(String[] args) {
		inter_Face i = new inter_Face();
		i.disp1();
		i.disp2();
	}

	@Override
	public void disp2() {
		System.out.println("Interface Suppressed");
	}

}
