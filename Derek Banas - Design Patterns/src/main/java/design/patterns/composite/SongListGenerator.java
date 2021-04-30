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
public class SongListGenerator {

    public static void main(String[] args) {
        SongComponent industrialMusic = new SongGroup("Industrial", "xp music, provocative themes");
        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "genre of rock developed in late 60s");
        SongComponent dubstepMusic = new SongGroup("Dubstep", "electronic dance music in South London");
        SongComponent everySong = new SongGroup("Song List", "every available song");

        everySong.add(industrialMusic);
        industrialMusic.add(new Song("Head like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("HeadHunter", "Front 242", 1988));
        industrialMusic.add(dubstepMusic);

        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));

        everySong.add(heavyMetalMusic);
        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

        DiscJockey crazyLarry = new DiscJockey(everySong);

        crazyLarry.getSongList();

    }
}
