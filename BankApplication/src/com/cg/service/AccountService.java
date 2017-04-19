package com.cg.service;

import com.cg.beans.Account;
import com.cg.exceptions.DuplicateAccountException;
import com.cg.exceptions.InsufficientInitialAmmount;
import com.cg.exceptions.InvalidAccountNumber;

public interface AccountService {

	Account createAccount(int AcountNumber, int balance) throws InsufficientInitialAmmount, InvalidAccountNumber, DuplicateAccountException;

}