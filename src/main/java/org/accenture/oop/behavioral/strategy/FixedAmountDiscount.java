package org.accenture.oop.behavioral.strategy;

class FixedAmountDiscount implements DiscountStrategy {
    private double amount;

    public FixedAmountDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double applyDiscount(double originalPrice) {
        return Math.max(originalPrice - amount, 0);
    }
}
