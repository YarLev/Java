package com.java.Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AccountRepository {

    private static AccountRepository INSTANCE; // Singleton

    private List<Account> accountList = new ArrayList<>();

    private AccountRepository(){
    }

    public static AccountRepository getInstance(){
        if (INSTANCE == null){
            INSTANCE = new AccountRepository();
        }
        return INSTANCE;
    }

    public void add(Account account){
        accountList.add(account);
    }

    public Account getById(Long id) throws AccountNotFoundException {
        for (Account account : accountList) {
            if (Objects.equals(account.getId(), id)){
                return account;
            }
        }
        throw new AccountNotFoundException("Не существует аккаунта с номером: " + id);
    }
}
