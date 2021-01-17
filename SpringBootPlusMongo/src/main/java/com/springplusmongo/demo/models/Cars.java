package com.springplusmongo.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cars {

    @Id
    private String id;
    private String modelName;
    private String brand;
    private double engineCapacity;
    private String fuel;
    private int noOfSeats;
    private String color;
    private String year;
    private int kmsDriven;

    public Cars(){

    }

    public Cars(String modelName, String brand, Double engineCapacity, String fuel, Integer noOfSeats, String color, String year, Integer kmsDriven){
        this.modelName = modelName;
        this.brand = modelName;
        this.engineCapacity = engineCapacity;
        this.fuel = fuel;
        this.noOfSeats = noOfSeats;
        this.color = color;
        this.year = year;
        this.kmsDriven = kmsDriven;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getKmsDriven() {
        return kmsDriven;
    }

    public void setKmsDriven(int kmsDriven) {
        this.kmsDriven = kmsDriven;
    }
}
