/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.command;

/**
 *
 * @author drochaju
 */
public class TurnTVOff implements Command{

    ElectronicDevice theDevice;

    public TurnTVOff(ElectronicDevice theDevice) {
        this.theDevice = theDevice;
    }

    @Override
    public void execute() {
        theDevice.off();
    }

    @Override
    public void undo() {
        theDevice.on();
    }

}
