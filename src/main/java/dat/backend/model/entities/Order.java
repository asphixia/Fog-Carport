package dat.backend.model.entities;

import java.sql.Timestamp;

public class Order {
    int orderId;
    int userId;
    int price;
    int producktId;
    Timestamp orderDate;
    int length;
    int width;
    int r_width;
    int r_lengthe;
    String username;


    public Order(int length, int width, int r_width, int r_lengthe) {
        this.username = username;
        this.length = length;
        this.width = width;
        this.r_width = r_width;
        this.r_lengthe = r_lengthe;

    }

    public Order(int orderId, int userId, int price, int producktId, Timestamp orderDate, int length, int width) {
        this.orderId = orderId;
        this.userId = userId;
        this.price = price;
        this.producktId = producktId;
        this.orderDate = orderDate;
        this.length = length;
        this.width = width;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProducktId() {
        return producktId;
    }

    public void setProducktId(int producktId) {
        this.producktId = producktId;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
