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
public class Television implements ElectronicDevice{

    private int volume = 0;

    @Override
    public void off() {
        System.out.println("TV is OFF");
    }

    @Override
    public void on() {
        System.out.println("TV is ON");
    }

    @Override
    public void volumeDown() {
        System.out.println("TV volume is at " + --volume);
    }

    @Override
    public void volumeUp() {
        System.out.println("TV volume is at " + ++volume);

    }

}
