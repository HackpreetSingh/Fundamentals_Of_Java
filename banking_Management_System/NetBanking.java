package banking_Management_System;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetBanking {
	Scanner s;
	private String user_name="Motu", password="abcd";
	int amount=100000;
	public NetBanking() {
		s = new Scanner(System.in);
	}

//	private String getUser_name() {
//		return this.user_name;
//	}
//
//	private int getAmount() {
//		return this.amount;
//	}
//
//	private void setAmount(int amount) {
//		this.amount = amount;
//	}
//
//	private void setUser_name(String user_name) {
//		this.user_name = user_name;
//	}
//
//	private String getPassword() {
//		return this.password;
//	}
//
//	private void setPassword(String password) {
//		this.password = password;
//	}

	boolean verify() {
		System.out.println("Enter your User Name : ");
		if (s.nextLine().equals(this.user_name)) {
			System.out.println("Enter your password :");
			if (s.nextLine().equals(this.password))
				return true;
			else
				System.out.println("Wrong Password entered!!");
		} else
			System.out.println("No such User Name Exits!");

		return false;
	}

	void debit() {
		String deb;
		int Debit;

		System.out.print("Enter the amount you want to debit : ");
		deb = s.nextLine();
		Pattern p = Pattern.compile("[^0-9 ]");
		Matcher m = p.matcher(deb);
		if (m.find()) {
			System.out.println("Enter a valid amount!!");
		}

		else {
			Debit = Integer.parseInt(deb);
			if (Debit > this.amount) {
				System.out.println("You are a bankrupt!!");
				return;
			} else {
				System.out.println("Are you sure you want to debit : " + deb + " Amount?");
				if (s.next().charAt(0) == 'y') {
					this.amount -= Debit;
					System.out.println("Amount dispensed : " + deb + "\tRemaining Amount : " + this.amount);
				} else {
					System.out.println("Bhago");
				}
			}
		}

	}

	public static void main(String[] args) {
		NetBanking a = new NetBanking();
		if (a.verify())
			a.debit();
	}
}
