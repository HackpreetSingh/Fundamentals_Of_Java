
public class fibbonacci {

	static void fibbo(int limit) {
		int i=0,a=0,b=1,c;
        System.out.print(a+" "+b);
		while(i<=limit) {
			c=a+b;
			a=b;
			b=c;
			i++;
			System.out.print(" "+c);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
fibbo(10);
	}

}
