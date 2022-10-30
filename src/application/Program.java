package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        // exemplo Polimorfismo
        Account x = new Account(1020,"Alex", 1000.0);
        Account y = new SavingsAccount(1002, "Mary", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);





    }
}