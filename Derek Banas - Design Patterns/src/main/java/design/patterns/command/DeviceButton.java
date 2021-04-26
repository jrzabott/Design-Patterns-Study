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
public class DeviceButton {

    Command theCommand;

    public DeviceButton(Command theCommand) {
        this.theCommand = theCommand;
    }
public void press(){
    theCommand.execute();
}
public void pressUndo(){
    theCommand.undo();
}
}
