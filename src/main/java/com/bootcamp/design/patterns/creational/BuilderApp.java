package com.bootcamp.design.patterns.creational;

import com.bootcamp.design.patterns.creational.builder.BankAccount;
import com.bootcamp.design.patterns.creational.builder.BankAccountBuilder;
import com.bootcamp.design.patterns.creational.builder.BankAccountType;

public class BuilderApp {

    public static void main(String[] args) {

        BankAccountBuilder builder = new BankAccountBuilder(12345L);

        BankAccount bankAccount = builder.withBalance(1000.20)
                .withOwner("John Smith")
                .withRate(10.15)
                .withType(BankAccountType.PLATINUM)
                .build();

        System.out.println(bankAccount.toString());
    }
}