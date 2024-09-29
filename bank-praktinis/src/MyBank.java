import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class MyBank implements Bank {
    ArrayList<Account> bank = new ArrayList<>();

    @Override
    public int getNumberOfAccounts() {
        return bank.size();
    }

    @Override
    public BigDecimal getTotalReserves() {
        BigDecimal sum = BigDecimal.ZERO;
        for (Account account : bank) {
            sum = sum.add(account.getBalance());
        }
        return sum;
    }

    @Override
    public Collection<Account> getAllAccounts() {
        return bank;
    }

    @Override
    public Account openDebitAccount(String s) {
        for (Account account : bank) {
            if (account.getHolderName().equals(s)) {
                return null;
            }
        }
        BankAccount newAccount = new BankAccount(s);
        bank.add(newAccount);
        return newAccount;
    }

    @Override
    public Account openCreditAccount(String s, BigDecimal bigDecimal) {
        for (Account account : bank) {
            if (account.getHolderName().equals(s)) {
                return null;
            }
        }
        BankAccount newAccount = new BankAccount(s, bigDecimal);
        bank.add(newAccount);
        return newAccount;
    }

    @Override
    public Account getAccountByHolderName(String s) {
        return bank.stream()
                .filter(account -> account.getHolderName().equals(s))
                .findFirst()
                .get();
    }

    @Override
    public Account getAccountByNumber(String s) {
        return bank.stream()
                .filter(account -> account.getNumber().equals(s))
                .findFirst()
                .get();
    }

    @Override
    public void closeAccount(Account account) {
        bank.remove(account);
    }
}
