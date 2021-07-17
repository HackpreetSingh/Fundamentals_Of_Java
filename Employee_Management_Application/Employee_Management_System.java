package Employee_Management_Application;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Emp_Details {
	String nm, des, age;
	float sal;
}

public class Employee_Management_System {
	static Emp_Details e[];
	static Scanner s;
	static int i = 0;

	public Employee_Management_System() {
		e = new Emp_Details[10];
		s = new Scanner(System.in);

	}

	void nameChecker() {
		s.nextLine();
		while (true) {
			System.out.println("Enter the name :");
			e[i].nm = s.nextLine();
			if (e[i].nm == null || e[i].nm.isEmpty()) {
				System.out.println("Name cannot be empty!!");
				continue;
			}
			if (e[i].nm.split(" ").length > 3)
				System.out.println("Size of Name is too large!!");
			else {
				Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
				Matcher m = p.matcher(e[i].nm);
				if (m.find()) {
					System.out.println("Name Should not contain special characters!!");
					continue;
				} else
					break;

			}

		}

	}

	void ageChecker() {
		while (true) {
			System.out.println("Enter your age :");
			e[i].age = s.nextLine();
			Pattern p = Pattern.compile("[^0-9 ]");
			Matcher m = p.matcher(e[i].age);
			if (m.find()) {
				System.out.println("Age should be numeric and within range only!!");
				continue;
			} else if (Integer.parseInt(e[i].age) >= 18 && Integer.parseInt(e[i].age) <= 60)
				break;
			else
				System.out.println("Age should be between 16 and 60!!");
		}
	}

	void desChecker() {
		while (true) {

			System.out.println("Enter your Designation :");
			e[i].des = s.nextLine();
			if (e[i].des.equalsIgnoreCase("programmer") || e[i].des.toLowerCase().contains("programmer")) {

				e[i].sal = 25000;
				break;
			} else if (e[i].des.equalsIgnoreCase("tester") || e[i].des.toLowerCase().contains("tester")) {
				e[i].sal = 20000;
				break;
			} else if (e[i].des.equalsIgnoreCase("manager") || e[i].des.toLowerCase().contains("manager")) {
				e[i].sal = 35000;
				break;
			} else
				System.out.println("Wrong designation entered!!");
		}
	}

	void create() {
		if (i < 10) {
			e[i] = new Emp_Details();

			nameChecker();
			ageChecker();
			desChecker();
			i++;
		} else {
			System.out.println("Maximum number of inputs done!!");
		}
		System.out.println("___________________________________________________");

	}

	void display() {
		for (int j = 0; j < i; ++j) {
			System.out.println("Employee Id :" + (j + 1));
			System.out.println("Employee Name :" + e[j].nm);
			System.out.println("Employee Age :" + e[j].age);
			System.out.println("Employee Salary :" + e[j].sal);
			System.out.println("Employee Designation :" + e[j].des);
			System.out.println("___________________________________________________");
		}
	}

	void raise(int j) {
		System.out.println("Enter the % of salary to be raised :");
		float fl = 1.0f + (s.nextFloat() / 100.0f);
		if (!(j - 1 < i) && !(j - 1 >= 0)) {
			System.out.println("employee id is invalid!!");
			return;

		}
		e[j - 1].sal *= fl;

		System.out.println("Salary of Employee with employee id : " + j + " has been raised to : " + e[j - 1].sal);
		System.out.println("_________________________________________________________________________________");

	}

	void delete() {
		System.out.println("Enter the employe id you want to delete?");
		
		for (int x = s.nextInt()-1; x < i; x++)
			e[x] = e[x + 1];
		i--;
	}

//	boolean choiceChecker(String cho) {
//		Pattern p = Pattern.compile("[^0-9 ]");
//		Matcher m=p.matcher(cho);
//		if(m.find()) {
//		System.out.println("Choice entered should be numeric only!!!");
//			return false;
//		}
//		else return true;
//	}
	public static void main(String[] args) {
		Employee_Management_System m = new Employee_Management_System();
		int ch = 0;
		String cho="";
//		char ip = 'y';

		while (ch != 5) {
//			while(true) {
			System.out.println("Enter 1 for create\nEnter 2 for display\nEnter 3 for raise\nEnter 4 for delete\nEnter 5 to exit");
//			cho = s.nextLine();
//			if(m.choiceChecker(cho))
//			{
//				ch=Integer.parseInt(cho);
//				break;
//			}
//			}
			ch=s.nextInt();
			switch (ch) {
			case 1: {
				m.create();
				while (true) {
					System.out.println("Again Want to continue?(Y/N)");
					char choice = s.next().charAt(0);
					if (choice == 'y' || choice == 'Y')
						m.create();
					else
						break;
				}
//				s.nextLine();
				
				break;
			}
			case 2: {
				if (i != 0)
					m.display();
				else {
					System.out.println("No Data saved!!");
					break;
				}
				break;
			}
			case 3: {
				int j;
				if (i != 0) {
					while (true) {
						System.out.println("Enter the employee id whose salary is to be raised :");
						j = s.nextInt();
						if (j <= i)
							break;
						else
							System.out.println("Employee Id not Exists!!");
					}
					m.raise(j);
				} else {
					System.out.println("No Data saved!!");
					break;
				}
				break;
			}
			case 4: {
				if(i==0)
					System.out.println("No Data Saved!!!");
				else
				m.delete();
				break;
			}
//			default:System.out.println("Wrong Choice entered!!");
			}
//			while(true) {
//			System.out.println("Enter y/n to continue");
//			ip = s.next().charAt(0);
//		    if(ip=='y'||ip=='Y'||ip=='n'||ip=='N')
//		    	break;
//		    else
//		    	System.out.println("Enter a valid choice!!");
//			}
		}
		System.out.println("Signing Out!!");

	}
}