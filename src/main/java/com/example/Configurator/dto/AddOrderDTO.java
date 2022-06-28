package com.example.Configurator.dto;

public class AddOrderDTO {
    private Integer trimId;
    private Integer truckId;
    private Integer cruiseControlId;

    private Integer totalPrice;

    public AddOrderDTO(Integer trimId, Integer truckId, Integer cruiseControlId, Integer totalPrice) {
        this.trimId = trimId;
        this.truckId = truckId;
        this.cruiseControlId = cruiseControlId;
        this.totalPrice = totalPrice;
    }

    public AddOrderDTO() {
    }

    public Integer getTrimId() {
        return trimId;
    }

    public void setTrimId(Integer trimId) {
        this.trimId = trimId;
    }

    public Integer getTruckId() {
        return truckId;
    }

    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    public Integer getCruiseControlId() {
        return cruiseControlId;
    }

    public void setCruiseControlId(Integer cruiseControlId) {
        this.cruiseControlId = cruiseControlId;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
}
