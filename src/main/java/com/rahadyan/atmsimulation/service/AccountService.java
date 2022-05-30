package com.rahadyan.atmsimulation.service;

import com.rahadyan.atmsimulation.domain.Account;
import com.rahadyan.atmsimulation.dto.Result;

public interface AccountService {
    Result<Account> deductAccount(Account account);
    Result<Account> inputAccount();
    Result<Account> isExistingAccount(String accountNumber);

}
