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
public interface ATMState {

    void insertCard();

    void ejectCard();

    void insertPin(int pin);

    void requestCash(int cash);
}
