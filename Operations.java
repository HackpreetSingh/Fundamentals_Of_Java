import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User {
	String id;
	String name;

	User() {

	}

	User(String id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Employee extends User {
	Address address;
	Project project;
	double salary;

	Employee(String id, String name, Address address, Project project, double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.project = project;
		this.salary = salary;
	}
}

class Address {
	String city;
	String zipCode;

	Address(String city, String zipCode) {
		this.city = city;
		this.zipCode = zipCode;

	}
}

class Project {
	int projectId;
	String name;
	double budget;

	public Project(int projectId, String name, double budget) {
		this.projectId = projectId;
		this.name = name;
		this.budget = budget;
	}
}

public class Operations {
	static double sumer(List<Employee> emp, int sum) {

		double curr_sum = emp.get(0).salary, max_sum = 0;
		int start = 0;
		for (int i = 1; i < emp.size(); i++) {
		if (curr_sum <= sum)
				max_sum = Math.max(max_sum, curr_sum);
   	while (curr_sum + emp.get(0).salary > sum && start < i) {
				curr_sum -= emp.get(start).salary;
				start++;
			}
        curr_sum += emp.get(i).salary;
		}
		if (curr_sum <= sum)
			max_sum = Math.max(max_sum, curr_sum);

		return max_sum;
	}

	public static void main(String[] args) {
		List<User> l = new ArrayList<User>();
		List<Employee> emp = new ArrayList<Employee>();
		double small = Integer.MAX_VALUE, sum = 0;
		int count = 0;
		l.add(new User("Wiley01", "Hempreet"));
		l.add(new Employee("Wiley02", "Karan", new Address("Bareilly", "243122"), new Project(1, "LMS", 1000), 500));
		l.add(new Employee("Wiley03", "Anmol", new Address("Bareilly", "110058"), new Project(1, "LMS", 1000), 400));
		l.add(new Employee("Wiley04", "Harsh", new Address("Bareilly", "110058"), new Project(1, "LMS", 1000), 200));
		for (User u : l) {
			if (u instanceof Employee) {
				count++;
				Employee e = (Employee) u;
				sum += e.salary;
				if (small > e.salary)
					small = e.salary;
				if (sum > e.project.budget)
					sum -= small;
				emp.add(e);
				System.out.println(e.id + "--" + e.name);
			}
		}
		System.out.println("Total employees among the users is : " + count);
		System.out.println("Maximum budget Utilization is : " + sumer(emp,1000));

	}

}