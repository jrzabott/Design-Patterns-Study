/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.strategy;

/**
 *
 * @author drochaju
 */
public interface Flys {

    String fly();
}

class ItFlys implements Flys {

    public String fly() {
        return "Flying High...";
    }
}

class CantFly implements Flys {

    public String fly() {
        return "I can´t Fly!!!";
    }

}
