package org.accenture.oop.behavioral.strategy;

public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(50.0);
        cart.addItem(30.0);
        cart.addItem(20.0);

        System.out.println("Total price (no discount): $" + cart.calculateTotal());

        cart.setDiscountStrategy(new PercentageDiscount(10));
        System.out.println("Total price (10% discount): $" + cart.calculateTotal());

        cart.setDiscountStrategy(new FixedAmountDiscount(15));
        System.out.println("Total price ($15 discount): $" + cart.calculateTotal());
    }
}