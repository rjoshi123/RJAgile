package com.cg.repo;

import com.cg.beans.Account;
import com.cg.exceptions.DuplicateAccountException;
import com.cg.exceptions.InvalidAccountNumber;

public interface AccountRepo {

	boolean createAccount(Account a) throws InvalidAccountNumber, DuplicateAccountException;

}