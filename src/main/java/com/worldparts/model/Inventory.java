package com.worldparts.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Table(name = "INVENTORIES")
@Entity
@IdClass(InventoryPk.class)
public class Inventory {

    @JsonIgnore
    @Id
    private Product product;

    @Id
    private Warehouse warehouse;

    @Column(name = "QUANTITY")
    private Integer quantity;

    public Inventory() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
