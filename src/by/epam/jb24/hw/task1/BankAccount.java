package by.epam.jb24.hw.task1;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String typeOfAccount;

	public BankAccount(String accountNumber, String typeOfAccount,
			double balance) {
		this.setAccountNumber(accountNumber);
		this.setTypeOfAccount(typeOfAccount);
		this.setBalance(balance);
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getTypeOfAccount() {
		return typeOfAccount;
	}

	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}

	@Override
	public String toString() {
		return "\n Account number:" + accountNumber + "; Type of Account: "
				+ typeOfAccount + "; Current balance : " + balance;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (this == obj) {
			return true;
		}

		if (this.getClass() != obj.getClass()) {
			return false;
		}

		BankAccount myBankAccount = (BankAccount) obj;

		if (accountNumber != myBankAccount.accountNumber) {
			return false;
		}

		if (balance != myBankAccount.balance) {
			return false;
		}

		if (typeOfAccount != myBankAccount.typeOfAccount) {
			return false;
		}

		return true;
	}

	public int hashCode() {
		return (int) (accountNumber.hashCode() + typeOfAccount.hashCode() + 31 * balance);
	}
}
