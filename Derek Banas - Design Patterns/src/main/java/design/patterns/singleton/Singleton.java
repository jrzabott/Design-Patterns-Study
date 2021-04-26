/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author drochaju
 */
public class Singleton {

    private static Singleton firstInstance = null;

    String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
        "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e",
        "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h",
        "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l",
        "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o",
        "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r",
        "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u",
        "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};

    private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

    // Used to slow down 1st thread
    static boolean firstThread = true;

    public static Singleton getInstance() {
        if (firstInstance == null) {
            if (firstThread) {
                firstThread = false;
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Singleton.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            synchronized (Singleton.class) {

                if (firstInstance == null) {
                    firstInstance = new Singleton();
                    Collections.shuffle(firstInstance.letterList);
                }
            }

        }
        return firstInstance;
    }

    public LinkedList<String> getLetterList() {
        return firstInstance.letterList;
    }

    public LinkedList<String> getTiles(int howManyTiles) {
        LinkedList<String> tilesToSend = new LinkedList<>();
        for (int i = 0; i < howManyTiles; i++) {
            tilesToSend.add(firstInstance.letterList.remove(0));
        }

        return tilesToSend;
    }
}
