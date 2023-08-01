package org.accenture.oop.behavioral.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();

        ConcreteObserver observer1 = new ConcreteObserver(subject);
        ConcreteObserver observer2 = new ConcreteObserver(subject);

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState(42);

        subject.detach(observer2);

        subject.setState(17);
    }
}
