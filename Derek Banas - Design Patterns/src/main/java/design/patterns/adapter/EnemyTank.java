/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.adapter;

import java.util.Random;

/**
 *
 * @author drochaju
 */
public class EnemyTank implements EnemyAttacker{

    Random generator = new Random();

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank.");
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Tank moves " + movement + " Distance");

    }

    @Override
    public void fireWeapon() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Tank does " + attackDamage + " Damage");
    }

}
