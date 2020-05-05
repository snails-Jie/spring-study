package zhangjie.demo.mvc;

public class Bank {
    private String bankCode;//银行编号
    private String bankAccount;//银行卡账号

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}
