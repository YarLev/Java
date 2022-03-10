package com.java.bankrepeat;

//В данном домашнем задании нужно написать небольшую банковскую систему.
//        Минимальная банковская система будет состоять из классов (сущностей): Bill (счет) Account (аккаунт)
//        Person (личность человека) Deposit (пополнение счета) Payment (платеж).
//
//        Связи между сущностями будут такие: Account имеет поле типа Person, так же Account имеет поле типа Bill
//        Deposit и Payment имеют по одному полю Bill
//
//        Класс Person будет иметь следующие поля: имя, фамилия, номер телефона.
//        Класс Account будет иметь поля: Bill и Person.
//        Класс Bill будет содеражать поле с числовым значением внутри: например Integer amount
//        Класс Payment будет содержать поле Bill
//        Класс Deposit будет содержать поле Bill
//
//        Сценарии:
//        Созадние нескольких аккаунтов и счетов
//        В классах-сервисах (Напримет класс PaymentService) совершенить платежа (уменьшение счета)
//        И депозит (DepositService) (увеличение счета)
//
//        Перевод денег с одного аккаунта на другой
//        Создать дополнительный класс TransferService, создать в нем метод transfer и реализовать логику перевода денег
//        с одного аккаунта на другой
//
//        В методе main не должно происходить никакой логики, кроме вызовов сервисов.
//        Сервисы будут выполнять все действия, в методе main можно только создавать изначальные объекты и вызывать сервисы
//
//        Так же стоит предусмотреть критические случаи, например не оставлять отрицательную сумму на счету

import com.java.bankrepeat.entity.Account;
import com.java.bankrepeat.entity.Bill;
import com.java.bankrepeat.entity.Person;
import com.java.bankrepeat.service.DepositService;
import com.java.bankrepeat.service.PaymentService;
import com.java.bankrepeat.service.TransferService;

public class Main {
    public static void main(String[] args) {

        Person loriPerson = new Person("Lori", "Cat", "+37529555");
        Bill loriBill = new Bill(10000);
        Account loriAccount = new Account(loriBill, loriPerson);

        Person martinPerson = new Person("Martin", "Dog", "+3752956546");
        Bill martinBill = new Bill(5000);
        Account martinAccount = new Account(martinBill, martinPerson);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(loriAccount, 2000);
        paymentService.pay(martinAccount, 3000);
        System.out.println("\n");

        DepositService depositService = new DepositService();
        depositService.deposit(loriAccount, 12000);
        depositService.deposit(martinAccount, 8000);
        System.out.println("\n");

        TransferService transferService = new TransferService();
        transferService.transfer(loriAccount, martinAccount, 5000);
    }
}
