import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class sample_Test {
	static ArrayList<Emp_Details> e=new ArrayList<>();
	static Scanner s;
	static float salary;
	static int i = 0;

	public sample_Test() {
		s = new Scanner(System.in);

	}

	String nameChecker() {
		s.nextLine();
		String name;
		while (true) {
			System.out.println("Enter the name :");
			name = s.nextLine();
			if (name == null || name.isEmpty()) {
				System.out.println("Name cannot be empty!!");
				continue;
			}
			if (name.split(" ").length > 3)
				System.out.println("Size of Name is too large!!");
			else {
				Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
				Matcher m = p.matcher(name);
				if (m.find()) {
					System.out.println("Name Should not contain special characters!!");
					
				} else {
					return name;
				}
			}

		}

	}

	String ageChecker() {
		String name;
		while (true) {
			System.out.println("Enter your age :");
			name = s.nextLine();
			Pattern p = Pattern.compile("[^0-9 ]");
			Matcher m = p.matcher(name);
			if (m.find()) {
				System.out.println("Age should be numeric and within range only!!");
				continue;
			} else if (Integer.parseInt(name) >= 18 && Integer.parseInt(name) <= 60)
			{return name;}
				else
				System.out.println("Age should be between 16 and 60!!");
		}
	}

	String desChecker() {
		String name;
		while (true) {
			System.out.println("Enter your Designation :");
			name = s.nextLine();
			if (name.equalsIgnoreCase("programmer") || name.toLowerCase().contains("programmer")) {

				salary = 25000;
				return name;
			} else if (name.equalsIgnoreCase("tester") || name.toLowerCase().contains("tester")) {
				salary = 20000;
				return name;
					} else if (name.equalsIgnoreCase("manager") || name.toLowerCase().contains("manager")) {
				salary = 35000;
				return name;
					} else
				System.out.println("Wrong designation entered!!");
		}
	}

	void create() {
		if (e.size()<=10) {
			Emp_Details emp=new Emp_Details();
			emp.nm=nameChecker();
			emp.age=ageChecker();
			emp.des=desChecker();
			emp.sal=salary;
			e.add(emp);
		} else {
			System.out.println("Maximum number of inputs done!!");
		}
		System.out.println("___________________________________________________");

	}

	void display() {
		for (int j = 0; j < e.size(); ++j) {
			Emp_Details s=e.get(j);
			System.out.println("Employee Id :" + (j + 1));
			System.out.println("Employee Name :" + s.nm);
			System.out.println("Employee Age :" + s.age);
			System.out.println("Employee Salary :" + s.sal);
			System.out.println("Employee Designation :" + s.des);
			System.out.println("___________________________________________________");
		}
	}

	void raise(int j) {
		System.out.println("Enter the % of salary to be raised :");
		float fl = 1.0f + (s.nextFloat() / 100.0f);
		if (!(j - 1 < e.size()) && !(j - 1 >= 0)) {
			System.out.println("employee id is invalid!!");
			return;

		}
		Emp_Details s=e.get(j-1);
		s.sal*=fl;
		e.set(j-1, s);
		System.out.println("Salary of Employee with employee id : " + j + " has been raised to : " + e.get(j-1).sal);
		System.out.println("_________________________________________________________________________________");

	}

	void delete() {
		System.out.println("Enter the employe id you want to delete?");
		e.remove(s.nextInt()-1);
	}

	public static void main(String[] args) {
		sample_Test m = new sample_Test();
		int ch = 0;
		while (ch != 5) {
			System.out.println(
					"Enter 1 for create\nEnter 2 for display\nEnter 3 for raise\nEnter 4 for delete\nEnter 5 to exit");
//			try{ch = s.nextInt();}
//			catch(Exception e) {System.out.println("Enter a valid choice!!");
			ch = s.nextInt();
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

				break;
			}
			case 2: {
				if (e.size() != 0)
					m.display();
				else {
					System.out.println("No Data saved!!");
					break;
				}
				break;
			}
			case 3: {
				int j;
				if (e.size() != 0) {
					while (true) {
						System.out.println("Enter the employee id whose salary is to be raised :");
						j = s.nextInt();
						if (j <= e.size())
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
				if (e.size() == 0)
					System.out.println("No Data Saved!!!");
				else
					m.delete();
				System.out.println("Data Deleted as required!!");
				break;
			}
			}
		}
		System.out.println("Signing Out!!");

	}
}