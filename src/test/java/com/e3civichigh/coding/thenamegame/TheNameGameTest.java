package com.e3civichigh.coding.thenamegame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheNameGameTest {

    @Test
    public void createSong() {
        String StephenSong = "Stephen, Stephen, bo-btephen\n" +
                "Banana-fana fo-ftephen\n" +
                "Fee-fi-mo-mtephen\n" +
                "Stephen!\n";
        TheNameGame game = new TheNameGame();
        assertEquals(StephenSong, game.createSong("Stephen"));
    }

    @Test
    public void createSongElijah() {
        String StephenSong = "Elijah, Elijah, bo-belijah\n" +
                "Banana-fana fo-felijah\n" +
                "Fee-fi-mo-melijah\n" +
                "Elijah!\n";
        TheNameGame game = new TheNameGame();
        assertEquals(StephenSong, game.createSong("Elijah"));
    }

    @Test
    public void createSongBob() {
        String StephenSong = "Bob, Bob, bo-ob\n" +
                "Banana-fana fo-fob\n" +
                "Fee-fi-mo-mob\n" +
                "Bob!\n";
        TheNameGame game = new TheNameGame();
        assertEquals(StephenSong, game.createSong("Bob"));
    }

    @Test
    public void createSongFelix() {
        String StephenSong = "Felix, Felix, bo-belix\n" +
                "Banana-fana fo-elix\n" +
                "Fee-fi-mo-melix\n" +
                "Felix!\n";
        TheNameGame game = new TheNameGame();
        assertEquals(StephenSong, game.createSong("Felix"));
    }

    @Test
    public void createSongMartin() {
        String StephenSong = "Martin, Martin, bo-bartin\n" +
                "Banana-fana fo-fartin\n" +
                "Fee-fi-mo-artin\n" +
                "Martin!\n";
        TheNameGame game = new TheNameGame();
        assertEquals(StephenSong, game.createSong("Martin"));
    }

}