
public class multi_Threading_UsingRunnable_Class {

	public static void main(String[] args) {
		//Using classes from multi_Threading_UsingThread_Class.java
		MNO m=new MNO();
		UVW u=new UVW();
		Thread t1=new Thread(m);
		Thread t2=new Thread(u);
		System.out.println("t1 : "+t1.getState()+"t2 : "+t2.getState());
		t1.start();
		System.out.println("t1 : "+t1.getState()+"t2 : "+t2.getState());
		t2.start();
		System.out.println("t1 : "+t1.getState()+"t2 : "+t2.getState());
	}
}
