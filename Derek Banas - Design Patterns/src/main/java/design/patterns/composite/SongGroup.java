/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author drochaju
 */
public class SongGroup extends SongComponent {

    ArrayList<SongComponent> songComponents = new ArrayList();

    String groupName;
    String groupDescription;

    public SongGroup(String newGroupName, String newGroupDescription) {
        groupName = newGroupName;
        groupDescription = newGroupDescription;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public void add(SongComponent newSongComponent) {
        this.songComponents.add(newSongComponent);
    }

    public void remove(SongComponent newSongComponent) {
        this.songComponents.remove(newSongComponent);
    }

    public SongComponent getComponent(int componentIndex) {
        return (SongComponent) songComponents.get(componentIndex);
    }

    public void displaySongInfo() {
        System.out.println(getGroupName() + " " + getGroupDescription() + "\n");

        Iterator songIterator = songComponents.iterator();
        while (songIterator.hasNext()) {
            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }
    }
}
