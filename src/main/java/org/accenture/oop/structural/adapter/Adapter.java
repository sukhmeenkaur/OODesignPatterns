package org.accenture.oop.structural.adapter;

class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("Adapter's request() method called");
        adaptee.specificRequest();
    }
}
