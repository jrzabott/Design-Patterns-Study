/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.command;

import java.util.List;

/**
 *
 * @author drochaju
 */
public class TurnItAllOff  implements Command{

    List<ElectronicDevice> theDevices;

    public TurnItAllOff(List<ElectronicDevice> theDevices) {
        this.theDevices = theDevices;
    }



    @Override
    public void execute() {
        for (ElectronicDevice theDevice : theDevices) {
            theDevice.off();
        }
    }

    @Override
    public void undo() {
         for (ElectronicDevice theDevice : theDevices) {
            theDevice.on();
        }
    }

}
