package org.accenture.oop.structural.facade;

class DVDPlayer {
    void turnOn() {
        System.out.println("DVD Player is ON");
    }

    void playMovie(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    void turnOff() {
        System.out.println("DVD Player is OFF");
    }
}
