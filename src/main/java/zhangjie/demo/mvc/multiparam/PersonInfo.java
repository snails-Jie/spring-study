package zhangjie.demo.mvc.multiparam;

import zhangjie.demo.mvc.Account;
import zhangjie.demo.mvc.Bank;

public class PersonInfo {
    private Account account;
    private Bank bank;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
