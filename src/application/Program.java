package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001,"Alex",500.0,0.01));
        list.add(new BusinessAccount(1002,"Mary",1500.0,100.0));
        list.add(new SavingsAccount(1003,"Blob",500.0,0.01));
        list.add(new BusinessAccount(1004,"Joan Jet",1500.0,300.0));

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }

            System.out.printf("Total Balance: %.2f%n", sum);

        for (Account acc : list){
            acc.deposit(10.0);
        }

        for (Account acc : list){
            System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }


    }
}