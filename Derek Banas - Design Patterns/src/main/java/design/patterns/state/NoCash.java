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
public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void ejectCard() {
        System.out.println("We Don't Have Money. You didn't enter a card.");
    }

    @Override
    public void insertCard() {
        System.out.println("Machine has no money.");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Machine has no money.");
    }

    @Override
    public void requestCash(int cash) {
        System.out.println("Machine has no money.");
    }

}
