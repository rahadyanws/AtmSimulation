package com.rahadyan.atmsimulation.dto;


import com.rahadyan.atmsimulation.domain.Account;

import java.util.HashMap;
import java.util.Map;

public class AccountRepository {

    private static Map<String, Account> accounts = new HashMap<>();

    static {
        accounts.put("112233", new Account("John Doe", "012108", 100, 0, "112233"));
    }

    public static Map<String, Account> getAccounts() {
        return accounts;
    }

    public static void setAccounts(Map<String, Account> accounts) {
        AccountRepository.accounts = accounts;
    }
}
