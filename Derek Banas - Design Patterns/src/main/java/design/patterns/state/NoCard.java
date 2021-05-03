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
public class NoCard implements ATMState {

    ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void ejectCard() {
        System.out.println("Card not present.");
    }

    @Override
    public void insertCard() {
        System.out.println("Please enter a PIN");
        atmMachine.setATMState(atmMachine.getYesCardState());

    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Card not present");
    }

    @Override
    public void requestCash(int cash) {
        System.out.println("Card not present");
    }

}
