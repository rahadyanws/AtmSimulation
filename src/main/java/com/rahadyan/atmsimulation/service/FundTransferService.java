package com.rahadyan.atmsimulation.service;

import com.rahadyan.atmsimulation.domain.Account;
import com.rahadyan.atmsimulation.dto.Result;

public interface FundTransferService {

    public Result<Account> inputTransferedAccount(Account account);

    Result<Account> isValidData(Account account);

    Result<Account> transferAmount(Account account);

    Result<Account> confirmTransaction(Account account);
}