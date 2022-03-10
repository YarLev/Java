package com.java.bankrepeat.service;

import com.java.bankrepeat.entity.Account;
import com.java.bankrepeat.entity.Bill;

public class TransferService {
    public void transfer(Account accountFrom, Account accountTo, int amount){
        Bill accFrom = accountFrom.getBill();
        Bill accTo = accountTo.getBill();

        if (accFrom.getAmount() > amount){
            System.out.println("Происходит перевод средств с аккаунта " + accountFrom.getAccountHolder().getName() +
                    " на аккаунт " + accountTo.getAccountHolder().getName());
            accFrom.setAmount(accFrom.getAmount() - amount);
            accTo.setAmount(accTo.getAmount() + amount);
            System.out.println("Перевод успешно завершён");
            System.out.println("Счёт " + accountFrom.getAccountHolder().getName() + ": " + accFrom.getAmount());
            System.out.println("Счёт " + accountTo.getAccountHolder().getName() + ": " + accTo.getAmount());
        }else{
            System.out.println("Недостаточно средств для транзакции");
        }
    }
}