package com.e3civichigh.coding.thenamegame;

public class TheNameGame {
    public static void main(String[] args) {
        String name = "William";
        TheNameGame game = new TheNameGame();
        String song = game.createSong(name);
        System.out.println(song);
    }

    @SuppressWarnings("WeakerAccess")
    public String createSong(String name) {
        String sep = ", ";
        String b = "b";
        String f = "f";
        String m = "m";
        String x = name;
        String y = name.substring(1);

        // TODO what if name starts with b, f or m or a vowel?
        char letter = name.toLowerCase().charAt(0);
        if ("aeiou".indexOf(letter) > -1) {
            y = name.toLowerCase();
        } else if (letter == 'b') {
            b = "";
        } else if (letter == 'f') {
            f = "";
        } else if (letter == 'm') {
            m = "";
        }

        String song = x + sep + x + sep + "bo-" + b + y + "\n";
        song = song + "Banana-fana fo-" + f + y + "\n";
        song = song + "Fee-fi-mo-" + m + y + "\n";
        song = song + x + "!\n";
        return song;
    }
}
