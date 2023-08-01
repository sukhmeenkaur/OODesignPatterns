package org.accenture.oop.structural.facade;

class Projector {
    void turnOn() {
        System.out.println("Projector is ON");
    }

    void setInput(DVDPlayer dvdPlayer) {
        System.out.println("Setting projector input to DVD Player");
    }

    void turnOff() {
        System.out.println("Projector is OFF");
    }
}