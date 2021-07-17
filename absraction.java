abstract class abc{
abstract void withdraw();
abstract void ministat();
}
abstract class abcd extends abc{
	void withdraw() {
		System.out.println("half class completed");
	}

}
public class absraction extends abcd{

	public static void main(String[] args) {
	absraction a=new absraction();
	}

	@Override
	void ministat() {
		System.out.println("Full  class completed");	}

}
