/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.factory;

import java.util.Scanner;

/**
 *
 * @author drochaju
 */
public class EnemyShipTesting {

    public static void main(String[] args) {
        EnemyShip theEnemy = null;
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        Scanner userInput = new Scanner(System.in);
        System.out.println("What type? (B / R / U)");
        if (userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }
        if (theEnemy != null) {
            doStuffEnemy(theEnemy);
        } else {
            System.out.println("Enter a B, R or U");
        }

    }

    private static void doStuffEnemy(EnemyShip ufoShip) {
        ufoShip.displayEnemyShip();
        ufoShip.followHeroShip();
        ufoShip.enemyShipShoots();
    }
}
