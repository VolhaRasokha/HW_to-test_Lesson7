package by.epam.jb24.hw.task1;

import java.util.ArrayList;
import java.util.List;

public class ListOfAccounts {
	private List<BankAccount> listOfAccounts = new ArrayList<BankAccount>();

	public List<BankAccount> getListOfAccounts() {
		return listOfAccounts;
	}

	public void addListOfAccounts(BankAccount account) {
		listOfAccounts.add(account);
	}

	@Override
	public String toString() {
		return "List of existing accounts: " + listOfAccounts;
	}
}
