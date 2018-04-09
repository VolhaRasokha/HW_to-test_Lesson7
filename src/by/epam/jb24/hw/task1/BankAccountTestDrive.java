package by.epam.jb24.hw.task1;

public class BankAccountTestDrive {

	public static void main(String[] args) {
		ListOfAccounts myListOfAccounts = new ListOfAccounts();

		myListOfAccounts.addListOfAccounts(new BankAccount("0001", "debit",
				1000));
		myListOfAccounts.addListOfAccounts(new BankAccount("0002", "debit",
				3000));
		myListOfAccounts.addListOfAccounts(new BankAccount("0003", "credit",
				5000));
		myListOfAccounts.addListOfAccounts(new BankAccount("0004", "debit",
				1000));
		myListOfAccounts.addListOfAccounts(new BankAccount("0001", "debit",
				1000));

		System.out.println(myListOfAccounts);

		BankAccount ba1 = myListOfAccounts.getListOfAccounts().get(0);
		BankAccount ba2 = myListOfAccounts.getListOfAccounts().get(4);
		BankAccount ba3 = new BankAccount("0003", "credit", 5000);

		System.out
				.println("-----------------------------------------------------------------------");
		System.out.println("There are acconts, that we will compare:");
		System.out
				.print("-----------------------------------------------------------------------");
		System.out.print(ba1);
		System.out.println(ba2);

		System.out.println("");
		System.out
				.println("-----------------------------------------------------------------------");
		System.out.println("There are account's hash codes: ");
		System.out
				.println("-----------------------------------------------------------------------");
		System.out.println(ba1.hashCode());
		System.out.println(ba2.hashCode());

		System.out.println("");
		System.out
				.println("-----------------------------------------------------------------------");
		System.out.println("There is result of accounts comparison: ");
		System.out
				.println("-----------------------------------------------------------------------");

		if (ba1.equals(ba2)) {
			System.out.println("Result is true");
		} else {
			System.out.println("Result is false");
		}

		System.out.println("");
		System.out
				.println("-----------------------------------------------------------------------");
		System.out
				.println("Check if we already has object b3 in our myListOfAccounts array list: ");
		System.out
				.println("-----------------------------------------------------------------------");
		System.out.println(myListOfAccounts.getListOfAccounts().contains(ba3));
	}

}
