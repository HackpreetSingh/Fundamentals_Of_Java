import java.util.*;
public class scanner_Sample {
	static Scanner s;
	String nm,des;
	int sal;
	public scanner_Sample() {
		s=new Scanner(System.in);
		// TODO Auto-generated constructor stub
	}
	void create() {
		s.nextLine();
		System.out.println("Enter the name");
		nm=s.nextLine();
		while(nm.split(" ").length>3) {
			System.out.println("Wrong Choice.\nEnter the name");
			nm=s.nextLine();
		}
		System.out.println("Enter the designation");
		des=s.nextLine();
		System.out.println("Enter the salary");
		sal=s.nextInt();
		
		
	}
	void display(){
		System.out.println("Name is : "+nm);
		System.out.println("Designation is : "+des);
		System.out.println("Salary is : "+sal+"\n\n");
	}
	void raise(int inc) {	
		sal+=inc;
	}
	void exit() {
		System.exit(0);
	}
	

	public static void main(String[] args) {
		scanner_Sample ss=new scanner_Sample();
		while(true)
			{
			System.out.println("1. Enter 1 to create\n2. Enter 2 to display\n3. Enter 3 to raise salary\n4. Enter 4 to exit\n");
			int ch = s.nextInt();
		switch(ch) {
		case 1:{
			ss.create();
			break;}
		case 2:{
			ss.display();
			break;}
		case 3:{
			System.out.println("Enter the increment");
			int inc=s.nextInt();
			ss.raise(inc);
			break;}
		case 4:{ss.exit();
			break;}
		default:{
			System.out.println("Wrong choice");
			//break; optional
		}
		}
		}

	}}
