package ru.otus.java.basic.homeworks.homework5.bank_accounts;

public class MainApplications {
    public static void main(String[] args) {
        BankAccount creditAccount = new CreditAccount("Boris Boris", -1000);
        BankAccount premiumAccount = new PremiumAccount("Rodion Bessonov", 10000000);
        BankAccount savingAccount = new SavingAccount("Henadzi Bessonov", 10000);
        BankAccount[] bankAccounts = new BankAccount[3];
        bankAccounts[0] = creditAccount;
        bankAccounts[1] = premiumAccount;
        bankAccounts[2] = savingAccount;
        for (int i = 0; i < bankAccounts.length; i++) {
            bankAccounts[i].withdraw(10000);
            bankAccounts[i].info();
        }
    }
}
