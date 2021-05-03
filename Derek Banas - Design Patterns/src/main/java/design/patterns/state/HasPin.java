/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.state;

/**
 *
 * @author drochaju
 */
public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void insertCard() {
        System.out.println("Cannot insert more than a card.");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("PIN already entered.");
    }

    @Override
    public void requestCash(int cash) {
        if (cash > atmMachine.cashInMachine) {
            System.out.println("Don't have that cash.");
        } else {
            System.out.println(cash + " is provided by the machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cash);
        }

        System.out.println("Card Ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());

        if (atmMachine.cashInMachine <= 0) {
            atmMachine.setATMState(atmMachine.getNoCashState());
        }
    }

}
