package jUnitAssignment;

public class Savings {
	private int balance;
	
	
	
	public void setbalance(int amount) {
		
		this.balance = amount;
		
	}
	
	public int balance() {
		
		return this.balance;
		
	}
	
	public int deposit(int amount) {
		int savingsLimit = this.balance + amount;
		
		if(savingsLimit <= 100000) {
			
			this.balance = this.balance + amount;
			
			return 1;
		}
		
		return -1;
		
	}
	
	public int withdraw(int amount) {
		int balanceAmount = this.balance - amount;
		
		if(balanceAmount < 0) {
			return -1;
		}
		
		this.balance = this.balance - amount;
		return this.balance;
	}
	
	public String print() {
		
		return "Balance: $"+ this.balance +"";
		
	}
	
	public int buyStamps(int stamps) {
		int price = stamps * 2;
		int balanceAmount = this.balance - price;
		
		if(balanceAmount < 0) {
			return -1;
		}
		
		this.balance = this.balance - price;
		
		return price;
			
	}

}
