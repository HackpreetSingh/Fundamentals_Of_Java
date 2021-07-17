package banking_Management_System;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ATM 
//extends Transactions
{
	
	private long card_no = 1234;
	private int pin = 1313;
	private int amount = 100000;
	Scanner s;
	ArrayList<Integer> bal,amt;
	ATM() {
		s = new Scanner(System.in);
//		this.bal=Transactions.get_trans_bal();
//		this.amt=Transactions.get_trans_amt();		
	}

//	public long getCard_no() {
//		return this.card_no;
//	}
//
//	public void setCard_no(long card_no) {
//		this.card_no = card_no;
//	}
//
//	public int getPin() {
//		return this.pin;
//	}
//
//	public void setPin(int pin) {
//		this.pin = pin;
//	}
//
//	public int getAmount() {
//		return this.amount;
//	}
//
//	public void setAmount(int amount) {
//		this.amount = amount;
//	}

	void mini_statement() {
	
		System.out.println("Intial Balance : " + this.bal.get(0));
		for(int i=0;i<bal.size();++i) {
			if(amt.get(i)>0)
			System.out.println("Amount credited : "+amt.get(i)+"balance : "+bal.get(i+1));
			else	System.out.println("Amount debited : "+(-1*amt.get(i))+"balance : "+bal.get(i+1));
		}
	}
	
	void debit() {
		String deb;
		int Debit;
		s.nextLine();
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
		ATM a = new ATM();
		if(a.verify())
		a.debit();
	}

	boolean verify() {
		System.out.println("Enter your card number : ");
		if(s.nextLong()==this.card_no)
		{
			System.out.println("Enter your pin :");
			if(s.nextInt()==this.pin)	return true;
			else System.out.println("Wrong Pin entered!!");
		}
		else 	System.out.println("No such ATM Card Exits!");
		
		return false;
	}

}
