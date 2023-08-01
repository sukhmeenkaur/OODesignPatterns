package org.accenture.oop.structural.facade;

public class HomeTheaterApp {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        homeTheater.watchMovie("Inception");
        System.out.println("Enjoying the movie...");

        homeTheater.endMovie();
    }
}
