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
public class EnemyRobot {

    Random generator = new Random();

    public void smashWithHands() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot causes " + attackDamage + " Damage with its hands");
    }

    public void walkForward(){
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot walks forward " + movement + " Spaces");

    }

    public void reactToHuman(String driverName){
        System.out.println("Enemy Robot tramps on " + driverName);
    }

}
