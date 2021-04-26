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
public class TVRemotePause extends RemoteButton {

    public TVRemotePause(EntertainmentDevice theDevice) {
        super(theDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was Paused");
    }

}
