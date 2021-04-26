/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.command;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author drochaju
 */
public class PlayWithRemote {

    static LinkedList<DeviceButton> buttonHistory = new LinkedList<>();

    public static void main(String[] args) {
        ElectronicDevice newDevice = TVRemote.getDevice();

        TurnTVOn onCommand = new TurnTVOn(newDevice);

        DeviceButton onPressed = new DeviceButton(onCommand);

        onPressed.press();
        buttonHistory.addFirst(onPressed);

        // ---------------------------------------

        TurnTVOff offCommand = new TurnTVOff(newDevice);

        onPressed = new DeviceButton(offCommand);

        onPressed.press();
        buttonHistory.addFirst(onPressed);

        // ---------------------------------------

        TurnTVVolumeUp volUpCommand = new TurnTVVolumeUp(newDevice);

        onPressed = new DeviceButton(volUpCommand);

        onPressed.press();
        buttonHistory.addFirst(onPressed);
        onPressed.press();
        buttonHistory.addFirst(onPressed);
        onPressed.press();
        buttonHistory.addFirst(onPressed);

        // ---------------------------------------

        Television theTV = new Television();
        Radio theRadio = new Radio();

        List<ElectronicDevice> allDevices = new ArrayList<>();

        allDevices.add(theTV);
        allDevices.add(theRadio);

        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);

        turnThemOff.press();
        buttonHistory.addFirst(turnThemOff);

        // ---------------------------------------

//        turnThemOff.pressUndo();

        // ---------------------------------------
        // Implement an undo command history ...
        // ...
        // Undoing all the commands...
        System.out.println("=======================================");
        System.out.println("Button Hitory: " + buttonHistory);
        System.out.println("=======================================");
        while (!buttonHistory.isEmpty()) {
            DeviceButton nextElement = buttonHistory.getFirst();
            nextElement.pressUndo();
            buttonHistory.removeFirst();
        }
        System.out.println("=======================================");
        System.out.println("Button Hitory: " + buttonHistory);
    }
}
