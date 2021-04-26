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
public class Robot implements RobotPlan {

    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;

    public String getRobotTorso() {
        return robotTorso;
    }

    @Override
    public void setRobotTorso(String torso) {
        this.robotTorso = torso;
    }

    public String getRobotArms() {
        return robotArms;
    }

    @Override
    public void setRobotArms(String arms) {
        this.robotArms = arms;
    }

    public String getRobotHead() {
        return robotHead;
    }

    @Override
    public void setRobotHead(String head) {
        this.robotHead = head;
    }

    public String getRobotLegs() {
        return robotLegs;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.robotLegs = legs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Robot{robotHead=").append(robotHead);
        sb.append(", robotTorso=").append(robotTorso);
        sb.append(", robotArms=").append(robotArms);
        sb.append(", robotLegs=").append(robotLegs);
        sb.append('}');
        return sb.toString();
    }

    

}
