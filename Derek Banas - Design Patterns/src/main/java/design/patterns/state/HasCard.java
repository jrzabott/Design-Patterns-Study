/*
 *
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.state;

/**
 *
 * @author drochaju
 */
public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected.");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void insertCard() {
        System.out.println("Cannot enter more than one card.");
    }

    @Override
    public void insertPin(int pin) {
        if (pin == 1234) {
            System.out.println("Correct PIN");
            atmMachine.correctPin = true;
            atmMachine.setATMState(atmMachine.getHasPinState());
        } else {
            System.out.println("PIN Incorrect");
            System.out.println("Card Ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void requestCash(int cash) {
        System.out.println("Enter PIN first");
    }

}
