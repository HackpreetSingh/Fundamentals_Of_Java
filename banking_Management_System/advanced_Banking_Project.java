package banking_Management_System;
import java.util.*;

/*
 * Build an application that constitutes for a banking platform, it should handle the account transactions, for credit and debit as per the  
   banking systems, we should have the account details tracked as well.
 * Topics to be covered : Java - (Streams/Lambdas/OOP's/List  
   Collections)
_____________________________________________________________________________________
functions ::::>
 * data_mem{}
 * credit function{} 
 * debit function{}
 * verify function{}
 * change mobile{} 
 * change pin{}
 * past_5_transactions{}
 * main{  step 1 : verify function(Enter ac_number and pin)
          step 2 : if correct then step 3 else step 1
          step 3 : menu for transactions
          step 4 : menu driven switch
       }
classes ::::>
 * Customer_Details(for storing customer name, mobile number, account number,pin:by getter/setter)
 * advanced_mini_projects_1 (for implementing functions)
*/
class Customer {
	String name, mobile_no, ac_no, address;
	int pin, balance, index;
	List<Integer> bal = new ArrayList<Integer>();
	List<Integer> amt = new ArrayList<Integer>();

	Customer(){
		
	}
	public Customer(String name, String mobile_no, String ac_no, String address, int pin, int balance) {
		this.name = name;
		this.mobile_no = mobile_no;
		this.ac_no = ac_no;
		this.address = address;
		this.pin = pin;
		this.balance = balance;
		bal.add(balance);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobile_no=" + mobile_no + ", ac_no=" + ac_no + ", address=" + address
				+ ", pin=" + pin + ", balance=" + balance;
	}

}

public class advanced_Banking_Project {
	static List<Customer> l = new ArrayList<Customer>();;
	static Scanner s = new Scanner(System.in);;
	static boolean session = false;
	static int index, count;

	public static String generateRandom() {  //for generating a random account number
	    Random random = new Random();
	    StringBuilder sb = new StringBuilder();

	    // first not 0 digit
	    sb.append(random.nextInt(9) + 1);

	    // rest of 11 digits
	    for (int i = 0; i < 11; i++) {
	        sb.append(random.nextInt(10));
	    }

	    return (sb.toString());
	}
	
	public static void data_mem() {
		char ch='y';
		String name,ac_no,mobile_no,address;
		int pin,balance;
//		Customer c=new Customer();
		while(true)
		{
			ac_no=generateRandom();
			System.out.print("Enter the Name: ");
			name=s.nextLine();
			System.out.print("Enter the Phone Number: ");
			mobile_no=s.nextLine();
			System.out.print("Enter the Address: ");
			address=s.nextLine();
			System.out.print("Set your pin: ");
			pin=s.nextInt();
			System.out.print("Enter the Initial Balance: ");
			balance=s.nextInt();
			
			l.add(new Customer(name, mobile_no, ac_no, address, pin, balance));		
				
			System.out.println("Your Account number is: "+ac_no+" Save is for further reference!!");
			System.out.println("Enter (Y/N) to Continue: ");
			ch=s.next().charAt(0);
			if(ch=='y'||ch=='Y')
				{
				s.nextLine();
				continue;
				
				}
			else break;
			/* Sample records for testing
			  * l.add(new Customer("Hempreet Singh", "9807654321", "123456789098", "100 ABC COLONY, NEW DELHI", 1313, 50000));		
			  * l.add(new Customer("Sample Data", "+911234567890", "1213456789098", "200 XYZ COLONY, BANGALORE", 1999, 80000));
			*/
		}
	}

	public static boolean verify() {
		count = 0;
		
		while (count < 3) {
			s.nextLine();
			System.out.print("Enter you account number for which you want to transact : ");
			String temp = s.nextLine();
			for (Customer c : l)
				if (c.ac_no.equals(temp)) {
					index = l.indexOf(c);
					break;
				} else
					index = -1;

			if (index == -1) {
				count++;
				System.out.println("Account number not exists!\n" + "You have " + (3 - count) + " chances left.");
				continue;
			}
			System.out.print("Enter your pin : ");
			int i = s.nextInt();

			if (i == l.get(index).pin) {
				session = true;
				break;
			}

			else {
				count++;
				System.out.println("Incorrect Pin!\n" + "You have " + (3 - count) + " chances left.");
			}

		}
		return session;
	}

	public static void limit_Checker(int a, int b) {
//		if (l.get(index).bal.size() == 6)
//			l.get(index).bal.remove(0);
//		if (l.get(index).amt.size() == 5)
//			l.get(index).amt.remove(0);

		l.get(index).bal.add(a);
		l.get(index).amt.add(b);
	}

	public static void credit() {
		int count = 0;
		while (count < 3) {
			System.out.print("Enter the total amount you want to deposit(less than 25000) : ");
			int amount = s.nextInt();
			if (amount % 500 == 0 && amount < 25000) {
				l.get(index).balance += amount;
				limit_Checker(l.get(index).balance, amount);
				System.out.println("Amount raised to :" + l.get(index).balance);
				return;
			} else if (amount % 500 == 0 && amount > 25000) {
				count++;
				System.out.println("Amount entered is quite big to be deposited in ATM!\n" + "You have " + (3 - count)
						+ " chances left!");
			} else {
				count++;
				System.out.println("Amount not multiple of 500!\n" + "You have " + (3 - count) + " chances left!");
			}
		}
		System.out.println("You have taken your maximum attempts!");
		session = false;
	}

	public static void debit() {
		count = 0;
		while (count < 3) {
			System.out.print("Enter the amount you want to withdraw(less than 25000 and multiples of 500) : ");
			int amount = s.nextInt();
			if (amount % 500 == 0 && amount < 25000) {
				l.get(index).balance -= amount;
				limit_Checker(l.get(index).balance, amount * -1);
				System.out.println("Amount withdrawn is :" + l.get(index).balance);
				return;
			} else if (amount % 500 == 0 && amount > 25000) {
				count++;
				System.out.println("Amount entered is quite big to be withdrawn from ATM!\n" + "You have " + (3 - count)
						+ " chances left!");
			} else {
				count++;
				System.out.println("Amount not multiple of 500!\n" + "You have " + (3 - count) + " chances left!");
			}
		}
		System.out.println("You have taken your maximum attempts!");
	}

	public static void mobile_change() {
		count = 0;
		String no = "";
		while (count < 3) {
			s.nextLine();

			System.out.println("Enter your new mobile number");
			no = s.nextLine();
			System.out.println("Are you sure to continue with this number(Y/N)?");
			if (Character.toLowerCase(s.next().charAt(0)) == 'y')
				break;
			else
				count++;
			System.out.println("You have " + (3 - count) + " chances left.");

		}

		if (count == 4) {
			session = false;
			return;
		}

		int otp = 123456;
		count = 0;

		while (count < 3) {
			System.out.println("Enter the OTP you have recieved");

			if (s.nextInt() == otp) {
				l.get(index).mobile_no = no;
				System.out.println("Mobile Number Successfully changed!");
				break;
			}

			else {
				count += 1;
				System.out.println("Wrong OTP entered!\nYou have " + (3 - count) + " chances left.");
			}
		}

		if (count == 4) {
			session = false;
			return;
		}

	}

	public static void pin_change() {
		count = 0;
		int no;

		while (count < 3) {
			System.out.println("Enter the old pin to verify ");
			no = s.nextInt();

			if (no == (l.get(index).pin))
				break;

			count++;
			System.out.println("Account number entered does not match!\nYou have " + (3 - count) + " chances left.");

		} // end of while loop

		if (count == 4) {
			session = false;
			return;
		}

		System.out.println("Enter new 4 digit pin you want to set?");
		l.get(index).pin = s.nextInt();
		System.out.println("Pin Successfully changed!");

	}

	public static void past_5_transactions() {
		if (l.get(index).amt.size() == 0) {
			System.out.println("No Transactions Done!!");
			return;
		}
		System.out.println("Past 5 Transaction Details are : \nInitial Balance : " + l.get(index).bal.get(0));
		for (int i = 0; i < l.get(index).amt.size(); i++) {

			if (l.get(index).amt.get(i) < 0)

				System.out.println("Debit of : " + l.get(index).amt.get(i) * -1 + " Balance Left : "
						+ l.get(index).bal.get(i + 1));

			else

				System.out.println(
						"Credit of : " + l.get(index).amt.get(i) + " New Balance : " + l.get(index).bal.get(i + 1));
		}
	}

	public static void main(String[] args) {

	System.out.println("Enter 1 to credit some amount\nEnter 2 to debit some amount\nEnter 3 for changing the mobile number\nEnter 4 for changing the pin\nEnter 5 for viewing the past 5 transactions\nEnter 6 for account information\nEnter 7 to exit\nEnter 8 for new Account");
	
		int ch = s.nextInt();
		while (ch != 7) {
			switch (ch) {
			case 1: {
				if(l.size()==0)
					System.out.println("No record present!!");
				else credit();
				break;
			}
			case 2: {
				if(l.size()==0)
					System.out.println("No record present!!");
				else debit();
				break;
			}
			case 3: {
				if(l.size()==0)
					System.out.println("No record present!!");
				else mobile_change();
				break;
			}
			case 4: {
				if(l.size()==0)
					System.out.println("No record present!!");
				else pin_change();
				break;
			}

			case 5: {
				if(l.size()==0)
					System.out.println("No record present!!");
				else past_5_transactions();
				break;
			}
			case 6: {
				if(l.size()==0)
					System.out.println("No record present!!");
				else System.out.println("New Details Are : " + l.get(index).toString());
				break;
			}
			case 8: {
				s.nextLine();
				data_mem();
				if(!verify()) System.exit(0);
				break;
			}
			default:
				System.out.println("Wrong choice entered!");

			}
			System.out.println(
					"Enter 1 to credit some amount\nEnter 2 to debit some amount\nEnter 3 for changing the mobile number\nEnter 4 for changing the pin\nEnter 5 for viewing the past 5 transactions\nEnter 6 for account information\nEnter 7 to exit\nEnter 8 for new Account");
			ch = s.nextInt();
		}
	}

}
