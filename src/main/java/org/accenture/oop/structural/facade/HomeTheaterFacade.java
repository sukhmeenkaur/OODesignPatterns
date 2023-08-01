package org.accenture.oop.structural.facade;

class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade() {
        this.dvdPlayer = new DVDPlayer();
        this.projector = new Projector();
        this.soundSystem = new SoundSystem();
    }

    void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        dvdPlayer.turnOn();
        projector.turnOn();
        projector.setInput(dvdPlayer);
        soundSystem.turnOn();
        soundSystem.setVolume(8);
        dvdPlayer.playMovie(movie);
    }

    void endMovie() {
        System.out.println("Shutting down the movie...");
        dvdPlayer.turnOff();
        projector.turnOff();
        soundSystem.turnOff();
    }
}
