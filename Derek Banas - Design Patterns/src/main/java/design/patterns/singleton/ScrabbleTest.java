/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.singleton;

import java.util.LinkedList;

/**
 *
 * @author drochaju
 */
public class ScrabbleTest {
     public static void main(String[] args) {
        Singleton newInstance = Singleton.getInstance();
         System.out.println("Instance ID: " + System.identityHashCode(newInstance));
         System.out.println(newInstance.getLetterList());

         LinkedList<String> playerOneTiles = newInstance.getTiles(7);
         System.out.println("Player 1: " + playerOneTiles);
         System.out.println(newInstance.getLetterList());

         Singleton instanceTwo = Singleton.getInstance();
         System.out.println("Instance 2 ID: " + System.identityHashCode(instanceTwo));
         System.out.println(instanceTwo.getLetterList());

         LinkedList<String> playerTwoTiles = instanceTwo.getTiles(7);
         System.out.println("Player 2: " + playerTwoTiles);
         System.out.println(instanceTwo.getLetterList());
    }
}
