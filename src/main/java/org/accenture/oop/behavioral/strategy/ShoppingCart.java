package org.accenture.oop.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private DiscountStrategy discountStrategy = new NoDiscount();
    private List<Double> items = new ArrayList<>();

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void addItem(double price) {
        items.add(price);
    }

    public double calculateTotal() {
        double total = 0;
        for (double itemPrice : items) {
            total += itemPrice;
        }
        return discountStrategy.applyDiscount(total);
    }
}

