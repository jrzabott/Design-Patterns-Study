/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.builder;

/**
 *
 * @author drochaju
 */
public class RobotBuilderTesting {

    public static void main(String[] args) {

        RobotBuilder oldStyleRobot = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);

        robotEngineer.makeRobot();
        Robot firstRobot = robotEngineer.getRobot();

        System.out.println(firstRobot.toString());
    }

}
