package com.example.Configurator.model;

import lombok.Generated;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CruiseControl implements Serializable {

//    @OneToOne
//    @JoinColumn(name = "order_id", nullable = false)
//    private Order order;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Integer id;

    private String type;

    private Integer price;

    public CruiseControl(Integer id, String type, Integer price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public CruiseControl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "CruiseControl{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


}
