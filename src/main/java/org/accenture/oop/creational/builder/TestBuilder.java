package org.accenture.oop.creational.builder;

public class TestBuilder {
    public static void main(String[] args) {
        Product product1 = new Product.Builder()
                .setProductName("Product 1")
                .setPrice(42)
                .setIsInStock(true)
                .build();

        Product product2 = new Product.Builder()
                .setProductName("Product 2")
                .setIsInStock(false)
                .build();

        printProductInfo(product1);
        printProductInfo(product2);
    }

    private static void printProductInfo(final Product product) {
        System.out.println("Printing Product information:");
        System.out.println(" - Product Name: " + product.getProductName());
        System.out.println(" - Product Price: " + product.getPrice());
        System.out.println(" - Is the product in stock: " + product.isInStock());
    }
}
