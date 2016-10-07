package tp2;

public class BankAccount {
private String cbu;
private float balance;

public BankAccount (String id){
	cbu = id;
	balance = 0;
}
public void deposit (float amount) {
	if (amount >0) {
		balance += amount; 
	}
}
public void withdraw (float amount) {
	if (amount >0) {
		balance -= amount; 
	}
}
	public float getBalance() {
		return balance;
	}
	public String getCbu() {
		return cbu;
	}
}
