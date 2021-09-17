package com.bootcamp.design.patterns.creational.builder;

//@
//@
public class BankAccount {

    private long accountNumber;
    private String owner;
    private BankAccountType type;
    private double balance;
    private double interestRate;

    public BankAccount() {
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public BankAccountType getType() {
        return type;
    }

    public void setType(BankAccountType type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccount{");
        sb.append("accountNumber=").append(accountNumber);
        sb.append(", owner='").append(owner).append('\'');
        sb.append(", type=").append(type);
        sb.append(", balance=").append(balance);
        sb.append(", interestRate=").append(interestRate);
        sb.append('}');
        return sb.toString();
    }
}