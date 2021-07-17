import java.util.*;
public class calci {

	float a,b;
	Scanner s;
	calci(){
		s=new Scanner(System.in);
		System.out.println("Enter 2 values : ");
		a=s.nextFloat();
		b=s.nextFloat();
		System.out.println("Numbers entered are : "+(int)a+" and "+(int)b);
	}
	float add() {
		return (a+b);
	}
	float sub() {
		return (a-b);
	}
	float mul() {
		return (a*b);
	}
	float div() {
		return (a/b);
	}
	public static void main(String[] args) {
		calci c=new calci();
		
		while(true) {
			System.out.println("Enter 1 for add,2 for subtract, 3 for multiply and 4 for division");
		
		int ch=c.s.nextInt();
		switch(ch) {
		case 1:{
			System.out.println("Addition of "+c.a+" and "+c.b+" is "+c.add());
			break;
		}
		case 2:{
			System.out.println("Subtraction of "+c.a+" and "+c.b+" is "+c.sub());
			break;
		}
		case 3:{
			System.out.println("Multiplication of "+c.a+" and "+c.b+" is "+c.mul());
			break;
		}
		case 4:{
			System.out.println("Division of "+c.a+" and "+c.b+" is "+c.div());
			break;
		}
		
		default:{
			System.exit(0);
		}}
	}}

}
