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
public abstract class RemoteButton {

    private EntertainmentDevice theDevice;

    public RemoteButton(EntertainmentDevice theDevice) {
        this.theDevice = theDevice;
    }

    public void buttonFivePressed() {
        theDevice.buttonFivePressed();
    }

    public void buttonSixPressed() {
        theDevice.buttonSixPressed();
    }

    public void deviceFeedback() {
        theDevice.deviceFeedback();
    }
    public abstract void buttonNinePressed();
}
