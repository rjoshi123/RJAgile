package com.cg.repo;

import java.util.LinkedList;
import java.util.List;

import com.cg.beans.Account;
import com.cg.exceptions.DuplicateAccountException;
import com.cg.exceptions.InvalidAccountNumber;

public class AccountRepoImpl implements AccountRepo {

	public List <Account> acc= new LinkedList<Account>();
	
	/* (non-Javadoc)
	 * @see com.cg.repo.AccountRepo#createAccount(com.cg.beans.Account)
	 */
	@Override
	public boolean createAccount(Account a) throws InvalidAccountNumber, DuplicateAccountException
	
	{
		if(acc==null){
			throw new InvalidAccountNumber();
		}

		
		if(acc.contains(a))
		{
			throw new DuplicateAccountException();
		}
		
	
		acc.add(a);
		return true;
		
	}
}
