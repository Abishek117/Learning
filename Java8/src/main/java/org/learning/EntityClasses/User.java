package org.learning.EntityClasses;

import java.util.List;

public class User {
    public int userId;
    public String userName;
    public List<Order> orders;

    public User(int userId, String userName, List<Order> orders) {
        this.userId = userId;
        this.userName = userName;
        this.orders = orders;
    }

    public int getUserId() {
        return userId;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", orders=" + orders +
                '}';
    }
}
