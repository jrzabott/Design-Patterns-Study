/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.composite;

import com.sun.java.browser.dom.DOMUnsupportedException;

/**
 *
 * @author drochaju
 */
public abstract class SongComponent {

    public void add(SongComponent newSongComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(SongComponent newSongComponent) {
        throw new UnsupportedOperationException();
    }

    public SongComponent getComponent() {
        throw new UnsupportedOperationException();
    }

    public String getSongName() {
        throw new UnsupportedOperationException();
    }

    public String getBandName() {
        throw new UnsupportedOperationException();
    }

    public int getReleaseYear() {
        throw new UnsupportedOperationException();
    }

    public void displaySongInfo(){
        throw new UnsupportedOperationException();
    }
}
