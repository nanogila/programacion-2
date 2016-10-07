package tp2;

public class Bank {
private BankAccount[] accounts;
public Bank (BankAccount anAccount, BankAccount anotherAccount, BankAccount thirdAccount) {
	accounts = new BankAccount[3];
	accounts[0] = anAccount;
	accounts[1] = anotherAccount;
	accounts[2] = thirdAccount;
}
public void transfer (BankAccount sender, BankAccount reciever, float amount) {
	for(int i=0; i<3; i++) {
		if (sender.getCbu() == accounts[i].getCbu()) {
			for(int j=0; j<3; j++) {
				if (reciever.getCbu() == accounts[j].getCbu()) {
					accounts[i].withdraw(amount);
					accounts[j].deposit(amount);
				}
			}
		}
	}
}
public float getAccountBalance(String cbu) {
	for(int i=0; i<3; i++) {
		if (cbu == accounts[i].getCbu()) {
			return accounts[i].getBalance();
		}
	}
	return (float)-127.3;
}

}
