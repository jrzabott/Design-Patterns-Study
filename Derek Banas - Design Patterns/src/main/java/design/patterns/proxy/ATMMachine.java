/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.proxy;

import design.patterns.state.*;

/**
 *
 * @author drochaju
 */
public class ATMMachine {

    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPIN;
    ATMState atmOutOfMoney;

    ATMState atmState;

    int cashInMachine = 2000;
    boolean correctPin = false;

    public ATMMachine() {
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPIN = new HasPin(this);
        atmOutOfMoney = new NoCash(this);

        atmState = noCard;

        if (cashInMachine <= 0) {
            atmState = atmOutOfMoney;
        }
    }

    void setATMState(ATMState newATMState) {
        atmState = newATMState;
    }

    public void setCashInMachine(int newCashInMachine) {
        cashInMachine = newCashInMachine;
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void requestCash(int cash) {
        atmState.requestCash(cash);
    }

    public void insertPin(int pin) {
        atmState.insertPin(pin);
    }

    public ATMState getYesCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasPinState() {
        return hasCorrectPIN;
    }

    public ATMState getNoCashState() {
        return atmOutOfMoney;
    }

}
