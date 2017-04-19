package com.cg.service;

import java.util.LinkedList;
import java.util.List;

import com.cg.beans.Account;
import com.cg.exceptions.DuplicateAccountException;
import com.cg.exceptions.InsufficientInitialAmmount;
import com.cg.exceptions.InvalidAccountNumber;
import com.cg.repo.AccountRepo;
import com.cg.repo.AccountRepoImpl;

public class AccountServiceImpl implements AccountService {
	
	AccountRepo repo= new AccountRepoImpl();
	/* (non-Javadoc)
	 * @see com.cg.service.AccountService#createAccount(int, int)
	 * 
	 * 
	 * 
	 */
	
	

	@Override
	public Account createAccount(int AcountNumber, int balance) throws InsufficientInitialAmmount, InvalidAccountNumber, DuplicateAccountException{
		if(balance < 500){
			
			throw new InsufficientInitialAmmount();
		}
		
	
		Account a= new Account();
		a.setAccountNumber(AcountNumber);
		a.setBalance(balance);
		
		repo.createAccount(a);
		
		return a;
	}

}
