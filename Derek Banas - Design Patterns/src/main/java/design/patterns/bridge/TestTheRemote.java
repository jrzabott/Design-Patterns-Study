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
public class TestTheRemote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RemoteButton theTV = new TVRemoteMute(new TVDevice(1, 200));
        RemoteButton theTV2 = new TVRemoteMute(new TVDevice(1, 200));

        System.out.println("Test TV with Mute");
        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();

        System.out.println("Test TV with Pause");
        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();
        theTV2.deviceFeedback();

    }

}
