package com.cg.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.cg.beans.Account;
import com.cg.exceptions.DuplicateAccountException;
import com.cg.exceptions.InsufficientInitialAmmount;
import com.cg.exceptions.InvalidAccountNumber;
import com.cg.service.AccountService;
import com.cg.service.AccountServiceImpl;
import static org.junit.Assert.assertEquals;
public class AccountServiceTest {

	
	AccountService service;
	@Before
	public void setUp() throws Exception {
		
		service = new AccountServiceImpl();
	}
	
	/*@Test(expected=com.cg.exceptions.InsufficientInitialAmmount.class)
	public void createAccountTest1() throws InvalidAccountNumber, InsufficientInitialAmmount, DuplicateAccountException{
	
		service.createAccount(101, 300);
	}*/
	
	@Test(expected=com.cg.exceptions.DuplicateAccountException.class)
	public void createAccountTest2() throws InvalidAccountNumber, InsufficientInitialAmmount, DuplicateAccountException{
	
		service.createAccount(100, 3000);
		
		service.createAccount(102, 3000);
		
		service.createAccount(101, 3000);
		
		Account account =new Account();
		
		account.setAccountNumber(100);
		account.setBalance(3000);
		
		
		assertEquals(account, service.createAccount(101, 3000));
		
		
		
	}
	/*@Test
	public void createAccountTest3() throws InvalidAccountNumber, InsufficientInitialAmmount{
		Account a = new Account();
		a.setAccountNumber(102);
		a.setBalance(3000);
		assertEquals(a, service.createAccount(102, 3000));
	}*/
	
	


}
