/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.facade;

/**
 *
 * @author drochaju
 */
public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal) {
        boolean result = false;
        if (cashToWithdrawal < cashInAccount) {
            System.out.println("You don't have enough money");
        } else {
            result = true;
            decreaseCashInAccount(cashToWithdrawal);
            System.out.println("Withdraw complete.");
        }
        System.out.println("Current balance: " + getCashInAccount());
        return result;
    }

    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit complete.");
        System.out.println("Current balance: " + getCashInAccount());
    }
}
