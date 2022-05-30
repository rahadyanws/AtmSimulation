package com.rahadyan.atmsimulation.service;

import com.rahadyan.atmsimulation.domain.Account;
import com.rahadyan.atmsimulation.domain.TransferredAccount;

public interface MenuService {
    int choosenMenu();

    int choosenWithdraw();

    int chooseSummary(Account account);

    int chooseWitdhrawalAdditionalOption();

    int chooseFundTransferSummary(TransferredAccount transferredAccount, Account account);
}
