package com.example.Configurator.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Customer implements Serializable {

//    @OneToOne
//    @JoinColumn(name = "order_id", nullable = false)
//    private Order order;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Integer id;

    public Customer() {
    }

    private String name;

    public Customer(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
