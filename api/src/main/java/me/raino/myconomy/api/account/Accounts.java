package me.raino.myconomy.api.account;

import me.raino.myconomy.api.bank.Bank;

import java.util.UUID;

public interface Accounts extends Iterable<Account> {

    UUID getOwner();

    Bank getBank();

    Account get(String name);

    boolean has(String name);

    void remove(String name);

}
