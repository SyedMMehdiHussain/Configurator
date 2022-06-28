package com.example.Configurator.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Optional;

@Entity
@Table
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "truck_id",referencedColumnName = "id")
    private Truck truck;

    @OneToOne
    @JoinColumn(name = "trim_id", referencedColumnName = "id")
    private Trim trim;

    @OneToOne
    @JoinColumn(name = "cruiseControl_id", referencedColumnName = "id")
    private CruiseControl cruiseControl;

    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    private Integer totalPrice;

    public Order(Integer id, Truck truck, Trim trim, CruiseControl cruiseControl, Customer customer, Integer totalPrice) {
        this.id = id;
        this.truck = truck;
        this.trim = trim;
        this.cruiseControl = cruiseControl;
        this.customer = customer;
        this.totalPrice = totalPrice;
    }

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public Trim getTrim() {
        return trim;
    }

    public void setTrim(Trim trim) {
        this.trim = trim;
    }

    public CruiseControl getCruiseControl() {
        return cruiseControl;
    }

    public void setCruiseControl(CruiseControl cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", truck=" + truck +
                ", trim=" + trim +
                ", cruiseControl=" + cruiseControl +
                ", customer=" + customer +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
