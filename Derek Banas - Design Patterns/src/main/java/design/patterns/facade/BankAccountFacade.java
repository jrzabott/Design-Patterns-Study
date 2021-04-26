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
public class BankAccountFacade {

    private int accountNumber;
    private int secureCode;

    public BankAccountFacade(int accountNumber, int securityKey) {
        this.accountNumber = accountNumber;
        this.secureCode = securityKey;
    }

    void depositCash(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void withdrawCash(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
