package com.java.bankrepeat.service;

import com.java.bankrepeat.entity.Account;
import com.java.bankrepeat.entity.Bill;

public class DepositService {
    public void deposit(Account account, int amount) {
        Bill bill = account.getBill();
        System.out.println("Происходит пополнения счёта, текущее значение " + account.getAccountHolder().getName() + " : " + bill.getAmount());
        bill.setAmount(bill.getAmount() + amount);
        System.out.println("Счёт пополнен, новое значение счёта " + account.getAccountHolder().getName() + " : " + bill.getAmount());
    }
}
