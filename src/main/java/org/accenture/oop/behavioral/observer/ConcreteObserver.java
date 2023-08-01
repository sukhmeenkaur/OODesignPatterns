package org.accenture.oop.behavioral.observer;

public class ConcreteObserver implements Observer {
    private Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        int state = subject.getState();
        System.out.println("Observer received an update. New state: " + state);
    }
}
