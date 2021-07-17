package Threads;

import java.util.*;

class fibb extends Thread {

	List<Integer> l = new ArrayList<Integer>();

	int a = 0, b = 1, c = 1;
	public synchronized void run() {
		for (int i = 0; i < 10; i++) {
			c = a + b;
			System.out.println(a + " + " + b + " = " + c);

			a = b;
			b = c;
			l.add(c);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class fibbo {
	public static void main(String[] args) {
		fibb m1 = new fibb();
		fibb m2 = new fibb();
		m1.start();
		m2.start();
	}
}