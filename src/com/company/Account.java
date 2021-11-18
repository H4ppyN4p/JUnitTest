package com.company;

public class Account {
    private int accountNr;
    private String accountOwner;
    private int accountMoney;

    public Account(int accountNr, String accountOwner, int accountMoney){
        this.accountNr = accountNr;
        this.accountOwner = accountOwner;
        this.accountMoney = accountMoney;
    }

    public Account(int accountNr, String accountOwner){
        this.accountNr = accountNr;
        this.accountOwner = accountOwner;
        this.accountMoney = 0;
    }

    public void setAccountNr(int accountNr){
        this.accountNr = accountNr;
    }

    public int getAccountNr(){
        return accountNr;
    }

    public void setAccountOwner(String accountOwner){
        this.accountOwner = accountOwner;
    }

    public String getAccountOwner(){
        return accountOwner;
    }

    public void setAccountMoney(int accountMoney){
        this.accountMoney = accountMoney;
    }

    public int getAccountMoney(){
        return accountMoney;
    }

    public int insertMoney(int accountMoney){
        return this.accountMoney += accountMoney;
    }

    public int withdrawMoney(int accountMoney){
        if (accountMoney > this.accountMoney){
            return -1;
        } else {
            return this.accountMoney -= accountMoney;
        }
    }

    @Override
    public String toString(){
        return ("account owner: "  + this.accountOwner + "\naccount number: " + this.accountNr + "\nmoney on account: "+ this.accountMoney);
    }
}
