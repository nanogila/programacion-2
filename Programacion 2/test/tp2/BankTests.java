package tp2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTests {

	@Test
	public void testTransfer() {
		BankAccount anAccountA = new BankAccount ("123");
		BankAccount anAccountB = new BankAccount ("456");
		BankAccount anAccountC = new BankAccount ("789");
		anAccountA.deposit(444);
		anAccountB.deposit(556);
		anAccountC.deposit(1000);
		
		Bank testBank = new Bank (anAccountA, anAccountB, anAccountC);
		testBank.transfer(anAccountA, anAccountB, 444);
		float result = testBank.getAccountBalance("123");
		assertEquals(0, result, 0.1);
	}
	@Test
	public void testTransfer2() {
		BankAccount anAccountA = new BankAccount ("123");
		BankAccount anAccountB = new BankAccount ("456");
		BankAccount anAccountC = new BankAccount ("789");
		anAccountA.deposit(444);
		anAccountB.deposit(556);
		anAccountC.deposit(1000);
		
		Bank testBank = new Bank (anAccountA, anAccountB, anAccountC);
		testBank.transfer(anAccountA, anAccountB, 444);
		float result2 = testBank.getAccountBalance("456");
		assertEquals(1000, result2, 0.1);
	}
	@Test
	public void testTransfer3() {
		BankAccount anAccountA = new BankAccount ("123");
		BankAccount anAccountB = new BankAccount ("456");
		BankAccount anAccountC = new BankAccount ("789");
		anAccountA.deposit(444);
		anAccountB.deposit(556);
		anAccountC.deposit(1000);
		
		Bank testBank = new Bank (anAccountA, anAccountB, anAccountC);
		testBank.transfer(anAccountA, anAccountC, 443);
		float result2 = testBank.getAccountBalance("789");
		assertEquals(1443, result2, 0.1);
	}

}
