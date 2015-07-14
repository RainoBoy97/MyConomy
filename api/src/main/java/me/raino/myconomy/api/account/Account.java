package me.raino.myconomy.api.account;

import me.raino.myconomy.api.bank.Bank;
import me.raino.myconomy.api.currency.Currency;

import java.util.UUID;

public interface Account {

    String getName();

    UUID getOwner();

    Bank getBank();

    Currency getCurrency();

    double getBalance();

    double getBalance(Currency currency);

    double deposit(double amount);

    double deposit(double amount, Currency currency);

    double withdraw(double amount);

    double withdraw(double amount, Currency currency);

}
