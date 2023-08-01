package org.accenture.oop.structural.facade;

class SoundSystem {
    void turnOn() {
        System.out.println("Sound System is ON");
    }

    void setVolume(int volume) {
        System.out.println("Setting volume to: " + volume);
    }

    void turnOff() {
        System.out.println("Sound System is OFF");
    }
}
