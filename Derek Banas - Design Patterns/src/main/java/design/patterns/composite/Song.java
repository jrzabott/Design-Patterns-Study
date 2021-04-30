/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.composite;

/**
 *
 * @author drochaju
 */
public class Song extends SongComponent {

    String songName;
    String bandName;
    int releaseYear;

    public Song(String songName, String bandName, int releaseYear) {
        this.songName = songName;
        this.bandName = bandName;
        this.releaseYear = releaseYear;
    }

    @Override
    public String getBandName() {
        return this.bandName; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getReleaseYear() {
        return this.releaseYear; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSongName() {
        return this.songName; //To change body of generated methods, choose Tools | Templates.
    }

    public void displaySongInfo(){
        System.out.println(getSongName() + " was recorded by " + getBandName() + " in " + getReleaseYear()) ;
    }

}
