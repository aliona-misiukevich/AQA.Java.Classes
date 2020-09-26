package com.epam.classes.aqa;

public class House {
    private int id;
    private int flatNo;
    private double square;
    private int floor;
    private double roomQuantity;
    private String street;
    private BuildingType type;
    private double term;

    public House(int id, int flatNo, double square, int floor, double roomQuantity, String street, BuildingType type, double term) {
        this.id = id;
        this.flatNo = flatNo;
        this.square = square;
        this.floor = floor;
        this.roomQuantity = roomQuantity;
        this.street = street;
        this.type = type;
        this.term = term;
    }

    public House (int id, double square, double roomQuantity, String street, BuildingType type, double term) {
        this.id = id;
        this.square = square;
        this.roomQuantity = roomQuantity;
        this.street = street;
        this.type = type;
        this.term = term;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getRoomQuantity() {
        return roomQuantity;
    }

    public void setRoomQuantity(double roomQuantity) {
        this.roomQuantity = roomQuantity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public BuildingType getType() {
        return type;
    }

    public void setType(BuildingType type) {
        this.type = type;
    }

    public double getTerm() {
        return term;
    }

    public void setTerm(double term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", flatNo=" + flatNo +
                ", square=" + square +
                ", floor=" + floor +
                ", roomQuantity=" + roomQuantity +
                ", street='" + street + '\'' +
                ", type=" + type +
                ", term=" + term +
                '}';
    }
}
