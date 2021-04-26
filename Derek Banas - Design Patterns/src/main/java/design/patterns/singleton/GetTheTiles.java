/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.singleton;

import java.util.LinkedList;

public class GetTheTiles implements Runnable {

    public GetTheTiles() {
    }

    @Override
    public void run() {
        Singleton newInstance = Singleton.getInstance();
        System.out.println("Instance ID: " + System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());
        LinkedList<String> playerOneTiles = newInstance.getTiles(7);
        System.out.println("Player: " + playerOneTiles);
        System.out.println("Got Tiles");

    }
}