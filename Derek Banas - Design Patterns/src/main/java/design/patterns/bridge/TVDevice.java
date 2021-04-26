/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.bridge;

/**
 *
 * @author drochaju
 */
public class TVDevice extends EntertainmentDevice{

    public TVDevice(int newDeviceState, int newMaxSetting) {
        this.deviceState = newDeviceState;
        this.maxSetting = newMaxSetting;
    }



    @Override
    public void buttonFivePressed() {
        System.out.println("Channel Down");
        deviceState--;
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Channel Up");
        deviceState++;
    }

}
