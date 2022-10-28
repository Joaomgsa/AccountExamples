package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc1 = new Account(1001,"Alex", 1000.0);
        BusinessAccount bacc = new BusinessAccount(1002, "OLX", 0.0, 500.0);

        acc1.withdraw(200.0);


        //Upcasting


        Account acc2 = new SavingsAccount(1002, "Bob",1000.0, 0.01 );

        acc2.withdraw(200.0);

        Account acc3 = new BusinessAccount(1003, "OLX", 1000.0, 2500.0);

        acc3.withdraw(200.00);

              System.out.println("Business Account balance : $"+acc1.getBalance());
              System.out.println("Savings Account balance : $"+acc2.getBalance());
              System.out.println("Business Account balance : $"+acc3.getBalance());
    }
}