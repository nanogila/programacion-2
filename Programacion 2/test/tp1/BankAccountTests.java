package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTests {

	@Test
    public void testDeposit() {
        BankAccount tester = new BankAccount("100752752"); // MyClass is tested
        tester.deposit(10);
float value = tester.getBalance();
        // assert statements
        assertEquals(10, value, 0.01);
}
	@Test
    public void testWithdraw() {
        BankAccount tester = new BankAccount("100752752"); // MyClass is tested
        tester.withdraw(10);
float value = tester.getBalance();
        // assert statements
        assertEquals(-10, value, 0.01);
}
	@Test
    public void testConstructorBalance() {
        BankAccount tester = new BankAccount("100752752"); // MyClass is tested
float value = tester.getBalance();
        // assert statements
        assertEquals(0, value, 0.01);
}
	@Test
    public void testConstructorCbu() {
        BankAccount tester = new BankAccount("100752752"); // MyClass is tested
String value = tester.getCbu();
        // assert statements
        assertEquals("100752752", value);
}
}
