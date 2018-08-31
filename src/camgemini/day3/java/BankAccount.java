package camgemini.day3.java;

public class BankAccount {
	private long accountId;
	private String accountHolderName;
	private String accountType;
	private double balance;
	public static long totalNumberOfAccounts;
	
	public BankAccount() {
		totalNumberOfAccounts++;
	}
	
	public BankAccount(long accountId, String accountHolderName, String accountType, double balance) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.balance = balance;
		totalNumberOfAccounts++;
	}
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}
	public double withdraw(double amount) {
		if(balance - amount >= 0)
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println("There's no sufficient balance.");
		}
		return balance;
	}
	public double accountBalance() {
		return balance;
	}
	public static long totalBankAccounts() {
		return totalNumberOfAccounts;
	}

	public void displayBankAccountDetails() {
		System.out.println("Account Id : " + accountId);
		System.out.println("Account holder name: " + accountHolderName );
		System.out.println("Account type: " + accountType);
		System.out.println("Account balance: " + balance);
	}

//	public long getAccountId() {
//		return accountId;
//	}
//
//	public void setAccountId(long accountId) {
//		this.accountId = accountId;
//	}
//
//	public String getAccountHolderName() {
//		return accountHolderName;
//	}
//
//	public void setAccountHolderName(String accountHolderName) {
//		this.accountHolderName = accountHolderName;
//	}
//
//	public String getAccountType() {
//		return accountType;
//	}
//
//	public void setAccountType(String accountType) {
//		this.accountType = accountType;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//
//	public static long getTotalNumberOfAccounts() {
//		return totalNumberOfAccounts;
//	}
//
//	public static void setTotalNumberOfAccounts(long totalNumberOfAccounts) {
//		BankAccount.totalNumberOfAccounts = totalNumberOfAccounts;
//	}
	

	
	} 

