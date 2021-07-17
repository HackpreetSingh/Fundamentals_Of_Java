import java.util.*;
public class star {

//	static void func(int n) {
//		for(int i=1;i<=n;++i)
//		{
//			for(int sp=n-i;sp>=1;--sp)
//				System.out.print(" ");
//			for(int j=1;j<=i;++j)
//				System.out.print("*");
//		    for(int j=i-1;j>=1;j--)
//		    	System.out.print("*");
//			System.out.println();
//		}
//
//	}
	static void prime(int no) {
		if(no==0||no==1) {
			System.out.println("not prime");
			return ;
		}
		int flag=0;
		for(int i=2;i<no;++i)
			if(no%i==0)
				{flag=1; break;}
		if(flag==1) System.out.println("not prime");
		else System.out.println("prime");
	}
//	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		star.prime(s.nextInt());
	}

}
