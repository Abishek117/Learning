package org.learning.EntityClasses;

public class Order {
    public int orderId;
    public String productName;
    public int rate;

    public Order(int orderId, String productName, int rate) {
        this.orderId = orderId;
        this.productName = productName;
        this.rate = rate;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getRate() {
        return rate;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", rate=" + rate +
                '}';
    }
}
