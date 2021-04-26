/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.factory;

/**
 *
 * @author drochaju
 */
public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {
        EnemyShip newShip = null;
        if (newShipType.equalsIgnoreCase("U")) {
            newShip = new UFOEnemyShip();
        }
        if (newShipType.equalsIgnoreCase("R")) {
            newShip = new RocketEnemyShip();
        }
        if (newShipType.equalsIgnoreCase("B")) {
            newShip = new BigUFOEnemyShip();
        }
        return newShip;
    }
}
