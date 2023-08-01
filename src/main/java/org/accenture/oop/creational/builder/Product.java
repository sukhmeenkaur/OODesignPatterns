package org.accenture.oop.creational.builder;

public class Product {
    private String productName;
    private int price;
    private boolean isInStock;

    private Product(Builder builder) {
        this.productName = builder.productName;
        this.price = builder.price;
        this.isInStock = builder.isInStock;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public static class Builder {
        private String productName;
        private int price;
        private boolean isInStock;

        public Builder() {
        }

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setIsInStock(boolean isInStock) {
            this.isInStock = isInStock;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
