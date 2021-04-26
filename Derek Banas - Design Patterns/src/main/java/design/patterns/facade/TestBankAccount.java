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
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccountFacade accessingBank = new BankAccountFacade(1235678, 1234);

        accessingBank.withdrawCash(50.00d);
        accessingBank.withdrawCash(900.00d);
        accessingBank.depositCash(200.00d);
    }
} 
