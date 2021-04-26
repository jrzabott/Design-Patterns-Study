/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.adapter;

/**
 *
 * @author drochaju
 */
public class EnemyRobotAdapter implements EnemyAttacker{

        EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot theRobot) {
        this.theRobot = theRobot;
    }

    @Override
    public void assignDriver(String driverName) {
        theRobot.reactToHuman(driverName);
    }

    @Override
    public void driveForward() {
        theRobot.walkForward();
    }

    @Override
    public void fireWeapon() {
        theRobot.smashWithHands();
    }

}
