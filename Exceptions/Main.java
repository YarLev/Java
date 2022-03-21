package com.java.Exceptions;

public class Main {
    public static void main(String[] args) {
        AccountRepository accountRepository = AccountRepository.getInstance();
        Account account1 = new Account(1L,"Lori", 10000);
        Account account2 = new Account(2L,"Max", 20000);
        Account account3 = new Account(3L,"Bax", 30000);
        Account account4 = new Account(4L,"Lux", 40000);

        accountRepository.add(account1);
        accountRepository.add(account2);
        accountRepository.add(account3);
        accountRepository.add(account4);

        try {
            System.out.println(accountRepository.getById(4L));
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
        }
    }
}
