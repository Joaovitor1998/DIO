package accounts;

import java.math.BigDecimal;

import client.Client;

public abstract class Account implements IAccount {

    private static final int DEFAULT_AGENCY = 3344;
    private int agency;
    protected long number;
    protected BigDecimal balance;
    protected String accountType;
    protected Client client;

    public Account(BigDecimal balance) {
        this.agency = DEFAULT_AGENCY;
        this.balance = balance;
    }

    public int getAgency() {
        return agency;
    }

    public long getNumber() {
        return number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public void transferTo(BigDecimal value, Account account) {
        if (this.balance.compareTo(value) == -1) {
            System.out.println("You don't have money enough.");
        } else {
            this.withdraw(value);
            account.depositValue(value);
        }
    }

    @Override
    public void withdraw(BigDecimal value) {
        this.balance = this.balance.subtract(value);

    }

    @Override
    public void depositValue(BigDecimal value) {
        this.balance = this.balance.add(value);
    }

}