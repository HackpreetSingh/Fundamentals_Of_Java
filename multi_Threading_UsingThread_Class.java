public class multi_Threading_UsingThread_Class {

	public static void main(String[] args) throws InterruptedException {
		MNO m=new MNO();
		UVW u=new UVW();
		Thread t1=new Thread(m);
		Thread t2=new Thread(u);
//		or	multi_Threading_UsingThread_Class m1=new multi_Threading_UsingThread_Class();
//		multi_Threading_UsingThread_Class m2=new multi_Threading_UsingThread_Class();
//		m1.start();
//		m2.start();
        System.out.println("t1 : "+t1.getState()+", t2 : "+t2.getState());
		t1.start();
		t1.sleep(800);
		t2.join();//makes both threads synchronised(one executed after completion of other)
		System.out.println("\n"+"t1 : "+t1.getState()+", t2 : "+t2.getState());
		t1.suspend();
		System.out.println(t1.getState());
		t2.start();
		t1.resume();
		
	}
}
class MNO extends Thread{

	public void run() {
		for(int i=2;i<=10;i+=2)
			System.out.print(i+" ");
	}
}
class UVW extends Thread{
	public void run() {
		for(int i=1;i<=10;i+=2)
			System.out.print(i+" ");
	}
}