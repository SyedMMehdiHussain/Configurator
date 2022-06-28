package com.example.Configurator.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Trim implements Serializable {

//    @OneToOne
//    @JoinColumn(name = "order_id", nullable = false)
//    private Order order;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Integer id;

    public Trim() {
    }

    private String type;
    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Trim(Integer id, String type, Integer price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Trim{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
