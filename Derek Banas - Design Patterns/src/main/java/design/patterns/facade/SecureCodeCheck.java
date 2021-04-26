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
public class SecureCodeCheck {

    private int securityCode = 1234;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean idCodeCorrect(int secCodeToCheck) {
        if (secCodeToCheck == getSecurityCode()) {
            return true;
        }
        return false;
    }
}
