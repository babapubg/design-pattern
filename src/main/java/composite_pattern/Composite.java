package composite_pattern;

import java.util.ArrayList;
import java.util.List;

abstract class Account {
	public abstract float getBalance();
}

class DepositeAccount extends Account {

	private String accountNo;
	private float accountBalance;

	public DepositeAccount(String accountNo, float accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}

	public float getBalance() {
		return accountBalance;
	}

}

class SavingsAccount extends Account {

	private String accountNo;
	private float accountBalance;

	public SavingsAccount(String accountNo, float accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}

	public float getBalance() {
		return accountBalance;
	}

}

class CompositeAccount extends Account {
	private float totalBalance;
	private List<Account> accountList = new ArrayList<Account>();

	public float getBalance() {
		totalBalance = 0;
		for (Account a : accountList) {
			totalBalance += a.getBalance();
		}
		return totalBalance;
	}

	public void addAccount(Account acc) {
		accountList.add(acc);
	}

	public void removeAccount(Account acc) {
		accountList.remove(acc);
	}
}

public class Composite {
//Client

	public static void main(String[] args) {

		
	}
}