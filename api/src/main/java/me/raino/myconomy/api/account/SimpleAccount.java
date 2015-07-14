package me.raino.myconomy.api.account;

import me.raino.myconomy.api.bank.Bank;
import me.raino.myconomy.api.currency.Currency;

import java.util.UUID;

public class SimpleAccount implements Account {

    private String name;
    private UUID owner;
    private Bank bank;
    private Currency currency;

    private double balance;

    public SimpleAccount(String name, UUID owner, Bank bank, Currency currency) {
        this.name = name;
        this.owner = owner;
        this.bank = bank;
        this.currency = currency;

        this.balance = 0.0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public UUID getOwner() {
        return this.owner;
    }

    @Override
    public Bank getBank() {
        return this.bank;
    }

    @Override
    public Currency getCurrency() {
        return this.currency;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public double getBalance(Currency currency) {

        return currency.convert(this.balance, this.currency);
    }

    @Override
    public double deposit(double amount) {
        return deposit(amount, this.currency);
    }

    @Override
    public double deposit(double amount, Currency currency) {
        // TODO: fix
        return (this.balance += this.currency.convert(amount, currency));
    }

    @Override
    public double withdraw(double amount) {
        return withdraw(amount, this.currency);
    }

    @Override
    public double withdraw(double amount, Currency currency) {
        // TODO: fix
        return (this.balance -= this.currency.convert(amount, currency));
    }

}
