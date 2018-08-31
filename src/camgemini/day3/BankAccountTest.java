package camgemini.day3;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import camgemini.day3.java.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


class BankAccountTest 
{
	BankAccount account;
	BankAccount account1;
	BankAccount account2;
	@BeforeEach
	void setUp() 
	{
//		account=new BankAccount();
		account = new BankAccount(1234, "ASDF", "SAVING", 30000);
//		account.setAccountHolderName("Joe");
//		account.setAccountType("CUREENT");
//		account.setAccountId(3456);
//		account.setBalance(50000);
	}

	@Test
	void testDeposit() 
	{
//		assertEquals(55000.0, account.deposit(5000));
		assertEquals(35000.0, account.deposit(5000));
		assertEquals(37345.34, account.deposit(2345.34));
	}
	@Test
	void testWithdraw() 
	{
//		assertEquals(45000.0, account.withdraw(5000), 0.02);
		assertEquals(25000.0, account.withdraw(5000), 0.02);
		assertEquals(19000.0, account.withdraw(6000), 0.02);
	}
	@Test
	void testTotalBankAccounts()
	{
		assertEquals(1,BankAccount.totalBankAccounts());
		account1=new BankAccount(567,"GHJK","CURRENT",40000);
		account2=new BankAccount(789,"QWERT","SAVINGS",35000);
		assertEquals(3,BankAccount.totalBankAccounts());	
		
	}

    @AfterEach
	void tearDown() 
    {
		account = null;
	}
}