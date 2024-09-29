import ibank.Account;

import java.math.BigDecimal;

public class BankAccount implements Account {
    private String holderName;
    private BigDecimal balance;
    private String number;
    private BigDecimal credit;

    public BankAccount(String holderName) {
        this.holderName = holderName;
        balance = BigDecimal.ZERO;
        number = String.valueOf((int )(Math.random() * 999999 + 100000));
    }

    public BankAccount(String holderName, BigDecimal creditBalance) {
        this.holderName = holderName;
        balance = BigDecimal.ZERO;
        number = String.valueOf((int )(Math.random() * 999999 + 100000));
        credit = creditBalance.negate();
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String getHolderName() {
        return holderName;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public boolean deposit(BigDecimal bigDecimal) {
        balance = balance.add(bigDecimal);
        return true;
    }

    @Override
    // Patestavau pats, tai viskas veikia. Nežinau kas negerai?
    // Gaunu Cannot read field "scale" because "val" is null
    public boolean withdraw(BigDecimal bigDecimal) {
        BigDecimal newBalance = balance.subtract(bigDecimal);
        if(newBalance.compareTo(credit) > 0 || newBalance.compareTo(credit) == 0) {
            balance = newBalance;
            return true;

        }
        return false;
    }

    public BigDecimal getCredit() {
        return credit;
    }
}
