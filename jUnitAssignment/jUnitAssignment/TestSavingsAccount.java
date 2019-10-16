package jUnitAssignment;

import org.junit.*;

import junit.framework.TestCase;;

public class TestSavingsAccount extends TestCase {
	
	@Test
	public void testSavingsAccount(){ 
	     Savings f = new Savings();
	 }
	
	@Test
	public void testDeposit(){ 
	Savings s = new Savings();
	s.setbalance(0);
	s.deposit(5000);              
	assertEquals(5000, s.balance());
	}
	
	@Test
	public void testWithdraw(){ 
	Savings s = new Savings();
	s.setbalance(0);
	s.deposit(5000);        
	s.withdraw(3000);      
	assertEquals(2000, s.balance());
	}
	
	@Test
	public void testWithdrawEmpty(){ 
	Savings s = new Savings();
	s.setbalance(0);
	assertEquals(0, s.balance());
	assertEquals(-1, s.withdraw(1000)); 
	assertEquals(0, s.balance());
	s.deposit(500);        
	assertEquals(-1, s.withdraw(1000)); 
	assertEquals(500, s.balance());
	}
	
	@Test
	public void testPrintBalance(){ 
	Savings s = new Savings();
	s.setbalance(0); 
	s.deposit(500); 
	assertEquals("Balance: $500", s.print());
	}
	
	@Test
	public void testStamps(){ 
	Savings s = new Savings();
	s.setbalance(0); 
	s.deposit(1000); 
	assertEquals(20, s.buyStamps(10)); 
	assertEquals(980, s.balance());
	}
	
	@Test
	public void testnotEnoughForStamps(){ 
	Savings s = new Savings();
	s.setbalance(0);
	s.deposit(0);
	assertEquals(-1, s.buyStamps(1000));
	assertEquals(0, s.balance());
	}
	
	@Test
	public void testoverSavingsLimit(){ 
	Savings s = new Savings();
	s.setbalance(99999); 
	assertEquals(-1, s.deposit(2)); 
	assertEquals(99999, s.balance());
	}






}
