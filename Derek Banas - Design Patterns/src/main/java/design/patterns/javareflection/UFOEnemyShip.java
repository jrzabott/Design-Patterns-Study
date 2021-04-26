/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.javareflection;

import design.patterns.abstractfactory.EnemyShipFactory;

/**
 *
 * @author drochaju
 */
public class UFOEnemyShip extends design.patterns.abstractfactory.UFOEnemyShip {

    private String idcode = "100";

    public UFOEnemyShip(EnemyShipFactory shipFactory) {
        super(shipFactory);
    }

    private String getPrivate() {
        return "How did you get this";

    }

    private String getOtherPrivate(int thisInt, String thatString) {
        return String.format("How did you get here %d %s", thisInt, thatString);
    }

    public UFOEnemyShip(int number, String randString) {
        System.out.println(String.format("You sent: %d %s", number, randString));
    }
}
