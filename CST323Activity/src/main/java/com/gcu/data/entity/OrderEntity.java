package com.gcu.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ORDERS")
public class OrderEntity {
    @Id
    Long id;

    @Column(name="ORDER_NO")
    String orderNo;

    @Column(name="PRODUCT_NAME")
    String productName;

    @Column(name="PRICE")
    float price;

    @Column(name="QUANTITY")
    int quantity;

    public OrderEntity(long id, String orderNo, String productName, float price, int quantity) {
    }

    public OrderEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
