package com.java.bankrepeat.service;

import com.java.bankrepeat.entity.Account;
import com.java.bankrepeat.entity.Bill;

public class PaymentService {
    public void pay(Account account, int amount){
        Bill bill = account.getBill();
        if (bill.getAmount() > amount){
            System.out.println("Происходит операция платежа, текущее значение счёта " + account.getAccountHolder().getName() + " : " + bill.getAmount());
            bill.setAmount(bill.getAmount() - amount);
            System.out.println("Плетёж совершён, новое значение счёта " + account.getAccountHolder().getName() + " : " + bill.getAmount());
        }else{
            System.out.println("Недостаточно средств");
        }
    }
}
