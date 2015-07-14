package me.raino.myconomy.api.bank;

import me.raino.myconomy.api.account.Account;
import me.raino.myconomy.api.account.Accounts;
import me.raino.myconomy.api.currency.Currency;

import java.util.UUID;

public interface Bank {

    String getName();

    UUID getOwner();

    Accounts getAccounts();

    Accounts getAccounts(UUID owner);

    Account createAccount(UUID owner, String name);

    Account createAccount(UUID owner, String name, Currency currency);

    void removeAccount(UUID owner, String name);

    Currency getCurrency();

}
