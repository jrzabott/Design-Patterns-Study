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
public class TestATMMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();
        atmMachine.ejectCard();

        atmMachine.insertCard();
        atmMachine.insertPin(7890);
        atmMachine.requestCash(2000);
        
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(2000);

        atmMachine.insertCard();
        atmMachine.insertPin(1234);
    }

}
