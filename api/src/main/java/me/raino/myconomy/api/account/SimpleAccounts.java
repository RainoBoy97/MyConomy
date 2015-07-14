package me.raino.myconomy.api.account;

import me.raino.myconomy.api.bank.Bank;

import java.util.*;

public class SimpleAccounts implements Accounts {

    private UUID owner;
    private Bank bank;
    private Map<String, Account> accounts;

    public SimpleAccounts(UUID owner, Bank bank, List<Account> accounts) {
        this.owner = owner;
        this.bank = bank;
        this.accounts = new HashMap<>(5);
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
    public Account get(String name) {
        return this.accounts.get(name);
    }

    @Override
    public boolean has(String name) {
        return this.accounts.containsKey(name);
    }

    @Override
    public void remove(String name) {
        Account account = this.accounts.remove(name);
        this.bank.removeAccount(account.getOwner(), account.getName());
    }

    @Override
    public Iterator<Account> iterator() {
        return this.accounts.values().iterator();
    }

}
